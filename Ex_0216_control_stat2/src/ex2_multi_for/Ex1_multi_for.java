package ex2_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
//		���� for��: for���� ��ø, for�� �ȿ� for���� �ִ� ����
//		- ���� 2�߱����� ���
//		- �⺻��
//		for (�ʱ��; ���ǽ�; ������;) {
//			for(�ʱ��; ���ǽ�; ������;) {
//				�ݺ��ϰ��� �ϴ� ���
//			}
//		}
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) { //���� j�� ���� i�� �����ϴ� ������ �� ������ ���� �ݺ��Ѵ�.
				System.out.println(i + " " + j); // ���� i�� ���� j�� �����ϴ� ������ �� ������ ����
			} //inner for��
			System.out.println();//�� �ٲٱ� ���� ��¹�
		}//outer for��
		
//		���� ���� for���� ��� ���
//		1 1
//		1 2
//		1 3
//
//		2 1
//		2 2
//		2 3
//
//		3 1
//		3 2
//		3 3
		
		System.out.print("----------------------------------------------");
		System.out.println();
//		Example01
//		1 2 3 4
//		1 2 3 4
//		1 2 3 4
		
		for (int i = 0; i < 3; i++) { //���� ������ŭ �ݺ�
			for (int j = 0; j < 4; j++) { //������ �ϴ� ���� ���� ��ŭ �ݺ�
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------------");
		System.out.println();
//		Example02
//		1 1 1 1
//		1 1 1 1
//		1 1 1 1
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 1; j < 2; j++) {
				System.out.print(j+ " ");
				System.out.print(j+ " ");
				System.out.print(j+ " ");
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------------");		
		System.out.println();
//		Example03
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12 
		
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		
		System.out.print("----------------------------------------------");		
		System.out.println();
		
//		Example04
		
//		A B C D
//		A B C D		
//		A B C D
		
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
		char d = 'D';
		
		 for (int i = 0; i < 3; i++) {
			for (int j = 65; j <= d; j++) { // j < 69
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
		
		System.out.println();		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 'A'; j < 'E'; j++) {
				System.out.print((char)j + " ");
			}
			System.out.println();
		}		
		
		System.out.print("----------------------------------------------");		
		System.out.println();
		
//		Homework - failed
//		1 2 3 4 5 6 7 8 9 10
//		2 3 4 5 6 7 8 9 10 1
//		3 4 5 6 7 8 9 10 1 2
//		4 5 6 7 8 9 10 1 2 3
//		5 6 7 8 9 10 1 2 3 4
//		6 7 8 9 10 1 2 3 4 5
//		7 8 9 10 1 2 3 4 5 6
//		8 9 10 1 2 3 4 5 6 7
//		9 10 1 2 3 4 5 6 7 8
//		10 1 2 3 4 5 6 7 8 9

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10 - i; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int num2 = i + j;
				if (num2 > 10) {
					num2 %= 10; // == num2 -= 10;
				}
				System.out.print(num2 + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
