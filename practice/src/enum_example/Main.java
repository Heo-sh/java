package enum_example;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ӽ���, �����, ���� �� �ϳ��� �Է�: ");
		String game = sc.next();
		
		Enum_exam user = Enum_exam.valueOf(game);
		
		System.out.println(user.getUser()          );
		
		
		
		
	}
}
