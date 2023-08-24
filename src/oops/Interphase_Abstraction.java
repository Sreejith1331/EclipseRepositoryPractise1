package oops;

public class Interphase_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface ICarDetails{
	static final int maxSpeed = 120;
	static final int milage = 20;
	void carCompany();
	void carName();
	void carAcceleration();
	void carMilage();
}

interface IBikeDetails{
	static final int bMaxSpeed = 150;
	static final int bMilage = 40;
	void bikeCompany();
	void bikeName();
	void bikeAcceleration();
	void bikeMilage();
}

class Home1 implements ICarDetails{

	@Override
	public void carCompany() {
		// TODO Auto-generated method stub
		System.out.println("Car Company is Maruti");
	}

	@Override
	public void carName() {
		// TODO Auto-generated method stub
		System.out.println("Car name is Celerio");
	}

	@Override
	public void carAcceleration() {
		// TODO Auto-generated method stub
		System.out.println("Car acceleration is "+maxSpeed);
	}

	@Override
	public void carMilage() {
		// TODO Auto-generated method stub
		System.out.println("Car milage is "+milage);
	}
	
}

//class Home2 implements 
