package ex2_method;

public class MethodTest {
//	수학적 함수
//	f(x) = 2x + 1
	
//	java 함수
//	f = 함수명
//	x = 파라미터
//	2x + 1 = 명령
	
	public int f(int x) { //함수 구현
		return 2*x + 1; // == int num = 2*x + 1; return num;
	}
	
	public void test(int su) { // return 값 생략시: void
		su++;
		System.out.println("su: " + su);
	}
	
	public void add(int a, int b) { //if use return: void -> int
//		return a + b;
		System.out.println(a + b);
	}
	
//	public void total(int a) {
//		int total = 0;
//		for (int i = 1; i <= a; i++) {
//			total += i;
//		}
//		System.out.println(total);
//	}
	
	public int total(int a) {
		int total = 0;
		for (int i = 1; i <= a; i++) {
			total += i;
		}
		return total;
	}
	
//	1~10까지 총합을 구하는 메서드 만들기
	public void sum() {
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		
		System.out.println(total);
	}
	
//	외부에서 수를 하나 입력받아서 해당 수에 해당하는 구구단을 출력하는 함수
	
	public void dan(int x) {
		if (x > 0) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", x, i, (x * i));
			}			
		} else {
			System.out.println("숫자를 다시 입력해주요: ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
