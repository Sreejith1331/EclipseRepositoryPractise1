package firstpkg;

public class Basic_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//basic calculator
		int a = 20, b = 10;
		char action = '+';
		
		switch(action) {
		case '+':
			System.out.println("a + b = " + (a+b));
			break;
		case '-':
			System.out.println("a - b = " + (a-b));
			break;
		case '*':
			System.out.println("a * b = " + (a*b));
			break;
		case '/':
			System.out.println("a / b = " + (a/b));
			break;
			default:
				System.out.println("Invalid input");
		}

	}

}
