package JAVASCANNERCLASS;

import java.util.Scanner;

public class StringTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		int row = 3, column = 2;
		String[][] names = new String[row][column];
		System.out.println("Enter 3 user names and their password");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				
				names[i][j] = objSC.next();
				
				
			}
		}
		
		System.out.println("\nStored User names and Passwords are:\n");
		System.out.println("UserName\tPassword");
		System.out.println("-------------------------");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(names[i][j]+"\t\t");
			}
			System.out.println();
		}
		
	}

}
