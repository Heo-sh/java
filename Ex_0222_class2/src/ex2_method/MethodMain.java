package ex2_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest(); //��ü ����
		int num = mt.f(3); //�Լ� ȣ�� �� ���� ���� ���� ����, �Ķ���� ����
		System.out.println(num);
		
//		�Լ��� �⺻ ����
//		1. �Լ� ���� �� ��ü ����
//		2. �Լ� ȣ�� and ���� ���� ���� ����
//		3. �Ķ���� ����
//		4. ��� �� ��ȯ
		
		int su = 10;
		
		mt.test(su); //���-> su: 11
//		�Ķ���ͷ� ���� ������ ���� ����Ǿ� ���޵Ǳ� ������ ������ ���� ���� ������ �ʴ´�.
		System.out.println(su); //���: 10
		
//		Example01
//		�� ���� ������ ���ϴ� add�Լ��� ����,
//		main���� add�Լ��� ȣ��, �� ���� ���ڸ� �Է� �� ��� ����϶�.
		
//		int n3 = mt.add(9, 6);
//		
//		System.out.println(n3);
		
//		mt.add(16, 6);
		
//		Homework
//		1~n���� ������ �����ִ� �Լ� �����.
		int n1 = mt.total(10);
		int n2 = mt.total(90);
//		mt.total(2);
//		mt.total(150);
		
		System.out.println(n1);
		System.out.println(n2);
		
		System.out.println("--------------------------");
		
		mt.sum();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ������ ���ڸ� �Է��ϼ���: ");
		int x = sc.nextInt();
		
		mt.dan(x);
		
		
		
		
		
		
		
		
	}
}
