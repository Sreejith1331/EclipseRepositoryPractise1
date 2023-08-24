package oops;

public class Polymorphism_MethodOverriding {
	String job, phone;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildProperties objC = new ChildProperties();
		objC.childJob="Software Tester";
		objC.childPhone="Xiomi";
		objC.parentJob="Teacher";
		objC.parentPhone="Honor";
		objC.job();
		objC.phone();
	}

}

class ParentProperties{
	String parentJob, parentPhone;
	public void job() {
		System.out.println("Parent's job is: "+parentJob);
	}
	public void phone() {
		System.out.println("Parent's phone is: "+parentPhone);
	}
}

class ChildProperties extends ParentProperties{
	String childJob, childPhone;

	@Override
	public void job() {
		// TODO Auto-generated method stub
		super.job();
		System.out.println("Child's job is: "+childJob);
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("Child's phone is: "+childPhone);
		super.phone();
	}
	
}
