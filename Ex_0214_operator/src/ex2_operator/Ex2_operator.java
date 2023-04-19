package ex2_operator;

public class Ex2_operator {
	public static void main(String[] args) {
//		대입연산자
//		- 우변에 있는 값을 좌변에 대입한다.
		
		int n1 = 10;
		int n2 = 7;
		
		System.out.println("=연산자 : n1 : " + n1 + " n2 : " + n2);
		
//		복합대입연산자
//		- 산술연산자와 대입연산자가 합쳐진 형태(+=, -=, *=, /=, %=)
		
//		+=연산자 - 누적합을 구할 때 많이 사용됨
		System.out.println("n1 += n2 : " + (n1 += n2)); //n1 = n1 + n2 출력: 17
		
//		-=연산자
		System.out.println("n1 -= n2 : " + (n1 -= n2)); //n1 = n1 - n2 출력: 10
		
//		*=연산자
		System.out.println("n1 *= n2 : " + (n1 *= n2)); //n1 = n1 * n2 출력: 70
		
//		/=연산자
		System.out.println("n1 /= n2 : " + (n1 /= n2)); //n1 = n1 / n2 출력: 10
		
//		%=연산자
		System.out.println("n1 %= n2 : " + (n1 %= n2)); //n1 = n1 % n2 출력: 3
		
//		비교연산자
//		- 두 수의 값을 비교할 때 사용하는 연산자
//		- 비교한 결과를 논리형 데이터(true or false)로 반환한다.
//		- >(초과), <(미만), >=(이상), <=(미만), ==(같다), !=(같지 않다)
		
		n1 = 10;
		n2 = 7;
		boolean result;
		
		result = n1 < n2;
		System.out.println(result); //false
		
		result = n1 == n2;
		System.out.println(result); //false
		
		result = n1 != n2;
		System.out.println(result); //true
		
//		논리연산자
//		- 비교연산자를 통한 연산이 2개 이상 필요할 때 사용
//		- &&, ||, !
//		- 연산결과를 논리형 데이터(true of false)로 반환한다.
		
//		&&: 앞 뒤의 연산이 모두 True여야 True를 반환한다. And(그리고)의 의미를 가진다.
//		- 참 && 참 -> True
//		- 참 && 거짓 -> False
//		- 거짓 && 참 -> False => 앞의 연산이 거짓이면 뒤의 연산을 진행하지 않는다.
//		- 거짓 && 거짓 -> False
		result = n1 > n2 && n1 != n2;
		System.out.println(result); //true
		
//		||: 압 뒤의 연산 중 둘 중 하나라도 참이면 True를 반환, Or(또는)의 의미를 가짐.
//		- 참 || 참 -> True
//		- 참 || 거짓 -> True => 앞의 연산이 참이면 뒤의 연산은 진행 X
//		- 거짓 || 참 -> True
//		- 거짓 || 거짓 -> True
		result = n1 < n2 || n1 != n2;
		System.out.println(result); //true
		
//		!: not의 의미를 가진다. True -> False, False -> True로 바꿔준다.
		
//		위의 result 값은 True이다.
		System.out.println(!result); //false
	}
}
