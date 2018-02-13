package HW1;
import java.util.*;

/*1.	Write a Java method int num_root(int num) that takes as its argument a nonnegative integer int num and computes its numeric root. 
 * First, it computes the sum of num’s digits. If the result has more than one digit, then it computes the sum of result’s digits. 
 * The procedure is repeated, until a single-digit result is obtained. For example, num_root(12345) returns 6, 
 * since 1 + 2 + 3 + 4 + 5 = 15 and 1 + 5 = 6. (25 points)
*/

public class hw13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = sc.nextInt();
		while(n < 0) {
			System.out.print("Invalid input, try again: ");
			n = sc.nextInt();
		}		
		sc.close();
		
		System.out.println("The numeric root of the number is: " + num_root(n));
		System.out.println("The solution of the ultimate method is: " + numroot(n));		
	}
	
	public static int num_root(int num) { //using recursion <3
		if(num < 10)
			return num;
		
		int sum = 0;		
		while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
		return num_root(sum);
	}
	
	public static int numroot(int num) {  //another method that does the same by converting to string and then back	
		if(num < 10)
			return num;
		
		int sum1 = 0;
		String mynum = Integer.toString(num);
		for(int i = 0; i < mynum.length(); i++) {
			char j = mynum.charAt(i);
			sum1 = sum1 + Character.getNumericValue(j);			
		}
		return numroot(sum1);
	}
}