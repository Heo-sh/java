package ex5_super;

public class SuperMain {
	public static void main(String[] args) {
		Child c = new Child(15);
//		�ڽ� Ŭ������ �����ϸ� �ڽ��� �����ڰ� ȣ��Ǵµ�,
//		���⼭�� �ڽ�Ŭ�������� super()��
//		�θ��� �����ڸ� ���� ȣ�������Ƿ�
//		�θ�Ŭ������ �����ڿ� ���� �����ϰ� ��.
		
		int res = c.result();
		System.out.println("res: " + res); //100
	}
}
