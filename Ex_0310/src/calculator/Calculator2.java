package calculator;

public class Calculator2 {
	public static void main(String[] args) {
//	���� ���� �͸� Ŭ����
//	- �͸� Ŭ������ ���� Ŭ����(inner class)�� ��������
//	�̸��� ���� Ŭ�����̴�.
//	- ���߿� �ٽ� �ҷ��� ������ ���ٴ� ���� �����Ѵ�.
//	��, ���α׷����� �Ͻ������� ���ǰ� �������� ��ü��� ���� �ȴ�.
//	- ��ȸ�� Ŭ����
//	- �̸��� ���⿡ �����ڸ� ���� �� ����.

		int num3 = 30;

		MyCalculator calc = new MyCalculator() {
//			num3 = 40; //���Ӱ� ���� �����Ϸ��µ� ������ ����.
			// ������ ���ȭ�� �Ͼ�⿡ ������ ����.
			// final int num3
			@Override
			public int plus(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 + num2;
			}
		};

	}
}
