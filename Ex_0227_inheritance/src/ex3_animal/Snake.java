package ex3_animal;

public class Snake extends Animal {
//	getLeg() + ctrl + space
	@Override
//	@: 언어테이션 - 의미가 있는 주석
	public int getLeg() {
//		 TODO Auto-generated method stub
		return 0;
	}
	
//	오버라이드(오버라이딩)
//	- 메서드의 중복정의
//	- 메서드의 재정의 라는 의미
//	- 상속관계의 객체에서 부모의 메서드를 자식이 가져와 사용하되
//	    이름은 그대로 두고, 내용만 현재 자식클래스의 사정에 맞게 사용하도록 재정의
//	- 오버라이딩 메서드는 내용을 제외하고는 부모의 것과 완전히 동일해야함.
	
	String sensor = "감각 특출";
}
