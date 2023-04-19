package ex1_coumputer;

public class Computer {
	private String brand = "Samsung";
	int ssd = 512;
	
//	setter&getter
//	- 영원히 변할 것 같지 않지만 피치 못할 사정으로 바뀔 때 사용
//	- private로 만들어진 변수의 값을 변경 or 조회할 때 사용하는 메서드의 개념
	
	public void setBrand(String a) { //private에 있는 값을 세팅(대입)한다: setter
		brand = a; //a를 private 변수에 대입
	}
	
	public String getBrand() { //private에 있는 값을 가져(출력)온다: getter
		return brand;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
