package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLabel;

public class secondHall {
	private static int RoomNumber = 10;
	
	JLabel secondHall = new JLabel();
	JLabel ImageLabel = new JLabel();
	
	public boolean Opaque = true;
	public boolean AreaFilled = true;
	public boolean BorderPainted = true;
	public boolean Focusable = true;
	public boolean Visible = true;
	
	JButton Hall = new JButton();
		ButtonDataStorage BDS = new ButtonDataStorage(225, 260, 200, 50);
	
	JButton GuestRoom1 = new JButton();
		ButtonDataStorage BDS1 = new ButtonDataStorage(20, 155, 80, 200);
	
	JButton GuestRoom2 = new JButton();
		ButtonDataStorage BDS2 = new ButtonDataStorage(540, 155, 80, 200);
	
	JButton Office = new JButton();
		ButtonDataStorage BDS3 = new ButtonDataStorage(400,190,30,60);
	
	JButton Study = new JButton();
		ButtonDataStorage BDS4 = new ButtonDataStorage(205,190,30,60);
	
	JButton ThirdHall = new JButton();
		ButtonDataStorage BDS5 = new ButtonDataStorage(275, 190, 85, 60);
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\Second floor.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	secondHall(int W, int H) {
		this.toggleButtonStateFinal();
		
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		secondHall.add(Hall);
			Hall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Hall.setVisible(Visible);
			Hall.setOpaque(Opaque);
			Hall.setContentAreaFilled(AreaFilled);
			Hall.setBorderPainted(BorderPainted);
			Hall.setFocusable(Focusable);
			
		secondHall.add(GuestRoom1);
			GuestRoom1.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			GuestRoom1.setVisible(Visible);
			GuestRoom1.setOpaque(Opaque);
			GuestRoom1.setContentAreaFilled(AreaFilled);
			GuestRoom1.setBorderPainted(BorderPainted);
			GuestRoom1.setFocusable(Focusable);
			
		secondHall.add(GuestRoom2);
			GuestRoom2.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			GuestRoom2.setVisible(Visible);
			GuestRoom2.setOpaque(Opaque);
			GuestRoom2.setContentAreaFilled(AreaFilled);
			GuestRoom2.setBorderPainted(BorderPainted);
			GuestRoom2.setFocusable(Focusable);
			
		secondHall.add(Office);
			Office.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			Office.setVisible(Visible);
			Office.setOpaque(Opaque);
			Office.setContentAreaFilled(AreaFilled);
			Office.setBorderPainted(BorderPainted);
			Office.setFocusable(Focusable);
			
		secondHall.add(Study);
			Study.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Study.setVisible(Visible);
			Study.setOpaque(Opaque);
			Study.setContentAreaFilled(AreaFilled);
			Study.setBorderPainted(BorderPainted);
			Study.setFocusable(Focusable);
			
		secondHall.add(ThirdHall);
			ThirdHall.setBounds(this.ScalingWidth(BDS5.getX()), this.ScalingHeight(BDS5.getY()), this.ScalingWidth(BDS5.getWidth()), this.ScalingHeight(BDS5.getHeight()));
			ThirdHall.setVisible(Visible);
			ThirdHall.setOpaque(Opaque);
			ThirdHall.setContentAreaFilled(AreaFilled);
			ThirdHall.setBorderPainted(BorderPainted);
			ThirdHall.setFocusable(Focusable);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		secondHall.add(Hall);
			Hall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Hall.setVisible(Visible);
			Hall.setOpaque(Opaque);
			Hall.setContentAreaFilled(AreaFilled);
			Hall.setBorderPainted(BorderPainted);
			Hall.setFocusable(Focusable);
			
		secondHall.add(GuestRoom1);
			GuestRoom1.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			GuestRoom1.setVisible(Visible);
			GuestRoom1.setOpaque(Opaque);
			GuestRoom1.setContentAreaFilled(AreaFilled);
			GuestRoom1.setBorderPainted(BorderPainted);
			GuestRoom1.setFocusable(Focusable);
			
		secondHall.add(GuestRoom2);
			GuestRoom2.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			GuestRoom2.setVisible(Visible);
			GuestRoom2.setOpaque(Opaque);
			GuestRoom2.setContentAreaFilled(AreaFilled);
			GuestRoom2.setBorderPainted(BorderPainted);
			GuestRoom2.setFocusable(Focusable);
			
		secondHall.add(Office);
			Office.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			Office.setVisible(Visible);
			Office.setOpaque(Opaque);
			Office.setContentAreaFilled(AreaFilled);
			Office.setBorderPainted(BorderPainted);
			Office.setFocusable(Focusable);
			
		secondHall.add(Study);
			Study.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Study.setVisible(true);
			Study.setVisible(Visible);
			Study.setOpaque(Opaque);
			Study.setContentAreaFilled(AreaFilled);
			Study.setBorderPainted(BorderPainted);
			Study.setFocusable(Focusable);
			
		secondHall.add(ThirdHall);
			ThirdHall.setBounds(this.ScalingWidth(BDS5.getX()), this.ScalingHeight(BDS5.getY()), this.ScalingWidth(BDS5.getWidth()), this.ScalingHeight(BDS5.getHeight()));
			ThirdHall.setVisible(Visible);
			ThirdHall.setOpaque(Opaque);
			ThirdHall.setContentAreaFilled(AreaFilled);
			ThirdHall.setBorderPainted(BorderPainted);
			ThirdHall.setFocusable(Focusable);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		secondHall.add(Hall);
			Hall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Hall.setVisible(Visible);
			Hall.setOpaque(Opaque);
			Hall.setContentAreaFilled(AreaFilled);
			Hall.setBorderPainted(BorderPainted);
			Hall.setFocusable(Focusable);
			
		secondHall.add(GuestRoom1);
			GuestRoom1.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			GuestRoom1.setVisible(Visible);
			GuestRoom1.setOpaque(Opaque);
			GuestRoom1.setContentAreaFilled(AreaFilled);
			GuestRoom1.setBorderPainted(BorderPainted);
			GuestRoom1.setFocusable(Focusable);
			
		secondHall.add(GuestRoom2);
			GuestRoom2.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			GuestRoom2.setVisible(Visible);
			GuestRoom2.setOpaque(Opaque);
			GuestRoom2.setContentAreaFilled(AreaFilled);
			GuestRoom2.setBorderPainted(BorderPainted);
			GuestRoom2.setFocusable(Focusable);
			
		secondHall.add(Office);
			Office.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			Office.setVisible(Visible);
			Office.setOpaque(Opaque);
			Office.setContentAreaFilled(AreaFilled);
			Office.setBorderPainted(BorderPainted);
			Office.setFocusable(Focusable);
			
		secondHall.add(Study);
			Study.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Study.setVisible(Visible);
			Study.setOpaque(Opaque);
			Study.setContentAreaFilled(AreaFilled);
			Study.setBorderPainted(BorderPainted);
			Study.setFocusable(Focusable);
			
		secondHall.add(ThirdHall);
			ThirdHall.setBounds(this.ScalingWidth(BDS5.getX()), this.ScalingHeight(BDS5.getY()), this.ScalingWidth(BDS5.getWidth()), this.ScalingHeight(BDS5.getHeight()));
			ThirdHall.setVisible(Visible);
			ThirdHall.setOpaque(Opaque);
			ThirdHall.setContentAreaFilled(AreaFilled);
			ThirdHall.setBorderPainted(BorderPainted);
			ThirdHall.setFocusable(Focusable);
		}
		
		System.out.println("Building Second Hall ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		secondHall.add(ImageLabel);
		secondHall.setBounds(0,0,W,H);
		secondHall.setLayout(null);
		secondHall.setVisible(false);
	}
	public JButton getHall() {
		return Hall;
	}
	public JButton getGuestRoom1() {
		return GuestRoom1;
	}
	public JButton getGuestRoom2() {
		return GuestRoom2;
	}
	public JButton GetOffice() {
		return Office;
	}
	public JButton GetStudy() {
		return Study;
	}
	public JButton GetThirdHall() {
		return ThirdHall; 
	}
	
	public JLabel getsecondHall() {
		return secondHall;
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
