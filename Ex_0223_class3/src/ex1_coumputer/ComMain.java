package ex1_coumputer;

public class ComMain {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.ssd = 1024; //Ŭ������ �������� ������ �����ϴ�.
//		com1.brand = "Apple"; //�ٲ�� �ȵǴ� �������� �ٲ��. <- ���� but class ������ private�� ���� ���� �� ���� ���
		
		com1.setBrand("LG");
//		System.out.println(com1.brand); //private�� ���� ������  ���� ������ �� ������ ȣ�⵵ ���� �ʴ´�.
		System.out.println(com1.getBrand());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
