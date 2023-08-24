package firstpkg;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmetic operators
		int a = 10, b = 20;
		System.out.println("Value of a+b = " + (a+b));
		System.out.println("Value of a-b = " + (a-b));
		System.out.println("Value of a*b = " + (a*b));
		System.out.println("Value of a/b = " + (a/b));
		System.out.println("Value of a%b = " + (a%b));
		
		//Assignment operators
		System.out.println("Value of a = " + (a=100));
		System.out.println("Value of b = " + (b=200));
		System.out.println("Value of a+=b" + (a+=b));
		System.out.println("Value of a-=b" + (a-=b));
		System.out.println("Value of a*=b" + (a*=b));
		System.out.println("Value of a/=b" + (a/=b));
		
		//Relational operators
		
		System.out.println("a > b "+(a>b));
		System.out.println("a < b "+(a<b));
		System.out.println("a >= b "+(a>=b));
		System.out.println("a <= b "+(a<=b));
		System.out.println("a != b "+(a!=b));
		System.out.println("a == b "+(a==b));
		
		//Logical operators
		
		String username = "abc123";
		String password = "1234";
		System.out.println(username == "abc123" && password == "1234");
		System.out.println (!(username == "abc123"));
		
		//Unary operators
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("Post increment of a = " + a++);
		System.out.println("Post decrement of a = " + a--);
		System.out.println("Pre increment of b = " + ++a);
		System.out.println("Pre decrement of b = " + --b);
		
		//Ternary operators
		
		int c = (a>b) ? a:b;
		System.out.println("c = " + c);
		
		System.out.println("HelLo Mis\ftor");
		

	}

}
