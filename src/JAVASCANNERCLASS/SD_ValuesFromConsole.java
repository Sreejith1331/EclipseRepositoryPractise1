package JAVASCANNERCLASS;

import java.util.Scanner;

public class SD_ValuesFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		int size;
		System.out.print("Enter total no.of.values to store:");
		size = objSC.nextInt();
		
		int[] arr1 = new int[size];
		
		System.out.println("Enter the values:");
		for(int i = 0; i<arr1.length; i++)
		{
			arr1[i] = objSC.nextInt();
		}
		
		System.out.println("The created array is:");
		
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
			
		}
	}

}
