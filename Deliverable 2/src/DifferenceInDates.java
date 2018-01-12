import java.util.Scanner;
public class DifferenceInDates {
	public static void main(String[] args) {
		int day1;
		int month1;
		int year1;
		int day2;
		int month2;
		int year2;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the first dates information: ");
		System.out.println("The month(1-12)");
		month1 = scnr.nextInt();
		System.out.println("The day(1-31)");
		day1 = scnr.nextInt();
		System.out.println("The year(yyyy)");
		year1 = scnr.nextInt();
		
		System.out.println("Enter the second dates information: ");
		System.out.println("The month(1-12)");
		month2 = scnr.nextInt();
		System.out.println("The day(1-31)");
		day2 = scnr.nextInt();
		System.out.println("The year(yyyy)");
		year2 = scnr.nextInt();
		
		System.out.println("The difference in the dates are "+ (Math.abs(year1-year2))+" year(s), " + (Math.abs(month1-month2)) + " month(s), and " + (Math.abs(day1-day2)) + " day(s).");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
