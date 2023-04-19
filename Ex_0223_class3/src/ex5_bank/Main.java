package ex5_bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		UserInfo info = new UserInfo();
		
		int select; //선택한 항목을 저장할 변수
		int money;
		
		exit: while(true) {
			System.out.println("1. 입\t금");
			System.out.println("2. 출\t금");
			System.out.println("3. 잔 액 확 인");
			System.out.println("4. 종\t료"); //\t: 한 번의 탭만큼 공간이 생긴다.
			
			Scanner sc = new Scanner(System.in);
			System.out.print("항목선택: ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("----입금----");
				System.out.print("입금할 금액 입력: \n");
				money = sc.nextInt();
				info.deposit(money);
				break;
			case 2:
				System.out.println("----출금----");
				System.out.print("출금할 금액 입력: \n");
				money = sc.nextInt();
				info.witdraw(money);
				break;
			case 3:
				System.out.println("--잔액확인--");
				int money1 = info.showMoney();
				System.out.printf("현재 잔액: %d원\n", money1);
				break;
			case 4:
				System.out.println("종료");
				break exit;
			}			
		}
		
	}
}
