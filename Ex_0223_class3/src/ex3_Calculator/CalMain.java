package ex3_Calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		CalTest num1 = new CalTest();

		num1.setA(5);
		num1.setB(6);
		num1.setCal("-");
		
		num1.getCal();
	
		System.out.println();
		
		CalTest calculator = new CalTest();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("��1: ");
//		int su1 = sc.nextInt();
//		System.out.println("��2: ");
//		int su2 = sc.nextInt();
//		System.out.println("������: ");
//		String op = sc.next();
//		
//		int result = calculator.calculator(su1, su2, op);
//		
//		System.out.printf("���: %d",result);
	}
}
