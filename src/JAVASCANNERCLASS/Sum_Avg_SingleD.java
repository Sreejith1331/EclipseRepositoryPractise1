package JAVASCANNERCLASS;

import java.util.Scanner;

public class Sum_Avg_SingleD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		int size, sum = 0, avg;
		System.out.println("Enter length of the array");
		size = objSC.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = objSC.nextInt();
			sum = sum+arr[i];
		}
	}

}
