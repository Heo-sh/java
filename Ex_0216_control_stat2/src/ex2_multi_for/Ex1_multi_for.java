package ex2_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
//		다중 for문: for문의 중첩, for문 안에 for문이 있는 문장
//		- 보통 2중까지만 사용
//		- 기본형
//		for (초기식; 조건식; 증감식;) {
//			for(초기식; 조건식; 증감식;) {
//				반복하고자 하는 명령
//			}
//		}
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) { //변수 j는 변수 i가 만족하는 조건이 될 때까지 완전 반복한다.
				System.out.println(i + " " + j); // 변수 i는 변수 j가 만족하는 조건이 될 때까지 고정
			} //inner for문
			System.out.println();//줄 바꾸기 위한 출력문
		}//outer for문
		
//		위의 다중 for문의 출력 결과
//		1 1
//		1 2
//		1 3
//
//		2 1
//		2 2
//		2 3
//
//		3 1
//		3 2
//		3 3
		
		System.out.print("----------------------------------------------");
		System.out.println();
//		Example01
//		1 2 3 4
//		1 2 3 4
//		1 2 3 4
		
		for (int i = 0; i < 3; i++) { //줄의 개수만큼 반복
			for (int j = 0; j < 4; j++) { //찍어줘야 하는 숫자 개수 만큼 반복
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------------");
		System.out.println();
//		Example02
//		1 1 1 1
//		1 1 1 1
//		1 1 1 1
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 1; j < 2; j++) {
				System.out.print(j+ " ");
				System.out.print(j+ " ");
				System.out.print(j+ " ");
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------------");		
		System.out.println();
//		Example03
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12 
		
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------------");		
		System.out.println();
		
//		Example04
		
//		A B C D
//		A B C D		
//		A B C D
		
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
		char d = 'D';
		
		 for (int i = 0; i < 3; i++) {
			for (int j = 65; j <= d; j++) { // j < 69
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
		
		System.out.println();		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 'A'; j < 'E'; j++) {
				System.out.print((char)j + " ");
			}
			System.out.println();
		}		
		
		System.out.print("----------------------------------------------");		
		System.out.println();
		
//		Homework - failed
//		1 2 3 4 5 6 7 8 9 10
//		2 3 4 5 6 7 8 9 10 1
//		3 4 5 6 7 8 9 10 1 2
//		4 5 6 7 8 9 10 1 2 3
//		5 6 7 8 9 10 1 2 3 4
//		6 7 8 9 10 1 2 3 4 5
//		7 8 9 10 1 2 3 4 5 6
//		8 9 10 1 2 3 4 5 6 7
//		9 10 1 2 3 4 5 6 7 8
//		10 1 2 3 4 5 6 7 8 9

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10 - i; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int num2 = i + j;
				if (num2 > 10) {
					num2 %= 10; // == num2 -= 10;
				}
				System.out.print(num2 + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
