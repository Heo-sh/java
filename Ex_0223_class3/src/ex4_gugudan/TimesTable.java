package ex4_gugudan;

public class TimesTable {
	public void showTable(int a) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d´Ü\n",a);
			System.out.printf("%d X %d = %d\n", a, i, a * i);
		}
	}
}
