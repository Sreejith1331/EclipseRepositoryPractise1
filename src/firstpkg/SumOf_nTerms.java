package firstpkg;

import java.util.Scanner;

public class SumOf_nTerms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastDigit, sum;
		Scanner objSc = new Scanner(System.in);
		System.out.println("Enter a natural number");
		lastDigit=objSc.nextInt();
		int i=1;
		while(i<=lastDigit)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		sum=lastDigit*(lastDigit+1)/2;
		System.out.println("Sum of the digits = "+sum);
	}

}
