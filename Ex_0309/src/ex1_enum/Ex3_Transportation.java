package ex1_enum;

public class Ex3_Transportation {
	public static void main(String[] args) {
		Transportation[] trans = Transportation.values();
		
		for (Transportation tran : trans) {
			System.out.printf("�������: %s, 100km - ���: %d��\n", tran.name(), tran.totalFare(100));
		}
//		name(): enum ���� ����� �̸��� ��ȯ�Ѵ�.
	}
}
