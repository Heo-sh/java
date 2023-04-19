package bread;

public class MakeBread {
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("-----------------");
	}
	
	public void makeBread(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n", a);
		System.out.println("-----------------");
	}
	
	public void makeBread(String x, int a) {
		w: while (true) {
			if (a >= 100) {
				System.out.printf("%s을(를) 대량으로 만들었습니다. 완료: %d개\n", x, a);
				System.out.println("-----------------");
				break;
			} else if (a < 100 && a > 0){
				for (int i = 1; i <= a; i++) {
					System.out.printf("%s을(를) 만들었습니다.\n", x);
				}			
				System.out.printf("요청하신 %d개의 %s을(를) 만들었습니다.\n", a, x);
				System.out.println("-----------------");
				break;
			} else {
				System.out.println("만들 수 없습니다.");
				continue w;
			}			
		}
	}
}
