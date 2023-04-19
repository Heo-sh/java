package ex2_Map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
//		Map
//		- 키(Key)와 값(Value)이 한 쌍의 데이터로 저장
//		- Key 값을 통해 Value 값을 검색하기에 많은 양의 데이터를
//		    조회하는 데 잇어서 매우 뛰어난 성능을 발휘한다.
//		- Map은 인터페이스이며, 구현하는 클래스 중 많이 사용되는 클래스는
//		  HashMap이다.
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
//		HashMap에 요소 추가
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
//		Map에 저장되는 Value값은 중복이 될 수 있다.
//		- 없는 Key값으로 추가를 하면 새롭게 추가가 된다.
		map.put(4, 'A');
		
//		Map에 저장되는 Key값은 중복 안된다.
//		- 기존에 같은 이름을 가진 Key가 있다면 Value를 갱신한다.
		map.put(1, 'F');		
		
//		HashMap의 크기
		System.out.println("map의 크기: " + map.size());

//		HashMap 요소 제거
//		- 중복되지 않는 Key값을 이용하여 요소 제거
		map.remove(3);
		
//		HashMap 출력
		System.out.println(map);
		
//		HashMap value값 출력
//		- Key값을 통해 Value값을 가져온다.
		char ch = map.get(1);
		System.out.println("map.get(1): " + ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
