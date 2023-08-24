package JAVASCANNERCLASS;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer value");
		Scanner objSC = new Scanner(System.in);
		int input = objSC.nextInt();
		int factorial = 1;
		
		for(int i = input; i > 0; i--)
		{
			factorial = i*factorial;
			
		}
		System.out.println("Factorial = " + factorial);
	}

}
