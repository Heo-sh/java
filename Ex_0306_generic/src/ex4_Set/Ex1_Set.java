package ex4_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
//		컬렉션(collection)
//		- java.util패키지에 있는 인터페이스 -> 추상 메서드가 들어가 있다.
//		- 배열의 단점을 보완하여 index개수가 정해지지 않은 다수의 객체를
//		     다루기 위해 사용하는 프로그래밍 방식
//		- 요소를 추가하는 데에 제약이 없다
		
//		- 종류
//		- 1. Set
//		- 2. Map: List 다음으로 쓰인다.
//		- 3. List: 제일 많이 쓰인다.
		
//		Set 인터페이스를 구현하고 있는 클래스
//		- HashSet, TreeSet
		
//		Set에게 물려받은 추상메서드가 오버라이딩(재정의)이 다 되어 있다.
		HashSet<String> hs1 = new HashSet<String>();
		
//		set에 데이터를 추가하는 법
//		- 인덱스 번호가 없기에 순차적으로 추가가 되나,
//		     간단한 것들은 정렬이 되어서 추가된다.
//		- for문을 통해 하나하나 출력이 불가하다.
		hs1.add("a");
		hs1.add("e");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		hs1.add("c");
		
//		HashSet에 들어있는 요소의 개수를 보든 메서드
		System.out.println("hs1의 요소의 개수: " + hs1.size());
		
//		HashSet은 중복된 데이터를 추가할 수 없다.
		System.out.println(hs1.add("a")); //false 출력 - 이미 있는 값을 추가하기에
		hs1.add("b");

		System.out.println("hs1의 요소의 개수: " + hs1.size());
		
//		HashSet에 저장되어 있는 하나의 데이터를 제거하는 법
		hs1.remove("a");
		
//		HashSet 출력
		System.out.println(hs1);

//		HashSet에 저장되어 있는 모든 데이터를 제거하는 법
		hs1.removeAll(hs1); //결과를 논리형으로 반환해준다.
		hs1.clear(); //삭제하고 반환하는 값이 없다.
		System.out.println(hs1);
		
		System.out.println("-----------------");
		
//		HashSet 객체 hs2를 만들어 1~45까지의 난수 6개를 요소로 넣어서 출력하기
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
//		while (true) {
//			int n = new Random().nextInt(45)+1;
//			
//			hs2.add(n);
//			
//			if (n != n) {
//				hs2.add(n);				
//			} else if (hs2.size() == 6) {
//				break;
//			}
//		}
//		
//		System.out.println(hs2);
		
		while (hs2.size() < 6) {
			int rnd = new Random().nextInt(45) + 1;
			hs2.add(rnd);
		}
		
		System.out.println(hs2);
		
//		index가 없기에 요소 하나하나에 접근을 할 수 없다
//		Set -> 배열로 변환
		
//		Integer[0] --> 배열의 방의 개수를 0으로 잡으면 Set이 add해둔 요소의 개수만큼
//		알아서 방을 만들어준다.
		
		Integer[] arr = hs2.toArray(new Integer[0]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
