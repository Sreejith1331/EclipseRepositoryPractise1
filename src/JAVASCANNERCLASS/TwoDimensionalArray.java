package JAVASCANNERCLASS;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		int[][] arr = new int[3][2];
		System.out.println("Enter 6 integer values to store in the 2D array");
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				arr[i][j] = objSC.nextInt();
			}
		}
		System.out.println("\n\n");
		System.out.println("Stored values in the 2D array are:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
