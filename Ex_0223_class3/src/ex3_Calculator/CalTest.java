package ex3_Calculator;

public class CalTest {
	private int a;
	private int b;
	private String op;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void getCal() {
		if (op == "+") {
			System.out.printf("%d�� %d�� ��: %d", a, b, a + b);
		} else if (op == "-"){
			System.out.printf("%d�� %d�� ����: %d", a, b, a - b);			
		} else if (op == "*") {
			System.out.printf("%d�� %d�� ����: %d", a, b, a * b);
		} else if (op == "/") {
			System.out.printf("%d�� %d�� ������: %d", a, b, a / b);
		}
	}
	public void setCal(String cal) {
		this.op = cal;
	}
	
	public int calculator(int su1, int su2, String op) {
		int result = 0;
		switch (op) {
		case "+":
			result = su1 + su2;
			break;
		case "-":
			result = su1 - su2;
			break;
		case "*":
			result = su1 * su2;
			break;
		case "/":
			result = su1 / su2;
			break;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
