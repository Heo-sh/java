package ex1_enum;

public enum Transportation {
//	enum Ŭ�������� �߻� Ŭ������ ����Ͽ��� Ŭ���������δ� ������ ���� �ʰ�
//	����鿡�� ������ ����.
//	- �߻�޼��带 ����� ������ �ؾ� �ϱ⿡
	
	BUS(100) { //�͸� Ŭ����(�̸��� ���� Ŭ����)��� �Ѵ�
//					- �������� �ʰ� �ѹ��� ���ڴ�. (��ȸ��)
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return fare * distance;
		} //�߻�Ŭ������ ����� ������� '��� ��ü ��'�� �͸� Ŭ������ ������ �ؾ��Ѵ�.
	},
	TRAIN(150) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return fare * distance;
		} 
	},
	SHIP(200) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return fare * distance;
		}
	},
	AIRPLANE(250) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return fare * distance;
		}
	};
	
	protected final int fare;
	
	private Transportation(int fare) {
		this.fare = fare;
	} 

	//����Ÿ��� distance ������ �޴� �߻� �޼���
	abstract int totalFare(int distance);
}
