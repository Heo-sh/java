package Ex2_function;

import java.util.*;

public class Ex2_function {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id1", "이름1");
		map.put("id2", "이름2");
		map.put("id3", "이름3");
		map.put("id4", "이름4");
		map.put("id5", "이름5");
		
//		compute()
//		- Map 하나의 value 값을 업데이트할 때 사용
//		BiFunction
//		- R apply (T t, U u)
//		map.compute("id1", (k, v) -> {
//			return v + "**";
//			});
//		
//		System.out.println("mp.get(\"id1\"): " + map.get("id1"));
		
		map.forEach((key, value) -> {
			map.compute(key, (k, v) -> v + "**");
		});
		
//		map의 모든 요소를 람다식으로 출력
		map.forEach((k, v) -> System.out.printf("key = %s, value = %s\n", k, v)); 
		
		
		
		
	}
}
