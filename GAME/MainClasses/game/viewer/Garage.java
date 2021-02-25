package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Garage {

	JPanel Garage = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton FrontPorch = new JButton();
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Garage.png");
	Image Resize = BackGround.getImage();
	
	Garage(int W, int H) {
		if(W == 640) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			
			Garage.add(FrontPorch);
				FrontPorch.setBounds(0, 0, 220, 360);
				FrontPorch.setVisible(true);
				FrontPorch.setOpaque(false);
				FrontPorch.setContentAreaFilled(false);
				FrontPorch.setBorderPainted(false);
				FrontPorch.setFocusable(false);
		}
		if(W == 1280) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			
			Garage.add(FrontPorch);
				FrontPorch.setBounds(0*2, 0*2, 220*2, 520);
				FrontPorch.setVisible(true);
				FrontPorch.setOpaque(false);
				FrontPorch.setContentAreaFilled(false);
				FrontPorch.setBorderPainted(false);
				FrontPorch.setFocusable(false);
		}
		if(W == 1920) {
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			
			Garage.add(FrontPorch);
				FrontPorch.setBounds(0*3, 0*3, 220*3, 880);
				FrontPorch.setVisible(true);
				FrontPorch.setOpaque(false);
				FrontPorch.setContentAreaFilled(false);
				FrontPorch.setBorderPainted(false);
				FrontPorch.setFocusable(false);
		}
		
		System.out.println("building Garage ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		Garage.add(ImageLabel);
		Garage.setBounds(0,0,W,H);
		Garage.setLayout(null);
		Garage.setVisible(true);
	}
	public JButton getFrontPorch() {
		return FrontPorch;
	}
	public JPanel getGarage() {
		return Garage;
	}
	
}
