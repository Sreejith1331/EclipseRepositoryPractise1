package oops;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 20, no2 =4;
		double no3 = no1/no2;
		System.out.println(no1+"/"+no2+ " = "+no3);
		
		usingTryCatch();
	}
	
	static void usingTryCatch(){
		
		
		try {
			int no4 = 10, no5 = 0;
			double	no6 = no4/no5;
			System.out.println(no4+"/"+no5+ " = "+no6);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	
		System.out.println("Practicing Exception Handling");
	}

}
