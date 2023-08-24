package firstpkg;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type casting - Assigning the value of one primitive data type to another type
		
		//Widening casting - byte->short->char->int->long->float->double
		
		//Narrowing casting - double->float->long->int->char->short->byte
		
		byte num1 = 125;
		System.out.println("byte num1 = " + num1);
		
		short num2 = num1;
		System.out.println("short num2 = " + num2);
		
		char num3 = (char) num2;
		System.out.println("char num3 = " + num3);
		
		int num4 = num2;
		System.out.println("int num4 = " + num4);
		
		long num5 = num4;
		System.out.println("long num5 = " + num5);
		
		float num6 = num5;
		System.out.println("float num6 = " + num6);
		
		double num7 = num6;
		System.out.println("double num7 = " + num7);
		
		double num8 = 12345.564d;
		System.out.println("double num8 = " + num8);
		
		float num9 = (float)num8;
		System.out.println("float num9 = " + num9);
		
		long num10 = (long)num9;
		System.out.println("long num10 = " + num10);
		
		int num11 = (int)num10;
		System.out.println("int num11 = " + num11);
		
		short num12 = (short)num11;
		System.out.println("short num12 = " + num12);
		
		byte num13 = (byte)num12;
		System.out.println("byte num13 = " + num13);
		
	}
}
