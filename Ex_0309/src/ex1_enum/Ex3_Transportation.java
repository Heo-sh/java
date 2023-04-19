package ex1_enum;

public class Ex3_Transportation {
	public static void main(String[] args) {
		Transportation[] trans = Transportation.values();
		
		for (Transportation tran : trans) {
			System.out.printf("교통수단: %s, 100km - 요금: %d원\n", tran.name(), tran.totalFare(100));
		}
//		name(): enum 안의 상수의 이름을 반환한다.
	}
}
