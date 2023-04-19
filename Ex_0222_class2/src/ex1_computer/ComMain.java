package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
//		다른 클래스에 있는 변수와 함수를 사용하기 위해서는
//		해당 클래스를 객체화 해야 한다.
		
//		객체 생성법 - 메모리 낭비 최소화, 쿼리 단축
//		- 클래스명 객체명 = new 클래스명();
		
		Computer com1 = new Computer();
		
//		다른 클래스에 잇는 변수를 출력 or 대입하는 법
//		- 객체명.변수명 = 데이터; -> 객체화
		
//		출력법
		
//		System.out.println("cpu: " + com1.cpu);
//		System.out.println("ram: " + com1.ram);
//		System.out.println("ssd: " + com1.ssd);
//		System.out.println("color: " + com1.color);
//		
//		System.out.println("----------------------------------");
		
//		대입법
		
		Computer com2 = new Computer();		
		
		com2.ram = 128;
		
//		System.out.println("cpu: " + com2.cpu);
//		System.out.println("ram: " + com2.ram);
//		System.out.println("ssd: " + com2.ssd);
//		System.out.println("color: " + com2.color);		
//				
//		System.out.println("----------------------------------");

//		new로 따로 명시적 객체생성을 했기에 값이 같더라도 저장되는 주소를 달리 쓴다.
		
//		if (com1.equals(com2)) {
//			System.out.println("주소가 같다.");
//		} else {
//			System.out.println("주소가 다르다");
//		}
		
//		메서드호출법
//		- 객체명.메서드명: 호출부
		
		com1.getInfo();
		com2.getInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
