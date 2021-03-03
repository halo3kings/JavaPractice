package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThirdHall {

	JPanel ThirdHall = new JPanel();
	JLabel ImageLabel = new JLabel();
	
	JButton SecondHall = new JButton();
		ButtonDataStorage BDS = new ButtonDataStorage(225, 410, 200, 50);
	
	JButton PaintersStudio = new JButton();
		ButtonDataStorage BDS1 = new ButtonDataStorage(25, 25, 150, 400);
	
	JButton MasterBedroom = new JButton();
		ButtonDataStorage BDS2 = new ButtonDataStorage(280,150,30,150);
	
	JButton AntiquesRoom = new JButton();
		ButtonDataStorage BDS3 = new ButtonDataStorage(510, 40, 70, 400);
	
	JButton Attic = new JButton();
		ButtonDataStorage BDS4 = new ButtonDataStorage(380,190,60,120);
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Rooms\\3rdHall.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	ThirdHall(int W, int H) {
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		ThirdHall.add(SecondHall);
			SecondHall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			SecondHall.setVisible(true);
			//SecondHall.setOpaque(false);
			//SecondHall.setContentAreaFilled(false);
			//SecondHall.setBorderPainted(false);
			//SecondHall.setFocusable(false);
			
		ThirdHall.add(PaintersStudio);
			PaintersStudio.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			PaintersStudio.setVisible(true);
			//PaintersStudio.setOpaque(false);
			//PaintersStudio.setContentAreaFilled(false);
			//PaintersStudio.setBorderPainted(false);
			//PaintersStudio.setFocusable(false);
			
		ThirdHall.add(MasterBedroom);
			MasterBedroom.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			MasterBedroom.setVisible(true);
			//MasterBedroom.setOpaque(false);
			//MasterBedroom.setContentAreaFilled(false);
			//MasterBedroom.setBorderPainted(false);
			//MasterBedroom.setFocusable(false);
			
		ThirdHall.add(AntiquesRoom);
			AntiquesRoom.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			AntiquesRoom.setVisible(true);
			//AntiquesRoom.setOpaque(false);
			//AntiquesRoom.setContentAreaFilled(false);
			//AntiquesRoom.setBorderPainted(false);
			//AntiquesRoom.setFocusable(false);
			
		ThirdHall.add(Attic);
			Attic.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Attic.setVisible(true);
			//Attic.setOpaque(false);
			//Attic.setContentAreaFilled(false);
			//Attic.setBorderPainted(false);
			//Attic.setFocusable(false);

		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		ThirdHall.add(SecondHall);
			SecondHall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			SecondHall.setVisible(true);
			//SecondHall.setOpaque(false);
			//SecondHall.setContentAreaFilled(false);
			//SecondHall.setBorderPainted(false);
			//SecondHall.setFocusable(false);
			
		ThirdHall.add(PaintersStudio);
			PaintersStudio.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			PaintersStudio.setVisible(true);
			//PaintersStudio.setOpaque(false);
			//PaintersStudio.setContentAreaFilled(false);
			//PaintersStudio.setBorderPainted(false);
			//PaintersStudio.setFocusable(false);
			
		ThirdHall.add(MasterBedroom);
			MasterBedroom.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			MasterBedroom.setVisible(true);
			//MasterBedroom.setOpaque(false);
			//MasterBedroom.setContentAreaFilled(false);
			//MasterBedroom.setBorderPainted(false);
			//MasterBedroom.setFocusable(false);
			
		ThirdHall.add(AntiquesRoom);
			AntiquesRoom.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			AntiquesRoom.setVisible(true);
			//AntiquesRoom.setOpaque(false);
			//AntiquesRoom.setContentAreaFilled(false);
			//AntiquesRoom.setBorderPainted(false);
			//AntiquesRoom.setFocusable(false);
			
		ThirdHall.add(Attic);
			Attic.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Attic.setVisible(true);
			//Attic.setOpaque(false);
			//Attic.setContentAreaFilled(false);
			//Attic.setBorderPainted(false);
			//Attic.setFocusable(false);

		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		ThirdHall.add(SecondHall);
			SecondHall.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), this.ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			SecondHall.setVisible(true);
			//SecondHall.setOpaque(false);
			//SecondHall.setContentAreaFilled(false);
			//SecondHall.setBorderPainted(false);
			//SecondHall.setFocusable(false);
			
		ThirdHall.add(PaintersStudio);
			PaintersStudio.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			PaintersStudio.setVisible(true);
			//PaintersStudio.setOpaque(false);
			//PaintersStudio.setContentAreaFilled(false);
			//PaintersStudio.setBorderPainted(false);
			//PaintersStudio.setFocusable(false);
			
		ThirdHall.add(MasterBedroom);
			MasterBedroom.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			MasterBedroom.setVisible(true);
			//MasterBedroom.setOpaque(false);
			//MasterBedroom.setContentAreaFilled(false);
			//MasterBedroom.setBorderPainted(false);
			//MasterBedroom.setFocusable(false);
			
		ThirdHall.add(AntiquesRoom);
			AntiquesRoom.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			AntiquesRoom.setVisible(true);
			//AntiquesRoom.setOpaque(false);
			//AntiquesRoom.setContentAreaFilled(false);
			//AntiquesRoom.setBorderPainted(false);
			//AntiquesRoom.setFocusable(false);
			
		ThirdHall.add(Attic);
			Attic.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Attic.setVisible(true);
			//Attic.setOpaque(false);
			//Attic.setContentAreaFilled(false);
			//Attic.setBorderPainted(false);
			//Attic.setFocusable(false);

		}
		
		System.out.println("Building Second Hall ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		ThirdHall.add(ImageLabel);
		ThirdHall.setBounds(0,0,W,H);
		ThirdHall.setLayout(null);
		ThirdHall.setVisible(true);
	}
	public JButton getSecondHall() {
		return SecondHall;
	}
	public JButton getPaintersStudio() {
		return PaintersStudio;
	}
	public JButton getMasterBedroom() {
		return MasterBedroom;
	}
	public JButton getAntiquesRoom() {
		return AntiquesRoom;
	}
	public JButton getAttic() {
		return Attic;
	}
	public JPanel getThirdHall() {
		return ThirdHall;
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