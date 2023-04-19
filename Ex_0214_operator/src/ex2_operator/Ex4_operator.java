package ex2_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		//삼항연산자(?, :)
//		- 하나의 조건을 정의하여, 조건이 참일 때 반환할 명령, 조건이 거짓이 거짓일 때 반환할 명령을
//		     얻어내기 위한 연산자
		
		int a = 10;
		int b = 15;
		
		boolean result = ++a >= b ? true : false; // 뒤에 오는 명령이 굳이 논리형일 필요는 없다.
		System.out.println(result); //false
		
		char result2 = ++a >= b ? 'O' : 'X'; // 반환될 명령과 명령을 담을 변수의 type이 동일해야한다
		System.out.println(result2); //X
		
		int result3 = ++a >= b ? 1 : 0;
		System.out.println(result3); //0
	}
}
