package ex1_enum;

import java.util.Arrays;

public class Ex1_enum {
	public static void main(String[] args) {
//		��ü�� ������ ����ϴ� ���� �ƴ� �̸����� ������ ����� �����ϴ�.
		
		Item[] items = Item.values(); //values�� ��ȯ���� �迭
//		- ������ ��� �ȿ� ��� �ִ� ������� �迭�� ��ȯ
		
//		for���� ���� �迭 �ȿ� ��� �ִ� ��� ������
//		for (int i = 0; i < items.length; i++) {
//			System.out.println(items[i]); //����� �̸� ��ȯ
//		}
		
		System.out.println(Arrays.toString(items)); //���ڿ��� ��ȯ �� ��ȯ
		
//		������ ���� ��ȯ
//		ordinal(): �������� ����ִ� ������� ����(int)��� ��ȯ
		for(Item item : items) { //Item item: ������ ��ü
			System.out.println("name = " + item.name() + ", ordinal = " + item.ordinal());
		}
		
		Item i1 = Item.START; // ����� �������� �� 3����
		Item i2 = Item.valueOf("START");
//		valueOf(String): String���� enum���� �����´�. ���ٸ� Exception �߻�
		Item i3 = Item.valueOf(Item.class, "START");
//		valueOf(Ŭ����.class, String): �Ѱܹ��� Ŭ���� �������� String�� ã�Ƽ�, enum���� �����´�.
		Item i4 = Item.STOP;
		
//		������ ������� �񱳴� ==�� ����� �� �ִ�. (����� �ּҸ� ��)
//		<, >�� ���� �񱳿����ڴ� ��� �Ұ�
		System.out.println(i3);
		System.out.println(i1 == i2); //true
		System.out.println(i1 == i4); //false
		
		switch (i1) {
		case START: //Item.START�� �� �� ����
			System.out.println("���� ����");
			break;
		case STOP:
			System.out.println("���� ����");
			break;		
		case EXIT:
			System.out.println("���� ����");
			break;
			
		}
	}
}
