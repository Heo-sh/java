package ex1_coumputer;

public class ComMain {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.ssd = 1024; //클래스의 변수까지 접근이 간단하다.
//		com1.brand = "Apple"; //바뀌면 안되는 변수까지 바뀐다. <- 단점 but class 설정시 private로 변수 설정 시 단점 상쇄
		
		com1.setBrand("LG");
//		System.out.println(com1.brand); //private로 변수 설정시  값을 변경할 수 없지만 호출도 되지 않는다.
		System.out.println(com1.getBrand());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
