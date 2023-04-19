package ex7_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
//		Scanner
//		- 키보드에서 값을 직접 입력받아 변수에 저장할 있도록 해주는 '클래스'이다.
		Scanner sc = new Scanner(System.in);
		
//		키보드에서 숫자를 입력받아 정수형 변수에 집어 넣는다.
//		이름.nextInt();
		System.out.print("정수를 입력해주세요  : ");
		int num = sc.nextInt();
		System.out.printf("입력받은 num : %d\n", num);
		
//		키보드에서 문자열을 입력받아 문자열 변수에 집어넣는다.
//		이름.next();
		System.out.print("문자열을 입력해주세요  : ");
		String str = sc.next();
		System.out.printf("입력받은 str : %s\n", str);
		
//		for vs while의 차이점
//		- for: 내가 반복하고자 하는 횟수를 정확하게 알고 있을 때 사용
//		- while: 몇 번 반복해야 하는지 정확하게 알 수 없을 때도 사용 가능

		System.out.print("정수를 입력해주세요  : ");
		int number = sc.nextInt();
		
		while (number != -1) {
			System.out.printf("입력한 정수: %d\n", number);
			System.out.print("정수를 입력해주세요  : ");
			number = sc.nextInt();
			if (number == -1) {
				System.out.println("-1이 입력되어 종료합니다.");
				break;
			}
		}
		
//		for(;;) {
//			
//		} //for문의 반복문
				
	}
}
