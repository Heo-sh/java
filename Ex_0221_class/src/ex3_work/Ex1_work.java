package ex3_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
//		Example01
//		Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޴´�.
//		�Է¹��� ���ڿ����� �ҹ��� a�� �� �� �ִ����� �Ǻ��ϴ� �ڵ带 ����
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է��Ͻÿ�: ");
//		String str = sc.next();
//		char[] ch = str.toCharArray();
//		
//		int count = 0;
//		
//		for (int i = 0; i < ch.length; i++) { //ch.length -> str.length() 
//			System.out.println(ch[i] + " ");
//			if (ch[i] == 'a') { //ch[i] -> str.charAt(i)
//				count++;
//			}
//		}
//		System.out.printf("a�� �� ����: %d", count);
		
//		Example02
//		ȸ�����ϱ�
//		ȸ��: ������ �о, �ڷ� �о �Ȱ��� ������ ����
		
//		Ű���忡�� ���ڿ��� �Է¹��� �� �ش� ������ ȸ������ �ƴ����� �Ǵ��ϴ� �ڵ� ����
		
		System.out.println("���ڿ� �Է�: ");
		String ori = sc.next();
		String rev = "";
		
		for (int i = ori.length() - 1; i >= 0; i--) {
			rev += ori.charAt(i);
		}
		
		if (ori.equals(rev)) { //ori == rev
			System.out.println(ori + "��(��) ȸ���̴�.");
		} else {
			System.out.println(ori + "��(��) ȸ���� �ƴϴ�.");
		}
				
	}
}
