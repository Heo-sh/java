
package ex6_car;

public class HybridWaterCar extends HybridCar {
	int waterGauge = 0;
	
//	변수를 받음
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
//	출력을 추가한다.
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물의 양: " + waterGauge);
	}
}
