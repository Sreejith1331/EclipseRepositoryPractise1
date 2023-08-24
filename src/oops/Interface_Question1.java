package oops;

public class Interface_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human objH = new Human();
		objH.eat();
		objH.sleep();
		objH.bite();
		objH.jump();
		objH.speak();
	}

}

interface Animal{
	void eat();
	void sleep();
}

class Monkey{
	public void jump() {
		System.out.println("Monkey jumps");
	}
	
	public void bite() {
		System.out.println("Monkey bites");
	}
}

class Human extends Monkey implements Animal{
	public void speak() {
		System.out.println("Human speaks");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Humans eat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Humans sleep");
	}
}