package ex8_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
//		Ű���忡�� ���� �Է¹ް� �ش��ϴ� ������ ���
//		2~9 �̿��� ���� �ԷµǸ�
//		"2~9 ������ ���ڸ� �Է��ϼ���" ���
		
		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
//		
//		for (int i = num; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (num < 2 || num > 9) {
//					System.out.println("2~9 ������ ���ڸ� �Է��ϼ���");
//				}
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
//			}
//		}
		
//		System.out.println("���ϴ� ������ ���� �Է�: ");
//		int dan = sc.nextInt();
//		
//		if (dan < 2 || dan > 9) {
//			System.out.println("2~9 ������ ���ڸ� �Է����ּ���");
//			} else {				
//				for (int i = 1; i <= 9; i++) {
//					System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//			}
//		}
		
//		homework
//		Scanner�� ���� ���� n1, n2�� �Է¹޴´�.
//		�׸��� n1���� n2������ ���� ����Ͽ� �� ����� ����ϴ� ���α׷��� �ۼ�
//		ex) 2�� 5�� �Է¹����� 2+3+4+5�� �������� 14�� ���
//		n1�� n2���� ũ�ٸ� �������� �ڸ��� �ٲ� �־ ��� ����ϱ�
//		ex) 5�� 2�� �Է¹����� 2+3+4+5�� ����� 14���
		
		System.out.println("n1�� ���� �Է�: ");
		int n1 = sc.nextInt();
		System.out.println("n2�� ���� �Է�: ");
		int n2 = sc.nextInt();
		
		int total = 0;
		
//		int min = n1;
//		int max = n2;
//		if (min > n2) {
//			min = n2;
//			max = n1;
//		}
		
//		for (int i = min; i <= max; i++) {
//			total += i;
//		}
//		System.out.printf("%d�� %d������  ��: %d",min , max, total);
		
		
//		System.out.printf("n1�� n2�� ��: %d", n1+n2);
		
		if (n1 >= n2) {
			for (int i = n2; i <= n1; i++) {
				total += i;
			} 
			System.out.printf("%d�� %d������  ��: %d", n1, n2, total);
		} else if (n2 >= n1) {
			for (int i = n1; i <= n2; i++) {
				total += i;
			}
			System.out.printf("%d�� %d������  ��: %d", n2, n1, total);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
