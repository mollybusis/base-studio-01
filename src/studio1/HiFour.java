package studio1;

import java.util.Scanner;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
//		ArgsProcessor ap = new ArgsProcessor(args);
//		String s0 = ap.nextString("Enter the first name");
//		String s1 = ap.nextString("Enter name 2");
//		String s2 = ap.nextString("Enter name 3");
//		String s3 = ap.nextString("Enter name 4");
//		//
//		// Say hello to the names in s0 through s3.
//		//
//		System.out.println("Hi " + s0 + ", " + s1 + ", " + s2 + ", and "+ s3 + " how are you?");
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the first name");
		String s1 = myObj.nextLine();
		System.out.println("Enter the second name");
		String s2 = myObj.nextLine();
		System.out.println("Enter the third name");
		String s3 = myObj.nextLine();
		System.out.println("Enter the fourth name");
		String s4 = myObj.nextLine();

		System.out.println("Hi " + s1 + ", " + s2 + ", " + s3 + ", and "+ s4 + " how are you?");

		
	}
}
