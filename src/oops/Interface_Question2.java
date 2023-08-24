package oops;

public class Interface_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv objStv = new SmartTv();
		objStv.switchOn();
		objStv.switchOff();
		objStv.volumeUp();
		objStv.volumeDown();
		objStv.bluetooth();
		objStv.usbPort();
	}

}

interface ItvRemote{
	void volumeUp();
	void volumeDown();
	void switchOn();
	void switchOff();
}

interface IsmartTVremote extends ItvRemote{
	void bluetooth();
	void youtube();
	void usbPort();
}

class SmartTv implements ItvRemote, IsmartTVremote{

	@Override
	public void bluetooth() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV has bluetooth connection");
	}

	@Override
	public void youtube() {
		// TODO Auto-generated method stub
		System.out.println("Smart TV has YouTube connection");
	}

	@Override
	public void usbPort() {
		// TODO Auto-generated method stub
		System.out.println("Smart TV has USB port");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("TV remote has volume up button");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("TV Remote have Volume down button");
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("TV Remote has Switch ON button");
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("TV Remote has Switch Off button");
	}
	
}
