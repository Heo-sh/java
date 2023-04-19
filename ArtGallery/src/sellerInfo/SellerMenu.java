package sellerInfo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buyerInfo.BuyerMenu;

public class SellerMenu extends JFrame {

	public SellerMenu() {
		super("SellerMenu");
		Color mainColor = new Color(153, 102, 000);
		getContentPane().setBackground(mainColor);
		setBounds(600, 600, 400, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		getContentPane().setLayout(null);
		
		JButton prev, next, sell, add;
		
		Color color = new Color(204, 153, 000);
		
		prev = new JButton("<");
		next = new JButton(">");
		sell = new JButton("sell");
		
		add = new JButton("그림 올리기");
		
		sell.setBounds(160, 700, 60, 20);
		sell.setBackground(color);
		getContentPane().add(sell);
		
		add.setBounds(280, 600, 100, 20);
		add.setBackground(color);
		getContentPane().add(add);
		
		JLabel highcost;
				
		highcost = new JLabel("최고가:");
		highcost.setBounds(140, 650, 60, 20);
		getContentPane().add(highcost);
		
		JTextField highcosttf;
		
		highcosttf = new JTextField();
		highcosttf.setBounds(190, 650, 60, 20);
		getContentPane().add(highcosttf);
		
//		JPanel image;
//		
//		image = new JPanel();
//		image.setBounds(5, 10, 375, 580);
//		image.setBackground(Color.blue);
//		getContentPane().add(image);
		
		imagepage.setBounds(3, 10, 375, 580);
		getContentPane().add(imagepage);
		imagepage.setLayout(new BorderLayout());
		imagepage.add(prev, BorderLayout.WEST);
		imagepage.add(next, BorderLayout.EAST);
		
		setVisible(true);
	}
	
	
	static JPanel imagepage = new JPanel() {
		
//		private File image;
//		
//		public File getImage() {
//			return image;
//		}
//		
//		public void setImage(File image) {
//			this.image = image;
//		}
//		
		
		
		ArrayList<String> imagelist = new ArrayList<String>();
		String path = "../image/Monalisa.png";
//		String img = getImage().getAbsolutePath();
		
		
		
		public String setimg() {
			imagelist.add(path);
			System.out.println(imagelist.get(0));
			return imagelist.get(0);
		}
		
		Image background = new ImageIcon(BuyerMenu.class.getResource(setimg())).getImage();
		
		
		public void paint(Graphics g) {
			g.drawImage(background, 5, 10, 375, 600, null);
		}
				
	};
}
