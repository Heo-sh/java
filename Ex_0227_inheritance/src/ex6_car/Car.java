package ex6_car;

public class Car {
	int gasGauge = 0;
	
	public Car(int gasGuage) {
		this.gasGauge = gasGuage;		
	}
	
	public void showCurrentGauge() {
		System.out.println("ÀÜ¿© °¡½º·®: " + gasGauge);
	}
}
