package oops;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford objFord = new Ford();
		objFord.accelerator();
		objFord.Break();
		objFord.comfort();
		
		Ferari objFerari = new Ferari();
		objFerari.accelerator();
		objFerari.Break();
		objFerari.speed();
	}

}

class Cars{
	public void accelerator() {
		System.out.println("To increase the speed");
	}
	public void Break() {
		System.out.println("To reduce the speed");
	}
}
class Ford extends Cars{
	public void comfort() {
		System.out.println("Comfor for drive");
	}
}
class Ferari extends Cars{
	public void speed() {
		System.out.println("High speed of the car");
	}
}
