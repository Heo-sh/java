package ex1_generic;

public class GenEx_main {
	public static void main(String[] args) {
//		T�� ���ϴ� Ŭ������ ��� ���ϴ� ������ ��ü�� ����
//		T�� �ڸ����� Ŭ������ ���԰����ϴ�.
		
		GenEx<String> v1 = new GenEx<String>(); //T�ڸ��� String�� ����
		v1.setValue("ȫ�浿");
		System.out.println(v1.getValue());
		
//		���׸� Ÿ���� �⺻�ڷ����� �ν����� �ʴ´�.
//		�⺻�ڷ���(int, char, float, double)�� ���׸� Ÿ�Կ��� �̿��ϰ��� �� ����
//		Integer, Character, Float, Double Ŭ������ �̿��ؾ��Ѵ�.
		
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
