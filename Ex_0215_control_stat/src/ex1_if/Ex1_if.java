package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
//		제어문(control-statement): 코드의 흐름을 제어하는 문법
//		- 조건문: if, switch
//		- 반복문: for, while
		
//		조건문: 조건에 대하여 명령을 실행할지 실행하지 않을지 정하는 문법
		
//		- 기본형
//		if(조건식) {
//			조건식이 참일 때 실행할 명령
//		}
		
//		조건식: 참 or 거짓인지를 판별할 수 있는 식 -> 논리형으로 반환될 수 있는 연산자를 기억하자
		
		int n = 50;
//		문자형을 초기화할 때는 null 혹은 ""를 쓴다.
		String str = null; //String은 기본 자료형이 아니다. 문자형을 저장하는 자료형
//		대문자로 시작하는 것들은 대부분 class에 속한다.
		
		if (n == 50) {
			str = "n은 50입니다.";
		}
		
		if (n != 50) {
			str = "n은 50이 아닙니다.";
		}
		
		System.out.println(str);
	}
}
