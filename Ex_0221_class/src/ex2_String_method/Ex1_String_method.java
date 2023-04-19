package ex2_String_method;

public class Ex1_String_method {
	public static void main(String[] args) {
//		메서드(method)
//		- 어떠한 기능을 가지고 있는 명령문의 집합
//		- 메서드를 사용하는 가장 큰 이유: 반복적으로 사용되는 코드를 줄이기 위해서
//		- 자주 사용하는 내용의 코드를 메서드로 작성하여 필요할 때만 호출 가능
		
//		메서드 호출법
//		객체명.함수명();
		String str = "Hong Gil Dong"; //암시적 객체 생성
		
		System.out.println(str);
		
		System.out.println("문자열 str의 길이: " + str.length());
		
		int index = str.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치: " + index);
		
		char c = str.charAt(2);
		System.out.println("2에 해당하는(추출) 문자: " + c);
		
		String str2 = str.substring(0, 4);
		System.out.println("잘라낸 문자열: " + str2);

		//split(): 소괄호 안에 적힌 걸 기준으로 문자열을 나눠서 문자열 배열에 넣어주는 기능
		String [] str3 = str.split(" ");
		for (int i = 0; i < str3.length; i++) {
			System.out.printf("str[%d]: %s\n", i, str3[i]);
		}
		
		System.out.println(str);
		str = " Hong Gil Dong ";
		
//		trim(): 문자열의 앞 뒤 공백 제거
		System.out.println(str.trim());
		
//		String 클래스에 속해 있는 메서드는 아니지만 유용한 메서드
//		문자열로 작성된 숫자를 실제 정수로 바꿔주는 코드 -> '숫자 형태의 문자열'만 바꿔준다.
//		Wrapper Class - Integer(int), Character(char), Float(float), Double(double)
		String number = "1";
		System.out.println(number + 10); //110
		System.out.println(Integer.parseInt(number) + 10); //11
		
//		실제 정수를 문자열로 바꿔주는 코드
		int number2 = 1;
		System.out.println(number2 + 10); //11
		System.out.println(Integer.toString(number2) + 10); //110
		
	}
}
