package firstpkg;

public class ClassWorkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//assign values to 2 variables
		int a = 10, b = 20;
		System.out.println("a + b = " + (a+b));
		
		//value swapping with extra variable help
		a = 25; b = 30; int c;
		c = a;
		a = b; 
		b = c;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//value swapping without using extra variable
		a = a + b;	// a = 30+25
		b = a - b;	// b = 55-25
		a = a - b;	// a = 55-30
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	
		//check 23 and 45 are equal
		int d = 23, e = 45;
		System.out.println("23 = 45 : " + (d == e));
		
		//Assign values of variables 'f' and 'g' as 55 and 70 respectively and then check the
		//conditions a < 50 and a < b are true
		int f = 55, g = 70;
		System.out.println(f<50 && f<g);
		
		//variable h = 17; print 2nd digit
		int h = 17;
		System.out.println("2nd digit of "+h+" is: " + (17%10));
		
		
		

	}

}
