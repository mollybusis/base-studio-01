package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("What is the first integer to be averaged?");
		int n1 = myObj.nextInt();
		System.out.println("What is the second integer to be averaged?");
		int n2 = myObj.nextInt();
		
		int sum = n1 +n2;
		 
		double ave = sum/2.0;
		
		System.out.println("The average is " + ave);
		
	}

}
