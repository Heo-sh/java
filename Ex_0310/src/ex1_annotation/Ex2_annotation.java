package ex1_annotation;


@TestInfo(tester = "홍길동",
datetime = @DateTime(date = "20230310", time = "170408")) 
//value를 통해서 TestInfo의 value()메서드에 정보 저장
//;는 사용 X
//값을 미리 전달해야한다.
//여러 개의 값 사용 시 {}사용
//앞의 value는 생략 가능
//value값을 정하지 않으면 기본값으로 설정한 "정보1"이 반환

public class Ex2_annotation {
	public static void main(String[] args) {
//		2. 메타 어노테이션
//		- 사용자 정의 어노테이션
//		- 어노테이션을 만들기 위한 어노테이션
//		- 스프링에서 어노테이션으로 많이 통제를 한다.
//		- java.lang.annotation 패키지에 정의되어 있다.
		
//		메타 어노테이션 종류
//		1. @Target
//		- 어노테이션이 적용 가능한 대상(범위)를 지정하는 데 사용
//		- 어노테이션을 붙일 수 있는 대상을 지정하는 것
//		- 대상을 여러개 지정 사용 가능
//			@Target({})
//		2. @Documeted
//		3. @Inherited
//		4. @Retention
//		- 어노테이션이 유지되는 기간을 지정하는 데 사용
//		- @Retention(SOURCE): 어노테이션이 소스 코드에만 이용 가능하며 컴파일 후에는 사라짐
//		- @Retention(CLASS): .class파일에 존재하지만 런타임에는 사라짐(실행시 사용 불가)
//		- @Retention(RUNTIME): 컴파일러와 런타임에 사용 가능(실행 시에 정보 제공) - 주로 사용
//		5. @Repeatable
		
//		어노테이션 타입 정의
//		- @ 기호를 붙이는 것을 제외하면 인터페이스를 정의하는 것과 동일
//		- @Override: 어노테이션 Override: 어노테이션 타입
//		- 구조:
//			@interface 어노테이션 {
//			
//			}
		
//		어노테이션 요소의 규칙
//		- 요소의 타입은 기본자료형, String, Enum, 어노테이션, Class만 허용
//		- ()안에 매개변수를 선언 불가
//		- 예외를 선언불가
//		- 요소를 타입 매개변수로 정의 불가
		
		TestInfo testInfo = Ex2_annotation.class.getAnnotation(TestInfo.class);
		String[] value = testInfo.value(); //배열로 변환
		
		for (String val : value) { //for문을 이용하여 값을 전체 반환
			System.out.print(val);
		}
		
		System.out.println();
		
		String[] tools = testInfo.testTool();
		for (String tool : tools) {
			System.out.print(tool + " ");
		}
		
		System.out.println();
		
		String tester = testInfo.tester();
		System.out.println(tester);
		
		String date = testInfo.datetime().date();
		String time = testInfo.datetime().time();
		System.out.printf("date = %s, time = %s", date, time);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
