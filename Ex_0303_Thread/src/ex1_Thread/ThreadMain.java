package ex1_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		
		tt.start(); //run()메서드를 호출해주는 메서드
//		Runnable에는 start가 없으므로, Thread를 객체로 만들어
//		rt 객체를 변수로 받는다.
		t1.start();
	}
}
