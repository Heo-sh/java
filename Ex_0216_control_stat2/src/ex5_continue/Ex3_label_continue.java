package ex5_continue;

public class Ex3_label_continue {
	public static void main(String[] args) {
//		label
		
		int n = 0;
		outer: while (true) {
			if (n >= 10) {
				break;
			}
			while (true) {
				n++;
				if (n % 3 == 0) {
					System.out.println("continue�� ����");
					continue outer;
				}
				System.out.println(n);
			}
		}
		
		System.out.println("----------------------------------------------");
		
//		switch�������� break
		n = 0;
		
		w: while (n < 10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch�� 1�� ���İ�");
				break w; //switch�� ���������� ������ ���� ����
						 //label�� �޾��ְ� �Ǹ� ��Ÿ������μ��� ���� ����
			case 2:
				System.out.println("switch�� 2�� ���İ�");
				continue; //���ǽ����� �ö󰬴�
			}
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
