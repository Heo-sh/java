package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
//		Child Ŭ������ Parent Ŭ������ ��ӹ��� �����̹Ƿ�
//		�θ�κ��� ��ӹ��� money, home ���� ������ ������� �����ٰ�
//		��� ����
		
		Child c1 = new Child();
		
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.home);
		
		System.out.println("-------------------");
		
//		��Ӱ����� ������ �θ�Ŭ������ �ڽ��� ����� �������
//		�����ٰ� ��� �Ұ�
		
		Parent p1 = new Parent();
		System.out.println(p1.money);
		System.out.println(p1.home);
//		System.out.println(p1.car); //Error

		System.out.println("-------------------");
		
//		c1�� Parent�� ��Ӱ�����
//		instanceof Ű���带 ���ؼ� true���� ���� �� �ִ�.
//		- �ڽ�Ŭ������ �θ�Ŭ������ �ּҰ� ����
		
		if (c1 instanceof Parent) {
			System.out.println("c1�� Parent�� �ڽ�");
		}
		
		
//		���ϻ��ü��
//		- 1. �Ѹ��� �ڳడ �θ��� �θ� ���� �� �Ұ���
//		- 2. ���� � ��Ȳ�� �Ƶ� ��Ӱ����� ����⿡�� Object�� �ִ�.
//		Object�� ��� Ÿ���� �޾Ƶ��� �� �ִ� �ֻ��� ��ü
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
