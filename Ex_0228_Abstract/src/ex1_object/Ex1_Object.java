package ex1_object;

public class Ex1_Object {
//	※ 원래 있는 클래스명을 제목으로 쓰면 안된다. ex)String, Random
//	  - 정의가 되어 있는 클래스이기에 의미를 잃어버릴 수 있다.
//	※ package가 모이면 module이 되고,
//	  module이 모이는 데가 Library이다.
//	※ import가 필요한 이유
//	  - 다른 package에 있으면 불러와야 하므로 ex)Scanner, Random
	
//	현재 클래스에 특정 메서드가 있다.
//	어떨 때는 String을 인자로 받고 어떨 때는 int를 인자로 받는다.
//	상황에 따라서 다른 인자 값을 받아야 한다면,
//	지역변수(클래스변수)를 어떻게 선언해야 할까
//	1. 오버로딩(오버로드)
//		- 오버로딩을 하는 방법도 있지만 Object를 쓰는 방법도 있다.
	
	Object value; //Object형으로 변수 생성, 자바의 최상위 객체
//	객체변수
//	- 아무 것도 들어가 있지 않은 변수
//	- 인스턴스 변수라고도 한다.
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() { //Object를 반환형으로: 어떠한 값이 들어올 지 모르기 때문에
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
