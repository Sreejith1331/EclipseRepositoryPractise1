package firstpkg;

public class Vehicle_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car objC = new Car();
		objC.drive();
	}

}
class Vehicle{
	public void drive() {
		System.out.println("Repairing a car");
	}
}
class Car extends Vehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
	}
	
}
