package firstpkg;

import java.util.Scanner;

public class AverageOf_3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr3= new int[3];
		System.out.println("Enter 3 integer values");
		Scanner objSc = new Scanner(System.in);
		int sum=0, average;
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i] = objSc.nextInt();
			sum=sum+arr3[i];
		}
		average = sum/3;
		System.out.println("Average of the 3 numbers: "+average);
	}

}
