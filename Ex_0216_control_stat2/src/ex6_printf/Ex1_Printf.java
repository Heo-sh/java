package ex6_printf;

public class Ex1_Printf {
	public static void main(String[] args) {
//		printf
//		- 문자열과 변수에 들어있는 데이터를 함께 출력할 수 있도록 도와주는 포맷형식
//		- f == format이라는 뜻
		
//		%d: 정수형 데이터를 입력받을 때 사용 -> int, long
//		%c: 문자형 데이터를 입력받을 때 사용 -> char
//		%s: 문자열(문장) 데이터를 입력받을 때 사용 - String
//		%f: 실수형 데이터를 입력받을 때 사용 -> double, float
		
		int su1 = 10;
		int su2 = 7;
		
		System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
		System.out.printf("%d + %d = %d\n", su1, su2, su1 + su2);

//		\n: 줄바꿈
		
		System.out.println("------------------------------------");
		
//		Ex01
//		제 나이는 30세입니다.
		int age = 30;
		System.out.printf("제 나이는 %d세 입니다.\n", age);
		
		System.out.println("------------------------------------");
		
//		Ex02
//		제 이름은 ooo이고, 제 나이는 oo세이고, 제 키는 ooo.ocm이고, 제 혈액형은 oo형입니다.
		String name = "허성혁";
		int age2 = 29;
		double hei = 172.3;
		String blood = "A";
		
		System.out.printf
		("이름은 %s이고, 나이는 %d세이고, 키는 %.1fcm이고, 혈액형은 %s형입니다.\n", name, age2, hei, blood);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
