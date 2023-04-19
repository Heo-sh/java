package ex5_Abstract;

public class Terran extends Unit {
//	각 종족별 공중유닉이면 true, 지상유닛이면 false
	boolean fly;
	
	public Terran(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 3;
	}

}
