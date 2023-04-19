package ex2_generic;

public class Person<T, M> { //��ƼŸ�� �Ķ����
//	- ���׸� Ÿ���� �ΰ� �̻��� ��ƼŸ�� �Ķ���͸� ����� �� �հ�
//	    �� ��� �� Ÿ�� �Ķ���͸� �޸��� ���� �����Ѵ�.
	
//	����� ������ ������ ��
//	�̸�, ��ȭ��ȣ
	
	private T name;
	private M tel;
	
	public Person(T name, M tel) {
		this.name = name;
		this.tel = tel;
	} //������

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
