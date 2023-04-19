package pr_ArrayList_Example;

import java.util.*;

public class ArrayList_Ex1 {
	
//	랜덤의 이름을 입력받아 ArrayList에 넣고
//	거기서 김씨 성을 가진 사람이 몇 명인지 출력
	
	public static void main(String[] args) {
		ArrayList<String> namelist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int person = 0;
			System.out.print("사람 이름을 입력하세요: ");
			namelist.add(sc.next());
			
			for (String name : namelist) {
				System.out.print(name + " ");
			}
			System.out.println();
			
			for (int i = 0; i < namelist.size(); i++) {
				String first = namelist.get(i);
				if (first.startsWith("김")) {
					person++;
				}
			}
			System.out.printf("김씨 성을 가진 사람은 %d명입니다.", person);
			System.out.println();
		}
	}
}
