package ex2_operator;

public class Ex3_operator {
	public static void main(String[] args) {
//		��Ʈ������
//		- &, |, ^, ~
//		- ���������ڿ� ���������� bit����(2����)�� ���길 ����
//		- �Ϲ������� ��ȣȭ, ��ȣȭ �۾��� ���
		
		int a = 10; //2����: 1010
		int b = 7; //2����: 0111
		int c = a & b; //������(and): 2������ �ٲ��� �� �� ���� ��� 1�� ���� ����� 1, �������� 0
		System.out.println(c); // 2
		
		c = a | b; //������(or): 2������ �ٲ��� �� �� ���� ��� 0�̸� 0, �������� 1
		System.out.println(c); // 15
		
		c = a ^ b; //��Ÿ��or(xor): 2������ �ٲ��� �� �� ���� ���� ������ 0, �ٸ� ���� 1
		System.out.println(c); // 13
		
		System.out.println(~c); // -14
		
//		����������
//		- 1�� ������Ű�ų� 1�� ���ҽ����ִ� ������
//		- ++, --
//		= ��������
//		- ������ �տ��� ����� �ȴ�.
		a = 10;
		System.out.println(++a); //11
	
//		= ��������
//		- ������ �ڿ��� ����� �ȴ�.
//		- ���� ���� �ٽ� �ѹ� ���� �� ����
		b = 10;
		System.out.println(b++); //10
		System.out.println(b); //11
		
		a = 7;
		++a;
		++a;
		a++;
		++a;
		a++;
		a++;
		a++;
		System.out.println(a); //14
		
//		Example01
//		a = 10;
//		b = 12;
//		++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10;
//		11 >= 12 or 9 <= 12 and 1 >= 0 and 23 - 11 > 10;
//		True and True
		
//		����: True
		
//		Example02
//		�������� �ִ�
//		��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ����
//		5, 7, 5
//		���������� �Ϸ翡 ����Ǵ� �� ������ ����ϰ�,
//		�ð��� ��ü ������ ��� ���갳���� ���
//		��հ��� ��� ������ float���� ���� ��
		
		int p = 5;
		a = 7;
		int o = 5;
		int sum = p + a + o;
		System.out.println("�Ϸ翡 ����Ǵ� �� ���� : " + sum);
		float avg = (float)sum/24;
		//���� / ���� -> ����, �Ǽ� / ���� -> �Ǽ�, ����/�Ǽ� -> �Ǽ�, �Ǽ�/�Ǽ� -> �Ǽ�
		System.out.println("�ð��� ������ ��� ���� ���� : " + avg);
		
		
	}
}