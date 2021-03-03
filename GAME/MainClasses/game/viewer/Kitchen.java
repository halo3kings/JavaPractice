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
		ButtonDataStorage BDS = new ButtonDataStorage(10, 120, 130, 270);
	
	JButton Hall2 = new JButton();
		ButtonDataStorage BDS1 = new ButtonDataStorage(370, 120, 30, 130);
		
	JButton DiningRoom = new JButton();
		ButtonDataStorage BDS2 = new ButtonDataStorage(530, 130, 60, 125);	
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\Kitchen.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	Kitchen(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			Kitchen.add(Hall);
				Hall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
				
			Kitchen.add(Hall2);
				Hall2.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Hall2.setVisible(true);
				//Hall2.setOpaque(false);
				//Hall2.setContentAreaFilled(false);
				//Hall2.setBorderPainted(false);
				//Hall2.setFocusable(false);
				
			Kitchen.add(DiningRoom);
				DiningRoom.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
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
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			Kitchen.add(Hall);
				Hall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
			
			Kitchen.add(Hall2);
				Hall2.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Hall2.setVisible(true);
				//Hall2.setOpaque(false);
				//Hall2.setContentAreaFilled(false);
				//Hall2.setBorderPainted(false);
				//Hall2.setFocusable(false);
			
			Kitchen.add(DiningRoom);
				DiningRoom.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
				DiningRoom.setVisible(true);
				//DiningRoom.setOpaque(false);
				//DiningRoom.setContentAreaFilled(false);
				//DiningRoom.setBorderPainted(false);
				//DiningRoom.setFocusable(false);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			Kitchen.add(Hall);
				Hall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Hall.setVisible(true);
				//Hall.setOpaque(false);
				//Hall.setContentAreaFilled(false);
				//Hall.setBorderPainted(false);
				//Hall.setFocusable(false);
			
			Kitchen.add(Hall2);
				Hall2.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Hall2.setVisible(true);
				//Hall2.setOpaque(false);
				//Hall2.setContentAreaFilled(false);
				//Hall2.setBorderPainted(false);
				//Hall2.setFocusable(false);
			
			Kitchen.add(DiningRoom);
				DiningRoom.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
				DiningRoom.setVisible(true);
				//DiningRoom.setOpaque(false);
				//DiningRoom.setContentAreaFilled(false);
				//DiningRoom.setBorderPainted(false);
				//DiningRoom.setFocusable(false);
		}
		
		System.out.println("building Kitchen ");
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
