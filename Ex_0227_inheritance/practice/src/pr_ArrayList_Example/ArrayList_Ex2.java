package pr_ArrayList_Example;

import java.util.*;

public class ArrayList_Ex2 {	
	public static void main(String[] args) {
//	별명을 입력 받아 ArrayList에 저장하고 이들 중 별명의 길이가 제일 긴 별명을 출력하시오.
		ArrayList<String> nickname = new ArrayList<String>();
		ArrayList<Integer> len = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("별명 입력: ");
			nickname.add(sc.next());
			
			for (int i = 0; i < nickname.size(); i++) {
				int nickleng = nickname.get(i).length();
				len.add(nickleng);
				System.out.print(nickname.get(i) + " " + len.get(i));
			}
			int max = len.get(0);
			
//			for (int i = 0; i < len.size(); i++) {
//				if (max > len.get(i)) {
//					max = len.get(i);
//				}
//				System.out.print(max + "");
//				System.out.println();
//			}
			
			System.out.println();
						
		}
		
	}
}
