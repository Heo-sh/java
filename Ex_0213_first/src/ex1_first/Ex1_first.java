package ex1_first;

public class Ex1_first {
	public static void main(String[] args) {
		//main + ctrl + space
		
		// <- 주석: 프로그램의 소스코드에 프로그래머의 의견이나 설명을 적을 수 있는 코드
		//프로그램 소스 중간에 삽입하더라도 프로그램의 수행에 전혀 영향을 끼치지 않음
		//*컴퓨터(jvm)에서 *컴파일을 할 시 인식하지 못 하는 코드이다.
		//한줄 주석: //
		/*여러줄 주석: /**/
	
		//sysout + ctrl + space
		//System.out.println("hello world"); //출력함수: 소괄호 안에 든 것을 출력해주는 함수
		
		/*jvm이란?
		 * 자바 가상 머신(Java Virtual Machine)
		 * 자바 코드를 컴파일하여 바이트 코드(0과 1로 이루어진 코드)로 만들면 이 코드가 
		 * 자바 가상 머신 환경에서 실행된다.
		 * JVM은 자바 실행 환경(JDK)에 포함되어 있다.*/
		
		/*컴파일이란?
		 *프로그래머가 작성한 .java(자바코드)를
		 *.class(바이트코드)로 바꾸는 일련의 과정 */
		
		//""안에 있으면 한글자더라도 문장이 된다.
		System.out.println("Hello World");
		System.out.println(100);
		System.out.println(100+50);
		//문장 뒤에 숫자를 더하면 문장 뒤에 붙는다.
		System.out.println("안녕하세요" + 10); //안녕하세요10
		
		System.out.println(5 + 10 + ":" + 5 + 10); //15:510 -> 숫자가 먼저 계산되는 것이 아닌 순차적으로 계산이 되기에
		//15+":5"+10 <- 이렇게 되어버린다.
		System.out.println(5 + 10 + ":" + (5 + 10)); //15:15
		
		//""안에 숫자가 들어갔다고 하더라도 문장이다.
		System.out.println("2 + 2 = " + 2 + 2); //2 + 2 = 22

		System.out.println("2 + 2 = " +(2 + 2)); //2 + 2 = 4

	}
}
