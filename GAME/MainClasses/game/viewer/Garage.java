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
		ButtonDataStorage BDS = new ButtonDataStorage(400,100,180,200);
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\Garage.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	Garage(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			Garage.add(FrontPorch);
				FrontPorch.setBounds(0, 0, 220, 360);
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
			
			Garage.add(FrontPorch);
				FrontPorch.setBounds(0*2, 0*2, 220*2, 520);
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
			
			Garage.add(FrontPorch);
				FrontPorch.setBounds(0*3, 0*3, 220*3, 880);
				FrontPorch.setVisible(true);
				//FrontPorch.setOpaque(false);
				//FrontPorch.setContentAreaFilled(false);
				//FrontPorch.setBorderPainted(false);
				//FrontPorch.setFocusable(false);
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
