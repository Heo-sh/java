package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
//		Example1
//		�� ���� ������ ������ �ʱ�ȭ �Ѵ� (���� ����)
//		�׸��� ��������ڸ� ����� ���ڿ� ������ �����.
//		switch���� �̿��Ͽ� ������ ������ �����ϴ� ���� �ڵ� �ۼ��ϱ�
		int n1 = 10;
		int n2 = 2;
		
		String op = "*";
		
		switch (op) {
		case "+":
			System.out.println("���� �� : " + (n1 + n2));
			break;
		case "-":
			System.out.println("���� �� : " + (n1 - n2));
			break;
		case "*":
			System.out.println("���� �� : " + (n1 * n2));
			break;
		case "/":
			System.out.println("������ �� : " + (n1 / n2));
			break;
		}
	
//		Example2
//		������ ������ �ϳ� ����� ��(1, 2��)�� �����Ѵ�.
//		�ش� ���� �� �ϱ��� �ִ��� Switch���� �̿� �ۼ�
		
		int month = 8;
		
//		switch (month) {
//		case 1:
//			System.out.println(month + "���� 1�Ϻ��� 31�ϱ����Դϴ�.");
//			break;
//		case 2:
//			System.out.println(month + "���� 1�Ϻ��� 28�ϱ����Դϴ�.");
//			break;
//		case 3:
//			System.out.println(month + "���� 1�Ϻ��� 31�ϱ����Դϴ�.");
//			break;
//		case 4:
//			System.out.println(month + "���� 1�Ϻ��� 28�ϱ����Դϴ�.");
//			break;
//		case 5:
//			System.out.println(month + "���� 1�Ϻ��� 31�ϱ����Դϴ�.");
//			break;
//		case 7:
//			System.out.println(month + "���� 1�Ϻ��� 31�ϱ����Դϴ�.");
//			break;
//		case 8:
//			System.out.println(month + "���� 1�Ϻ��� 31�ϱ����Դϴ�.");
//			break;
//		case 9:
//			System.out.println(month + "���� 1�Ϻ��� 30�ϱ����Դϴ�.");
//			break;
//		case 10:
//			System.out.println(month + "���� 1�Ϻ��� 31�ϱ����Դϴ�.");
//			break;
//		case 11:
//			System.out.println(month + "���� 1�Ϻ��� 30�ϱ����Դϴ�.");
//			break;
//		case 12:
//			System.out.println(month + "���� 1�Ϻ��� 31�ϱ����Դϴ�.");
//			break;
//		default:
//			System.out.println(month + "���� �����ϴ�.");
//			break;
//		}
		
//		Example2�� break�� 3���� �Ἥ ����� - ����� ���� ��� case�� �� �ٿ� ���� �� �� �ִ�.
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "���� 1�Ϻ��� 31�ϱ����Դϴ�.");
			break;
		case 2:
			System.out.println(month + "���� 1�Ϻ��� 28�ϱ����Դϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� 1�Ϻ��� 30�ϱ����Դϴ�.");
			break;
		}		
	}
}
