package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
//		switch
//		- �⺻��
//		switch (�񱳰�) {
//		case ���ǰ�1:
//			�񱳰��� ���ǰ�1�� ��ġ�� �� ������ ���;
//			break;
//		case ���ǰ�2:
//			�񱳰��� ���ǰ�2�� ��ġ�� �� ������ ���;
//			break;
//		case ���ǰ�3:
//			�񱳰��� ���ǰ�3�� ��ġ�� �� ������ ���;
//			break;
//		default: -> ��������
//			�񱳰��� ���ǰ��� ��ġ�ϴ� �� ���� �� ������ ���;
//			break;
//		}
		
		int n = 1;
		
		switch (n) {
		case 1:
			System.out.println("1. �����ϱ�");
			break; //switch���� ���������� Ű����
		case 2:
			System.out.println("2. ���ӼҰ�");
			break;
		case 3:
			System.out.println("3. ����");
			break;
		default:
			System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�.");
			break;
		}
		
//		if vs switch
//		- if��: ������ ������ �񱳸� �� �� ex) ������
//		- switch��: 1:1 ������ �ؾ��� �� ex) �޴�����
		
//		�̷� ��� 100~0������ ��� ���� ������ �ɾ��־�� �ϱ⿡ �۾��� �����.
//		- �������� ���� �ʴ�.
		int score = 80;
		
		switch (score) {
		case 100:
			System.out.println("������ A�Դϴ�.");
			break;
		case 99:
			System.out.println("������ A�Դϴ�.");
			break;
		case 98:
			System.out.println("������ A�Դϴ�.");
			break;
		}

	}
	
}
