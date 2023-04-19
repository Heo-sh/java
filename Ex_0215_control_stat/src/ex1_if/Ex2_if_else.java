package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
//		if - else문
//		- else문에는 조건식이 들어가지 않는다.
		
//		- 기본형
//		if (조건식) {
//			조건이 참일 때 실행할 명령
//		} else {
//			조건이 참이 아닐 때 실행할 명령
//		}
		
		int n = 49;
		String str = "";
		
		if (++n >= 50) {
			str = "n은 50이상의 수";
		} else {
			str = "n은 50미만의 수";
		}
		
		System.out.println(str);
		
//		Example01
//		변수 age에 나이를 대입하고, 30세 이상이면
//		"드실만큼 드셨네요", 그렇지 않으면 "더 드셔도 되겠네요"를
//		출력하는 조건문 작성하기
//		그리고 마지막으로 "감사합니다."문장 출력하기
		
		int age = 29;
		String str1 = "";
		
		if (age >= 30) {
			str1 = "드실만큼 드셨네요.";
		} else {
			str1 = "더 드셔도 되겠네요.";
		}
		
		System.out.println(str1 + " " + "감사합니다.");
		
//		Example02
//		위 조건문 코드를 삼항연산자로 바꾸기
//		- 코드의 길이를 줄이기 위해서는 상황에 맞추어 if문과 삼항연산자를 적절히 사용하는 것이 좋다.
		
		String str2 = age >= 30 ? "드실만큼 드셨네요." : "더 드셔도 되겠네요.";
		
		System.out.println(str2 + " " + "감사합니다.");
		
	}
}
