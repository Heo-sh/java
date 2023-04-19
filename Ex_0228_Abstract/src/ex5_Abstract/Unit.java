package ex5_Abstract;

abstract public class Unit {
	String name; //이름
	int energy = 0; //체력
	
	public int getEnergy() {
		return energy;
	}
	
//	캐릭터가 공격을 당햇을 때 체력 감소량은 지금 당장 알 수 없다.
//	누가 언제 어디서 어떻게 공격을 받을지 모르니까 so 추상메서드로 정의
	abstract public void decEnergy();
}
