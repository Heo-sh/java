package ex2_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		//���׿�����(?, :)
//		- �ϳ��� ������ �����Ͽ�, ������ ���� �� ��ȯ�� ���, ������ ������ ������ �� ��ȯ�� �����
//		     ���� ���� ������
		
		int a = 10;
		int b = 15;
		
		boolean result = ++a >= b ? true : false; // �ڿ� ���� ����� ���� ������ �ʿ�� ����.
		System.out.println(result); //false
		
		char result2 = ++a >= b ? 'O' : 'X'; // ��ȯ�� ��ɰ� ����� ���� ������ type�� �����ؾ��Ѵ�
		System.out.println(result2); //X
		
		int result3 = ++a >= b ? 1 : 0;
		System.out.println(result3); //0
	}
}
