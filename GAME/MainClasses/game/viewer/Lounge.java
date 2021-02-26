package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lounge {
	
	private int greenHouseButtonX = 210;
	private int greenHouseButtonY = 160;
	private int greenHouseButtonW = 30;
	private int greenHouseButtonH = 120;
	
	private int hallWayButtonX = 530;
	private int hallWayButtonY = 100;
	private int hallWayButtonW = 100;
	private int hallWayButtonH = 400;
	
	JPanel Lounge = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton GreenHouse = new JButton();
	JButton HallWay = new JButton();
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\Lounge.png");
	Image Resize = BackGround.getImage();
	
	Lounge(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			
			Lounge.add(GreenHouse);
				GreenHouse.setBounds(greenHouseButtonX, greenHouseButtonY, greenHouseButtonW, greenHouseButtonH);
				GreenHouse.setVisible(true);
				//GreenHouse.setOpaque(false);
				//GreenHouse.setContentAreaFilled(false);
				//GreenHouse.setBorderPainted(false);
				//GreenHouse.setFocusable(false);
				
			Lounge.add(HallWay);
				HallWay.setBounds(hallWayButtonX, hallWayButtonY, hallWayButtonW, hallWayButtonH);
				HallWay.setVisible(true);
				//HallWay.setOpaque(false);
				//HallWay.setContentAreaFilled(false);
				//HallWay.setBorderPainted(false);
				//HallWay.setFocusable(false);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			
			Lounge.add(GreenHouse);
				GreenHouse.setBounds(greenHouseButtonX*2,240 , greenHouseButtonW*2,180 );
				GreenHouse.setVisible(true);
				//GreenHouse.setOpaque(false);
				//GreenHouse.setContentAreaFilled(false);
				//GreenHouse.setBorderPainted(false);
				//GreenHouse.setFocusable(false);
			
			Lounge.add(HallWay);
				HallWay.setBounds(hallWayButtonX*2, 150, hallWayButtonW*2, hallWayButtonH+100);
				HallWay.setVisible(true);
				//HallWay.setOpaque(false);
				//HallWay.setContentAreaFilled(false);
				//HallWay.setBorderPainted(false);
				//HallWay.setFocusable(false);	
		}
		if(W == 1936) {
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			
			Lounge.add(GreenHouse);
				GreenHouse.setBounds(greenHouseButtonX*3,340 , greenHouseButtonW*3, 100+greenHouseButtonH*2);
				GreenHouse.setVisible(true);
				//GreenHouse.setOpaque(false);
				//GreenHouse.setContentAreaFilled(false);
				//GreenHouse.setBorderPainted(false);
				//GreenHouse.setFocusable(false);
				
			Lounge.add(HallWay);
				HallWay.setBounds(hallWayButtonX*3, 213, hallWayButtonW*3, hallWayButtonH+300);
				HallWay.setVisible(true);
				//HallWay.setOpaque(false);
				//HallWay.setContentAreaFilled(false);
				//HallWay.setBorderPainted(false);
				//HallWay.setFocusable(false);	
		}
		
		System.out.println("building Garage ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		Lounge.add(ImageLabel);
		Lounge.setBounds(0,0,W,H);
		Lounge.setLayout(null);
		Lounge.setVisible(true);
	}
	public JButton getGreenHouse() {
		return GreenHouse;
	}
	public JButton getHallWay() {
		return HallWay;
	}
	public JPanel getLounge() {
		return Lounge;
	}
}
