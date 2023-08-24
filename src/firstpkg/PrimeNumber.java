package firstpkg;

import java.util.Scanner;

public class PrimeNumber {
		int no;	
	public static void main(String[] args) {
		Scanner objSc = new Scanner(System.in);
		PrimeNumber objPN = new PrimeNumber();
		 
		 System.out.println("Enter an integer value greater than 1");
		 objPN.no = objSc.nextInt();
		 if(objPN.no <= 1)
		 {
			 System.out.println("Invalid input");
		 }
		 else
		 {
		 objPN.primeNumber1();
		 }
		 objSc.close();
		 
	}
	
	public void primeNumber1() {
		int remainder=0, temp=1;
		 if(no==2)
		 {
			 System.out.println("It's a prime number");
		 }
		 else 
		 {
			 while(temp<=no)
			 {
				 remainder=no%temp;
				 if(remainder==0)
					 break;
				 else		 
					 temp++;
			 }
			 if(remainder==0)
				 System.out.println("It's a prime number");
			 else
				 System.out.println("It's not a prime number");
		 }
	}

}
