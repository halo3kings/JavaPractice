package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrontPorch{
	
	JPanel FrontPorch = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton Garage = new JButton();
	JButton Hallway = new JButton();
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\FrontPorch.png");
	Image Resize = BackGround.getImage();

	FrontPorch(int W, int H) {
		if(W == 640) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			
			FrontPorch.add(Hallway);
				Hallway.setBounds(100, 0, 120, BackGround.getIconHeight());
				Hallway.setVisible(true);
				Hallway.setOpaque(false);
				Hallway.setContentAreaFilled(false);
				Hallway.setBorderPainted(false);
				Hallway.setFocusable(false);
			
			FrontPorch.add(Garage);
				Garage.setBounds(550, 70, 300, 100);
				Garage.setVisible(true);
				Garage.setOpaque(false);
				Garage.setContentAreaFilled(false);
				Garage.setBorderPainted(false);
				Garage.setFocusable(false);
		}
		if(W == 1280) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			
			FrontPorch.add(Hallway);
				Hallway.setBounds(100*2, 0*2, 120*2, BackGround.getIconHeight());
				Hallway.setVisible(true);
				Hallway.setOpaque(false);
				Hallway.setContentAreaFilled(false);
				Hallway.setBorderPainted(false);
				Hallway.setFocusable(false);
				
			FrontPorch.add(Garage);
				Garage.setBounds(550*2, 120, 300*2, 100*2);
				Garage.setVisible(true);
				Garage.setOpaque(false);
				Garage.setContentAreaFilled(false);
				Garage.setBorderPainted(false);
				Garage.setFocusable(false);
		}
		if(W == 1920) {
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			
			FrontPorch.add(Hallway);
				Hallway.setBounds(100*3, 0*3, 120*3, BackGround.getIconHeight());
				Hallway.setVisible(true);
				Hallway.setOpaque(false);
				Hallway.setContentAreaFilled(false);
				Hallway.setBorderPainted(false);
				Hallway.setFocusable(false);
			
			FrontPorch.add(Garage);
				Garage.setBounds(550*3, 170, 300*3, 100*3);
				Garage.setVisible(true);
				Garage.setOpaque(false);
				Garage.setContentAreaFilled(false);
				Garage.setBorderPainted(false);
				Garage.setFocusable(false);
		}

		System.out.println("building front porch ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		FrontPorch.add(ImageLabel);
		FrontPorch.setBounds(0,0,W,H);
		FrontPorch.setLayout(null);
		FrontPorch.setVisible(true);
		
	}
	
	public JPanel getFrontPorch() {
		return FrontPorch;
	}
	public JButton getGarage() {
		return Garage;
	}
	public JButton getHallway() {
		return Hallway;
	}
	
	

}
