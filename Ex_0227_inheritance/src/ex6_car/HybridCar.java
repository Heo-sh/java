package ex6_car;

public class HybridCar extends Car {
	int electricGauge = 0;
	
//	�Ķ���͸� HybridWaterCarŬ�������� �޾� electricGauge ������ ����
	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;		
	}
	
//	����� �߰�
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("�ܿ� ���ⷮ: " + electricGauge);
	}
	


}
