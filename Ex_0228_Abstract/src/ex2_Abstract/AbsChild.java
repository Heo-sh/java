package ex2_Abstract;

public class AbsChild extends AbsParent {
//	�߻�Ŭ������ ��ӹ޴� �ڽ� Ŭ������ �θ� ������ �ִ�
//	�߻� �޼���(�̿ϼ�)�� �ݵ�� �޾Ƶξ�� �Ѵ�.
//	�߻�Ŭ������ ��ӹ޴� Ŭ������ �Ϲ� Ŭ�����̴�. -> abstract�� ���� �ʿ� ����
	
	@Override
	public void setValue(int n) {
		System.out.println("�߻�޼��� ��������");
	}
}
