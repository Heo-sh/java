package bread;

import java.util.Scanner;

public class MakeBreadMain {
	public static void main(String[] args) {
		MakeBread mb = new MakeBread();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ���� ���Ͻó���?: ");
		int count = sc.nextInt();
		System.out.println("���� ���� ���Ͻó���?: ");
		String bread = sc.next();
		
		
//		mb.makeBread();
//		mb.makeBread(count);
		mb.makeBread(bread, count);
	}
}
