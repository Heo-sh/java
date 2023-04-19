package ex1_enum;

public enum Item {
//	열거형은 상수를 가지고 생성되는 객체들을 한 곳에 모아둔 묶음이다.
//	상수들은 사용자가 지정한 이름으로부터 0부터 순차적으로 증가(index값을 가진다.)
//	클래스처럼 보이게 하는 상수
//	서로 관련있는 상수들끼리 모아 상수들을 정의하는 것
//	**상수**: 변하지 않는 값
	
	START("시작", "s"), STOP("멈춤", "p"), EXIT("종료", "e");
	
	String itemStr;
	String symbol;
	
//	상수에 값을 직접 넣으려면 생성자를 정의해줘야 한다.
	Item(String str, String symbol) { //private로 만들어지기에 생성자를 외부에서 호출 불가
		this.itemStr = str;
		this.symbol = symbol;
	}
	
//	get을 이용하여 접근
	public String getItemStr() {
		return itemStr;
	}
	public String getSymbol() {
		return symbol;
	}
	
	} //상수 객체를 만든 것

//	enum
//- 클래스처럼 보이게 하는 상수
//- 서로 관련있는 상수들끼리 모아 상수들을 정의하는 것
//- enum 클래스 형을 기반으로 한 클래스

//	enum의 특징
//- 열거형으로 선언된 순서에 따라 0부터 index값을 순차적으로 가진다.
//- 지정된 상수들은 대문자로 선언
//- 열거형 변수들을 선언 후 ;을 찍지 않는다.
//- 상수와 특정 값을 연결시킬 경우 ;을 붙여야 한다.

//	enum의 문법
//- enum 열거체명 {상수 1, 상수 2, ...}

//	enum 메서드
//- valueOf();
//	- String 값을  enum에서 가져온다.
//- values();
//	- enum의 요소들을 순서대로 enum 타입의 배열로 반환
//- ordinal();
//	- enum에 정의된 해당 값의 index 값 반환


















