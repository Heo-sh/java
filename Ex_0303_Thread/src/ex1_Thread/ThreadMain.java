package ex1_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		
		tt.start(); //run()�޼��带 ȣ�����ִ� �޼���
//		Runnable���� start�� �����Ƿ�, Thread�� ��ü�� �����
//		rt ��ü�� ������ �޴´�.
		t1.start();
	}
}
