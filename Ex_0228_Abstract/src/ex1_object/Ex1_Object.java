package ex1_object;

public class Ex1_Object {
//	�� ���� �ִ� Ŭ�������� �������� ���� �ȵȴ�. ex)String, Random
//	  - ���ǰ� �Ǿ� �ִ� Ŭ�����̱⿡ �ǹ̸� �Ҿ���� �� �ִ�.
//	�� package�� ���̸� module�� �ǰ�,
//	  module�� ���̴� ���� Library�̴�.
//	�� import�� �ʿ��� ����
//	  - �ٸ� package�� ������ �ҷ��;� �ϹǷ� ex)Scanner, Random
	
//	���� Ŭ������ Ư�� �޼��尡 �ִ�.
//	� ���� String�� ���ڷ� �ް� � ���� int�� ���ڷ� �޴´�.
//	��Ȳ�� ���� �ٸ� ���� ���� �޾ƾ� �Ѵٸ�,
//	��������(Ŭ��������)�� ��� �����ؾ� �ұ�
//	1. �����ε�(�����ε�)
//		- �����ε��� �ϴ� ����� ������ Object�� ���� ����� �ִ�.
	
	Object value; //Object������ ���� ����, �ڹ��� �ֻ��� ��ü
//	��ü����
//	- �ƹ� �͵� �� ���� ���� ����
//	- �ν��Ͻ� ������� �Ѵ�.
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() { //Object�� ��ȯ������: ��� ���� ���� �� �𸣱� ������
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
