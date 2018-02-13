package HW1;
import java.util.*;
/*1.	4.	Write a Java program that inputs the width and height of a rectangle and if needed a symbol. 
 * Program suggests you a menu like bellow and generates an output according to your choice.  (25 points)
(1)	Area
(2)	Perimeter
(3)	Draw
(4)	Exit
If you input 1 then program returns the area of a rectangle, if you input 2 the program returns the perimeter of a rectangle, 
if you input 3, the program will ask you to input a symbol then return a rectangle filled with that symbols.
For example:
Input: 
Choice -> 3
height = 3
width  = 4
symbol = *
Output will be:
****
****
**** 
Repeat as much as you want until you input 4. If you input 4 then program stops.  */

public class hw14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Width: ");
		int w = sc.nextInt();
		while(w < 1) {
			System.out.print("Invalid input, input a natural number: ");
			w = sc.nextInt();
		}
		System.out.print("Height: ");
		int h = sc.nextInt();
		while(h < 1) {
			System.out.print("Invalid input, input a natural number: ");
			h = sc.nextInt();
		}
		
		System.out.println("Press 1 for area");
		System.out.println("Press 2 for perimiter");
		System.out.println("Press 3 to draw");
		System.out.println("Press 4 to exit");
		System.out.print("Your choice: ");
		int ch = sc.nextInt();
		boolean on = true;
		
		while(on) {	
			if(ch < 1 || ch > 4) {
				System.out.println("Invalid input, please try again: ");
				ch = sc.nextInt();
			}
			if(ch == 1) {
				System.out.println("The area is: " + area(w, h));
				System.out.print("Next choice: ");
				ch = sc.nextInt();
			}
			if(ch == 2) {
				System.out.println("The perimiter is: " + perimiter(w, h));
				System.out.print("Next choice: ");
				ch = sc.nextInt();
			}
			if(ch == 3) {
				System.out.print("Choose symbol: ");
				char s = sc.next().charAt(0);				
				draw(s, w, h);
				System.out.print("Next choice: ");
				ch = sc.nextInt();
			}
			if(ch == 4) {
				on = false;
				sc.close();
				System.out.println("You exited the application. I hope you had fun!");
			}
		}
	}
	
	public static int area(int w, int h) {
		return w*h;
	}
	
	public static int perimiter(int w, int h) {
		return 2*w + 2*h;
	}
	
	public static void draw(char symb, int w, int h) {
		if(h < 2) {
			for(int i = 0; i < w; i++) {
				System.out.print(symb + " ");			
			}
			System.out.print("\n");
		}
		else {
			for(int i = 0; i < w; i++) {
				System.out.print(symb + " ");			
			}
			System.out.print("\n");
			
			for(int j = 0; j < h-2; j++) {
				System.out.print(symb + " ");
				
				for(int i = 0; i < w-2; i++) {				
					System.out.print("  ");			
				}
				System.out.print(symb + " ");			
				System.out.print("\n");
			}
			
			for(int i = 0; i < w; i++) {
				System.out.print(symb + " ");			
			}
			System.out.print("\n");
		}
	}	
	
}