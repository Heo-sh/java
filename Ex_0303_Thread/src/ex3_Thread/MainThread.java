package ex3_Thread;

public class MainThread {
	public static void main(String[] args) {
//		������ Ŭ�������� ���� �������� �̸��� ����, �켱������ Ȯ���ϴ�
//		�޼��带 �����Ѵ�.
		ThreadName tn = new ThreadName();
		tn.start();
		
		System.out.println("------------------");
		
		System.out.println("���� ����ǰ� �ִ� �������� �̸�: " + Thread.currentThread().getName());
		System.out.println("���� ����ǰ� �ִ� �������� ����: " + Thread.currentThread().getState());
//		RUNNABLE: ���� ������ ����
		System.out.println("���� ����ǰ� �ִ� �������� �켱����: " + Thread.currentThread().getPriority());	
//		1~10���� ������ ������, 1�� ���� ���� ������ �Ǹ�, ���������� ������ 5�� �⺻������ �� �ִ�.
	}
}
