package oops;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child objCh = new Child();
		objCh.add();
		objCh.subtract();
	}

}

class Parent{
	 public void add() {
		System.out.println("Addition");
	}
}

class Child extends Parent{ 
	 public void subtract() {
		System.out.println("Subtraction");
	}
}
