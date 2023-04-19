package ex1_enum;

import java.util.Arrays;

public class Ex1_enum {
	public static void main(String[] args) {
//		객체를 생성해 사용하는 것이 아닌 이름만을 가지고서 사용이 가능하다.
		
		Item[] items = Item.values(); //values의 반환형은 배열
//		- 열거형 상수 안에 들어 있는 내용들을 배열로 반환
		
//		for문을 통한 배열 안에 들어 있는 요소 꺼내기
//		for (int i = 0; i < items.length; i++) {
//			System.out.println(items[i]); //상수의 이름 반환
//		}
		
		System.out.println(Arrays.toString(items)); //문자열로 변환 후 반환
		
//		열거형 순서 반환
//		ordinal(): 열거형에 들어있는 상수들을 순서(int)대로 반환
		for(Item item : items) { //Item item: 열거형 객체
			System.out.println("name = " + item.name() + ", ordinal = " + item.ordinal());
		}
		
		Item i1 = Item.START; // 상수를 가져오는 법 3가지
		Item i2 = Item.valueOf("START");
//		valueOf(String): String값을 enum에서 가져온다. 없다면 Exception 발생
		Item i3 = Item.valueOf(Item.class, "START");
//		valueOf(클래스.class, String): 넘겨받은 클래스 정보에서 String을 찾아서, enum에서 가져온다.
		Item i4 = Item.STOP;
		
//		열거형 상수간의 비교는 ==을 사용할 수 있다. (상수의 주소를 비교)
//		<, >와 같은 비교연산자는 사용 불가
		System.out.println(i3);
		System.out.println(i1 == i2); //true
		System.out.println(i1 == i4); //false
		
		switch (i1) {
		case START: //Item.START라 쓸 수 없음
			System.out.println("게임 시작");
			break;
		case STOP:
			System.out.println("게임 멈춤");
			break;		
		case EXIT:
			System.out.println("게임 종료");
			break;
			
		}
	}
}
