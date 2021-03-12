package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLabel;

public class DiningRoom {
	private static int RoomNumber = 6;
	
	JLabel DiningRoom = new JLabel();
	JLabel ImageLabel = new JLabel();
	
	public boolean Opaque = true;
	public boolean AreaFilled = true;
	public boolean BorderPainted = true;
	public boolean Focusable = true;
	public boolean Visible = true;
	
	JButton Hall = new JButton();
		ButtonDataStorage BDS = new ButtonDataStorage(450, 150, 150, 210);
	
	JButton Kitchen = new JButton();
		ButtonDataStorage BDS1 = new ButtonDataStorage(295, 150, 30, 100);
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\DiningRoom.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	DiningRoom(int W, int H) {
		this.toggleButtonStateFinal();
		
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			DiningRoom.add(Hall);
				Hall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hall.setVisible(Visible);
				Hall.setOpaque(Opaque);
				Hall.setContentAreaFilled(AreaFilled);
				Hall.setBorderPainted(BorderPainted);
				Hall.setFocusable(Focusable);
				
			DiningRoom.add(Kitchen);
				Kitchen.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Kitchen.setVisible(Visible);
				Kitchen.setOpaque(Opaque);
				Kitchen.setContentAreaFilled(AreaFilled);
				Kitchen.setBorderPainted(BorderPainted);
				Kitchen.setFocusable(Focusable);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			DiningRoom.add(Hall);
				Hall.setBounds(ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hall.setVisible(Visible);
				Hall.setOpaque(Opaque);
				Hall.setContentAreaFilled(AreaFilled);
				Hall.setBorderPainted(BorderPainted);
				Hall.setFocusable(Focusable);
				
			DiningRoom.add(Kitchen);
				Kitchen.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Kitchen.setVisible(Visible);
				Kitchen.setOpaque(Opaque);
				Kitchen.setContentAreaFilled(AreaFilled);
				Kitchen.setBorderPainted(BorderPainted);
				Kitchen.setFocusable(Focusable);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			DiningRoom.add(Hall);
				Hall.setBounds(ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hall.setVisible(Visible);
				Hall.setOpaque(Opaque);
				Hall.setContentAreaFilled(AreaFilled);
				Hall.setBorderPainted(BorderPainted);
				Hall.setFocusable(Focusable);
				
			DiningRoom.add(Kitchen);
				Kitchen.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Kitchen.setVisible(Visible);
				Kitchen.setOpaque(Opaque);
				Kitchen.setContentAreaFilled(AreaFilled);
				Kitchen.setBorderPainted(BorderPainted);
				Kitchen.setFocusable(Focusable);
		}
		
		System.out.println("building DiningRoom ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		DiningRoom.add(ImageLabel);
		DiningRoom.setBounds(0,0,W,H);
		DiningRoom.setLayout(null);
		DiningRoom.setVisible(false);
	}
	public JButton getHall() {
		return Hall;
	}
	public JButton getKitchen() {
		return Kitchen;
	}
	public JLabel getDiningRoom() {
		return DiningRoom;
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
	public boolean getOpaque() {
		return Opaque;
	}
	public boolean getAreaFilled() {
		return AreaFilled;
	}
	public boolean getBorderPainted() {
		return BorderPainted;
	}
	public boolean getFocusable() {
		return Focusable;
	}
	public boolean getVisible() {
		return Visible;
	}
	public void setOpaque(boolean OP) {
		Opaque = OP;
	}
	public void setAreaFilled(boolean AF) {
		AreaFilled = AF;
	}
	public void setBorderPainted(boolean BP) {
		BorderPainted = BP;
	}
	public void setFocusable(boolean FO) {
		Focusable = FO;
	}
	public void setVisible(boolean VS) {
		Visible = VS;
	}
	
	public void toggleButtonStateFinal() {
		this.setAreaFilled(false);
		this.setOpaque(false);
		this.setBorderPainted(false);
		this.setFocusable(false);
		this.setVisible(true);
	}
	public int getRoomNumber() {
		return RoomNumber;
	}
	

}
