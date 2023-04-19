package ex3_constructor;

public class ConTest {
//	생성자
//	- 객체가 생성될 때 메모리 할당을 위해 호출되는 영역
//	- 생성자는 객체가 생성될 때 처음 딱 한번만 자동으로 호출된다.
	
//	생성자의 특징
//	- 클래스와 이름이 완전히 동일하다.
//	  ex)앞글자가 소문자면 함수, 대문자면 생성자 -> 구분의 편리함
//	- 반환형이 없다.
	
//	기본 생성자
//	- 단축키: ctrl + space
	public ConTest() {
		System.out.println("나는 기본생성자임");
	}
	
//	생성자의 오버로드
	public ConTest(String name) {
		System.out.println("name이 " + name + "(으)로 초기화 됨");
	}
	
	
	
}
