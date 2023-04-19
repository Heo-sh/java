package ex1_annotation;


@TestInfo(tester = "ȫ�浿",
datetime = @DateTime(date = "20230310", time = "170408")) 
//value�� ���ؼ� TestInfo�� value()�޼��忡 ���� ����
//;�� ��� X
//���� �̸� �����ؾ��Ѵ�.
//���� ���� �� ��� �� {}���
//���� value�� ���� ����
//value���� ������ ������ �⺻������ ������ "����1"�� ��ȯ

public class Ex2_annotation {
	public static void main(String[] args) {
//		2. ��Ÿ ������̼�
//		- ����� ���� ������̼�
//		- ������̼��� ����� ���� ������̼�
//		- ���������� ������̼����� ���� ������ �Ѵ�.
//		- java.lang.annotation ��Ű���� ���ǵǾ� �ִ�.
		
//		��Ÿ ������̼� ����
//		1. @Target
//		- ������̼��� ���� ������ ���(����)�� �����ϴ� �� ���
//		- ������̼��� ���� �� �ִ� ����� �����ϴ� ��
//		- ����� ������ ���� ��� ����
//			@Target({})
//		2. @Documeted
//		3. @Inherited
//		4. @Retention
//		- ������̼��� �����Ǵ� �Ⱓ�� �����ϴ� �� ���
//		- @Retention(SOURCE): ������̼��� �ҽ� �ڵ忡�� �̿� �����ϸ� ������ �Ŀ��� �����
//		- @Retention(CLASS): .class���Ͽ� ���������� ��Ÿ�ӿ��� �����(����� ��� �Ұ�)
//		- @Retention(RUNTIME): �����Ϸ��� ��Ÿ�ӿ� ��� ����(���� �ÿ� ���� ����) - �ַ� ���
//		5. @Repeatable
		
//		������̼� Ÿ�� ����
//		- @ ��ȣ�� ���̴� ���� �����ϸ� �������̽��� �����ϴ� �Ͱ� ����
//		- @Override: ������̼� Override: ������̼� Ÿ��
//		- ����:
//			@interface ������̼� {
//			
//			}
		
//		������̼� ����� ��Ģ
//		- ����� Ÿ���� �⺻�ڷ���, String, Enum, ������̼�, Class�� ���
//		- ()�ȿ� �Ű������� ���� �Ұ�
//		- ���ܸ� ����Ұ�
//		- ��Ҹ� Ÿ�� �Ű������� ���� �Ұ�
		
		TestInfo testInfo = Ex2_annotation.class.getAnnotation(TestInfo.class);
		String[] value = testInfo.value(); //�迭�� ��ȯ
		
		for (String val : value) { //for���� �̿��Ͽ� ���� ��ü ��ȯ
			System.out.print(val);
		}
		
		System.out.println();
		
		String[] tools = testInfo.testTool();
		for (String tool : tools) {
			System.out.print(tool + " ");
		}
		
		System.out.println();
		
		String tester = testInfo.tester();
		System.out.println(tester);
		
		String date = testInfo.datetime().date();
		String time = testInfo.datetime().time();
		System.out.printf("date = %s, time = %s", date, time);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
