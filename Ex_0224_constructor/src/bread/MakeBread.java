package bread;

public class MakeBread {
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
		System.out.println("-----------------");
	}
	
	public void makeBread(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.printf("��û�Ͻ� %d���� ���� ��������ϴ�.\n", a);
		System.out.println("-----------------");
	}
	
	public void makeBread(String x, int a) {
		w: while (true) {
			if (a >= 100) {
				System.out.printf("%s��(��) �뷮���� ��������ϴ�. �Ϸ�: %d��\n", x, a);
				System.out.println("-----------------");
				break;
			} else if (a < 100 && a > 0){
				for (int i = 1; i <= a; i++) {
					System.out.printf("%s��(��) ��������ϴ�.\n", x);
				}			
				System.out.printf("��û�Ͻ� %d���� %s��(��) ��������ϴ�.\n", a, x);
				System.out.println("-----------------");
				break;
			} else {
				System.out.println("���� �� �����ϴ�.");
				continue w;
			}			
		}
	}
}
