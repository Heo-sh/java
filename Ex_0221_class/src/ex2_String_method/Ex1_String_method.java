package ex2_String_method;

public class Ex1_String_method {
	public static void main(String[] args) {
//		�޼���(method)
//		- ��� ����� ������ �ִ� ��ɹ��� ����
//		- �޼��带 ����ϴ� ���� ū ����: �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ�
//		- ���� ����ϴ� ������ �ڵ带 �޼���� �ۼ��Ͽ� �ʿ��� ���� ȣ�� ����
		
//		�޼��� ȣ���
//		��ü��.�Լ���();
		String str = "Hong Gil Dong"; //�Ͻ��� ��ü ����
		
		System.out.println(str);
		
		System.out.println("���ڿ� str�� ����: " + str.length());
		
		int index = str.indexOf('n');
		System.out.println("�� ó�� ���� n�� ��ġ: " + index);
		
		char c = str.charAt(2);
		System.out.println("2�� �ش��ϴ�(����) ����: " + c);
		
		String str2 = str.substring(0, 4);
		System.out.println("�߶� ���ڿ�: " + str2);

		//split(): �Ұ�ȣ �ȿ� ���� �� �������� ���ڿ��� ������ ���ڿ� �迭�� �־��ִ� ���
		String [] str3 = str.split(" ");
		for (int i = 0; i < str3.length; i++) {
			System.out.printf("str[%d]: %s\n", i, str3[i]);
		}
		
		System.out.println(str);
		str = " Hong Gil Dong ";
		
//		trim(): ���ڿ��� �� �� ���� ����
		System.out.println(str.trim());
		
//		String Ŭ������ ���� �ִ� �޼���� �ƴ����� ������ �޼���
//		���ڿ��� �ۼ��� ���ڸ� ���� ������ �ٲ��ִ� �ڵ� -> '���� ������ ���ڿ�'�� �ٲ��ش�.
//		Wrapper Class - Integer(int), Character(char), Float(float), Double(double)
		String number = "1";
		System.out.println(number + 10); //110
		System.out.println(Integer.parseInt(number) + 10); //11
		
//		���� ������ ���ڿ��� �ٲ��ִ� �ڵ�
		int number2 = 1;
		System.out.println(number2 + 10); //11
		System.out.println(Integer.toString(number2) + 10); //110
		
	}
}
