package ex1_work;

public class PrintGraph {
//	Ư�� ������ �ٸ� Ŭ������ ������ ��
//	1. �Լ��� �Ķ����
//	2. �������� �Ķ����
	
	public void print(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "�� ����:");
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("#");				
			}
			System.out.println(" " + arr[i]);
		}
	}
	
	
	
	
	
}
