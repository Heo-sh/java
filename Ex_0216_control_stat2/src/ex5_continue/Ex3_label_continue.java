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
					System.out.println("continue를 만남");
					continue outer;
				}
				System.out.println(n);
			}
		}
		
		System.out.println("----------------------------------------------");
		
//		switch문에서의 break
		n = 0;
		
		w: while (n < 10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch문 1번 거쳐감");
				break w; //switch를 빠져나오는 역할을 먼저 수행
						 //label을 달아주게 되면 기타제어문으로서의 역할 수행
			case 2:
				System.out.println("switch문 2번 거쳐감");
				continue; //조건식으로 올라갔다
			}
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
