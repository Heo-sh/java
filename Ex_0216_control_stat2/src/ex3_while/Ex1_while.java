package ex3_while;

public class Ex1_while {
	public static void main(String[] args) {
//		while문
//		- for문보다는 간편한 구성을 가진 반복문(선비교 후처리)
//		- 기본형
//		while(조건식) {
//			반복하고자 하는 명령
//		}
		
		int num = 1; //초기식 = 초기값
		
		while(num <= 10) { //종료값
			System.out.println(num);
			num++; //초기값을 증감시켜주는 증감식 = 증감값
		}
		
		System.out.println("--------------------------------");
		
//		while문의 중첩
//		- 초기화 중요
		
		int n1 = 1;
		int n2 = 1;
		
		while (n1 <= 3) {
			n2 = 1;
			while (n2 <= 3) {
				System.out.println(n1 + " " + n2);
				n2++;
			}
			n1++;
		}
		
		System.out.println("--------------------------------");
		
//		Example01
//		1~10까지의 총합을 while문으로 작성
		
		int total = 0;
		int var = 1;
		
		while (var <= 10) {
			total += var;
			var++;
		}
		
		System.out.print(total);

	}
}
