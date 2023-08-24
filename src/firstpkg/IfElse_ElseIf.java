package firstpkg;

public class IfElse_ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Control flow -- Decision statements
		
		//if condition		
		int a = 20, b = 10;
		if (a>b) {
			System.out.println("a is greater");
		}

		//if-else condition
		if (a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		
		// verify a no is positive or negative
		int no = 10;
		if (no>=0) {
			System.out.println("Value of no is positive");
		}
		else {
			System.out.println("Value of no is negative");
		}
		
		//else-if 
		//verify greatest among 3 numbers
		
		if (a>b && a>no)
			System.out.println("a is greatest among three numbers");
		else if(b>a && b> no)
			System.out.println("b is greatest among three numbers");
		else
			System.out.println("no is greatest among three numbers");
		
		//verify a number is even or odd
		if(a%2 == 0)
			System.out.println("a is an even number");
		else
			System.out.println("a is an odd number");
	}

}
