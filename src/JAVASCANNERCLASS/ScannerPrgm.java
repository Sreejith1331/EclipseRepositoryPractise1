package JAVASCANNERCLASS;

import java.util.Scanner;

public class ScannerPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1, no2;
		System.out.println("Enter first integer value");
		Scanner objSC1 = new Scanner(System.in);
		no1 = objSC1.nextInt();
		System.out.println("Value1 = " + no1);
		
		System.out.println("Enter Second integer value");
		no2 = objSC1.nextInt();
		System.out.println("Value2 = " + no2);
		
		System.out.println("Sum of " + no1 + " +  " + no2 + " = " + (no1+no2));
		
		objSC1.close();

	}

}
