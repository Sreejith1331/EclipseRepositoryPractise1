package JAVASCANNERCLASS;

import java.util.Scanner;

public class SD_String_FromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC = new Scanner(System.in);
		String[] names = new String[5];
		System.out.println("Enter 5 names to store");
		for(int i=0; i<names.length;i++)
		{
			names[i] = objSC.next();
		}
		System.out.println("\n");
		System.out.println("Entered names are:\n");
		for(int i=0; i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}

}
