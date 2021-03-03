package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AntiquesRoom {

	
	JPanel AntiquesRoom = new JPanel();
	
	JLabel ImageLabel = new JLabel();
	
	JButton AntiquesRoom2 = new JButton();
		ButtonDataStorage BDS = new ButtonDataStorage(530, 100, 100, 200);
	JButton HallWay = new JButton();
		ButtonDataStorage BDS1 = new ButtonDataStorage(30, 80, 140, 200);
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\AntiquesRoom.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	AntiquesRoom(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			AntiquesRoom.add(AntiquesRoom2);
				AntiquesRoom2.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				AntiquesRoom2.setVisible(true);
				//AntiquesRoom2.setOpaque(false);
				//AntiquesRoom2.setContentAreaFilled(false);
				//AntiquesRoom2.setBorderPainted(false);
				//AntiquesRoom2.setFocusable(false);
				
			AntiquesRoom.add(HallWay);
				HallWay.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
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
			
			AntiquesRoom.add(AntiquesRoom2);
				AntiquesRoom2.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				AntiquesRoom2.setVisible(true);
				//AntiquesRoom2.setOpaque(false);
				//AntiquesRoom2.setContentAreaFilled(false);
				//AntiquesRoom2.setBorderPainted(false);
				//AntiquesRoom2.setFocusable(false);
			
			AntiquesRoom.add(HallWay);
				HallWay.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
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
			
			AntiquesRoom.add(AntiquesRoom2);
				AntiquesRoom2.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				AntiquesRoom2.setVisible(true);
				//AntiquesRoom2.setOpaque(false);
				//AntiquesRoom2.setContentAreaFilled(false);
				//AntiquesRoom2.setBorderPainted(false);
				//AntiquesRoom2.setFocusable(false);
				
			AntiquesRoom.add(HallWay);
				HallWay.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				HallWay.setVisible(true);
				//HallWay.setOpaque(false);
				//HallWay.setContentAreaFilled(false);
				//HallWay.setBorderPainted(false);
				//HallWay.setFocusable(false);	
		}
		
		System.out.println("building AntiquesRoom ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		AntiquesRoom.add(ImageLabel);
		AntiquesRoom.setBounds(0,0,W,H);
		AntiquesRoom.setLayout(null);
		AntiquesRoom.setVisible(true);
	}
	public JButton getAntiquesRoom2() {
		return AntiquesRoom2;
	}
	public JButton getHallWay() {
		return HallWay;
	}
	public JPanel getAntiquesRoom() {
		return AntiquesRoom;
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