package login;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginProject {
	JPanel cardPanel;
	LoginProject lp;
	CardLayout card;
	
	public static void main(String[] args) {
		LoginProject lp = new LoginProject();
		lp.setFrame(lp);
	}
	
	public void setFrame(LoginProject lpro) {
		JFrame jf = new JFrame();
		LoginPanel lp = new LoginPanel(lpro);
		signupPanel sp = new signupPanel(lpro);
		
		card = new CardLayout();
		
		cardPanel = new JPanel(card);
		cardPanel.add(lp.mainPanel, "Login");
		cardPanel.add(sp.mainPanel, "Register");
		
		jf.add(cardPanel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(600, 600, 400, 500);
		jf.setVisible(true);
	} //setFrame
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_DB?serverTimezone=UTC", "root",
				"1234");
		
		return conn;
	}
	
	class LoginPanel extends JPanel implements ActionListener {
		JPanel mainPanel;
		JTextField idTextField;
		JPasswordField passTextField;
		
		String userMode = "일반";
		LoginProject lp;
		Font font = new Font("회원가입", Font.BOLD, 40);
		String admin = "admin";
		
		public LoginPanel(LoginProject lp) {
			this.lp = lp;
			
			mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(5, 1));
			
			JPanel centerPanel = new JPanel();
			JLabel loginLabel = new JLabel("로그인 화면");
			loginLabel.setFont(font);
			centerPanel.add(loginLabel);
			
			JPanel userPanel = new JPanel();
			
			JPanel gridBagidInfo = new JPanel(new GridBagLayout());
			gridBagidInfo.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
			GridBagConstraints c = new GridBagConstraints();
			
			JLabel idLabel = new JLabel("아이디 : ");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 0;
			gridBagidInfo.add(idLabel);
			
			idTextField = new JTextField(15);
			c.insets = new Insets(0, 5, 0, 0);
			c.gridx = 1;
			c.gridy = 0;
			gridBagidInfo.add(idTextField, c);
			
			JLabel passLabel = new JLabel("비밀번호 : ");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 1;
			c.insets = new Insets(20, 0, 0, 0);
			gridBagidInfo.add(passLabel, c);
			
			passTextField = new JPasswordField(15);
			c.insets = new Insets(20, 5, 0, 0);
			c.gridx = 1;
			c.gridy = 1;
			gridBagidInfo.add(passTextField, c);
			
			JPanel loginPanel = new JPanel();
			JButton loginButton = new JButton("로그인");
			loginPanel.add(loginButton);
			
			JPanel signupPanel = new JPanel();
			JButton signupButton = new JButton("회원가입");
			loginPanel.add(signupButton);
			
			mainPanel.add(centerPanel);
			mainPanel.add(userPanel);
			mainPanel.add(gridBagidInfo);
			mainPanel.add(loginPanel);
			mainPanel.add(signupPanel);
			
			loginButton.addActionListener(this);
			
			signupButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					lp.card.next(lp.cardPanel);
				}
			});
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton)e.getSource();
			
			switch (e.getActionCommand()) {
			
			case "일반":
				userMode = "일반";
				break;
			
			case "관리자":
				userMode = "관리자";
				break;
				
			case "로그인":
				
				String id = idTextField.getText();
				String pass = passTextField.getText();
				
				try {
					String sql_query = String.format("SELECT password FROM user_info WHERE id = '%s' AND password = '%s'", id, pass);
					
					Connection conn = lp.getConnection();
					Statement stmt = conn.createStatement();
					
					ResultSet rset = stmt.executeQuery(sql_query);
					rset.next();
					
					if(pass.equals(rset.getString(1))) {
						JOptionPane.showMessageDialog(this, "Login Success", "로그인 성공", 1);
					} else {
						JOptionPane.showMessageDialog(this, "Login Failed", "로그인 실패", 1);
					}
				} catch (SQLException ex) {
					// TODO: handle exception
				} {
					
				}
				
			}
		}
	}
	
}
