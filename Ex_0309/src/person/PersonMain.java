package person;

public class PersonMain { //������ �ϱ� ���� Ŭ����
	public static void main(String[] args) {
//		���� ���������� �߰�, ����, Ȯ���� �غ���.
//		�̸�, ����, ��ȣ�� ���� PersonŬ������ �����.
//		PersonManagerŬ������ ����� personMgr()�޼��带 �����
//		�Ʒ��� ���� ��� ����
//		������ PersonMain���� �ϱ�
		
//		���:
//			1. �����߰�
//			2. ��������
//			3. ��ü����
//			4. ����
//			�׸���: 1 <- ���� �߰� �׸�
//			----�����߰�----
//			�̸�: 1 <- Ű���忡�� �Է¹ޱ�
//			����: 1
//			��ȭ: 1
//			���� ���� <- ArrayList �߰�
//			
//			�׸���: 3 <- ���� ���� �׸�
//			----��ü����----
//			����ο� 1��
//			�̸�: 1
//			����: 1
//			��ȭ: 1
//		
//			�׸���: 2 <- ���� ����
//			----���� ����----
//			������ �̸�: 1
//			1�� ������ �����߽��ϴ�.
//			������ �����Ͱ� �����ϴ�.
//		PersonManager pm = new PersonManager();
//		pm.personMgr();
		
		PersonManager_teacher pmt = new PersonManager_teacher();
		pmt.personMgr();
		
	}
}
