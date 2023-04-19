package ex5_continue;

public class Ex1_continue {
	public static void main(String[] args) {
//		기타제어문
//		- break
//		- continue
		
//		continue
//		- 반복문 내에서 continue를 만나게 되면 가장 
//		     가까이 있는 반복문의 증감식으로 돌아간다.
		
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0) {
					continue; // 짝수만 건너 뛰었다. = 특정 문장을 건너뛸 때 사용
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
