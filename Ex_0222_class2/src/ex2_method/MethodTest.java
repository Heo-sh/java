package ex2_method;

public class MethodTest {
//	������ �Լ�
//	f(x) = 2x + 1
	
//	java �Լ�
//	f = �Լ���
//	x = �Ķ����
//	2x + 1 = ���
	
	public int f(int x) { //�Լ� ����
		return 2*x + 1; // == int num = 2*x + 1; return num;
	}
	
	public void test(int su) { // return �� ������: void
		su++;
		System.out.println("su: " + su);
	}
	
	public void add(int a, int b) { //if use return: void -> int
//		return a + b;
		System.out.println(a + b);
	}
	
//	public void total(int a) {
//		int total = 0;
//		for (int i = 1; i <= a; i++) {
//			total += i;
//		}
//		System.out.println(total);
//	}
	
	public int total(int a) {
		int total = 0;
		for (int i = 1; i <= a; i++) {
			total += i;
		}
		return total;
	}
	
//	1~10���� ������ ���ϴ� �޼��� �����
	public void sum() {
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		
		System.out.println(total);
	}
	
//	�ܺο��� ���� �ϳ� �Է¹޾Ƽ� �ش� ���� �ش��ϴ� �������� ����ϴ� �Լ�
	
	public void dan(int x) {
		if (x > 0) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", x, i, (x * i));
			}			
		} else {
			System.out.println("���ڸ� �ٽ� �Է����ֿ�: ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
