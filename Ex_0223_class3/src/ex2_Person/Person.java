package ex2_Person;

public class Person {
	
//	사람마다 이름, 나이, 전화번호가 다르기에 미리 설정 X;	
	private int age; //전역변수
	private String name, tel;
	
//	마우스 우클릭 -> Source -> Generate Getters and Setters
	
//	this: 현재 클래스
//	- 개발을 함에 있어서 다른 이들과의 협업 중 직관적인 대처가 가능하다.
//	- 전역변수와 지역변수의 이름이 같기에 this를 써야한다.
//	- 메서드 안에서는 지역변수가 우선순위이기 때문이다.
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) { //지역변수: 특정 지역에서 생성되고, 그 지역에서만 사용되는 변수 -> 상대적
		this.age = age; //this가 없으면 파라미터로 받은 값을 전역변수로 전해주지 못 하고 지역변수로만 고정이 된다.
						//if 파라미터의 변수명과 전역변수의 변수명이 같지 않다면 this를 안 써도 된다.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
