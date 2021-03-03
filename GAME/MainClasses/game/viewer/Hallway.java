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
		ButtonDataStorage BDS = new ButtonDataStorage(60, 170, 70, 170);
			
	JButton	Dining = new JButton();
		ButtonDataStorage BDS1 = new ButtonDataStorage(180, 200, 30, 90);
			
	JButton Kitchen = new JButton();
		ButtonDataStorage BDS2 = new ButtonDataStorage(225, 220, 30, 70);
				
	JButton Stairs = new JButton();
		ButtonDataStorage BDS3 = new ButtonDataStorage(280, 180, 90, 120);
				
	JButton Kitchen2 = new JButton();
		ButtonDataStorage BDS4 = new ButtonDataStorage(390, 220, 30, 70);
				
	JButton PoolHall = new JButton();
		ButtonDataStorage BDS5 = new ButtonDataStorage(440, 200, 30, 90);
				
	JButton Library = new JButton();
		ButtonDataStorage BDS6 = new ButtonDataStorage(520, 170, 70, 170);
				
	JButton FrontPorch = new JButton();
		ButtonDataStorage BDS7 = new ButtonDataStorage(20,420, 600, 40);
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\MainHall.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	Hallway(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to:" + BackGround.getIconWidth() +" "+BackGround.getIconHeight());
			
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			
			HallWay.add(Lounge);
				Lounge.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Lounge.setVisible(true);
				//Lounge.setOpaque(false);
				//Lounge.setContentAreaFilled(false);
				//Lounge.setBorderPainted(false);
				//Lounge.setFocusable(false);
		
			HallWay.add(Dining);
				Dining.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Dining.setVisible(true);
				//Dining.setOpaque(false);
				//Dining.setContentAreaFilled(false);
				//Dining.setBorderPainted(false);
				//Dining.setFocusable(false);
				
			HallWay.add(Kitchen);
				Kitchen.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
				Kitchen.setVisible(true);
				//Kitchen.setOpaque(false);
				//Kitchen.setContentAreaFilled(false);
				//Kitchen.setBorderPainted(false);
				//Kitchen.setFocusable(false);
				
			HallWay.add(Stairs);
				Stairs.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
				Stairs.setVisible(true);
				//Stairs.setOpaque(false);
				//Stairs.setContentAreaFilled(false);
				//Stairs.setBorderPainted(false);
			    //Stairs.setFocusable(false);
				
			HallWay.add(Kitchen2);
				Kitchen2.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
				Kitchen2.setVisible(true);
				//Kitchen2.setOpaque(false);
				//Kitchen2.setContentAreaFilled(false);
				//Kitchen2.setBorderPainted(false);
				//Kitchen2.setFocusable(false);
				
			HallWay.add(PoolHall);
				PoolHall.setBounds(this.ScalingWidth(BDS5.getX()), this.ScalingHeight(BDS5.getY()), this.ScalingWidth(BDS5.getWidth()), this.ScalingHeight(BDS5.getHeight()));
				PoolHall.setVisible(true);
				//PoolHall.setOpaque(false);
				//PoolHall.setContentAreaFilled(false);
				//PoolHall.setBorderPainted(false);
				//PoolHall.setFocusable(false);
				
			HallWay.add(Library);
				Library.setBounds(this.ScalingWidth(BDS6.getX()), this.ScalingHeight(BDS6.getY()), this.ScalingWidth(BDS6.getWidth()), this.ScalingHeight(BDS6.getHeight()));
				Library.setVisible(true);
				//Library.setOpaque(false);
				//Library.setContentAreaFilled(false);
				//Library.setBorderPainted(false);
				//Library.setFocusable(false);
			
			HallWay.add(FrontPorch);
				FrontPorch.setBounds(this.ScalingWidth(BDS7.getX()), this.ScalingHeight(BDS7.getY()), this.ScalingWidth(BDS7.getWidth()), this.ScalingHeight(BDS7.getHeight()));
				FrontPorch.setVisible(true);
				//FrontPorch.setOpaque(false);
				//FrontPorch.setContentAreaFilled(false);
				//FrontPorch.setBorderPainted(false);
				//FrontPorch.setFocusable(false);
		
		}
		
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		HallWay.add(Lounge);
			Lounge.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Lounge.setVisible(true);
			//Lounge.setOpaque(false);
			//Lounge.setContentAreaFilled(false);
			//Lounge.setBorderPainted(false);
			//Lounge.setFocusable(false);
	
		HallWay.add(Dining);
			Dining.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			Dining.setVisible(true);
			//Dining.setOpaque(false);
			//Dining.setContentAreaFilled(false);
			//Dining.setBorderPainted(false);
			//Dining.setFocusable(false);
			
		HallWay.add(Kitchen);
			Kitchen.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			Kitchen.setVisible(true);
			//Kitchen.setOpaque(false);
			//Kitchen.setContentAreaFilled(false);
			//Kitchen.setBorderPainted(false);
			//Kitchen.setFocusable(false);
			
		HallWay.add(Stairs);
			Stairs.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			Stairs.setVisible(true);
			//Stairs.setOpaque(false);
			//Stairs.setContentAreaFilled(false);
			//Stairs.setBorderPainted(false);
		    //Stairs.setFocusable(false);
			
		HallWay.add(Kitchen2);
			Kitchen2.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Kitchen2.setVisible(true);
			//Kitchen2.setOpaque(false);
			//Kitchen2.setContentAreaFilled(false);
			//Kitchen2.setBorderPainted(false);
			//Kitchen2.setFocusable(false);
			
		HallWay.add(PoolHall);
			PoolHall.setBounds(this.ScalingWidth(BDS5.getX()), this.ScalingHeight(BDS5.getY()), this.ScalingWidth(BDS5.getWidth()), this.ScalingHeight(BDS5.getHeight()));
			PoolHall.setVisible(true);
			//PoolHall.setOpaque(false);
			//PoolHall.setContentAreaFilled(false);
			//PoolHall.setBorderPainted(false);
			//PoolHall.setFocusable(false);
			
		HallWay.add(Library);
			Library.setBounds(this.ScalingWidth(BDS6.getX()), this.ScalingHeight(BDS6.getY()), this.ScalingWidth(BDS6.getWidth()), this.ScalingHeight(BDS6.getHeight()));
			Library.setVisible(true);
			//Library.setOpaque(false);
			//Library.setContentAreaFilled(false);
			//Library.setBorderPainted(false);
			//Library.setFocusable(false);
			
		HallWay.add(FrontPorch);
			FrontPorch.setBounds(this.ScalingWidth(BDS7.getX()), this.ScalingHeight(BDS7.getY()), this.ScalingWidth(BDS7.getWidth()), this.ScalingHeight(BDS7.getHeight()));
			FrontPorch.setVisible(true);
			//FrontPorch.setOpaque(false);
			//FrontPorch.setContentAreaFilled(false);
			//FrontPorch.setBorderPainted(false);
			//FrontPorch.setFocusable(false);
	
		
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		HallWay.add(Lounge);
			Lounge.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Lounge.setVisible(true);
			//Lounge.setOpaque(false);
			//Lounge.setContentAreaFilled(false);
			//Lounge.setBorderPainted(false);
			//Lounge.setFocusable(false);
	
		HallWay.add(Dining);
			Dining.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			Dining.setVisible(true);
			//Dining.setOpaque(false);
			//Dining.setContentAreaFilled(false);
			//Dining.setBorderPainted(false);
			//Dining.setFocusable(false);
			
		HallWay.add(Kitchen);
			Kitchen.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			Kitchen.setVisible(true);
			//Kitchen.setOpaque(false);
			//Kitchen.setContentAreaFilled(false);
			//Kitchen.setBorderPainted(false);
			//Kitchen.setFocusable(false);
			
		HallWay.add(Stairs);
			Stairs.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			Stairs.setVisible(true);
			//Stairs.setOpaque(false);
			//Stairs.setContentAreaFilled(false);
			//Stairs.setBorderPainted(false);
		    //Stairs.setFocusable(false);
			
		HallWay.add(Kitchen2);
			Kitchen2.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Kitchen2.setVisible(true);
			//Kitchen2.setOpaque(false);
			//Kitchen2.setContentAreaFilled(false);
			//Kitchen2.setBorderPainted(false);
			//Kitchen2.setFocusable(false);
			
		HallWay.add(PoolHall);
			PoolHall.setBounds(this.ScalingWidth(BDS5.getX()), this.ScalingHeight(BDS5.getY()), this.ScalingWidth(BDS5.getWidth()), this.ScalingHeight(BDS5.getHeight()));
			PoolHall.setVisible(true);
			//PoolHall.setOpaque(false);
			//PoolHall.setContentAreaFilled(false);
			//PoolHall.setBorderPainted(false);
			//PoolHall.setFocusable(false);
			
		HallWay.add(Library);
			Library.setBounds(this.ScalingWidth(BDS6.getX()), this.ScalingHeight(BDS6.getY()), this.ScalingWidth(BDS6.getWidth()), this.ScalingHeight(BDS6.getHeight()));
			Library.setVisible(true);
			//Library.setOpaque(false);
			//Library.setContentAreaFilled(false);
			//Library.setBorderPainted(false);
			//Library.setFocusable(false);
	
		HallWay.add(FrontPorch);
			FrontPorch.setBounds(this.ScalingWidth(BDS7.getX()), this.ScalingHeight(BDS7.getY()), this.ScalingWidth(BDS7.getWidth()), this.ScalingHeight(BDS7.getHeight()));
			FrontPorch.setVisible(true);
			//FrontPorch.setOpaque(false);
			//FrontPorch.setContentAreaFilled(false);
			//FrontPorch.setBorderPainted(false);
			//FrontPorch.setFocusable(false);
		}
		
		System.out.println("building Hallway ");
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
	public JButton getFrontPorch() {
		return FrontPorch;
	}
	
	public void setHeight(int height) {
		Height = height;
	}
	public int getHeight() {
		return Height;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getWidth() {
		return Width;
	}
	public double getHeightRatio(int H) {
		double Ratio;
		Ratio = (double)H/(double)480.0;
		return Ratio;
	}
	public double getWidthRatio(int W) {
		double Ratio;
		Ratio = (double)W/(double)640.0;
		return Ratio;
	}
	public int ScalingHeight(int numberToCalc) {
		double Temp;
		int Calc;
		Temp = (getHeightRatio(this.getHeight()) * (double)numberToCalc);
		Calc = (int)Math.floor(Temp);
		return Calc;
	}
	public int ScalingWidth(int numberToCalc) {
		double Temp;
		int Calc;
		Temp = (getWidthRatio(this.getWidth()) * (double)numberToCalc);
		Calc = (int)Math.floor(Temp);
		return Calc;
	}
}
