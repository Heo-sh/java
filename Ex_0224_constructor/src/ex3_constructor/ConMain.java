package ex3_constructor;

public class ConMain {
	public static void main(String[] args) {
		ConTest ct = new ConTest(); //ConTest(): 생성자
		
//		ct.ConTest(); -> 재호출 불가
		
		ConTest ct2 = new ConTest("ABC"); //생성자 오버로딩
	}
}
