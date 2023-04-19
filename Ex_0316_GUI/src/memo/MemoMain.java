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
		JFrame frame = new JFrame("메모장");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setLayout(null); //수동배치

		
		JTextField tf = new JTextField();
		tf.setBounds(7, 15, 180, 30);
		
		JButton btn_input = new JButton("확인");
		btn_input.setBounds(190, 15, 60, 30);
		btn_input.setEnabled(false);
		
		JButton btnSave = new JButton("저장");
		btnSave.setBounds(6, 260, 110, 30);
		
		JButton btnClose = new JButton("종료");
		btnClose.setBounds(140, 260, 110, 30);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(7, 50, 243, 200);
		ta.setEditable(false);
		
		
//		프레임에 요소 붙히기
		frame.add(tf);
		frame.add(btn_input);
		frame.add(ta);
		frame.add(btnClose);
		frame.add(btnSave);
		
		frame.setBounds(700, 200, 270, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		버튼 기능 활성화
		
//		tf에 아무것도 쓰여져 있지 않으면 버튼 비활성화
		tf.addKeyListener(new KeyAdapter() { //KeyAdapter를 이용해 하나의 키워드만 가져올 수 있다.
			@Override
			public void keyReleased(KeyEvent e) {
				if (tf.getText().length() == 0) { 
					btn_input.setEnabled(false);
				} else {
					btn_input.setEnabled(true);
				}
			}
		});
		
//		btnSave를 클릭 시 ta에 있는 값을 메모장으로 저장하는 기능 구현
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				ta에 써 있는 내용을 가져와야 한다.
				String msg = ta.getText();
				
				FileDialog fd = new FileDialog(frame, "저장", FileDialog.SAVE);
				fd.setVisible(true);
				
//				fd를 통해 지정한 저장경로와 파일명을 알아내자
				String path = fd.getDirectory() + fd.getFile() + ".txt";
//				System.out.println(path);
				
//				char기반의 스트림을 생성하여 path경로에 저장
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
		
//		확인을 클릭 시 tf의 값을 ta로 복사 후 넣어주기
		btn_input.addActionListener(new InputButtonAdapter(ta, tf, btn_input));
		
//		btnClose를 눌렀을 때 프로그램 종료
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); //프레임 종료
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
