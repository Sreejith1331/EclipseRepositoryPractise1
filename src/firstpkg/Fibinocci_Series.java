package firstpkg;

import java.util.Scanner;

public class Fibinocci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSc = new Scanner(System.in);
		System.out.println("Enter the length of the fibonacci series");
		int size = objSc.nextInt();
		int firstNo=0, nextNo=1;
		for(int i=0; i< size; i++)
		{
			System.out.print(firstNo+" ");
			int sum = firstNo+nextNo;
			firstNo=nextNo;
			nextNo=sum;
		}
	}

}
