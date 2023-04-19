package ex4_Thread;

public class SleepThread extends Thread {
//	sleep() 메서드
//	- 스레드를 지정한 시간동안 Blocked 상태로 만든다.
//	- 시간은 1000분의 1초까지 결정 가능하며, 지정된 시간이 지나면
//	    다시 Runnable(실행 가능한)상태로 돌아간다.
	
	@Override
	public void run() {
		System.out.println("카운트 5초");
		for (int i = 5; i >= 0; i--) {
			if (i != 0) {
				try {
					System.out.println(i);
					Thread.sleep(1000); //1000milliseconds = 1초
				} catch (InterruptedException e) { //중간에 간섭을 받았을 때 생기는 예외
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //catch
			} //if
		} //for
		System.out.println("종료");
	}
}
