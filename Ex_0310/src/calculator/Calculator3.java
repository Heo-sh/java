package calculator;

public class Calculator3 {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		
//		return ���� ����
//		- �߰�ȣ�� ���� �����ؾ� �Ѵ�.
//		- ����� �� ���� ���� ����
		MyCalculator calc2 = (int num1, int num2) -> num1 + num2;		
		
//		�Ķ������ �ڷ��� ���� ����
//		- �����Ϸ��� ��� �Ķ������ �ڷ����� ������ �Ѵ�.
		MyCalculator calc3 = (num1, num2) -> num1 + num2;		
		
//		�Ű������� �ϳ��� �� ���ڸ� ������ִ� ���ٽ� �ۼ�
//		- �Ķ���Ͱ� �ϳ��� ��� �Ұ�ȣ�� ���� ����
		MyFunction func = (int num) -> { //�Ķ����
			System.out.println(num); //��� or return
		};
		MyFunction mf = num -> System.out.println(num);
		
		//::(�����ݷ�): �޼��� ���� ������
//		- ���ٽ��� ���� �����ϰ� ����� �� �ֵ��� ���ش�.
		MyFunction func2 = System.out::println;
		
		
		
		
		
		
		
	}
}
