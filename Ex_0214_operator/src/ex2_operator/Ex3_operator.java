package ex2_operator;

public class Ex3_operator {
	public static void main(String[] args) {
//		비트연산자
//		- &, |, ^, ~
//		- 논리연산자와 유사하지만 bit단위(2진수)의 연산만 가능
//		- 일반적으로 암호화, 복호화 작업에 사용
		
		int a = 10; //2진수: 1010
		int b = 7; //2진수: 0111
		int c = a & b; //논리곱(and): 2진수로 바꿨을 때 두 값이 모두 1일 때만 결과가 1, 나미지는 0
		System.out.println(c); // 2
		
		c = a | b; //논리합(or): 2진수로 바꿨을 때 두 값이 모두 0이면 0, 나머지는 1
		System.out.println(c); // 15
		
		c = a ^ b; //배타적or(xor): 2진수로 바꿨을 때 두 값이 서로 같으면 0, 다를 때는 1
		System.out.println(c); // 13
		
		System.out.println(~c); // -14
		
//		증감연산자
//		- 1씩 증가시키거나 1씩 감소시켜주는 연산자
//		- ++, --
//		= 선행증감
//		- 변수의 앞에서 사용이 된다.
		a = 10;
		System.out.println(++a); //11
	
//		= 후행증감
//		- 변수의 뒤에서 사용이 된다.
//		- 다음 번에 다시 한번 사용될 때 적용
		b = 10;
		System.out.println(b++); //10
		System.out.println(b); //11
		
		a = 7;
		++a;
		++a;
		a++;
		++a;
		a++;
		a++;
		a++;
		System.out.println(a); //14
		
//		Example01
//		a = 10;
//		b = 12;
//		++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10;
//		11 >= 12 or 9 <= 12 and 1 >= 0 and 23 - 11 > 10;
//		True and True
		
//		정답: True
		
//		Example02
//		과수원이 있다
//		배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각
//		5, 7, 5
//		과수원에서 하루에 생산되는 총 개수를 출력하고,
//		시간당 전체 과일의 평균 생산개수를 출력
//		평균값을 담는 변수는 float으로 만들 것
		
		int p = 5;
		a = 7;
		int o = 5;
		int sum = p + a + o;
		System.out.println("하루에 생산되는 총 개수 : " + sum);
		float avg = (float)sum/24;
		//정수 / 정수 -> 정수, 실수 / 정수 -> 실수, 정수/실수 -> 실수, 실수/실수 -> 실수
		System.out.println("시간당 과일의 평균 생산 개수 : " + avg);
		
		
	}
}
