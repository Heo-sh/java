package ex5_Abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("�غ�", 50, false); //���� ����
		System.out.println("t1�� ������: " + t1.energy); //ó�� ���� ���� ü��: 50
		t1.decEnergy(); //�������� decEnergy() ȣ�� -> ������ ����
		System.out.println("t1�� ������: " + t1.getEnergy()); //������ ���� ���� ü��: 47
		
		Protoss p1 = new Protoss("������", 150, false);
		System.out.println("p1�� ������: " + p1.energy); //150
		p1.decEnergy(); // -1
		p1.decEnergy(); // -1
		p1.decEnergy(); // -1
		System.out.println("p1�� ������: " + p1.getEnergy()); //147
		
		Zerg z1 = new Zerg("��������", 100, true);
		System.out.printf("%s�� ������: %d\n", z1.name, z1.energy);
		z1.decEnergy();
		System.out.printf("%s�� ������: %d\n", z1.name, z1.energy);

	}
}	
