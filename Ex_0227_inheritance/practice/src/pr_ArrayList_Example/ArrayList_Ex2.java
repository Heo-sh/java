package pr_ArrayList_Example;

import java.util.*;

public class ArrayList_Ex2 {	
	public static void main(String[] args) {
//	������ �Է� �޾� ArrayList�� �����ϰ� �̵� �� ������ ���̰� ���� �� ������ ����Ͻÿ�.
		ArrayList<String> nickname = new ArrayList<String>();
		ArrayList<Integer> len = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("���� �Է�: ");
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
