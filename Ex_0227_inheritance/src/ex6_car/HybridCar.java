package ex6_car;

public class HybridCar extends Car {
	int electricGauge = 0;
	
//	파라미터를 HybridWaterCar클래스에서 받아 electricGauge 변수에 대입
	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;		
	}
	
//	출력을 추가
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 전기량: " + electricGauge);
	}
	


}
