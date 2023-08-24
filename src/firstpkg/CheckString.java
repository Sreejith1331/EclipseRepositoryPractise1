package firstpkg;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a java program to check whether a given string ends with the string "language"
		Scanner objSc = new Scanner(System.in);
		String lang;
		System.out.println("Enter a language name");
		lang = objSc.nextLine();
		if(lang.endsWith("language"))
			System.out.println("The given string ends with \"language\"");
		else
			System.out.println("The given string does not ends with \"language\"");
	}

}
