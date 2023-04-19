package join;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JoinMenu extends JFrame{
	JLabel name, id, pw, email;
	JTextField nametf, idtf, pwtf, emailtf;
	JButton join;
	
	JoinPerson jp = new JoinPerson();
	ArrayList<JoinPerson> jplist = new ArrayList<JoinPerson>();
	
	public JoinMenu() {
		super("Join");
		Color mainColor = new Color(153, 102, 000);
		getContentPane().setBackground(mainColor);
		setBounds(600, 600, 400, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		name = new JLabel("이름");
		id = new JLabel("ID");
		pw = new JLabel("Password");
		email = new JLabel("Email");
		
		name.setBounds(50, 80, 80, 70);
		add(name);
		id.setBounds(50, 105, 80, 70);
		add(id);
		pw.setBounds(50, 130, 80, 70);
		add(pw);
		email.setBounds(50, 155, 80, 70);
		add(email);
		
		nametf = new JTextField();
		idtf = new JTextField();
		pwtf = new JTextField();
		emailtf = new JTextField();
		
		nametf.setBounds(140, 105, 80, 20);
		add(nametf);
		idtf.setBounds(140, 130, 80, 20);
		add(idtf);
		pwtf.setBounds(140, 155, 80, 20);
		add(pwtf);
		emailtf.setBounds(140, 180, 80, 20);
		add(emailtf);
		
		join = new JButton("회원가입");
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == join) {
					String namedata = nametf.getText();
					String iddata = idtf.getText();
					String pwdata = pwtf.getText();
					String emaildata = emailtf.getText();
					
//					System.out.println(namedata);
//					System.out.println(iddata);
//					System.out.println(pwdata);
//					System.out.println(emaildata);
					
					jp.setName(namedata);
					jp.setId(iddata);
					jp.setPw(pwdata);
					jp.setEmail(emaildata);
					
					jplist.add(jp);
					
					for (int i = 0; i < jplist.size(); i++) {
						System.out.println(jplist.get(i).getId());
						System.out.println(jplist.get(i).getPw());
						System.out.println(jplist.get(i).getEmail());
						System.out.println(jplist.get(i).getName());
					}
					
					nametf.setText("");
					idtf.setText("");
					pwtf.setText("");
					emailtf.setText("");
					
//					JFrame complete = new JFrame();
//					complete.setBounds(50, 50, 100, 100);
//					complete.setResizable(false);
//					complete.setDefaultCloseOperation(EXIT_ON_CLOSE);
//					
//					JLabel cong = new JLabel("회원 가입 완료");
//					cong.setBounds(40, 40, 80, 80);
//					complete.add(cong);
//					
//					setVisible(true);
				}
			}
		});
		join.setBounds(160, 300, 90, 90);
		add(join);
		
		getContentPane().setLayout(null);
		setVisible(true);
	}
	
	
}
