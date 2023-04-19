package ex2_Abstract;

public class AbsMain {
	public static void main(String[] args) {
//		추상 메서드는 직접 객체화를 할 수 없다.
//		추상 메서드를 상속받은 자식클래스를 객체화하여 접근해야 한다.
//		AbsParent ap = new AbsParent();
		
		AbsChild ac = new AbsChild();
		ac.setValue(3);
		
//		추상클래스를 상속받았기 때문에 추상클래스에 있는 일반메서드도 사용 가능
		System.out.println(ac.getValue()); //출력: 100
	}
}
