package ex1_work;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		
		int [] nArr = new int[10];
		
		for (int i = 0; i < 100; i++) {
			int r = new Random().nextInt(10);
//			System.out.println(r);
			nArr[r]++;
		}
		
		for (int i = 0; i < nArr.length; i++) {
			System.out.printf("nArr[%d]: %d\n", i, nArr[i]);
		}
		
		PrintGraph pg = new PrintGraph();
		pg.print(nArr);
	}
}
