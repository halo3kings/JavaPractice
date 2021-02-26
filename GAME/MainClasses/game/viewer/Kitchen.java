package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Kitchen {
	
	JPanel Kitchen = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton Hall = new JButton();
	JButton Hall2 = new JButton();
	JButton DiningRoom = new JButton();
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\Kitchen.png");
	Image Resize = BackGround.getImage();
	
	Kitchen(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			
			Kitchen.add(Hall);
				Hall.setBounds(10, 120, 130, 270);
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
				
			Kitchen.add(Hall2);
				Hall2.setBounds(370, 120, 30, 130);
				Hall2.setVisible(true);
				//Hall2.setOpaque(false);
				//Hall2.setContentAreaFilled(false);
				//Hall2.setBorderPainted(false);
				//Hall2.setFocusable(false);
				
			Kitchen.add(DiningRoom);
				DiningRoom.setBounds(530, 130, 60, 125);
				DiningRoom.setVisible(true);
				//DiningRoom.setOpaque(false);
				//DiningRoom.setContentAreaFilled(false);
				//DiningRoom.setBorderPainted(false);
				//DiningRoom.setFocusable(false);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			
			Kitchen.add(Hall);
				Hall.setBounds(20, 180, 260, 405);
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
			
			Kitchen.add(Hall2);
				Hall2.setBounds(740, 180, 60, 195);
				Hall2.setVisible(true);
				//Hall2.setOpaque(false);
				//Hall2.setContentAreaFilled(false);
				//Hall2.setBorderPainted(false);
				//Hall2.setFocusable(false);
			
			Kitchen.add(DiningRoom);
				DiningRoom.setBounds(1060, 195, 120, 188);
				DiningRoom.setVisible(true);
				//DiningRoom.setOpaque(false);
				//DiningRoom.setContentAreaFilled(false);
				//DiningRoom.setBorderPainted(false);
				//DiningRoom.setFocusable(false);
		}
		if(W == 1936) {
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			
			Kitchen.add(Hall);
				Hall.setBounds(30, 255, 390, 574);
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
			
			Kitchen.add(Hall2);
				Hall2.setBounds(1110, 255, 90, 276);
				Hall2.setVisible(true);
				//Hall2.setOpaque(false);
				//Hall2.setContentAreaFilled(false);
				//Hall2.setBorderPainted(false);
				//Hall2.setFocusable(false);
			
			Kitchen.add(DiningRoom);
				DiningRoom.setBounds(1590, 276, 180, 286);
				DiningRoom.setVisible(true);
				//DiningRoom.setOpaque(false);
				//DiningRoom.setContentAreaFilled(false);
				//DiningRoom.setBorderPainted(false);
				//DiningRoom.setFocusable(false);
		}
		
		System.out.println("building Library ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		Kitchen.add(ImageLabel);
		Kitchen.setBounds(0,0,W,H);
		Kitchen.setLayout(null);
		Kitchen.setVisible(true);
	}
	public JButton getHall() {
		return Hall;
	}
	public JButton getHall2() {
		return Hall2;
	}
	public JButton getDiningRoom() {
		return DiningRoom;
	}
	public JPanel getKitchen() {
		return Kitchen;
	}
}
