package ex5_Thread;

import java.util.Scanner;

public class ThreadCountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		ThreadCount tc = new ThreadCount(sc.nextInt());
		Thread t = new Thread(tc);
		
		t.start();

	}		
}
