package buyerInfo;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class BuyerMenu extends JFrame {
	JButton prev, next, buy;
	JLabel cost, highcost;
	JTextField costtf;
	JTextArea highcosttf;
//	JPanel image;
	Image images;
	ArrayList<Integer> costs = new ArrayList<Integer>();
	int highercost;

	public BuyerMenu() {
		super("BuyerMenu");
		Color mainColor = new Color(153, 102, 000);
		getContentPane().setBackground(mainColor);
		setBounds(600, 600, 400, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		getContentPane().setLayout(null);

		prev = new JButton("prev");
		next = new JButton("next");
		buy = new JButton("buy");

		Colorbtn bc = new Colorbtn();

		bc.colorbtn(prev);
		bc.colorbtn(next);
		bc.colorbtn(buy);
		prev.setBounds(6, 600, 60, 20);
		getContentPane().add(prev);
		next.setBounds(320, 600, 60, 20);
		getContentPane().add(next);
		buy.setBounds(160, 700, 60, 20);
		getContentPane().add(buy);

		cost = new JLabel("금액 입력:");
		cost.setBounds(120, 670, 60, 20);
		getContentPane().add(cost);

		highcost = new JLabel("최고가:");
		highcost.setBounds(140, 650, 60, 20);
		getContentPane().add(highcost);

		costtf = new JTextField();
		costtf.setBounds(190, 670, 60, 20);
		getContentPane().add(costtf);

		highcosttf = new JTextArea();
		highcosttf.setBounds(190, 650, 60, 20);
		getContentPane().add(highcosttf);

//		image = new JPanel();
//		image.setBounds(5, 10, 375, 580);
//		image.setBackground(Color.blue);
//		getContentPane().add(image);

//		imagepage.setLayout(null);
		imagepage.setBounds(3, 10, 375, 570);
		getContentPane().add(imagepage);
		
		buy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendcost();
			}
		});
		
		setVisible(true);
	}

	static JPanel imagepage = new JPanel() {
		Image background = new ImageIcon(BuyerMenu.class.getResource("../image/Monalisa.png")).getImage();
		
		public void paint(Graphics g) {
			g.drawImage(background, 5, 10, 375, 560, null);
		}
	};
	
	public void sendcost() {
		String cost = costtf.getText();
		costs.add(Integer.parseInt(cost));
		
//		for(int m : costs) {
//			System.out.println(m + " " + costs.size());
//		}
		
		highercost = Integer.parseInt(cost);
		
		for (int i = 0; i < costs.size(); i++) {
			if (highercost < costs.get(i)) {
				highercost = costs.get(i);
			}
		}
		System.out.println(highercost);
		
//		for (int m : costs) {
//			System.out.println(m + " " + costs.size());
//		}
		
		highcosttf.setText(String.valueOf(highercost));
		costtf.setText("");

	}

}
