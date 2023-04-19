package ex6_car;

public class CarMain {
	public static void main(String[] args) {
//		Car클래스는 gasGauge 변수를 가지고 있고,
//		잔여 가스량을 출력하는 함수인 showCurrentGauge()를 가지고 있다.
		
//		HybridCar클래스는 electricGauge 변수를 갖고 있고,
//		Car클래스를 상속하고, 생성자를 생성할 때 gasGauge, electricGauge를 파라미터로 받는다.
//		메서드는 오버라이딩을 이용하여 잔여 가스량과 잔여 전기량을 출력
		
//		HybridWaterCar클래스는 waterGauge 변수를 갖고 있고,
//		HybridCar클래스를 상속받고, 생성할 때
//		gasGauge, electricGauge, waterGauge를 파라미터로 받는다.
//		메서드는 오버라이딩을 하여, 잔여 가스, 전기, 물의 양을 출력
		
//		main에서 HybridWaterCar 객체를 생성, 다음과 같은 결과 출력
		
//		잔여가스량: 15
//		잔여전기량: 30
//		잔여물의 량: 25
		
		HybridWaterCar wc = new HybridWaterCar(250, 300, 210);
		wc.showCurrentGauge();
		
	}
}
