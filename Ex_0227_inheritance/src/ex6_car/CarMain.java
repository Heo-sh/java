package ex6_car;

public class CarMain {
	public static void main(String[] args) {
//		CarŬ������ gasGauge ������ ������ �ְ�,
//		�ܿ� �������� ����ϴ� �Լ��� showCurrentGauge()�� ������ �ִ�.
		
//		HybridCarŬ������ electricGauge ������ ���� �ְ�,
//		CarŬ������ ����ϰ�, �����ڸ� ������ �� gasGauge, electricGauge�� �Ķ���ͷ� �޴´�.
//		�޼���� �������̵��� �̿��Ͽ� �ܿ� �������� �ܿ� ���ⷮ�� ���
		
//		HybridWaterCarŬ������ waterGauge ������ ���� �ְ�,
//		HybridCarŬ������ ��ӹް�, ������ ��
//		gasGauge, electricGauge, waterGauge�� �Ķ���ͷ� �޴´�.
//		�޼���� �������̵��� �Ͽ�, �ܿ� ����, ����, ���� ���� ���
		
//		main���� HybridWaterCar ��ü�� ����, ������ ���� ��� ���
		
//		�ܿ�������: 15
//		�ܿ����ⷮ: 30
//		�ܿ����� ��: 25
		
		HybridWaterCar wc = new HybridWaterCar(250, 300, 210);
		wc.showCurrentGauge();
		
	}
}
