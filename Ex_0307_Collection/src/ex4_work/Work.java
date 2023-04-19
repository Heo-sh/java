package ex4_work;

import java.util.*;

public class Work {
	public static void main(String[] args) {
//		아래의 결과를 도출하세요
//		아이디 생성: abc
//		abc
//		
//		아이디 생성: abc2
//		abc abc2
//		
//		아이디 생성: abc3
//		abc abc2 abc3
//		
//		아이디 생성: ...
//		...
		
//		중복된 아이디를 검사하는 로직 추가하기
		
		ArrayList<String> idlist = new ArrayList<String>();
		ArrayList<Integer> pwlist = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("아이디 생성: ");
			String id = sc.next();
			
			if (id.equals("exit")) {
				break;
			} else if (idlist.contains(id)) { //중복 id 검사 로직
				System.out.println("존재하는 id입니다.");
				continue;
			}
			
//			for (int i = 0; i < idlist.size(); i++) { //중복 id 검사 로직
//				if (id.equals(idlist.get(i))) {
//					System.out.println("중복된 id");
//					continue w;
//				}
//			}
			
			System.out.print("비밀번호 생성: ");
			int pw = sc.nextInt();
						
			if (pwlist.contains(pw)) { //중복된 pw 검사 로직
				System.out.println("존재하는 pw입니다.");
			} else if (!idlist.contains(id) && !pwlist.contains(pw)){
				idlist.add(id); //아이디 추가로직
				pwlist.add(pw); //pw 추가로직
				
				for (int i = 0; i < idlist.size(); i++) {
					System.out.print(idlist.get(i) + " ");
				}
				System.out.println();
//				for (String str : idlist) {
//					System.out.println(str + " ");
//				}
				for (int num : pwlist) {
					System.out.print(num + " ");
				}
				System.out.println();				
			}
		}
		
	}
}
