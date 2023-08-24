package JAVASCANNERCLASS;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		String input, output="";
		System.out.println("Enter a palindrom word");
		input = objSC.next();
		for(int i=input.length()-1; i>=0;i--)
		{
			output=output+input.charAt(i);
		}
		System.out.println(output);
		
		objSC.close();
	}
}


