package ex5_bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		UserInfo info = new UserInfo();
		
		int select; //������ �׸��� ������ ����
		int money;
		
		exit: while(true) {
			System.out.println("1. ��\t��");
			System.out.println("2. ��\t��");
			System.out.println("3. �� �� Ȯ ��");
			System.out.println("4. ��\t��"); //\t: �� ���� �Ǹ�ŭ ������ �����.
			
			Scanner sc = new Scanner(System.in);
			System.out.print("�׸���: ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("----�Ա�----");
				System.out.print("�Ա��� �ݾ� �Է�: \n");
				money = sc.nextInt();
				info.deposit(money);
				break;
			case 2:
				System.out.println("----���----");
				System.out.print("����� �ݾ� �Է�: \n");
				money = sc.nextInt();
				info.witdraw(money);
				break;
			case 3:
				System.out.println("--�ܾ�Ȯ��--");
				int money1 = info.showMoney();
				System.out.printf("���� �ܾ�: %d��\n", money1);
				break;
			case 4:
				System.out.println("����");
				break exit;
			}			
		}
		
	}
}
