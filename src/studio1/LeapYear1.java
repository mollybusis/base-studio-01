package studio1;

import support.cse131.ArgsProcessor;


public class LeapYear1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int yearNumber = ap.nextInt("Enter the year number");
		
		int yearNumberIsDivisableBy4 = yearNumber % 4;
		
		int yearNumberIsDivisableBy100 = yearNumber % 100; 
		
		int yearNumberIsDivisableBy400 = yearNumber % 400;
		
		boolean leapYear = (yearNumberIsDivisableBy4 ==0 && yearNumberIsDivisableBy100 !=0) || yearNumberIsDivisableBy400 == 0;
		
		System.out.println(yearNumber + " is a leap year" + " :" + leapYear);
		
		

		
	}

}
