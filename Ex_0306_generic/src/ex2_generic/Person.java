package ex2_generic;

public class Person<T, M> { //멀티타입 파라미터
//	- 제네릭 타입은 두개 이상의 멀티타입 파라미터를 사용할 수 잇고
//	    이 경우 각 타입 파라미터를 콤마를 통해 구분한다.
	
//	사람의 정보를 저장할 때
//	이름, 전화번호
	
	private T name;
	private M tel;
	
	public Person(T name, M tel) {
		this.name = name;
		this.tel = tel;
	} //생성자

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public M getTel() {
		return tel;
	}

	public void setTel(M tel) {
		this.tel = tel;
	}

}
