package ex3_List;

import java.util.*;

public class Ex3_ArrayList {
	public static void main(String[] args) {
//		String[] name = new String[10]; //이름 밖에 저장 못 함.
//		int[] age = new int[10]; //나이 밖에 저장 못 함.
		
		ArrayList<Person> list = new ArrayList<Person>();		
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setHeight(180.5);

		Person p2 = new Person();
		p2.setName("김개똥");
		p2.setAge(28);
		p2.setHeight(167.4);

//		- 객체의 저장된 주소와 list의 해당 index값의 주소를 공유한다.
		list.add(p1); //index 0번의 주소와 p1 객체 주소를 공유한다.
		list.add(p2);
		
//		- Person 클래스의 변수가 private가 아닐 경우에는
//		    객체의 변수명만으로 접근이 가능하다.
//		System.out.println(list.get(0)); //p1 객체의 주소에 접근
//		System.out.println("p1의 이름: " + list.get(0).name); //p1 객체의 주소에 있는 name변수에 접근
//		System.out.println("p1의 나이: " + list.get(0).age); 
//		System.out.println("p1의 키: " + list.get(0).height); 
//		
//		System.out.println("p2의 이름: " + list.get(1).name);
//		System.out.println("p2의 나이: " + list.get(1).age);
//		System.out.println("p2의 키: " + list.get(1).height);
		
//		for문으로 반복출력	
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).name);
//			System.out.println(list.get(i).age);
//			System.out.println(list.get(i).height);
//			System.out.println("-----------------");
//		}
		
//		- Person 클래스의 변수들이 private로 만들엇을 경우
		for (int i = 0; i < list.size(); i++) {
			Person vo = list.get(i);
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getHeight());
			System.out.println("-----------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
