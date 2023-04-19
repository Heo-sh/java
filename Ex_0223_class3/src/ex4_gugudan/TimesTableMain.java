package ex4_gugudan;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		TimesTable dan = new TimesTable();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력할 단을 입력: ");
		int a = sc.nextInt();
		
		dan.showTable(a);
		
	}
}
