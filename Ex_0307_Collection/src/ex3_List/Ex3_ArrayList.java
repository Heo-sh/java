package ex3_List;

import java.util.*;

public class Ex3_ArrayList {
	public static void main(String[] args) {
//		String[] name = new String[10]; //�̸� �ۿ� ���� �� ��.
//		int[] age = new int[10]; //���� �ۿ� ���� �� ��.
		
		ArrayList<Person> list = new ArrayList<Person>();		
		
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(30);
		p1.setHeight(180.5);

		Person p2 = new Person();
		p2.setName("�谳��");
		p2.setAge(28);
		p2.setHeight(167.4);

//		- ��ü�� ����� �ּҿ� list�� �ش� index���� �ּҸ� �����Ѵ�.
		list.add(p1); //index 0���� �ּҿ� p1 ��ü �ּҸ� �����Ѵ�.
		list.add(p2);
		
//		- Person Ŭ������ ������ private�� �ƴ� ��쿡��
//		    ��ü�� ���������� ������ �����ϴ�.
//		System.out.println(list.get(0)); //p1 ��ü�� �ּҿ� ����
//		System.out.println("p1�� �̸�: " + list.get(0).name); //p1 ��ü�� �ּҿ� �ִ� name������ ����
//		System.out.println("p1�� ����: " + list.get(0).age); 
//		System.out.println("p1�� Ű: " + list.get(0).height); 
//		
//		System.out.println("p2�� �̸�: " + list.get(1).name);
//		System.out.println("p2�� ����: " + list.get(1).age);
//		System.out.println("p2�� Ű: " + list.get(1).height);
		
//		for������ �ݺ����	
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).name);
//			System.out.println(list.get(i).age);
//			System.out.println(list.get(i).height);
//			System.out.println("-----------------");
//		}
		
//		- Person Ŭ������ �������� private�� ������� ���
		for (int i = 0; i < list.size(); i++) {
			Person vo = list.get(i);
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getHeight());
			System.out.println("-----------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
