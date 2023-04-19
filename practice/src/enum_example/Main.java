package enum_example;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게임시작, 재시작, 종료 중 하나만 입력: ");
		String game = sc.next();
		
		Enum_exam user = Enum_exam.valueOf(game);
		
		System.out.println(user.getUser()          );
		
		
		
		
	}
}
