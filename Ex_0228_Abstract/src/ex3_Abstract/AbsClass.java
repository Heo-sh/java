package ex3_Abstract;

abstract public class AbsClass {
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	public abstract int changeValue();
}
