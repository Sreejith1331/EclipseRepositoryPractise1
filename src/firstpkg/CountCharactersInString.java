package firstpkg;

import java.util.Scanner;

public class CountCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = objSc.nextLine();
		System.out.println("No.of characters in your name is: "+name.length());
	}

}
