package oops;

public class Default_AccessModifier {
		int no1 = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default_AccessModifier objDAM = new Default_AccessModifier();
		objDAM.no1=11;
		System.out.println(objDAM.no1);
		
		DefaultAM objD1 = new DefaultAM();
		objD1.no2=22;
		System.out.println(objD1.no2);
		
	}

}

class DefaultAM{
	int no2 = 20;
}
