package firstpkg;

import java.util.Scanner;

public class OddNumbers1to99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count of odd numbers between 1 to 99
		int count=0;
		for(int i=0; i<100; i++)
		{
			if(i%2!=0)
			count++;
		}
		
		System.out.println("No.of.Odd numbers between 1 to 99 is: " + count);
		
		//insert Tutorial between Java 3.0
		String s1="Java 3.0", s2="Tutorial";
		System.out.println(s1.substring(0, 5)+ s2 + s1.substring(4, 8));
		
		//extract first half of an even string
		String s3 = "Sreejith";
		System.out.println(s3.substring(0, s3.length()/2));
		
		//count the no.of even and odd elements in a given array of integers
		int size;
		Scanner objSC = new Scanner(System.in);
		System.out.println("Enter the size of integer array");
		size=objSC.nextInt();
		System.out.println("Enter values into the integer array: ");
		int[] arr1 = new int[size];
		for(int i=0; i<size; i++)
		{
			arr1[i]=objSC.nextInt();
		}
		int even=0, odd=0;
		for(int i : arr1)
		{
			if(i%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Count Of Even Numbers: " + even);
		System.out.println("Count of Odd Numbers: " + odd);
		objSC.close();
	}

}
