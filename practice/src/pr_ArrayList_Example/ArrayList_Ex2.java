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
			String str = sc.next();

			if(str.equals("exit")){
				break;
			}
			nickname.add(str);
			len.add(str.length());
			int max = 0;
			int index = 0;			
			for (int i = 0; i < nickname.size(); i++) {
				System.out.println(nickname.get(i));
				System.out.println(len.get(i));
				if(max<=len.get(i)){
					max=len.get(i);
					index = i;
					System.out.println("max�� ���� " + max);
				}
			}
			System.out.println("���� ���� �� ���̴� :" + nickname.get(index));
			
			
//			for (int i = 0; i < len.size(); i++) {
//				if (max > len.get(i)) {
//					max = len.get(i);
//				}
//				System.out.print(max + "");
//				System.out.println();
//			}
			
						
		}
		
	}
}
