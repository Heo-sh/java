package ex2_valueType;

public class Ex1_valueType {
	public static void main(String[] args) {
//		자료형: 데이터(음료)를 담을 컵의 재질과 크기
		
//		자료형의 종류
//		논리형: boolean - 1bit(bit는 데이터의 최소단위) -> true or false
//		문자형: char - 글자당 2byte (''안에만 사용 가능, 한 글자만 들어갈 수 있다. like 'A')
//		정수형: byte - 1byte (-128 ~ 127 까지 담을 수 있다.)
//		      short - 2byte (-32,768 ~ 32,767까지 담을 수 있다.)
//		      int - 4byte (-2,147,483,648 ~ 2,147,483,647까지) 자주 사용됨
//			  long - 8byte (대략 -900경 ~ 900경까지) 증권, 금융 쪽에서 주로 사용
//		실수형: float - 4byte (소수점을 갖는 숫자들)
//		      double - 8byte
		
//		변수: 자료형이 데이터를 담기 위한 컵의 재질과 크기라면
//		          변수는 데이터를 실제로 담기 위한 컵을 만드는 과정
//		변수를 만드는 과정
//		1. 선언과 대입
//		자료형 변수명; -> 변수의 선언: 데이터를 담기 위한 컵을 생성
//		변수명 = 데이터; -> 변수의 대입: 컵(자료형)에 음료(데이터)를 따르는 과정
		
//		2. 변수의 초기화 (reset의 개념이 아닌 초기값을 지정한다는 의미)
//		자료형 변수명 = 데이터;
		
//		변수명 명명 규칙
//		- 숫자가 맨 앞에 들어 올 수 없다.
//		- 첫 글자는 항상 소문자여야 한다.
//		- '_'를 제외하고 특수기호가 포함될 수 없다.
//		- 예약어 금지(println, if, switch, while, etc...)
//		- 한글 절대 사용 금지
		
//		논리형
		boolean b = true; // '=': 프로그램 언어에서는 '같다'라는 의미가 아닌 우변의 값을 좌변에 '대입'한다는 의미
		System.out.println("b의 값 : " + b); // b의 값 : true
		
//		boolean b1 = 1; 에러가 뜬다: 데이터 별로 맞는 자료형을 사용해야 한다.
		
//		문자형
		char c = 'A'; // 문자형은 '' 안에 적어야 하며 두 글자 이상 올 수 없다.
		System.out.println("c의 값 : " + c); // c의 값 : A
		
		char c1 = 65; // 아스키코드로 65가 'A'이기에 출력이 가능하다. 즉, 숫자를 문자형에 대입할 경우 아스키코드로 변환되어 출력된다.
		System.out.println("c1의 값 : " + c1); // c의 값 : A
		
//		정수형
//		byte b1 = 128; byte 자료형의 표현범위를 벗어남으로 오류가 난다.
		
		byte b1 = 127;
		short s = 32767;
		int n = 550;
		
		System.out.println("b1의 값 : " + b1);
		System.out.println("s의 값 : " + s);
		System.out.println("n의 값 : " + n);
		
//		실수형(소수점이 있는 숫자)
		float f; // 변수의 선언 -> 안에 아무 것도 들어가 있지 않은 상태
		f = 3.14f; // 변수의 대입
		// java에서 실수는 기본적으로 double형으로 인식하기 때문에 float형을 사용하려면 명시(뒤에 f를 붙여줌)를 해줘야 한다.
		
		double d; // 변수의 선언
		d = 1.23; // 변수의 대입
		
		System.out.println("f의 값 : " + f);
		System.out.println("d의 값 : " + d);
		
//		변수 사용의 이유
//		- 수정과 삭제의 편리성
//		- 데이터를 동적으로 관리할 수 있다.

		byte b3 = 100;
		byte b4 = 20;
		
//		byte b5; // -> int로 바꿔야함.
		
		int b5;
		
		b5 = b3 + b4;
//		byte끼리의 연산을 하게 되면 범위를 넘어가는 경우가 많기에
//		java개발자들이 byte끼리의 연산을 하게 되면 자동으로 int로 변환되게 하였다.
	}
}
