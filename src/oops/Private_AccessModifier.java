package oops;

public class Private_AccessModifier {
	private int no1 = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private_AccessModifier objPAM = new Private_AccessModifier();
		objPAM.no1=23;
		System.out.println(objPAM.no1);
	}

}
