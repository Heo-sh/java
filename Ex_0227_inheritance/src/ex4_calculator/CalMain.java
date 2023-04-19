package ex4_calculator;

public class CalMain {
	public static void main(String[] args) {
//		Calculator 클래스를 만들고 getResult() 함수를 정의. 반환형은 정수
//		파라미터는 n1, n2 두개를 받고 -1을 return 합니다.
		
//		CalPlus 클래스를 만들어 Calculator 클래스를 상속받으세요
//		오버라이딩을 이용하여 Calculator의 getResult()함수를 인자로 받는 n1, n2를 더해주는 함수로 만든다.
//		이 때 return값은 -1이면 안된다.
		
//		CalMinus 클래스를 만들어 Calculator 클래스를 상속받으세요
//		오버라이딩을 이용하여 Calculator의 getResult()함수를 인자로 받는 n1, n2를 빼주는 함수로 만든다.
//		이 때 return값은 -1이면 안된다.
		
//		Main에서 실행하여 아래와 같은 결과가 나오면 성공
//		CalPlus: 30
//		CalMinus: 15
		Calculator cal = new Calculator();
		CalPlus plus = new CalPlus();
		CalMinus minus = new CalMinus();
		
		int cal1 = cal.getResult(15, 15);
		
		System.out.println(cal1);
		
		int n1 = plus.getResult(15, 15);
		int n2 = minus.getResult(30, 15);
		
		System.out.println("CalPlus: " + n1);
		System.out.println("CalMinus: " + n2);
	}
}
