package ex4_calculator;

public class CalMain {
	public static void main(String[] args) {
//		Calculator Ŭ������ ����� getResult() �Լ��� ����. ��ȯ���� ����
//		�Ķ���ʹ� n1, n2 �ΰ��� �ް� -1�� return �մϴ�.
		
//		CalPlus Ŭ������ ����� Calculator Ŭ������ ��ӹ�������
//		�������̵��� �̿��Ͽ� Calculator�� getResult()�Լ��� ���ڷ� �޴� n1, n2�� �����ִ� �Լ��� �����.
//		�� �� return���� -1�̸� �ȵȴ�.
		
//		CalMinus Ŭ������ ����� Calculator Ŭ������ ��ӹ�������
//		�������̵��� �̿��Ͽ� Calculator�� getResult()�Լ��� ���ڷ� �޴� n1, n2�� ���ִ� �Լ��� �����.
//		�� �� return���� -1�̸� �ȵȴ�.
		
//		Main���� �����Ͽ� �Ʒ��� ���� ����� ������ ����
//		CalPlus: 30
//		CalMinus: 15
		Calculator cal = new Calculator();
		CalPlus plus = new CalPlus();
		CalMinus minus = new CalMinus();
		
		int cal1 = cal.getResult(15, 15);
		
		System.out.println(cal1);
		
		int n1 = plus.getResult(15, 15);
		int n2 = minus.getResult(30, 15);
		
		System.out.println("CalPlus: " + n1);
		System.out.println("CalMinus: " + n2);
	}
}
