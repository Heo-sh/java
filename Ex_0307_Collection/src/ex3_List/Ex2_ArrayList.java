package ex3_List;

import java.util.*; //java.util 패키지에 있는 모든 것을 import하겠다.

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		index를 지정하여 값을 추가하기
//		- ArrayList명.add(index, element);
//		- 물리적으로 연결이 된 것이 아니라 기존의 index가 오른쪽으로 한 칸 밀리게 된다. 
		list.add(10);
		list.add(10);
		list.add(1, 14);
		list.add(1, 20);
		
//		하나의 요소에 접근하여 값을 변경
//		- ArrayList명.set(index, element);
		list.set(2, 30); //index 2번의 값을 30으로 수정

		System.out.println(list);
		
//		ArrayList 요소 제거
//		- ArrayList명.remove(index); 해당 index 값의 요소만 제거
//		- 중간에 있는 요소를 제거하면 기존의 index가 왼쪽으로 한칸씩 당겨진다.
		list.remove(1); //index 1번 요소 제거
		
//		ArrayList 요소의 인덱스 값 알아내기
//		- ArrayList명.indexOf(o);
//		- 중복된 값의 경우 가장 먼저 만나는 요소의 인덱스를 반환
//		- 기본적인 탐색 방향은 왼쪽에서 오른쪽
//		System.out.println("30의 index: " + list.indexOf(30));

//		- ArrayList명.lastIndexOf(o);
//		- 오른쪽에서 왼쪽으로 탐색하면서 가장 먼저 만나는 요소의 index를 바환
//		list.lastIndexOf(10);
		
		
//		ArrayList 요소 포함 확인		
//		- ArrayList명.contains(o);
//		- 있으면 true, 없으면 false를 반환
		list.contains(30);
		
//		ArrayList 비우기: 전체삭제
//		- ArrayList명.removeAll(ArrayList명);
//		- ArrayList명.clear();
		if (list.removeAll(list)) {
			System.out.println("list 비워짐");
		}; //논리형  출력 -> if문에 적용 가능하다.
		list.clear();
		
//		ArrayList가 비었는지 확인
//		- ArrayList명.isEmpty();
//		- 비워져 있으면 true, 아니라면 false 반환
		list.isEmpty();
		
		System.out.println(list);
		
	}
}
