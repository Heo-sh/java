package ex1_single_for;

public class Ex1_for {
	public static void main(String[] args) {
//		제어문: 코드의 흐름을 제어하는 문장
//		반목문: 특정 수행문을 원하는 만큼 반복하여 실행하는 제어문
//		- for
//		- while
		
//		for문: 특정 명령을 원하는 만큼 반복적으로 처리할 때 사용
//		- 기본형
//		for(초기식; 조건식; 증감식) {
//			조건이 참일 때 반복하고자 하는 명령
//		}
		
//		초기식: 반복을 시작하기 위한 시작값 - 변수를 하나 초기화 시킨다. / 초기값
//		조건식: 반복을 하기 위한 종료값 - 비교연산자 많이 사용 / 종료값
//		증감식: 초기식의 변수값을 증감시켜주는 역할 - 증감연산자 많이 사용 / 증감값
		
//		for문 사용 팁!
//		1) 내가 반복하고자 하는 횟수에 집중할 것
//		2) i를 사용할 수 있다면 적극 사용하기
		
		for (int i = 0; i < 3; i++) { // int i -> 지역변수
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------");
		
//		System.out.println(i); -> i는 for문 안에서 만들어진 변수라서 바깥에서는 사용할 수 가 없다.
//		- 허나, 사용을 하려면 main 영역 안 쪽에서 i를 선언해서 사용할 수 있다. -> 지역, 전역변수의 개념 -> 상대적인 개념이다.
//		ex)
//		int i; -> 전역변수
//		for (i = 0; i < 3; i++) {
//			System.out.println(i);
//		}
		
//		Example01
//		1~10까지 출력하는 for문 작성하기
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " "); // -> print는 가로로 출력이 된다.
		}
		
		System.out.println();
		
		int n = 1;
		for (int i = 0; i < 10; i++) {
			System.out.print(n++ + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		
//		Example02
//		10 ~ 1까지 출력 for문 작성
		
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int count = 10;
		for (int i = 0; i < 10; i++) {
			System.out.print(count-- + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------");

//		Example03
//		1~10까지 3의 배수만 출력하는 for문 작성
		
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("-----------------------------------------");		
		
//		Example04
//		1~20까지 홀수만 출력하는 for문 작성
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		for (int i = 20; i > 0; i--) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------");		
		
//		Example05
//		1~10까지의 총합을 구하는 for문 작성
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println(sum);
		System.out.println("-----------------------------------------");		
		
//		Example06
//		정수형 변수 num에 임의의 값을 넣고
//		1~num까지의 총합을 구하는 for문 작성
		
		int total = 0;
		int num = 3;
		
		for (int i = 1; i <= num; i++) {
			total += i;
		}
		System.out.println("1~" + num + "까지의 합 : " + total);		
		System.out.println("-----------------------------------------");		

//		Example07
//		정수형 변수 dan에 숫자를 하나 넣고
//		해당 숫자에 해당하는 구구단 출력
		
		int dan = 10;
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
		System.out.println("-----------------------------------------");		
		
		//☆★☆★☆★
		String s1 = "☆";
		String s2 = "★";
		String s3 = "☆★";
		String s4 = "☆★☆★☆★";
		
		System.out.println(s4);
				
		for (int i = 1; i <= 3; i++) {
			System.out.print(s1 + s2);
		}
		
		System.out.println();
		
		for (int i = 1; i <= 3; i++) {
			System.out.print(s3);
		}
		
		System.out.println();
		
		for (int i = 1; i <= 6; i++) {
			if(i % 2 == 0) {
				System.out.print("★");
			} else {
				System.out.print("☆");
			}
		}
		
		
		
		
	}
}
