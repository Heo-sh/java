package login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import join.JoinMain;
import join.JoinMenu;

public class LoginMenu extends JFrame {
	public LoginMenu() {
		super("Login");
		Color mainColor = new Color(153, 102, 000);
		getContentPane().setBackground(mainColor);
		setBounds(600, 600, 400, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		getContentPane().setLayout(null);
		
		ButtonGroup both = new ButtonGroup();		
		JRadioButton buyer = new JRadioButton("구매자", false);
		JRadioButton seller = new JRadioButton("판매자", false);
		
		both.add(buyer);
		both.add(seller);
		
		buyer.setBounds(100, 550, 90, 30);
		buyer.setBackground(mainColor);
		seller.setBounds(210, 550, 90, 30);
		seller.setBackground(mainColor);
		
		add(buyer);
		add(seller);
		
		JLabel id, pw, join;
		
		id = new JLabel("ID");
		pw = new JLabel("PW");
		join = new JLabel("회원가입");
		
		join.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new JoinMenu();
			}
		});
		
		id.setBounds(90, 600, 40, 20);
		pw.setBounds(90, 630, 40, 20);
		join.setBounds(160, 660, 60, 20);
		add(id);
		add(pw);
		add(join);
		
		JTextField idtf = new JTextField(20);
		JPasswordField pwf = new JPasswordField(20);
		
		idtf.setBounds(120, 600, 80, 20);
		add(idtf);
		pwf.setBounds(120, 630, 80, 20);
		add(pwf);
		
		JButton login = new JButton("Login");
		login.setBounds(220, 600, 80, 50);
		add(login);
		
		
		
		setVisible(true);
		
	}
	
}
