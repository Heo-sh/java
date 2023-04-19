package ex6_static;

public class Bank {
//	static
//	- 객체가 아무리 많이 생성되어도 메모리 상에 딱 한 개만 만들어지는 변수나 메서드
//	- 변수명이 인텔리체로 바뀐다.
//	- static으로 정의하는 순간 H영역이 아닌 static 영역으로 저장됨.
//	- 객체 이름이 아닌 클래스 이름으로 접근하는 게 보통의 방식이다.
//	- 객체 생성 없이도 언제든 가져다가 사용할 수 있다.
//	- static 변수가 많으면 프로그램이 실행되기까지 시간이 많이 걸린다.
	
	private String name = "우리은행";
	private String point;
	private String tel;
	static float interest = 10f;
	
//	생성자를 setter처럼 사용
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
//	결과를 출력할 메서드: getter
	public void printBank() {
		System.out.println("이름: " + name);
		System.out.println("지점위치: " + point);
		System.out.println("전화번호: " + tel);		
		System.out.println("이자율: " + interest + "%");
		System.out.println("-----------------------");
	}
	
	
	
	
	
	
}
