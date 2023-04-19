package ex1_casting;

public class Ex1_Promotion {
	public static void main(String[] args) {
//		형변환: 자료형을 바꿔주는 것
//		- Promotion: 작은 자료형을 큰 자료형에다 대입하는 것 (자동형변환, 암시적형변환)
//		- Demotion: 큰 자료형을 작은 자료형에다 대입하는 것 (강제형변환, 명시적형변환)
		
//		Promotion의 예
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n; //n의 값을 d라는 변수에 대입한다.
		
		System.out.println("d의 값 : " + d); //출력: 200.0
		
		char c = 'A'; //2byte
		long l = 100; //8byte
		l = c;
		
//		'A'에 해당하는 아스키코드 값이 출력이 되는데, 문자열에서 정수로 변환이 되어서 출력이 된 것이다.
		System.out.println("l의 값 : " + l); //출력: 65
	}
}
