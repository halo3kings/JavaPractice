package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuestRoom1 {


	JPanel GuestRoom1 = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton Hall = new JButton();
	ButtonDataStorage BDS = new ButtonDataStorage(450,100,180,220);
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\GuestRoom1.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	GuestRoom1(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			
			
			GuestRoom1.add(Hall);
				Hall.setBounds(BDS.getX(),BDS.getY(),BDS.getWidth(),BDS.getHeight());
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
				
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			GuestRoom1.add(Hall);
			Hall.setBounds(ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Hall.setVisible(true);
			//Hall.setOpaque(false);
			//Hall.setContentAreaFilled(false);
			//Hall.setBorderPainted(false);
			//Hall.setFocusable(false);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		GuestRoom1.add(Hall);
			Hall.setBounds(ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Hall.setVisible(true);
			//Hall.setOpaque(false);
			//Hall.setContentAreaFilled(false);
			//Hall.setBorderPainted(false);
			//Hall.setFocusable(false);
		}

		System.out.println("Building Stairs ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		GuestRoom1.add(ImageLabel);
		GuestRoom1.setBounds(0,0,W,H);
		GuestRoom1.setLayout(null);
		GuestRoom1.setVisible(true);
	}

	public JButton getHall() {
		return Hall;
	}
	
	public JPanel getGuestRoom1() {
		return GuestRoom1;
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
