package ex1_casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
//		Demotion: ū �ڷ����� ���� �ڷ����� ����
		char c = 'B'; //2byte B�� �ƽ�Ű�ڵ� ���� 66
		int n = c + 1; //��������� Promotion ĳ���� 66 + 1 = 67�̸�,
//		c = n; //c�� 2byte, n�� 4byte�̹Ƿ� ���� �߻� 
		c = (char)n; //67�� �ƽ�Ű�ڵ�� ��ȯ�ϸ� C�̴�.
		
		System.out.println("c�� �� : " + c); //���: C
		
		float f = 5.5f; //floay�� ũ��� 4byte�̳� �Ҽ������� �����ϸ� 4���ٴ� �� �� ũ��.
		int n1 = 0;
		
//		n = f; //���� 4byte���� �ڷ����� ��ġ���� ������ ���� X
		n1 = (int)f; 
//		float���� int�� ĳ���õǸ鼭 �Ҽ��� ���� �ڸ��� ����ϰ� �ȴ�.
		System.out.println("n�� �� : " + n1); //��� : 5
		
		byte b3 = 100;
		byte b4 = 20;
		
		byte b5;
		
		b5 = (byte)(b3 + b4);
		System.out.println(b5);
	}
}
