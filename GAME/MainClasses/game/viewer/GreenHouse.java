package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GreenHouse {
	JPanel GreenHouse = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton Lounge = new JButton();
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\GreenHouse.png");
	Image Resize = BackGround.getImage();
	
	GreenHouse(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			
			GreenHouse.add(Lounge);
				Lounge.setBounds(30, 100, 150, 330);
				Lounge.setVisible(true);
				//Lounge.setOpaque(false);
				//Lounge.setContentAreaFilled(false);
				//Lounge.setBorderPainted(false);
				//Lounge.setFocusable(false);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			
			GreenHouse.add(Lounge);
				Lounge.setBounds(30*2, 150, 150*2, 495);
				Lounge.setVisible(true);
				//Lounge.setOpaque(false);
				//Lounge.setContentAreaFilled(false);
				//Lounge.setBorderPainted(false);
				//Lounge.setFocusable(false);
		}
		if(W == 1936) {
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			
			GreenHouse.add(Lounge);
				Lounge.setBounds(30*3, 213, 150*3, 700);
				Lounge.setVisible(true);
				//Lounge.setOpaque(false);
				//Lounge.setContentAreaFilled(false);
				//Lounge.setBorderPainted(false);
				//Lounge.setFocusable(false);
		}
		
		System.out.println("building GreenHouse ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		GreenHouse.add(ImageLabel);
		GreenHouse.setBounds(0,0,W,H);
		GreenHouse.setLayout(null);
		GreenHouse.setVisible(true);
	}
	public JButton getLounge() {
		return Lounge;
	}
	public JPanel getGreenHouse() {
		return GreenHouse;
	}
}
