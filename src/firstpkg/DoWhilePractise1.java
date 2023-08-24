package firstpkg;

import java.util.Scanner;

public class DoWhilePractise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSc = new Scanner(System.in);
		int no1, no2, sum;
		char response='n';
		do {
			System.out.println("Enter first no:");
			no1 = objSc.nextInt();
			System.out.println("Enter second no:");
			no2 = objSc.nextInt();
			System.out.println(no1+"+"+no2+" = "+(no1+no2));
			System.out.println("Do you want to continue?\nif \'yes\' then enter \"y\"");
			response=objSc.next().charAt(0);
		}
		while(response=='y');
	}

}
