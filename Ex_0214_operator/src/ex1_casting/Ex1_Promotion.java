package ex1_casting;

public class Ex1_Promotion {
	public static void main(String[] args) {
//		����ȯ: �ڷ����� �ٲ��ִ� ��
//		- Promotion: ���� �ڷ����� ū �ڷ������� �����ϴ� �� (�ڵ�����ȯ, �Ͻ�������ȯ)
//		- Demotion: ū �ڷ����� ���� �ڷ������� �����ϴ� �� (��������ȯ, ���������ȯ)
		
//		Promotion�� ��
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n; //n�� ���� d��� ������ �����Ѵ�.
		
		System.out.println("d�� �� : " + d); //���: 200.0
		
		char c = 'A'; //2byte
		long l = 100; //8byte
		l = c;
		
//		'A'�� �ش��ϴ� �ƽ�Ű�ڵ� ���� ����� �Ǵµ�, ���ڿ����� ������ ��ȯ�� �Ǿ ����� �� ���̴�.
		System.out.println("l�� �� : " + l); //���: 65
	}
}
