package edureka.git.com;

public class Lamp {
	
	//stores the value for light
	//true if light is on
	//false if light is off
	boolean isOn;
	
	//method to turn on the light
	void turnOn() {
		isOn = true;
		System.out.println("Light on? " + isOn);
	}

	public static void main(String[] args) {
		Lamp led = new Lamp();
		
		//access method using object
		led.turnOn();

	}

}
