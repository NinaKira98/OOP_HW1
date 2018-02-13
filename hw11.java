package HW1;
import java.util.*;
/*1.	Write a Java program that inputs a valid time from the console using three integers: 
 * hours – a value within the range from 0 to 23 inclusive, 
 * minutes – a value within the range from 0 to 59 inclusive, 
 * seconds – a value within the range from 0 to 59 inclusive. 
 * It adds one second and prints hours, minutes and seconds of the obtained time. (25 points) 
*/

public class hw11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String hrs = "Hours", mins = "Minutes", secs = "Seconds";
		
		int hour = valid(0, 23, hrs, sc);
		
		int minute = valid(0, 59, mins, sc);
		
		int second = valid(0, 59, secs, sc);
		second++;
		
		if(second > 59) {     //Checks if the values become invalid because of s++ and fixes it
			minute++;
			if(minute > 59) {
				hour++;
				minute -= 60;
				if(hour > 23)
					hour -= 24;				
			}
			second -= 60;			
		}
		sc.close();
		
		System.out.println("The obtained time is: " + hour + ":" + minute + ":" + second);
		System.out.println(hour + " hours, " + minute + " minutes, " + second + " seconds.");
		System.out.println("Thank you!");		
		
	}
	
	static int valid(int min, int max, String input, Scanner sc) {
		System.out.print(input + ": ");
		int x = sc.nextInt();
		while(x < min || x > max) {
			System.out.print("Invalid input, try again: ");
			x = sc.nextInt();
		}
		return x;
	}
}