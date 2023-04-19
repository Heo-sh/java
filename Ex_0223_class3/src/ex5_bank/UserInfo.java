package ex5_bank;

public class UserInfo {
	private int money;
	
	public void deposit(int money) {
		this.money += money;
		System.out.printf("입금완료: %d원\n", this.money);
	}
	
	public void witdraw(int money) {
		if (money < this.money) {
			this.money -= money;
			System.out.printf("%d원 출금완료\n", money);
			System.out.printf("잔액: %d\n", this.money);
		} else if (money > this.money) {
			System.out.println("잔액부족");
		}	
	}
	public int showMoney() {
		return money;
	}
}
