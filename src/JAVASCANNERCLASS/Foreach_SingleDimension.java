package JAVASCANNERCLASS;

import java.util.Scanner;

public class Foreach_SingleDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		
		System.out.println("Enter 4 integer values in an array");
		int[] arr1 = new int[4];
		for(int i=0; i<4; i++)
		{
			arr1[i] = objSC.nextInt();
		}
		System.out.println("\nValues in the array are");
		for(int i : arr1) {
			System.out.println(i);
		}
			
	}

}
