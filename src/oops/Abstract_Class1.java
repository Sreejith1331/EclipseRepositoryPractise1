package oops;

public class Abstract_Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti objM = new Maruti();
		System.out.println(objM.no1);
		System.out.println(Maruti.no2);
		objM.speedRange();
		objM.milage();
		
		System.out.println("----------------------------------------------------------------------");
		
		Hyundai objHy = new Hyundai();
		System.out.println(objHy.no1);
		System.out.println(Hyundai.no2);
		objHy.milage();
		objHy.speedRange();
	}

}

abstract class Car{
	int no1 = 10;
	static int no2 = 20;
	abstract public void speedRange();
	public void milage() {
		System.out.println("Car Milage");
	}
}

class Maruti extends Car{

	@Override
	public void speedRange() {
		// TODO Auto-generated method stub
		System.out.println("Speed Range of Maruti");
	}
	
}

class Hyundai extends Car{

	@Override
	public void speedRange() {
		// TODO Auto-generated method stub
		System.out.println("Speed Range of Hyundai");
	}
	
}
