package ex1_enum;

public class Ex2_enum {
	public static void main(String[] args) {
//		��� �ϳ��� ������ ����
		Item start = Item.START;
//		��� �ȿ� ��� �ִ� �����͸� ����
		String str = start.getItemStr();
//		��� �ȿ� ��� �ִ� �����͸� ���
		System.out.println(str);
		
//		���� for���� �̿��Ͽ� �������� ��ü ���� ���
		Item[] items = Item.values();
		
		for (Item item : items) {
			System.out.println(item.getItemStr() + ", " + item.getSymbol());
		}
	}
}
