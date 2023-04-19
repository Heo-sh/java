package ex1_object;

public class ObjectMain {
	public static void main(String[] args) {
		Ex1_Object ob = new Ex1_Object();
		ob.setValue("Test"); //인자가 Object이지만 String이 Object를 상속받았으므로
//							       인자로 가능하다.
		System.out.println(ob.getValue());
		
//		int를 인자로 넣어보자.
		Ex1_Object ob2 = new Ex1_Object();
		
		ob2.setValue(100); //AutoBoxing(자동 형변환): 기본자료형 -> 객체 로 변환
		
		System.out.println(ob2.getValue() + "1");
		
//		UnBoxing: 객체 -> 기본자료형
		int i = (int)ob2.getValue(); //(int): 강제형변환
		
		System.out.println(i + 1);
	}
}
