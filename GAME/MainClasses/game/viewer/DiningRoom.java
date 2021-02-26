package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DiningRoom {
	JPanel DiningRoom = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton Hall = new JButton();
	JButton Kitchen = new JButton();
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\DiningRoom.png");
	Image Resize = BackGround.getImage();
	
	DiningRoom(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			
			DiningRoom.add(Hall);
				Hall.setBounds(450, 150, 150, 210);
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
				
			DiningRoom.add(Kitchen);
				Kitchen.setBounds(295, 150, 30, 100);
				Kitchen.setVisible(true);
				//Kitchen.setOpaque(false);
				//Kitchen.setContentAreaFilled(false);
				//Kitchen.setBorderPainted(false);
				//Kitchen.setFocusable(false);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			
			DiningRoom.add(Hall);
				Hall.setBounds(450*2, 225, 150*2, 315);
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
				
			DiningRoom.add(Kitchen);
				Kitchen.setBounds(295*2, 225, 30*2, 150);
				Kitchen.setVisible(true);
				//Kitchen.setOpaque(false);
				//Kitchen.setContentAreaFilled(false);
				//Kitchen.setBorderPainted(false);
				//Kitchen.setFocusable(false);
		}
		if(W == 1936) {
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			
			DiningRoom.add(Hall);
				Hall.setBounds(450*3, 320, 150*3, 445);
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
				
			DiningRoom.add(Kitchen);
				Kitchen.setBounds(295*3, 320, 30*3, 213);
				Kitchen.setVisible(true);
				//Kitchen.setOpaque(false);
				//Kitchen.setContentAreaFilled(false);
				//Kitchen.setBorderPainted(false);
				//Kitchen.setFocusable(false);
		}
		
		System.out.println("building Library ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		DiningRoom.add(ImageLabel);
		DiningRoom.setBounds(0,0,W,H);
		DiningRoom.setLayout(null);
		DiningRoom.setVisible(true);
	}
	public JButton getHall() {
		return Hall;
	}
	public JButton getKitchen() {
		return Kitchen;
	}
	public JPanel getDiningRoom() {
		return DiningRoom;
	}
}
