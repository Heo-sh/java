package ex3_try_catch;

public class Ex1_try_catch {
	public static void main(String[] args) {
		//�ڹٿ��� ���α׷��� ����Ǵ� ���� ����(����,����,����)
		//�� �߻��ϸ� �� �������� ���α׷��� ������ ����ȴ�.
		//��� ���ᰡ �ȵǸ� �� ū������ �߻��Ҽ� ������
		//���δ� ���󰡴��� ������ �ְų� ���� �߻��� �̸� �����ϰ�
		//������ �۾��� �����ؾ� �ϴ� ��찡 �ִ�.
		//�̷� �� ����ϴ� ������ ����ó�� �̴�.
		
		//���� ������ ����?
		//Ű���忡�� ���� ���� �� ���ϴ� Ÿ���� �ƴ� �ٸ� Ÿ������
		//�޴´ٸ� ���� ���� 
		
		int result = 10;
		char[] arr = new char[3];
		
		//result = 10/0;
		//ArithmeticException ������ 0���� ������ �� �� �߻��ϴ� ����
		
		//ArrayIndexOutOfBoundsException ���� index�� ���� �������� �� �� �߻��ϴ� ����
		
		try {
			//result = 10/0;
			arr[3] = 'A';
		} catch(Exception e) {
			//e.printStackTrace();//� ������ �߻��ߴ��� �˷���
			System.out.println("���� index�� ���� ���� �� �����ϴ�.");
		}
		
		
		
		
	}
}