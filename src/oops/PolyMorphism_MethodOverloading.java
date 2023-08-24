package oops;

public class PolyMorphism_MethodOverloading {
	int no1, no2, sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyMorphism_MethodOverloading obj = new PolyMorphism_MethodOverloading();
		obj.add();
		obj.add(33, 44);
		obj.add(77, 88.4);
		obj.add(33.4, 58);
	}
	
	public void add() {
		no1=10; no2=20;
		sum=no1+no2;
		System.out.println("Sum of "+no1+","+no2+" values: "+sum);
	}
	public void add(int z, int x) {
		sum=z+x;
		System.out.println("Sum of "+z+","+x+" values: "+sum);
	}
	public void add(int q, double w) {
		sum=q+(int)w;
		System.out.println("Sum of 2 values: "+sum);
	}
	public void add(double j, int k) {
		sum=(int)j+k;
		System.out.println("Sum of 2 values: "+sum);
	}
}
