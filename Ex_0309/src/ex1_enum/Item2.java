package ex1_enum;

public class Item2 {
//	�������� �ƴ� �Ϲ����� Ŭ�������� ����� ���� �ϰ� �ȴٸ�
//	�ϳ��ϳ� ������ �� ������ �ϴ� ���ŷο��� �ִ�.
	
	public static final Item2 START = new Item2("����", "S");
	public static final Item2 STOP = new Item2("����", "P");
	public static final Item2 EXIT = new Item2("����", "E");
	
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
