package ex3_Thread;

public class MainThread {
	public static void main(String[] args) {
//		스레드 클래스에는 현재 스레드의 이름과 상태, 우선순위를 확인하는
//		메서드를 제공한다.
		ThreadName tn = new ThreadName();
		tn.start();
		
		System.out.println("------------------");
		
		System.out.println("현재 실행되고 있는 스레드의 이름: " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태: " + Thread.currentThread().getState());
//		RUNNABLE: 실행 가능한 상태
		System.out.println("현재 실행되고 있는 스레드의 우선순위: " + Thread.currentThread().getPriority());	
//		1~10까지 순위가 있으며, 1이 제일 빨리 실행이 되며, 지정해주지 않으면 5가 기본값으로 들어가 있다.
	}
}
