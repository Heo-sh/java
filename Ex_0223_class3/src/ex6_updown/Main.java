package ex6_updown;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Start i = new Start();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("���� �Է�: ");
			int num = sc.nextInt();
			
			if (i.updown(num).equals("����")) {
				System.out.println(i.count + "ȸ ���� ����!");
				break;
			} else {
				System.out.println(i.updown(num));
				i.count++;
			}
		}
	}
}
