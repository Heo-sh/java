package ex2_operator;

public class Ex2_operator {
	public static void main(String[] args) {
//		���Կ�����
//		- �캯�� �ִ� ���� �º��� �����Ѵ�.
		
		int n1 = 10;
		int n2 = 7;
		
		System.out.println("=������ : n1 : " + n1 + " n2 : " + n2);
		
//		���մ��Կ�����
//		- ��������ڿ� ���Կ����ڰ� ������ ����(+=, -=, *=, /=, %=)
		
//		+=������ - �������� ���� �� ���� ����
		System.out.println("n1 += n2 : " + (n1 += n2)); //n1 = n1 + n2 ���: 17
		
//		-=������
		System.out.println("n1 -= n2 : " + (n1 -= n2)); //n1 = n1 - n2 ���: 10
		
//		*=������
		System.out.println("n1 *= n2 : " + (n1 *= n2)); //n1 = n1 * n2 ���: 70
		
//		/=������
		System.out.println("n1 /= n2 : " + (n1 /= n2)); //n1 = n1 / n2 ���: 10
		
//		%=������
		System.out.println("n1 %= n2 : " + (n1 %= n2)); //n1 = n1 % n2 ���: 3
		
//		�񱳿�����
//		- �� ���� ���� ���� �� ����ϴ� ������
//		- ���� ����� ���� ������(true or false)�� ��ȯ�Ѵ�.
//		- >(�ʰ�), <(�̸�), >=(�̻�), <=(�̸�), ==(����), !=(���� �ʴ�)
		
		n1 = 10;
		n2 = 7;
		boolean result;
		
		result = n1 < n2;
		System.out.println(result); //false
		
		result = n1 == n2;
		System.out.println(result); //false
		
		result = n1 != n2;
		System.out.println(result); //true
		
//		��������
//		- �񱳿����ڸ� ���� ������ 2�� �̻� �ʿ��� �� ���
//		- &&, ||, !
//		- �������� ���� ������(true of false)�� ��ȯ�Ѵ�.
		
//		&&: �� ���� ������ ��� True���� True�� ��ȯ�Ѵ�. And(�׸���)�� �ǹ̸� ������.
//		- �� && �� -> True
//		- �� && ���� -> False
//		- ���� && �� -> False => ���� ������ �����̸� ���� ������ �������� �ʴ´�.
//		- ���� && ���� -> False
		result = n1 > n2 && n1 != n2;
		System.out.println(result); //true
		
//		||: �� ���� ���� �� �� �� �ϳ��� ���̸� True�� ��ȯ, Or(�Ǵ�)�� �ǹ̸� ����.
//		- �� || �� -> True
//		- �� || ���� -> True => ���� ������ ���̸� ���� ������ ���� X
//		- ���� || �� -> True
//		- ���� || ���� -> True
		result = n1 < n2 || n1 != n2;
		System.out.println(result); //true
		
//		!: not�� �ǹ̸� ������. True -> False, False -> True�� �ٲ��ش�.
		
//		���� result ���� True�̴�.
		System.out.println(!result); //false
	}
}
