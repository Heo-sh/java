package ex1_work;

public class PrintGraph {
//	특정 변수를 다른 클래스로 보내는 법
//	1. 함수의 파라미터
//	2. 생성자의 파라미터
	
	public void print(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "의 갯수:");
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("#");				
			}
			System.out.println(" " + arr[i]);
		}
	}
	
	
	
	
	
}
