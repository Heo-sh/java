package ex5_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread {
	
	Scanner sc = new Scanner(System.in);

	int count = 0;
	Random rd = new Random();
	
	@Override
	public void run() {
	}
	
	
	public void startGame() {
		int rand = rd.nextInt(10);
		int rand2 = rd.nextInt(10);
		int result = rand + rand2;
		int [] ar = new int [5];
		for (int i = 1; i <= 5; i++) {
			ar[i] += result;
		}
		for (int i = 1; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		// while (true) {
		// 	// System.out.println("숫자의 합을 구하시오: ");
		// 	// int n = sc.nextInt();

				
		// 	// if (n == result) {
		// 	// 	System.out.printf("%d회 정답!", count);
		// 	// 	count++;				
		// 	// } else {
		// 	// 	System.out.println("다시 입력!: ");
		// 	// 	continue;
		// 	// }

		}
	}
