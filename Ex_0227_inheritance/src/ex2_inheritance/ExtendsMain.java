package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
//		Child 클래스는 Parent 클래스를 상속받은 상태이므로
//		부모로부터 상속받은 money, home 등의 변수를 마음대로 가져다가
//		사용 가능
		
		Child c1 = new Child();
		
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.home);
		
		System.out.println("-------------------");
		
//		상속관계라고 할지라도 부모클래스는 자식의 재산을 마음대로
//		가져다가 사용 불가
		
		Parent p1 = new Parent();
		System.out.println(p1.money);
		System.out.println(p1.home);
//		System.out.println(p1.car); //Error

		System.out.println("-------------------");
		
//		c1과 Parent가 상속관계라면
//		instanceof 키워드를 통해서 true값을 얻을 수 있다.
//		- 자식클래스와 부모클래스의 주소가 같다
		
		if (c1 instanceof Parent) {
			System.out.println("c1은 Parent의 자식");
		}
		
		
//		단일상속체제
//		- 1. 한명의 자녀가 두명의 부모를 갖는 게 불가능
//		- 2. 언제 어떤 상황이 됐든 상속관계의 꼭대기에는 Object가 있다.
//		Object는 모든 타입을 받아들일 수 있는 최상위 객체
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
