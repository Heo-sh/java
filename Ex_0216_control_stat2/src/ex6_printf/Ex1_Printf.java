package ex6_printf;

public class Ex1_Printf {
	public static void main(String[] args) {
//		printf
//		- ���ڿ��� ������ ����ִ� �����͸� �Բ� ����� �� �ֵ��� �����ִ� ��������
//		- f == format�̶�� ��
		
//		%d: ������ �����͸� �Է¹��� �� ��� -> int, long
//		%c: ������ �����͸� �Է¹��� �� ��� -> char
//		%s: ���ڿ�(����) �����͸� �Է¹��� �� ��� - String
//		%f: �Ǽ��� �����͸� �Է¹��� �� ��� -> double, float
		
		int su1 = 10;
		int su2 = 7;
		
		System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
		System.out.printf("%d + %d = %d\n", su1, su2, su1 + su2);

//		\n: �ٹٲ�
		
		System.out.println("------------------------------------");
		
//		Ex01
//		�� ���̴� 30���Դϴ�.
		int age = 30;
		System.out.printf("�� ���̴� %d�� �Դϴ�.\n", age);
		
		System.out.println("------------------------------------");
		
//		Ex02
//		�� �̸��� ooo�̰�, �� ���̴� oo���̰�, �� Ű�� ooo.ocm�̰�, �� �������� oo���Դϴ�.
		String name = "�㼺��";
		int age2 = 29;
		double hei = 172.3;
		String blood = "A";
		
		System.out.printf
		("�̸��� %s�̰�, ���̴� %d���̰�, Ű�� %.1fcm�̰�, �������� %s���Դϴ�.\n", name, age2, hei, blood);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
