package oops;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChildren objGC = new GrandChildren();
		objGC.firstGeneration();
		objGC.secondGeneration();
		objGC.thirdGeneration();
	}

}

class GrandParents {
	public void firstGeneration() {
		System.out.println("First Genaration of the Family");
	}
}

class Parents extends GrandParents {
	public void secondGeneration() {
		System.out.println("Second Generation of the Family");
	}
}

class GrandChildren extends Parents{
	public void thirdGeneration() {
		System.out.println("Third Generation of the Family");
	}
}
