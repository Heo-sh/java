package ex5_Abstract;

abstract public class Unit {
	String name; //�̸�
	int energy = 0; //ü��
	
	public int getEnergy() {
		return energy;
	}
	
//	ĳ���Ͱ� ������ ������ �� ü�� ���ҷ��� ���� ���� �� �� ����.
//	���� ���� ��� ��� ������ ������ �𸣴ϱ� so �߻�޼���� ����
	abstract public void decEnergy();
}
