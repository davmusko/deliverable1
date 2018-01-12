import java.util.Scanner;

public class DigitComparer {
	public static void main(String[] args) {
		int userNum1; //first number the user inputs
		int userNum2; //second number the user inputs
		String userNum; //used to convert int to string and find the length of the inputs
		int intLength; //same as above
		int i;
		int temp1 = 0;
		int temp2 = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		userNum1 = input.nextInt();
		System.out.println("Please enter a second number of the same length: ");
		userNum2 = input.nextInt();
		
		
		userNum = Integer.toString(userNum1);// used to get length of the userNum and set to i to run loop that many times
		intLength = userNum.length();
		
		for(i = 0;i<intLength;++i) {
			if(temp1 == temp2) {
				temp1 = (userNum1 % 10) + (userNum2 % 10);// adds together the right most digit of both numbers
				userNum1 = userNum1 / 10; // used to shift userNum to the left one place
				userNum2 = userNum2 / 10;
				temp2 = (userNum1 % 10) + (userNum2 % 10); // adds together the next two digits and loop will run again if they are equal
			} else {
				System.out.println("False"); // if loop does not run 'i' amount of times. it will break and return false
				break;
			}
		}
		if(i==intLength) {
			System.out.println("True"); // once the loop runs 'i' amount of times, 'true' is returned
		}
			
			
	}
	
}
		

	
	



