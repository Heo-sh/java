package ex1_enum;

public enum Transportation {
//	enum 클래스에서 추상 클래스를 사용하여도 클래스적으로는 오류가 나지 않고
//	상수들에서 오류가 난다.
//	- 추상메서드를 만들면 구현을 해야 하기에
	
	BUS(100) { //익명 클래스(이름이 없는 클래스)라고 한다
//					- 재사용하지 않고 한번만 쓰겠다. (일회용)
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return fare * distance;
		} //추상클래스를 만들면 만들어진 '상수 객체 옆'에 익명 클래스로 구현을 해야한다.
	},
	TRAIN(150) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return fare * distance;
		} 
	},
	SHIP(200) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return fare * distance;
		}
	},
	AIRPLANE(250) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return fare * distance;
		}
	};
	
	protected final int fare;
	
	private Transportation(int fare) {
		this.fare = fare;
	} 

	//주행거리를 distance 변수로 받는 추상 메서드
	abstract int totalFare(int distance);
}
