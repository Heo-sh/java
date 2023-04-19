package Ex2_function;

import java.util.*;

public class Ex2_function {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id1", "�̸�1");
		map.put("id2", "�̸�2");
		map.put("id3", "�̸�3");
		map.put("id4", "�̸�4");
		map.put("id5", "�̸�5");
		
//		compute()
//		- Map �ϳ��� value ���� ������Ʈ�� �� ���
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
		
//		map�� ��� ��Ҹ� ���ٽ����� ���
		map.forEach((k, v) -> System.out.printf("key = %s, value = %s\n", k, v)); 
		
		
		
		
	}
}
