package ex3_while;

public class Ex1_while {
	public static void main(String[] args) {
//		while��
//		- for�����ٴ� ������ ������ ���� �ݺ���(���� ��ó��)
//		- �⺻��
//		while(���ǽ�) {
//			�ݺ��ϰ��� �ϴ� ���
//		}
		
		int num = 1; //�ʱ�� = �ʱⰪ
		
		while(num <= 10) { //���ᰪ
			System.out.println(num);
			num++; //�ʱⰪ�� ���������ִ� ������ = ������
		}
		
		System.out.println("--------------------------------");
		
//		while���� ��ø
//		- �ʱ�ȭ �߿�
		
		int n1 = 1;
		int n2 = 1;
		
		while (n1 <= 3) {
			n2 = 1;
			while (n2 <= 3) {
				System.out.println(n1 + " " + n2);
				n2++;
			}
			n1++;
		}
		
		System.out.println("--------------------------------");
		
//		Example01
//		1~10������ ������ while������ �ۼ�
		
		int total = 0;
		int var = 1;
		
		while (var <= 10) {
			total += var;
			var++;
		}
		
		System.out.print(total);

	}
}
