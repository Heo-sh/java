package ex5_Abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("해병", 50, false); //유닛 생성
		System.out.println("t1의 에너지: " + t1.energy); //처음 생성 시의 체력: 50
		t1.decEnergy(); //재정의한 decEnergy() 호출 -> 데미지 입음
		System.out.println("t1의 에너지: " + t1.getEnergy()); //데미지 입은 후의 체력: 47
		
		Protoss p1 = new Protoss("광전사", 150, false);
		System.out.println("p1의 에너지: " + p1.energy); //150
		p1.decEnergy(); // -1
		p1.decEnergy(); // -1
		p1.decEnergy(); // -1
		System.out.println("p1의 에너지: " + p1.getEnergy()); //147
		
		Zerg z1 = new Zerg("무리군주", 100, true);
		System.out.printf("%s의 에너지: %d\n", z1.name, z1.energy);
		z1.decEnergy();
		System.out.printf("%s의 에너지: %d\n", z1.name, z1.energy);

	}
}	
