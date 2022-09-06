package studio1;

import java.util.Scanner;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ArgsProcessor ap = new ArgsProcessor(args);
//		int x = ap.nextInt("Value for x?");
//		int y = ap.nextInt("Value for y?");
//		int z = ap.nextInt("Value for z?");
//
//		boolean isOrdered = (x < y && y < z)||(x > y && y > z) ;
//		
//		System.out.println(isOrdered);
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = myObj.nextInt();
		System.out.println("Value for y?");
		int y = myObj.nextInt();
		System.out.println("Value for z?");
		int z = myObj.nextInt();
		
		boolean isOrdered = (x < y && y < z)||(x > y && y > z) ;
		System.out.println(isOrdered);

	}

}
