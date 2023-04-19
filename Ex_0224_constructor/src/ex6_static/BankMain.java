package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("서울", "02-222-2222");
		Bank bk2 = new Bank("대전", "03-333-3333");
		Bank bk3 = new Bank("부산", "04-444-4444");
		
		Bank.interest = 0.4f; // 클래스 이름으로 호출
		
		bk1.printBank();
		bk2.printBank();
		bk3.printBank();
	}
}
