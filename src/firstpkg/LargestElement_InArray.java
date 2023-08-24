package firstpkg;

import java.util.Scanner;

public class LargestElement_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largestNo=0;
		Scanner objSc = new Scanner(System.in);
		System.out.println("Enter the size of an integer array");
		int size = objSc.nextInt();
		int[] arr1 = new int[size];
		System.out.println("Enter elements into the array");
		for(int i=0; i<size; i++)
		{
			arr1[i] = objSc.nextInt();
			if(arr1[i]>largestNo) {
				largestNo=arr1[i];
			}
			
		}
		System.out.println("Largest number in the array is: "+largestNo);
		
	}

}

