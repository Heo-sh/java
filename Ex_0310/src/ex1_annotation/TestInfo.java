package ex1_annotation;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*; //ElementType: 열거형
import static java.lang.annotation.RetentionPolicy.*; //RetentionPolicy: 열거형

@Target({TYPE, FIELD, TYPE_USE, METHOD}) //상수객체
@Retention(RUNTIME)
public @interface TestInfo { //이렇게 만들면 다른 곳에서 @TestInfo라는 이름으로 어노테이션 사용
//어노테이션은 interface로 정의해야 함
	
	String[] value() default "정보1"; //추상메서드
//	default "정보1": 아무것도 정의하지 않았을 때 기본값으로 "정보1"을 반환
	String[] testTool() default "INF01";
	String tester();
	DateTime datetime();
//	DateTime이라는 어노테이션을 정의하여
//	그 안에 시간과 날짜를 받는 변수를 만들어 받아온다.
}
