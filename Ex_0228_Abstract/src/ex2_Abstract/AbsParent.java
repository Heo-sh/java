package ex2_Abstract;

public abstract class AbsParent {
//	�߻� �޼��尡 �� �� �̻� ���ǵǾ� �ִ� Ŭ������ �߻� Ŭ������ �ϴµ�,
//	�߻� Ŭ���� ���� abstract�� ���� �ڽ��� �߻�Ŭ������� �� �������� �Ѵ�.
//	����
//	- abstract ���������� class Ŭ������ {}
//	- ���������� abstract class Ŭ������ {}
	
	int value = 100;
	
//	����Ű: get + ctrl + space
	public int getValue() { //�Ϲ����� �޼���
		return value;
	}
	
//	�߻�޼���
//	����
//	- ���������� abstract ��ȯ�� �޼����(�Ķ����);
//	- abstract ���������� ��ȯ�� �޼����();
	
//	Ư¡
//	- �ϼ��ܰ谡 �ƴ� �̿ϼ��� �������� �ΰ�,
//	     ���߿� Ÿ Ŭ���� ������ �������Ͽ� ����� �� �ֵ��� ����� ��
	abstract public void setValue(int n);
}
