package ex2_Person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person(); //����� ��ü ���� - String Ŭ���� �̿��� Ŭ������ ��� ����� ��ü ������ �ؾ� �Ѵ�.
		
//		�⺻��
//		- ���� Ŭ������ �޼��� �������� this�� ���� ��쿡�� �⺻���� ���´�.
		System.out.println(p1.getName()); //null
		System.out.println(p1.getAge()); //0
		System.out.println(p1.getTel()); //null
		
		System.out.println("--------------------------------");
		
//		��ü p1�� setter�� ���� ������ ����
		p1.setName("ȫ�浿");
		p1.setAge(20);
		p1.setTel("010-1111-1111");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getTel());		
		
		System.out.println("--------------------------------");
		
		Person p2 = new Person();
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getTel());		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
