package ex6_updown;

import java.util.Random;

public class Start {
	Random rnd = new Random();
	int rand = rnd.nextInt(50) + 1;
	String str = "";
	int count = 1;
	
	public String updown(int a) {
		if (a < rand) {
			str = "Up!";
//			System.out.println("Up!");
		} else if (a > rand) {
			str = "Down!";
//			System.out.println("Down!");
		} else {
			str = "정답";
//			System.out.printf("%d회 만에 정답!");
		}
		return str;
	}
}
