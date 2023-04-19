package ex1_annotation;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*; //ElementType: ������
import static java.lang.annotation.RetentionPolicy.*; //RetentionPolicy: ������

@Target({TYPE, FIELD, TYPE_USE, METHOD}) //�����ü
@Retention(RUNTIME)
public @interface TestInfo { //�̷��� ����� �ٸ� ������ @TestInfo��� �̸����� ������̼� ���
//������̼��� interface�� �����ؾ� ��
	
	String[] value() default "����1"; //�߻�޼���
//	default "����1": �ƹ��͵� �������� �ʾ��� �� �⺻������ "����1"�� ��ȯ
	String[] testTool() default "INF01";
	String tester();
	DateTime datetime();
//	DateTime�̶�� ������̼��� �����Ͽ�
//	�� �ȿ� �ð��� ��¥�� �޴� ������ ����� �޾ƿ´�.
}
