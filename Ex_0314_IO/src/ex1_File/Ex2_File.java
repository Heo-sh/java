package ex1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "D:\\WEB15_LHJ\\java";
		
		File f = new File(path);
		//����Ŭ������ �ι�° ���
		//������������ ������ �� �ش� ������ ���� ��������� �̸��� ������ �� �ֽ��ϴ�.
		
		//���� == ���丮
		if(f.isDirectory()) {
			String[] names = f.list();
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
