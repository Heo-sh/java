package panel1;


import javax.swing.JFrame;

import panel2.JPanel02;
import panel2.Jpanel01;

public class JPanelTest extends JFrame {
	public Jpanel01 jpanel01 = null;
	public JPanel02 jpanel02 = null;
	
	public void change(String panelName) {
		if (panelName.equals("panel01")) {
			getContentPane().removeAll();
//			CotentPane: �Ϲ����� ������Ʈ�� ���� �� �ִ� �г�
			getContentPane().add(jpanel01);
			revalidate(); //��ġ�����ڿ��� �ڽ� ������Ʈ�� �ٽ� ��ġ�ϵ��� �����ϴ� �޼���
			repaint(); //���� ��ħ
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel02);
			revalidate();
			repaint();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
