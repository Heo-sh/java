package calculator;

@FunctionalInterface
//컴파일러에게 인터페이스를 람다식용 인터페이스로 사용할거다 라고 알려주는 것
//위의 어노테이션을 선언하고 메서드를 하나 이상 선언하면 오류가
//발생하므로 실수를 방지할 수 있다.
public interface MyCalculator {
	int plus(int num1, int num2); //추상메서드
}
