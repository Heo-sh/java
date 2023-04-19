package ex1_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
//		- 자바로 만들어진 모든 프로그램은 class로 이루어져 있다.
//		- 문자열을 저장하기 위해 사용했던 String도 자바에 내정 되어 있는 class이다.
		
//		String클래스의 특징
//		1) 객체 생성방법이 2가지(암시적, 명시적)
//		2) 한 번 생성된 문자열의 내용은 변화 X (불변의 특징)
//		3) import 생략이 가능한 유일한 class
		
		String s1 = "abc"; //암시적 객체 생성
		String s2 = "abc"; // - 주소의 재사용
//		이미 앞에 같은 문자열로 생성된 암시적 객체가 있다면
//		앞서 생성된 객체의 주소를 재사용한다. - 메모리 용량 최소화
//		암시적 객체 생성이 가능하여 변수로써 활용 가능
		
//		암시적 객체 생성을 할 수 있는 클래스는 String이 유일하다.
//		다른 모든 클래스들은 new를 사용하여 명시적 객체 생성을 해야 한다.
		
		String s3 = new String("abc"); //명시적 객체 생성 -> new: H영역에 새로운 메모리를 할당
		String s4 = new String("abc"); // - 주소가 다르다.
		
//		==연산자는 기본자료형을 비교할 때는 데이터를 비교한다.
//		허나 객체끼리 비교를 할 때는 주소를 비교하는 연산자로 기능이 바뀐다.
		if (s1 == s2) {
			System.out.println("s1과 s2의 주소 같다");
		} else {
			System.out.println("s1과 s2의 주소 다름");
		}
		
		if (s2 == s3) {
			System.out.println("s2과 s3의 주소 같다");
		} else {
			System.out.println("s2과 s3의 주소 다름");
		}		
		
		if (s3 == s4) {
			System.out.println("s3과 s4의 주소 같다");
		} else {
			System.out.println("s3과 s4의 주소 다름");
		}
		
		System.out.println("---------------------------------------");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열: ");
//		String s5 = sc.next();
////		스캐너를 통해서 문자열을 입력받아 객체에 저장했을 때
////		주소를 재사용하지 않는다.
//				
//		if (s1 == s5) {
//			System.out.println("s1과 s5의 주소 같다");
//		} else {
//			System.out.println("s1과 s5의 주소 다름");
//		}
		
		String greet = "안녕";
		greet += "하세요"; //greet = greet + "하세요";
		System.out.println(greet); //안녕하세요 -> 새로운 문자열을 만든다.
//		"하세요"가 뒤에 붙는 순간 "안녕" 뒤에 붙는 게 아닌
//		"안녕하세요"라는 메모리를 새로 할당받는다. 그러면 남아있는 "안녕"이
//		메모리를 낭비할 수 있는데 JVM의 GC(Garbage Collector)가 H(힙)영역을 돌면서
//		쓰레기 데이터를 처리한다. - 메모리의 관리보다는 개발에 더 신경을 쓸 수 있다.
		
	}
}
