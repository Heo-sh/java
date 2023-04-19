package ex1_if;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
//		if-else if-else문
//		- 비교해야할 조건이 여러 개 있는 경우에 사용
//		- 기본형
//		if (조건식 1) {
//			조건식 1이 참인 경우 실행할 명령
//		} else if (조건식 2) {
//			조건식 1이 거짓이고
//			조건식 2가 참일 경우 실행할 명령
//		} else if (조건식 3) {
//			조건식 1, 2가 거짓이고
//			조건식 3이 참인 경우 실행할 명령
//		} else if (조건식 4) {
//			위의 조건식들이 거짓이고
//			조건식 4가 참인 경우 실행할 명령
//		} else { <- 필요없다면 생략이 가능
//			위의 조건식들이 모두 거짓일 때 실행할 명령	
//		}
		
//		ex) 학점을 매길 때
//		- if부터 else if의 모든 조건식들을 위에서 아래로 하나씩 거치면서 중간에 해당이 되는 조건식이 있다면
//		그 밑에 다른 조건식들이 있다 하여도 중간에 빠져나와 그 조건식에 해당하는 명령을 출력한다.
		
		int score = 75;
		if (score >= 90) {
			System.out.println("성적은 A입니다.");
		} else if (score >= 80) {
			System.out.println("성적은 B입니다.");
		} else if (score >= 70) {
			System.out.println("성적은 C입니다.");
		} else if (score >= 60) {
			System.out.println("성적은 D입니다.");
		} else {
			System.out.println("성적은 F입니다.");
		}
		
//		if문의 중첩
//		- 기본형
//		if (조건식1) {
//			if(조건식2) {
//				조건식1, 2가 모두 참일 때 실행할 명령
//			}
//		}
		
//		정수형 변수 num에 임의의 숫자를 대입하고
//		해당 숫자가 5의 배수이면서 홀수 인지 판변하는 조건문을 작성
//		배수판별법: 정수 % n == 0 -> 정수는 n의 배수 
//		홀짝판별법: 정수 % 2 == 0 -> 짝수, 정수 % 2 != 0 -> 홀수
		int num = 155;
		
		if (num % 5 == 0) {
			if (num % 2 != 0) {
				System.out.println(num + "는(은) 5의 배수이며 홀수이다.");
			} else {
				System.out.println(num + "는(은) 5의 배수이나 짝수이다.");
			}
		} else {
			System.out.println(num + "는(은) 5의 배수가 아니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
