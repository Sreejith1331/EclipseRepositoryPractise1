package JAVASCANNERCLASS;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSC1 = new Scanner(System.in);
		int fNo, sNo;
		char action;
		System.out.println("Enter first integer value");
		fNo = objSC1.nextInt();
		System.out.println("Enter second integer value");
		sNo = objSC1.nextInt();
		System.out.println("Choose an action from the below\n +, -, *, /");
		action = objSC1.next().charAt(0);
		switch(action)
		{
		case '+':
			System.out.println(fNo + " + " + sNo + " = " + (fNo+sNo));
			break;
		case '-':
			System.out.println(fNo + " - " + sNo + " = " + (fNo-sNo));
			break;
		case '*':
			System.out.println(fNo + " * " + sNo + " = " + (fNo*sNo));
			break;
		case '/':
			System.out.println(fNo + " / " + sNo + " = " + (fNo/sNo));
			break;
			default:
				System.out.println("Invalid input");
		}
	}

}
