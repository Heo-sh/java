package ex1_if;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
//		if-else if-else��
//		- ���ؾ��� ������ ���� �� �ִ� ��쿡 ���
//		- �⺻��
//		if (���ǽ� 1) {
//			���ǽ� 1�� ���� ��� ������ ����
//		} else if (���ǽ� 2) {
//			���ǽ� 1�� �����̰�
//			���ǽ� 2�� ���� ��� ������ ����
//		} else if (���ǽ� 3) {
//			���ǽ� 1, 2�� �����̰�
//			���ǽ� 3�� ���� ��� ������ ����
//		} else if (���ǽ� 4) {
//			���� ���ǽĵ��� �����̰�
//			���ǽ� 4�� ���� ��� ������ ����
//		} else { <- �ʿ���ٸ� ������ ����
//			���� ���ǽĵ��� ��� ������ �� ������ ����	
//		}
		
//		ex) ������ �ű� ��
//		- if���� else if�� ��� ���ǽĵ��� ������ �Ʒ��� �ϳ��� ��ġ�鼭 �߰��� �ش��� �Ǵ� ���ǽ��� �ִٸ�
//		�� �ؿ� �ٸ� ���ǽĵ��� �ִ� �Ͽ��� �߰��� �������� �� ���ǽĿ� �ش��ϴ� ������ ����Ѵ�.
		
		int score = 75;
		if (score >= 90) {
			System.out.println("������ A�Դϴ�.");
		} else if (score >= 80) {
			System.out.println("������ B�Դϴ�.");
		} else if (score >= 70) {
			System.out.println("������ C�Դϴ�.");
		} else if (score >= 60) {
			System.out.println("������ D�Դϴ�.");
		} else {
			System.out.println("������ F�Դϴ�.");
		}
		
//		if���� ��ø
//		- �⺻��
//		if (���ǽ�1) {
//			if(���ǽ�2) {
//				���ǽ�1, 2�� ��� ���� �� ������ ����
//			}
//		}
		
//		������ ���� num�� ������ ���ڸ� �����ϰ�
//		�ش� ���ڰ� 5�� ����̸鼭 Ȧ�� ���� �Ǻ��ϴ� ���ǹ��� �ۼ�
//		����Ǻ���: ���� % n == 0 -> ������ n�� ��� 
//		Ȧ¦�Ǻ���: ���� % 2 == 0 -> ¦��, ���� % 2 != 0 -> Ȧ��
		int num = 155;
		
		if (num % 5 == 0) {
			if (num % 2 != 0) {
				System.out.println(num + "��(��) 5�� ����̸� Ȧ���̴�.");
			} else {
				System.out.println(num + "��(��) 5�� ����̳� ¦���̴�.");
			}
		} else {
			System.out.println(num + "��(��) 5�� ����� �ƴϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}