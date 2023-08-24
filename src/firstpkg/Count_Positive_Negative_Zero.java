package firstpkg;

import java.util.Scanner;

//find count of positive, negative and zeros in an array
public class Count_Positive_Negative_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSc = new Scanner(System.in);
		int positive = 0, negative = 0, zeros = 0, arrSize;
		System.out.println("We want to store some positive, negative and zeros in an integer array.\nFirst enter the array size");
		arrSize = objSc.nextInt();
		int [] noArray = new int[arrSize];
		
		System.out.println("Enter values into the array");
		
		for(int i = 0; i < arrSize; i++)
		{
			noArray[i] = objSc.nextInt();
			if(noArray[i] == 0)
				zeros++;
			else if(noArray[i] > 0)
				positive++;
			else 
				negative++;
		}
		
		System.out.println("Total no.of positive integers in the array: "+positive);
		System.out.println("Total no.of negative integers in the array: "+negative);
		System.out.println("Total no.of zeros in the array: "+zeros);
		
		
	}

}
