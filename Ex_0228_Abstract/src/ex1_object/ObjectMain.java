package ex1_object;

public class ObjectMain {
	public static void main(String[] args) {
		Ex1_Object ob = new Ex1_Object();
		ob.setValue("Test"); //���ڰ� Object������ String�� Object�� ��ӹ޾����Ƿ�
//							       ���ڷ� �����ϴ�.
		System.out.println(ob.getValue());
		
//		int�� ���ڷ� �־��.
		Ex1_Object ob2 = new Ex1_Object();
		
		ob2.setValue(100); //AutoBoxing(�ڵ� ����ȯ): �⺻�ڷ��� -> ��ü �� ��ȯ
		
		System.out.println(ob2.getValue() + "1");
		
//		UnBoxing: ��ü -> �⺻�ڷ���
		int i = (int)ob2.getValue(); //(int): ��������ȯ
		
		System.out.println(i + 1);
	}
}
