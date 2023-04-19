package ex3_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
//		Example01
//		키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
//		입력받은 문자열에서 소문자 a가 몇 개 있는지를 판별하는 코드를 구현
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자와 특수문자를 제외한 알파벳을 무작위로 입력하시오: ");
//		String str = sc.next();
//		char[] ch = str.toCharArray();
//		
//		int count = 0;
//		
//		for (int i = 0; i < ch.length; i++) { //ch.length -> str.length() 
//			System.out.println(ch[i] + " ");
//			if (ch[i] == 'a') { //ch[i] -> str.charAt(i)
//				count++;
//			}
//		}
//		System.out.printf("a가 들어간 개수: %d", count);
		
//		Example02
//		회문구하기
//		회문: 앞으로 읽어도, 뒤로 읽어도 똑같이 읽히는 문장
		
//		키보드에서 문자열을 입력받은 후 해당 문장이 회문인지 아닌지를 판단하는 코드 구현
		
		System.out.println("문자열 입력: ");
		String ori = sc.next();
		String rev = "";
		
		for (int i = ori.length() - 1; i >= 0; i--) {
			rev += ori.charAt(i);
		}
		
		if (ori.equals(rev)) { //ori == rev
			System.out.println(ori + "는(은) 회문이다.");
		} else {
			System.out.println(ori + "는(은) 회문이 아니다.");
		}
				
	}
}
