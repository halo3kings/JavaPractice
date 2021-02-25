package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hallway {
	JPanel HallWay = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton Lounge = new JButton();
	JButton	Dining = new JButton();
	JButton Kitchen = new JButton();
	JButton Stairs = new JButton();
	JButton Kitchen2 = new JButton();
	JButton PoolHall = new JButton();
	JButton Library = new JButton();
	JButton FrontPorch = new JButton();
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\MainHall.png");
	Image Resize = BackGround.getImage();
	
	Hallway(int W, int H) {
		if(W == 640) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to:" + BackGround.getIconWidth() +" "+BackGround.getIconHeight());
			
			HallWay.add(Lounge);
				Lounge.setBounds(60, 170, 70, 170);
				Lounge.setVisible(true);
				Lounge.setOpaque(false);
				Lounge.setContentAreaFilled(false);
				Lounge.setBorderPainted(false);
				Lounge.setFocusable(false);
		
			HallWay.add(Dining);
				Dining.setBounds(180, 200, 30, 90);
				Dining.setVisible(true);
				Dining.setOpaque(false);
				Dining.setContentAreaFilled(false);
				Dining.setBorderPainted(false);
				Dining.setFocusable(false);
				
			HallWay.add(Kitchen);
				Kitchen.setBounds(225, 220, 30, 70);
				Kitchen.setVisible(true);
				Kitchen.setOpaque(false);
				Kitchen.setContentAreaFilled(false);
				Kitchen.setBorderPainted(false);
				Kitchen.setFocusable(false);
				
			HallWay.add(Stairs);
				Stairs.setBounds(280, 180, 90, 120);
				Stairs.setVisible(true);
				Stairs.setOpaque(false);
				Stairs.setContentAreaFilled(false);
				Stairs.setBorderPainted(false);
			    Stairs.setFocusable(false);
				
			HallWay.add(Kitchen2);
				Kitchen2.setBounds(390, 220, 30, 70);
				Kitchen2.setVisible(true);
				Kitchen2.setOpaque(false);
				Kitchen2.setContentAreaFilled(false);
				Kitchen2.setBorderPainted(false);
				Kitchen2.setFocusable(false);
				
			HallWay.add(PoolHall);
				PoolHall.setBounds(440, 200, 30, 90);
				PoolHall.setVisible(true);
				PoolHall.setOpaque(false);
				PoolHall.setContentAreaFilled(false);
				PoolHall.setBorderPainted(false);
				PoolHall.setFocusable(false);
				
			HallWay.add(Library);
				Library.setBounds(520, 170, 70, 170);
				Library.setVisible(true);
				Library.setOpaque(false);
				Library.setContentAreaFilled(false);
				Library.setBorderPainted(false);
				Library.setFocusable(false);
			
			HallWay.add(FrontPorch);
				FrontPorch.setBounds(20,420, BackGround.getIconWidth()- 55, 40);
				FrontPorch.setVisible(true);
				//FrontPorch.setOpaque(false);
				//FrontPorch.setContentAreaFilled(false);
				//FrontPorch.setBorderPainted(false);
				//FrontPorch.setFocusable(false);
		
		}
		
		if(W == 1280) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			
		HallWay.add(Lounge);
			Lounge.setBounds(60*2, 170*2, 70*2, 170*2);
			Lounge.setVisible(true);
			Lounge.setOpaque(false);
			Lounge.setContentAreaFilled(false);
			Lounge.setBorderPainted(false);
			Lounge.setFocusable(false);
	
		HallWay.add(Dining);
			Dining.setBounds(180*2, 200*2, 30*2, 90*2);
			Dining.setVisible(true);
			Dining.setOpaque(false);
			Dining.setContentAreaFilled(false);
			Dining.setBorderPainted(false);
			Dining.setFocusable(false);
			
		HallWay.add(Kitchen);
			Kitchen.setBounds(225*2, 220*2, 30*2, 70*2);
			Kitchen.setVisible(true);
			Kitchen.setOpaque(false);
			Kitchen.setContentAreaFilled(false);
			Kitchen.setBorderPainted(false);
			Kitchen.setFocusable(false);
			
		HallWay.add(Stairs);
			Stairs.setBounds(280*2, 180*2, 90*2, 120*2);
			Stairs.setVisible(true);
			Stairs.setOpaque(false);
			Stairs.setContentAreaFilled(false);
			Stairs.setBorderPainted(false);
		    Stairs.setFocusable(false);
			
		HallWay.add(Kitchen2);
			Kitchen2.setBounds(390*2, 220*2, 30*2, 70*2);
			Kitchen2.setVisible(true);
			Kitchen2.setOpaque(false);
			Kitchen2.setContentAreaFilled(false);
			Kitchen2.setBorderPainted(false);
			Kitchen2.setFocusable(false);
			
		HallWay.add(PoolHall);
			PoolHall.setBounds(440*2, 200*2, 30*2, 90*2);
			PoolHall.setVisible(true);
			PoolHall.setOpaque(false);
			PoolHall.setContentAreaFilled(false);
			PoolHall.setBorderPainted(false);
			PoolHall.setFocusable(false);
			
		HallWay.add(Library);
			Library.setBounds(520*2, 170*2, 70*2, 170*2);
			Library.setVisible(true);
			Library.setOpaque(false);
			Library.setContentAreaFilled(false);
			Library.setBorderPainted(false);
			Library.setFocusable(false);
	
		
		}
		if(W == 1920) {
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			
		HallWay.add(Lounge);
			Lounge.setBounds(60*3, 170*3, 70*3, 170*3);
			Lounge.setVisible(true);
			Lounge.setOpaque(false);
			Lounge.setContentAreaFilled(false);
			Lounge.setBorderPainted(false);
			Lounge.setFocusable(false);
	
		HallWay.add(Dining);
			Dining.setBounds(180*3, 200*3, 30*3, 90*3);
			Dining.setVisible(true);
			Dining.setOpaque(false);
			Dining.setContentAreaFilled(false);
			Dining.setBorderPainted(false);
			Dining.setFocusable(false);
			
		HallWay.add(Kitchen);
			Kitchen.setBounds(225*3, 220*3, 30*3, 70*3);
			Kitchen.setVisible(true);
			Kitchen.setOpaque(false);
			Kitchen.setContentAreaFilled(false);
			Kitchen.setBorderPainted(false);
			Kitchen.setFocusable(false);
			
		HallWay.add(Stairs);
			Stairs.setBounds(280*3, 180*3, 90*3, 120*3);
			Stairs.setVisible(true);
			Stairs.setOpaque(false);
			Stairs.setContentAreaFilled(false);
			Stairs.setBorderPainted(false);
		    Stairs.setFocusable(false);
			
		HallWay.add(Kitchen2);
			Kitchen2.setBounds(390*3, 220*3, 30*3, 70*3);
			Kitchen2.setVisible(true);
			Kitchen2.setOpaque(false);
			Kitchen2.setContentAreaFilled(false);
			Kitchen2.setBorderPainted(false);
			Kitchen2.setFocusable(false);
			
		HallWay.add(PoolHall);
			PoolHall.setBounds(440*3, 200*3, 30*3, 90*3);
			PoolHall.setVisible(true);
			PoolHall.setOpaque(false);
			PoolHall.setContentAreaFilled(false);
			PoolHall.setBorderPainted(false);
			PoolHall.setFocusable(false);
			
		HallWay.add(Library);
			Library.setBounds(520*3, 170*3, 70*3, 170*3);
			Library.setVisible(true);
			Library.setOpaque(false);
			Library.setContentAreaFilled(false);
			Library.setBorderPainted(false);
			Library.setFocusable(false);
	
		}
		
		System.out.println("building Garage ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		HallWay.add(ImageLabel);
		HallWay.setBounds(0,0,W,H);
		HallWay.setLayout(null);
		HallWay.setVisible(true);
		}
	public JButton getLounge() {
		return Lounge;
	}
	public JButton getDining() {
		return Dining;
	}
	public JButton getKitchen() {
		return Kitchen;
	}
	public JButton getStairs() {
		return Stairs;
	}
	public JButton getKitchen2() {
		return Kitchen2;
	}
	public JButton getPoolHall() {
		return PoolHall;
	}
	public JButton getLibrary() {
		return Library;
	}
	public JPanel getHallWay() {
		return HallWay;
	}
}
