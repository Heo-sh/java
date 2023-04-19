package person;

import java.util.*;

public class PersonManager { //기능을 담당하는 클래스
	public void personMgr() {
		Scanner sc = new Scanner(System.in);
		int select;
		int count = 0;
		
		ArrayList<Person> pr = new ArrayList<Person>();
		Person p1 = new Person();
		
		a: while (true) {
			
			System.out.println("1. 정보 추가");
			System.out.println("2. 정보 삭제");
			System.out.println("3. 전체 정보");
			System.out.println("4. 종료");
			
			System.out.print("항목 선택: ");
			select = sc.nextInt();
			
			switch (select) {
			case 1: // 정보 추가
				
				System.out.println("----정보추가----");
				System.out.print("이름: ");
				p1.setName(sc.next());
				System.out.print("나이: ");
				p1.setAge(sc.nextInt());
				System.out.print("전화: ");
				p1.setTel(sc.next());
				
				pr.add(p1);	

				for (int i = 0; i < pr.size(); i++) {
					if (pr.get(i).getName().equals(p1.getName())) {
						System.out.println("정보 저장");
					}
				}
				
				break;
			case 2: // 정보 삭제
				
				System.out.print("삭제할 이름: ");
				String delete = sc.next();
				
				for (int i = 0; i < pr.size(); i++) {
					if (pr.get(i).getName().equals(delete)) {
						pr.remove(i);
						if(!pr.contains(delete)) {
							System.out.printf("%s의 정보를 삭제했습니다.\n", delete);

						}
					} else {
						System.out.println("삭제할 데이터가 없습니다.");
					}
				}
				break;
				
			case 3: // 전체 정보
				System.out.println("----전체정보----");
				for (int i = 0; i < pr.size(); i++) {
					count++;
				}
				System.out.printf("등록인원 %d명", count);
				System.out.println();

				for (int i = 0; i < pr.size(); i++) {
					System.out.println("이름: " + pr.get(i).getName());
					System.out.println("나이: " + pr.get(i).getAge());
					System.out.println("전화: " + pr.get(i).getTel());
					System.out.println("--------");
				}
				count = 0;
				break;
				
			case 4: // 종료
				break a;
				
			}
			
		}
		
	}
}
