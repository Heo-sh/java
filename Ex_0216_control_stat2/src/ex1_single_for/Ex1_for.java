package ex1_single_for;

public class Ex1_for {
	public static void main(String[] args) {
//		���: �ڵ��� �帧�� �����ϴ� ����
//		�ݸ�: Ư�� ���๮�� ���ϴ� ��ŭ �ݺ��Ͽ� �����ϴ� ���
//		- for
//		- while
		
//		for��: Ư�� ����� ���ϴ� ��ŭ �ݺ������� ó���� �� ���
//		- �⺻��
//		for(�ʱ��; ���ǽ�; ������) {
//			������ ���� �� �ݺ��ϰ��� �ϴ� ���
//		}
		
//		�ʱ��: �ݺ��� �����ϱ� ���� ���۰� - ������ �ϳ� �ʱ�ȭ ��Ų��. / �ʱⰪ
//		���ǽ�: �ݺ��� �ϱ� ���� ���ᰪ - �񱳿����� ���� ��� / ���ᰪ
//		������: �ʱ���� �������� ���������ִ� ���� - ���������� ���� ��� / ������
		
//		for�� ��� ��!
//		1) ���� �ݺ��ϰ��� �ϴ� Ƚ���� ������ ��
//		2) i�� ����� �� �ִٸ� ���� ����ϱ�
		
		for (int i = 0; i < 3; i++) { // int i -> ��������
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------");
		
//		System.out.println(i); -> i�� for�� �ȿ��� ������� ������ �ٱ������� ����� �� �� ����.
//		- �㳪, ����� �Ϸ��� main ���� �� �ʿ��� i�� �����ؼ� ����� �� �ִ�. -> ����, ���������� ���� -> ������� �����̴�.
//		ex)
//		int i; -> ��������
//		for (i = 0; i < 3; i++) {
//			System.out.println(i);
//		}
		
//		Example01
//		1~10���� ����ϴ� for�� �ۼ��ϱ�
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " "); // -> print�� ���η� ����� �ȴ�.
		}
		
		System.out.println();
		
		int n = 1;
		for (int i = 0; i < 10; i++) {
			System.out.print(n++ + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		
//		Example02
//		10 ~ 1���� ��� for�� �ۼ�
		
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int count = 10;
		for (int i = 0; i < 10; i++) {
			System.out.print(count-- + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------");

//		Example03
//		1~10���� 3�� ����� ����ϴ� for�� �ۼ�
		
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("-----------------------------------------");		
		
//		Example04
//		1~20���� Ȧ���� ����ϴ� for�� �ۼ�
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		for (int i = 20; i > 0; i--) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------");		
		
//		Example05
//		1~10������ ������ ���ϴ� for�� �ۼ�
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println(sum);
		System.out.println("-----------------------------------------");		
		
//		Example06
//		������ ���� num�� ������ ���� �ְ�
//		1~num������ ������ ���ϴ� for�� �ۼ�
		
		int total = 0;
		int num = 3;
		
		for (int i = 1; i <= num; i++) {
			total += i;
		}
		System.out.println("1~" + num + "������ �� : " + total);		
		System.out.println("-----------------------------------------");		

//		Example07
//		������ ���� dan�� ���ڸ� �ϳ� �ְ�
//		�ش� ���ڿ� �ش��ϴ� ������ ���
		
		int dan = 10;
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
		System.out.println("-----------------------------------------");		
		
		//�١ڡ١ڡ١�
		String s1 = "��";
		String s2 = "��";
		String s3 = "�١�";
		String s4 = "�١ڡ١ڡ١�";
		
		System.out.println(s4);
				
		for (int i = 1; i <= 3; i++) {
			System.out.print(s1 + s2);
		}
		
		System.out.println();
		
		for (int i = 1; i <= 3; i++) {
			System.out.print(s3);
		}
		
		System.out.println();
		
		for (int i = 1; i <= 6; i++) {
			if(i % 2 == 0) {
				System.out.print("��");
			} else {
				System.out.print("��");
			}
		}
		
		
		
		
	}
}
