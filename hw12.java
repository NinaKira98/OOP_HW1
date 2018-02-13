package HW1;
import java.util.*;

public class hw12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of entries: ");
		int num = sc.nextInt();
		while(num < 1 || num > 1000 ) {
			System.out.print("1 <= N <= 1000, try again: ");
			num = sc.nextInt();
		}
		System.out.println("Input Tagliatelle, Penne or Spagetti: ");
		int numT = 0, numP = 0, numS = 0;
		String tag = "tagliatelle", pen = "penne", spa = "spagetti";
		int saver = 0; //so that "Invalid, try again" does not print before any inputs in the beginning
		for(int i=0; i < num; i++) {
			String input = checkInpForThree(tag, pen, spa, sc);
			if(isSame(input, tag)) numT++;
			else if(isSame(input, pen)) numP++;
			else if(isSame(input, spa)) numS++;
			else if(!input.isEmpty() || !input.equals(null)){
				i--;				
				if(saver > 0)
					System.out.println("Invalid, try again: ");
				saver++;
			}			
		}
		
		System.out.print("The most inputed is: ");
		String winner = greatest(numT, numP, numS, tag, pen, spa);
		System.out.println(winner.toUpperCase());
	
		sc.close();
		
	}
	
	static String checkInpForThree(String a, String b, String c, Scanner sc) {
		String inp;
		inp = sc.nextLine();
		inp = inp.trim();
		inp = inp.toLowerCase();
		return inp;
	}
	
	static boolean isSame(String input, String compareTo) {
		if(input.equals(compareTo))			
			return true;
		
		return false;
	}
	
	static String greatest(int a, int b, int c, String as, String bs, String cs) {
		if(a > b && a > c) 	return as;
		else if(b > a && b > c) return bs;
		else if(c > a && c > b)	return cs;
		return "no winner";
	}

}