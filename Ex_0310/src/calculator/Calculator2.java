package calculator;

public class Calculator2 {
	public static void main(String[] args) {
//	지역 내부 익명 클래스
//	- 익명 클래스는 내부 클래스(inner class)의 일종으로
//	이름이 없는 클래스이다.
//	- 나중에 다시 불러질 이유가 없다는 뜻을 내포한다.
//	즉, 프로그램에서 일시적으로 사용되고 버려지는 객체라고 보면 된다.
//	- 일회용 클래스
//	- 이름이 없기에 생성자를 가질 수 없다.

		int num3 = 30;

		MyCalculator calc = new MyCalculator() {
//			num3 = 40; //새롭게 값을 대입하려는데 오류가 난다.
			// 변수의 상수화가 일어나기에 오류가 난다.
			// final int num3
			@Override
			public int plus(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 + num2;
			}
		};

	}
}
