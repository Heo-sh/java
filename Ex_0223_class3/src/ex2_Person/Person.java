package ex2_Person;

public class Person {
	
//	������� �̸�, ����, ��ȭ��ȣ�� �ٸ��⿡ �̸� ���� X;	
	private int age; //��������
	private String name, tel;
	
//	���콺 ��Ŭ�� -> Source -> Generate Getters and Setters
	
//	this: ���� Ŭ����
//	- ������ �Կ� �־ �ٸ� �̵���� ���� �� �������� ��ó�� �����ϴ�.
//	- ���������� ���������� �̸��� ���⿡ this�� ����Ѵ�.
//	- �޼��� �ȿ����� ���������� �켱�����̱� �����̴�.
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) { //��������: Ư�� �������� �����ǰ�, �� ���������� ���Ǵ� ���� -> �����
		this.age = age; //this�� ������ �Ķ���ͷ� ���� ���� ���������� �������� �� �ϰ� ���������θ� ������ �ȴ�.
						//if �Ķ������ ������� ���������� �������� ���� �ʴٸ� this�� �� �ᵵ �ȴ�.
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
