
package ex6_car;

public class HybridWaterCar extends HybridCar {
	int waterGauge = 0;
	
//	������ ����
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
//	����� �߰��Ѵ�.
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("�ܿ� ���� ��: " + waterGauge);
	}
}
