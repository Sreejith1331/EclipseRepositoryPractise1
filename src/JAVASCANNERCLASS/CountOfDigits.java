package JAVASCANNERCLASS;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		int input, remainder, count = 0;
		System.out.println("Enter an integer");
		input = objSC.nextInt();
		while(input>0)
		{
			input = input/10;
			count++;
		}
		
		System.out.println("Count of digits = " + count);
	}

}


