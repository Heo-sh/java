package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
//		�ٸ� Ŭ������ �ִ� ������ �Լ��� ����ϱ� ���ؼ���
//		�ش� Ŭ������ ��üȭ �ؾ� �Ѵ�.
		
//		��ü ������ - �޸� ���� �ּ�ȭ, ���� ����
//		- Ŭ������ ��ü�� = new Ŭ������();
		
		Computer com1 = new Computer();
		
//		�ٸ� Ŭ������ �մ� ������ ��� or �����ϴ� ��
//		- ��ü��.������ = ������; -> ��üȭ
		
//		��¹�
		
//		System.out.println("cpu: " + com1.cpu);
//		System.out.println("ram: " + com1.ram);
//		System.out.println("ssd: " + com1.ssd);
//		System.out.println("color: " + com1.color);
//		
//		System.out.println("----------------------------------");
		
//		���Թ�
		
		Computer com2 = new Computer();		
		
		com2.ram = 128;
		
//		System.out.println("cpu: " + com2.cpu);
//		System.out.println("ram: " + com2.ram);
//		System.out.println("ssd: " + com2.ssd);
//		System.out.println("color: " + com2.color);		
//				
//		System.out.println("----------------------------------");

//		new�� ���� ����� ��ü������ �߱⿡ ���� ������ ����Ǵ� �ּҸ� �޸� ����.
		
//		if (com1.equals(com2)) {
//			System.out.println("�ּҰ� ����.");
//		} else {
//			System.out.println("�ּҰ� �ٸ���");
//		}
		
//		�޼���ȣ���
//		- ��ü��.�޼����: ȣ���
		
		com1.getInfo();
		com2.getInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
