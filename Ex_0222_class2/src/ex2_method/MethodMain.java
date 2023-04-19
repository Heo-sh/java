package ex2_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest(); //객체 생성
		int num = mt.f(3); //함수 호출 및 값을 담을 변수 생성, 파라미터 전달
		System.out.println(num);
		
//		함수의 기본 원리
//		1. 함수 구현 및 객체 생성
//		2. 함수 호출 and 값을 담을 변수 생성
//		3. 파라미터 전달
//		4. 계산 후 반환
		
		int su = 10;
		
		mt.test(su); //출력-> su: 11
//		파라미터로 쓰인 변수의 값은 복사되어 전달되기 때문에 기존의 변수 값은 변하지 않는다.
		System.out.println(su); //출력: 10
		
//		Example01
//		두 개의 정수를 더하는 add함수를 구현,
//		main에서 add함수를 호출, 두 수의 숫자를 입력 및 결과 출력하라.
		
//		int n3 = mt.add(9, 6);
//		
//		System.out.println(n3);
		
//		mt.add(16, 6);
		
//		Homework
//		1~n까지 총합을 구해주는 함수 만들기.
		int n1 = mt.total(10);
		int n2 = mt.total(90);
//		mt.total(2);
//		mt.total(150);
		
		System.out.println(n1);
		System.out.println(n2);
		
		System.out.println("--------------------------");
		
		mt.sum();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단 숫자를 입력하세요: ");
		int x = sc.nextInt();
		
		mt.dan(x);
		
		
		
		
		
		
		
		
	}
}
