package firstpkg;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin ", s2 = " Tendulkar";
		
		//concat()
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+4+5);
		
		//equals()
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//toLowerCase(), toUpperCase()
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		//trim()
		System.out.println(s1.trim());
		System.out.println(s2.trim());
		
		//contains() 
		System.out.println(s1.contains("ch"));
		
		//length()
		System.out.println(s1.length());
		
		//subString()
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(2, 6));
		
		//startsWith(), endsWith()
		System.out.println(s2.startsWith("Ten"));
		System.out.println(s1.endsWith("in"));
		
		//charAt()
		System.out.println(s1.charAt(4));
		
		//split()
		String s3 = "Hello, Welcome to Luminar";
		String[] arrStr = s3.split(" ");
		for(String words:arrStr)
		{
			System.out.println(words);
		}
		
		//replace()
		System.out.println(s3.replace("Hello", "Hi"));
	}

}
