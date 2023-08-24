package JAVASCANNERCLASS;

import java.util.Scanner;

public class ArmStrongThreeDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		int input, remainder,output,sum = 0;
		System.out.println("Enter a three digit integer");
		input = objSC.nextInt();
		int tempInput = input;
		
		while(input>0)
		{
			remainder = input%10;
			output = remainder*remainder*remainder;
			sum = sum+output;
			input = input/10;
		}
		
		if(sum == tempInput)
			System.out.println("This is an armstrong number");
		else
			System.out.println("This is not an armstrong number");
		
	}

}
