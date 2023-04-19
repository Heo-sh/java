package ex1_generic;

public class GenEx_main {
	public static void main(String[] args) {
//		T에 원하는 클래스를 적어서 원하는 형태의 객체로 생성
//		T의 자리에는 클래스만 대입가능하다.
		
		GenEx<String> v1 = new GenEx<String>(); //T자리에 String을 지정
		v1.setValue("홍길동");
		System.out.println(v1.getValue());
		
//		제네릭 타입은 기본자료형을 인식하지 않는다.
//		기본자료형(int, char, float, double)을 제네릭 타입에서 이용하고자 할 때는
//		Integer, Character, Float, Double 클래스를 이용해야한다.
		
		GenEx<Integer> v2 = new GenEx<Integer>();
//		GenEx<Integer> v2 = new GenEx<>();		
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		GenEx<Float> v4 = new GenEx<Float>();
		v4.setValue(3.14f);
		System.out.println(v4.getValue());

		GenEx<Double> v5 = new GenEx<Double>();
		v5.setValue(3.14);
		System.out.println(v5.getValue());
	}
}
