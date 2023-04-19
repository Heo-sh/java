package ex6_updown;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Start i = new Start();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("숫자 입력: ");
			int num = sc.nextInt();
			
			if (i.updown(num).equals("정답")) {
				System.out.println(i.count + "회 만에 정답!");
				break;
			} else {
				System.out.println(i.updown(num));
				i.count++;
			}
		}
	}
}
