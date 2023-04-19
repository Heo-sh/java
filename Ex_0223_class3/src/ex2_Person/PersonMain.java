package ex2_Person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person(); //명시적 객체 생성 - String 클래스 이외의 클래스는 모두 명시적 객체 생성을 해야 한다.
		
//		기본값
//		- 만약 클래스의 메서드 구현에서 this가 없을 경우에도 기본값이 나온다.
		System.out.println(p1.getName()); //null
		System.out.println(p1.getAge()); //0
		System.out.println(p1.getTel()); //null
		
		System.out.println("--------------------------------");
		
//		객체 p1을 setter를 통해 정보를 저장
		p1.setName("홍길동");
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
