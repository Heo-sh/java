package ex1_overload;

public class Ex1_Overload {
//	overload
//	- �޼����� '�ߺ�����'��� �ϸ�, �ϳ��� Ŭ���� ������ ���� �̸��� ����
//	    �޼��尡 ���� �� ���ǵǴ� ���� ���Ѵ�.
	
//	�����ε��� ����
//	- �޼��带 ��Ȳ�� ���� ������ �ʿ䰡 ����.
//	ex) println
	
//	�޼��� �����ε� ��Ģ
//	-1) �޼����� �̸��� ��� ���ƾ� �Ѵ�.
//	-2) �Ķ������ ������ �޶�� �Ѵ�.
//	-3) �Ķ������ ������ ���� ���, �ڷ����� �޶�� �Ѵ�.
//	-4) �Ķ������ ������ ���Ƶ� ������ �ٸ��� �ȴ�.
 
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
	}

	public void result(int n) { //1�� 2���� ��Ģ
		System.out.println("������ ���ڷ� �޴� �޼���");
	}

	public void result(char n) { //3���� ��Ģ
		System.out.println("�������� ���ڷ� �޴� �޼���");
	}
	
	public void result(String s, int n) { //2�� 3���� ��Ģ
		System.out.println("���ڿ�, ������ ���ڷ� �޴� �޼���");
	}

	public void result(int n, String s) { //4���� ��Ģ
		System.out.println("����, ���ڿ���  ���ڷ� �޴� �޼���");
	}



}
