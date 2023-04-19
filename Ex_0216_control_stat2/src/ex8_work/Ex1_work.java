package ex8_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
//		키보드에서 값을 입력받고 해당하는 구구단 출력
//		2~9 이외의 값이 입력되면
//		"2~9 사이의 숫자만 입력하세요" 출력
		
		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
//		
//		for (int i = num; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (num < 2 || num > 9) {
//					System.out.println("2~9 사이의 숫자만 입력하세요");
//				}
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
//			}
//		}
		
//		System.out.println("원하는 구구단 숫자 입력: ");
//		int dan = sc.nextInt();
//		
//		if (dan < 2 || dan > 9) {
//			System.out.println("2~9 사이의 숫자만 입력해주세요");
//			} else {				
//				for (int i = 1; i <= 9; i++) {
//					System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//			}
//		}
		
//		homework
//		Scanner를 통해 정수 n1, n2를 입력받는다.
//		그리고 n1부터 n2까지의 합을 계산하여 그 결과를 출력하는 프로그램을 작성
//		ex) 2와 5를 입력받으면 2+3+4+5의 연산결과인 14를 출력
//		n1이 n2보다 크다면 데이터의 자리를 바꿔 넣어서 결과 출력하기
//		ex) 5와 2를 입력받으면 2+3+4+5의 결과인 14출력
		
		System.out.println("n1의 숫자 입력: ");
		int n1 = sc.nextInt();
		System.out.println("n2의 숫자 입력: ");
		int n2 = sc.nextInt();
		
		int total = 0;
		
//		int min = n1;
//		int max = n2;
//		if (min > n2) {
//			min = n2;
//			max = n1;
//		}
		
//		for (int i = min; i <= max; i++) {
//			total += i;
//		}
//		System.out.printf("%d와 %d까지의  합: %d",min , max, total);
		
		
//		System.out.printf("n1과 n2의 합: %d", n1+n2);
		
		if (n1 >= n2) {
			for (int i = n2; i <= n1; i++) {
				total += i;
			} 
			System.out.printf("%d와 %d까지의  합: %d", n1, n2, total);
		} else if (n2 >= n1) {
			for (int i = n1; i <= n2; i++) {
				total += i;
			}
			System.out.printf("%d와 %d까지의  합: %d", n2, n1, total);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
