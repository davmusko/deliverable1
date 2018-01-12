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
		
		
		userNum = Integer.toString(userNum1);
		intLength = userNum.length();
		
		for(i = 0;i<intLength;++i) {
			if(temp1 == temp2) {
				temp1 = (userNum1 % 10) + (userNum2 % 10);
				userNum1 = userNum1 / 10;
				userNum2 = userNum2 / 10;
				temp2 = (userNum1 % 10) + (userNum2 % 10);
			} else {
				System.out.println("False");
				break;
			}
		}
		if(i==intLength) {
			System.out.println("True");
		}
			
			
	}
	
}
		

	
	



