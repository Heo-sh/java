package ex1_Thread;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
//		작업할 내용
	}
	
//	프로세스(process)
//	- 현재 실행중인 프로그램
	
//	스레드(Thread)
//	- 프로세스에서 작업을 수행하는 것
//	- 두 가지 이상의 프로세스를 실행 가능하게 해준다.
//	- 하지만 실제로 동시에 2개가 실행되는 것은 아니고, 운영체제 내부에서
//	    동시에 돌아가는 것처럼 보이도록 아주 빠르게 번갈아 가면서 스레드를
//	    실행하는 것
	
//	프로세스가 실행되는 방식
//	- 1. 시간 분할 방식: 모든 프로세스에게 동일한 시간을 할당하고
//	                                    골고루 실행되는 방식
//	- 2. 선점형 방식: 각각의 프로세스에게 우선 순위를 부여, 우선순위가
//	                                높은 순으로 실행되는 방식

//	jvm이 스레드 처리 시 하는 일: 스레드 스케쥴링
//	- 1. 스레드가 몇 개 존재하는지
//	- 2. 스레드가 실행된느 프로그램 코드의 메모리 위치가 어디인지
//	- 3. 현재 스레드의 상태는 무엇인지
//	- 4. 스레드의 우선순위가 몇인지

//	개발자가 스레드 처리 시 하는 일
//	- 1. 자바 스레드로 작동할 작업이 무엇잊니 코드로서 요청
//	- 2. 스레드 코드가 실행할 수 있도록 JVM한테 요청

//	스레드의 생성
//	- 1. Thread 클래스 상속
//	- 2. Runnable 인터페이스 구현















}
