package bread;

import java.util.Scanner;

public class MakeBreadMain {
	public static void main(String[] args) {
		MakeBread mb = new MakeBread();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 빵을 원하시나요?: ");
		int count = sc.nextInt();
		System.out.println("무슨 빵을 원하시나요?: ");
		String bread = sc.next();
		
		
//		mb.makeBread();
//		mb.makeBread(count);
		mb.makeBread(bread, count);
	}
}
