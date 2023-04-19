package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
//		Example1
//		두 개의 정수형 변수를 초기화 한다 (값은 자유)
//		그리고 산술연산자를 담아줄 문자열 변수를 만든다.
//		switch문을 이용하여 정수의 연산을 수행하는 계산기 코드 작성하기
		int n1 = 10;
		int n2 = 2;
		
		String op = "*";
		
		switch (op) {
		case "+":
			System.out.println("덧셈 값 : " + (n1 + n2));
			break;
		case "-":
			System.out.println("뺄셈 값 : " + (n1 - n2));
			break;
		case "*":
			System.out.println("곱셈 값 : " + (n1 * n2));
			break;
		case "/":
			System.out.println("나눗셈 값 : " + (n1 / n2));
			break;
		}
	
//		Example2
//		정수형 변수를 하나 만들고 달(1, 2월)을 대입한다.
//		해당 달이 몇 일까지 있는지 Switch문을 이용 작성
		
		int month = 8;
		
//		switch (month) {
//		case 1:
//			System.out.println(month + "월은 1일부터 31일까지입니다.");
//			break;
//		case 2:
//			System.out.println(month + "월은 1일부터 28일까지입니다.");
//			break;
//		case 3:
//			System.out.println(month + "월은 1일부터 31일까지입니다.");
//			break;
//		case 4:
//			System.out.println(month + "월은 1일부터 28일까지입니다.");
//			break;
//		case 5:
//			System.out.println(month + "월은 1일부터 31일까지입니다.");
//			break;
//		case 7:
//			System.out.println(month + "월은 1일부터 31일까지입니다.");
//			break;
//		case 8:
//			System.out.println(month + "월은 1일부터 31일까지입니다.");
//			break;
//		case 9:
//			System.out.println(month + "월은 1일부터 30일까지입니다.");
//			break;
//		case 10:
//			System.out.println(month + "월은 1일부터 31일까지입니다.");
//			break;
//		case 11:
//			System.out.println(month + "월은 1일부터 30일까지입니다.");
//			break;
//		case 12:
//			System.out.println(month + "월은 1일부터 31일까지입니다.");
//			break;
//		default:
//			System.out.println(month + "월은 없습니다.");
//			break;
//		}
		
//		Example2를 break를 3개만 써서 만들기 - 명령이 같은 경우 case를 한 줄에 같이 쓸 수 있다.
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 1일부터 31일까지입니다.");
			break;
		case 2:
			System.out.println(month + "월은 1일부터 28일까지입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 1일부터 30일까지입니다.");
			break;
		}		
	}
}
