package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MasterBedroom {

	

	JPanel MasterBedroom = new JPanel();
	
	JLabel ImageLabel = new JLabel();
	
	JButton HallWay = new JButton();
		ButtonDataStorage BDS = new ButtonDataStorage(100, 100, 130, 180);
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\MasterBedroom.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	MasterBedroom(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
				
			MasterBedroom.add(HallWay);
				HallWay.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
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
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			
			MasterBedroom.add(HallWay);
				HallWay.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				HallWay.setVisible(true);
				//HallWay.setOpaque(false);
				//HallWay.setContentAreaFilled(false);
				//HallWay.setBorderPainted(false);
				//HallWay.setFocusable(false);	
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
				
			MasterBedroom.add(HallWay);
				HallWay.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				HallWay.setVisible(true);
				//HallWay.setOpaque(false);
				//HallWay.setContentAreaFilled(false);
				//HallWay.setBorderPainted(false);
				//HallWay.setFocusable(false);	
		}
		
		System.out.println("building MasterBedroom ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		MasterBedroom.add(ImageLabel);
		MasterBedroom.setBounds(0,0,W,H);
		MasterBedroom.setLayout(null);
		MasterBedroom.setVisible(true);
	}

	public JButton getHallWay() {
		return HallWay;
	}
	public JPanel getMasterBedroom() {
		return MasterBedroom;
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

