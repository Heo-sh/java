package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("����", "02-222-2222");
		Bank bk2 = new Bank("����", "03-333-3333");
		Bank bk3 = new Bank("�λ�", "04-444-4444");
		
		Bank.interest = 0.4f; // Ŭ���� �̸����� ȣ��
		
		bk1.printBank();
		bk2.printBank();
		bk3.printBank();
	}
}
