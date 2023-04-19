package homework;

import java.util.Random;

public class Graph {
	Random rd = new Random();
	int rand = rd.nextInt(9);
	
	int[] ar = new int[100];
	
	public void graph() {
		for (int i = 1; i < 101; i++) {
			ar[100] += rand;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
	}
}
