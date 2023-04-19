package ex2_Abstract;

public class AbsChild extends AbsParent {
//	추상클래스를 상속받는 자식 클래스는 부모가 가지고 있는
//	추상 메서드(미완성)를 반드시 받아두어야 한다.
//	추상클래스를 상속받는 클래스는 일반 클래스이다. -> abstract를 붙일 필요 없음
	
	@Override
	public void setValue(int n) {
		System.out.println("추상메서드 재정의함");
	}
}
