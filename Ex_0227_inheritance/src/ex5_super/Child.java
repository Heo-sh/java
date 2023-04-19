package ex5_super;

public class Child extends Parent {
//	자식 생성자에서 부모 생성자가 먼저 호출이 된다.
	
//	super
//	- 부모 클래스를 의미
//	- 생략 가능 but, 부모 생성자에 파라미터가 있다면 생략이 불가능 하다.
//	- 자식클래스에서 부모 생성자에게 파라미터를 전달할 수 있다.
//	- super(): 부모의 생성자
//	- super.변수명: 부모의 변수(객체)
	
//	함수와 생성자의 차이
//	- 생성자는 반환형이 없고, 따로 호출이 불가하다.
//	- 생성자의 이름은 항상 클래스와 동일
//	- 함수는 반환형이 있으며, 따로 호출이 가능하다.
	
	 public Child(int n) {
		 super(n);
		 System.out.println("자식(Child)클래스");
	}
	 
	 @Override
		public int result() {
			return super.result(); //parent.result();
		}
	 
//	 super: 부모 클래스		<->		this: 현재 클래스
	  
}
