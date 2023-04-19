package ex1_enum;

public class Ex2_enum {
	public static void main(String[] args) {
//		상수 하나를 가져와 저장
		Item start = Item.START;
//		상수 안에 들어 있는 데이터를 저장
		String str = start.getItemStr();
//		상수 안에 들어 있는 데이터를 출력
		System.out.println(str);
		
//		향상된 for문을 이용하여 열거형의 전체 내용 출력
		Item[] items = Item.values();
		
		for (Item item : items) {
			System.out.println(item.getItemStr() + ", " + item.getSymbol());
		}
	}
}
