package JAVASCANNERCLASS;

import java.util.Scanner;

public class ReverseNumber_SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		int input, reverse=0, remainder, sum=0;
		System.out.println("Enter an integer");
		input = objSC.nextInt();
		while(input>0)
		{
			remainder = input%10;
			sum+=remainder;
			reverse=reverse*10+remainder;
			input/=10;
		}
		System.out.println("Reverse of the number: "+reverse);
		System.out.println("Sum of the digits = "+sum);
	}

}
