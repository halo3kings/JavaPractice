package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrontPorch{
	
	JPanel FrontPorch = new JPanel();
		ButtonDataStorage BDS = new ButtonDataStorage(100,0,120,480);
		
	JLabel ImageLabel = new JLabel();
		ButtonDataStorage BDS1 = new ButtonDataStorage(550, 70, 300, 100);
	
	JButton Garage = new JButton();
	JButton Hallway = new JButton();
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\FrontPorch.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;

	FrontPorch(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			
			FrontPorch.add(Hallway);
				Hallway.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hallway.setVisible(true);
				//Hallway.setOpaque(false);
				//Hallway.setContentAreaFilled(false);
				//Hallway.setBorderPainted(false);
				//Hallway.setFocusable(false);
			
			FrontPorch.add(Garage);
				Garage.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Garage.setVisible(true);
				//Garage.setOpaque(false);
				//Garage.setContentAreaFilled(false);
				//Garage.setBorderPainted(false);
				//Garage.setFocusable(false);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			FrontPorch.add(Hallway);
				Hallway.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hallway.setVisible(true);
				//Hallway.setOpaque(false);
				//Hallway.setContentAreaFilled(false);
				//Hallway.setBorderPainted(false);
				//Hallway.setFocusable(false);
				
			FrontPorch.add(Garage);
				Garage.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Garage.setVisible(true);
				//Garage.setOpaque(false);
				//Garage.setContentAreaFilled(false);
				//Garage.setBorderPainted(false);
				//Garage.setFocusable(false);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			FrontPorch.add(Hallway);
				Hallway.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hallway.setVisible(true);
				//Hallway.setOpaque(false);
				//Hallway.setContentAreaFilled(false);
				//Hallway.setBorderPainted(false);
				//Hallway.setFocusable(false);
			
			FrontPorch.add(Garage);
				Garage.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Garage.setVisible(true);
				//Garage.setOpaque(false);
				//Garage.setContentAreaFilled(false);
				//Garage.setBorderPainted(false);
				//Garage.setFocusable(false);
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
