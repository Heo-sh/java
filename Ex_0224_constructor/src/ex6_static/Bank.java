package ex6_static;

public class Bank {
//	static
//	- ��ü�� �ƹ��� ���� �����Ǿ �޸� �� �� �� ���� ��������� ������ �޼���
//	- �������� ���ڸ�ü�� �ٲ��.
//	- static���� �����ϴ� ���� H������ �ƴ� static �������� �����.
//	- ��ü �̸��� �ƴ� Ŭ���� �̸����� �����ϴ� �� ������ ����̴�.
//	- ��ü ���� ���̵� ������ �����ٰ� ����� �� �ִ�.
//	- static ������ ������ ���α׷��� ����Ǳ���� �ð��� ���� �ɸ���.
	
	private String name = "�츮����";
	private String point;
	private String tel;
	static float interest = 10f;
	
//	�����ڸ� setteró�� ���
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
//	����� ����� �޼���: getter
	public void printBank() {
		System.out.println("�̸�: " + name);
		System.out.println("������ġ: " + point);
		System.out.println("��ȭ��ȣ: " + tel);		
		System.out.println("������: " + interest + "%");
		System.out.println("-----------------------");
	}
	
	
	
	
	
	
}
