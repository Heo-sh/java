package ex2_Abstract;

public class AbsMain {
	public static void main(String[] args) {
//		�߻� �޼���� ���� ��üȭ�� �� �� ����.
//		�߻� �޼��带 ��ӹ��� �ڽ�Ŭ������ ��üȭ�Ͽ� �����ؾ� �Ѵ�.
//		AbsParent ap = new AbsParent();
		
		AbsChild ac = new AbsChild();
		ac.setValue(3);
		
//		�߻�Ŭ������ ��ӹ޾ұ� ������ �߻�Ŭ������ �ִ� �Ϲݸ޼��嵵 ��� ����
		System.out.println(ac.getValue()); //���: 100
	}
}
