package ex1_enum;

public class Item2 {
//	열거형이 아닌 일반적인 클래스에서 상수를 정의 하게 된다면
//	하나하나 일일이 다 만들어야 하는 번거로움이 있다.
	
	public static final Item2 START = new Item2("시작", "S");
	public static final Item2 STOP = new Item2("멈춤", "P");
	public static final Item2 EXIT = new Item2("종료", "E");
	
	String str;
	String symbol;
	
	public Item2(String str, String symbol) {
		this.str = str;
		this.symbol = symbol;
	}

	public static Item2 getStart() {
		return START;
	}

	public static Item2 getStop() {
		return STOP;
	}

	public static Item2 getExit() {
		return EXIT;
	}
	
}
