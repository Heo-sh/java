package ex5_bank;

public class UserInfo {
	private int money;
	
	public void deposit(int money) {
		this.money += money;
		System.out.printf("�ԱݿϷ�: %d��\n", this.money);
	}
	
	public void witdraw(int money) {
		if (money < this.money) {
			this.money -= money;
			System.out.printf("%d�� ��ݿϷ�\n", money);
			System.out.printf("�ܾ�: %d\n", this.money);
		} else if (money > this.money) {
			System.out.println("�ܾ׺���");
		}	
	}
	public int showMoney() {
		return money;
	}
}
