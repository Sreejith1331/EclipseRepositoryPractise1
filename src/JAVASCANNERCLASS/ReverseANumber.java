package JAVASCANNERCLASS;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC1 = new Scanner(System.in);
		int input, remainder,output = 0;
		System.out.println("Enter an integer");
		input = objSC1.nextInt();
		int palindrome = input;
		
		while(input>0)
		{
			remainder = input % 10;
			output = output*10+remainder;
			input = input/10;
		}
		
		System.out.println("Reverse of " + input + " = " + output);
		
		if(palindrome == output)
			System.out.println("Palindrome number");
		else
			System.out.println("Not palindrome");
	}

}
