package ex2_generic;

public class GenericMain {
	public static void main(String[] args) {
		Person<String, String> p1 = new Person<String, String>("홍길동", "010-1111-1111");
		System.out.println("이름: " + p1.getName());
		System.out.println("번호: " + p1.getTel());
		
		System.out.println("-----------------------");
		
		Person<String, String> p2 = new Person<>("김길동", "010-2222-2222");
		System.out.println("이름: " + p2.getName());
		System.out.println("번호: " + p2.getTel());
		
		System.out.println(compare(p1, p2));
		
	}
	
//	위 사람의 정보를 저장하는 코드에서 객체들의 이름이 일치하면 true
//	다르면 false, 번호가 일치하면 true, 다르면 false를 받아
//	논리연산 하기
	
	public static <T, M> boolean compare(Person<T, M>p1, Person <T, M>p2) {
		boolean nameCompare = p1.getName().equals(p2.getName());
		boolean telCompare = p1.getTel().equals(p2.getTel());
		
		return nameCompare && telCompare;
	}
}
