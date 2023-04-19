package ex3_Abstract;

public class AbsMain {
	public static void main(String[] args) {
		AbsChild1 ac1 = new AbsChild1();
		
		System.out.println(ac1.getValue()); //100
		System.out.println(ac1.changeValue()); //110
		System.out.println(ac1.getValue()); //110
		
		System.out.println("----------------------------");
		
		AbsChild2 ac2 = new AbsChild2();

		System.out.println(ac2.getValue()); //100
		System.out.println(ac2.changeValue()); //97
		System.out.println(ac2.getValue()); //97
		
	}
}
