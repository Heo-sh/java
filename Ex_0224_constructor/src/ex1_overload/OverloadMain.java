package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		Ex1_Overload ol = new Ex1_Overload();
		
		ol.result();
		ol.result(1);
		ol.result('A');
		ol.result("ABC", 1);
		ol.result(2, "DEF");
		
		System.out.println(); //대표적인 메서드 오버로드
		
		
	}
}
