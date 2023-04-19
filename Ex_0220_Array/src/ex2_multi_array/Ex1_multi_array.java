package ex2_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
//		다차원 배열
//		- 2차원 이상의 배열을 의미, 배열의 요소로 또 다른 배열을 가지는 것을 의미
//		- 2차원 배열은 요소로서 1차원 배열을 가지며, 3차원 배열은 요소로서 2차원 배열을 가진다.
//		- 2차원 배열까지는 많이 사용하지만, 3차원부터는 거의 사용되지 않는다.
		
//		- 자료형 [][] 배열명 = new 자료형 [1차원 배열의 개수][1차원 배열의 들어가는 데이터의 개수];
//		- 3차원 배열: 자료형 [][][] 배열명 = new 자료형 [][][];
		
		int[][] test = new int[2][3];
		
//		2차원 배열의 각각의 방에 접근하는 법
//		배열명 [2차원 배열의 index][1차원 배열의 index] = 데이터;
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;

//		2차원 배열 출력하는 법
		
		System.out.println(test [0][0]);
		
		System.out.println("------------------------------------");
		
//		2차원 배열 출력법 2
		
		for (int i = 0; i < test.length; i++) { //test.length = 2 -> 1차원 배열의 개수
			for (int j = 0; j < test[i].length; j++) { //test[i].length = 6 -> 1차원 배열 안의 데이터 개수
				System.out.println(test [i][j]);
			}
		}
		
		System.out.println("------------------------------------");
		
//		2차원 배열 초기화
		
		int [][]arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
//		arr.length -> 3
//		arr[0].length -> 3 => length의 적극적 활용
		
//		2차원 배열부터는 큰 방에 들어있는 작은 방의 크기가 다를 수 있다.
		int [][]iArr = {{1, 2}, {3, 4, 5}, {6}};
		
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr [i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		
//		2차원 배열은 작은 방의 크기를 직접 지정 가능하다.
		
		int num[][] = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2]; 
		
		int n = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print((num[i][j] = n+=100) + " ");
			}
			System.out.println();
		}
		
	}
}
