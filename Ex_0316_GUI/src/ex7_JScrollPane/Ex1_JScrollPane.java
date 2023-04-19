package ex7_JScrollPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ex1_JScrollPane {
	public static void main(String[] args) {
		JFrame f = new JFrame("��ũ�� �����");
		f.setLayout(new BorderLayout());
		
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(10,5));
		int cnt = 1;
		for(int i = 1; i <=10; i++) {
			for(int j = 1; j<=5;j++) {
				jp.add(new JButton("��ư" + cnt));
				cnt++;
			}
		}
		
		//����, ���� ��ũ�ѹ� �����ϱ� ���� ���
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(jp, v, h);
		
		f.add(js, BorderLayout.CENTER);
		
		
		
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,200,300,200);
		f.setVisible(true);
	}
}