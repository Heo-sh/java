package ex1_coumputer;

public class Computer {
	private String brand = "Samsung";
	int ssd = 512;
	
//	setter&getter
//	- ������ ���� �� ���� ������ ��ġ ���� �������� �ٲ� �� ���
//	- private�� ������� ������ ���� ���� or ��ȸ�� �� ����ϴ� �޼����� ����
	
	public void setBrand(String a) { //private�� �ִ� ���� ����(����)�Ѵ�: setter
		brand = a; //a�� private ������ ����
	}
	
	public String getBrand() { //private�� �ִ� ���� ����(���)�´�: getter
		return brand;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
