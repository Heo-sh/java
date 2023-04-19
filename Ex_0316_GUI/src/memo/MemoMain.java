package memo;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�޸���");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setLayout(null); //������ġ

		
		JTextField tf = new JTextField();
		tf.setBounds(7, 15, 180, 30);
		
		JButton btn_input = new JButton("Ȯ��");
		btn_input.setBounds(190, 15, 60, 30);
		btn_input.setEnabled(false);
		
		JButton btnSave = new JButton("����");
		btnSave.setBounds(6, 260, 110, 30);
		
		JButton btnClose = new JButton("����");
		btnClose.setBounds(140, 260, 110, 30);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(7, 50, 243, 200);
		ta.setEditable(false);
		
		
//		�����ӿ� ��� ������
		frame.add(tf);
		frame.add(btn_input);
		frame.add(ta);
		frame.add(btnClose);
		frame.add(btnSave);
		
		frame.setBounds(700, 200, 270, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		��ư ��� Ȱ��ȭ
		
//		tf�� �ƹ��͵� ������ ���� ������ ��ư ��Ȱ��ȭ
		tf.addKeyListener(new KeyAdapter() { //KeyAdapter�� �̿��� �ϳ��� Ű���常 ������ �� �ִ�.
			@Override
			public void keyReleased(KeyEvent e) {
				if (tf.getText().length() == 0) { 
					btn_input.setEnabled(false);
				} else {
					btn_input.setEnabled(true);
				}
			}
		});
		
//		btnSave�� Ŭ�� �� ta�� �ִ� ���� �޸������� �����ϴ� ��� ����
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				ta�� �� �ִ� ������ �����;� �Ѵ�.
				String msg = ta.getText();
				
				FileDialog fd = new FileDialog(frame, "����", FileDialog.SAVE);
				fd.setVisible(true);
				
//				fd�� ���� ������ �����ο� ���ϸ��� �˾Ƴ���
				String path = fd.getDirectory() + fd.getFile() + ".txt";
//				System.out.println(path);
				
//				char����� ��Ʈ���� �����Ͽ� path��ο� ����
				try {
					FileWriter fw = new FileWriter(path);
					fw.write(msg);
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
 			}
		});
		
//		Ȯ���� Ŭ�� �� tf�� ���� ta�� ���� �� �־��ֱ�
		btn_input.addActionListener(new InputButtonAdapter(ta, tf, btn_input));
		
//		btnClose�� ������ �� ���α׷� ����
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); //������ ����
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
