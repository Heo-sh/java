package practice1;

public class Practice01 {
	public static int add(int n1, int n2) {
		int result = 0;
		if (n1 > n2) {
			result = n1 - n2;
		} else if (n2 > n1) {
			result = n2 - n1;
		}
		return result;
	}
	public static void main(String[] args) {
		int result = add(6, 10);
		System.out.println(result);
	}
}