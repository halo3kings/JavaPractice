package game.viewer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainMenuScreen{
	
	private static int RoomNumber = 0;
	
	public boolean Opaque = true;
	public boolean AreaFilled = true;
	public boolean BorderPainted = true;
	public boolean Focusable = true;
	public boolean Visible = true;
	
	private int Height;
	private int Width;
	
	JLabel MainMenu = new JLabel();
	JLabel ImageLabel = new JLabel();
	JLabel LoadScreen = new JLabel();
	
	ButtonDataStorage BDS = new ButtonDataStorage (20, 300, 100, 40);
	ButtonDataStorage BDS1 = new ButtonDataStorage(20, 360, 100, 40);	
	ButtonDataStorage BDS2 = new ButtonDataStorage(20, 0, 100, 40);
	ButtonDataStorage BDS3 = new ButtonDataStorage(20, 0, 100, 40);	
	ButtonDataStorage BDS4 = new ButtonDataStorage(20, 420, 100, 40);	
		
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\1920.png");
	Image Resize = BackGround.getImage();
	
	JButton Start = new JButton("Start");
	JButton Load = new JButton("Load");
	JButton LoadScreenBackButton = new JButton("Back");
	JButton LoadScreenLoadButton = new JButton("Load");
	JButton Quit = new JButton("Quit");
	
	
	MainMenuScreen(int W, int H) {
		this.toggleButtonStateFinal();
		
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			MainMenu.add(Start);
				Start.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Start.setVisible(Visible);
				Start.setOpaque(Opaque);
				Start.setContentAreaFilled(AreaFilled);
				Start.setBorderPainted(BorderPainted);
				Start.setFocusable(Focusable);
				Start.setFont(new Font("Cambria",Font.PLAIN,30));
				Start.setForeground(Color.WHITE);
			
			MainMenu.add(Load);
				Load.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				Load.setVisible(Visible);
				Load.setOpaque(Opaque);
				Load.setContentAreaFilled(AreaFilled);
				Load.setBorderPainted(BorderPainted);
				Load.setFocusable(Focusable);
				Load.setFont(new Font("Cambria",Font.PLAIN,30));
				Load.setForeground(Color.WHITE);
				
			MainMenu.add(LoadScreenBackButton);
				LoadScreenBackButton.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
				LoadScreenBackButton.setVisible(false);
				LoadScreenBackButton.setOpaque(Opaque);
				LoadScreenBackButton.setContentAreaFilled(AreaFilled);
				LoadScreenBackButton.setBorderPainted(BorderPainted);
				LoadScreenBackButton.setFocusable(Focusable);
				LoadScreenBackButton.setFont(new Font("Cambria",Font.PLAIN,30));
				LoadScreenBackButton.setForeground(Color.WHITE);
				
			MainMenu.add(LoadScreenLoadButton);
				LoadScreenLoadButton.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
				LoadScreenLoadButton.setVisible(false);
				LoadScreenLoadButton.setOpaque(Opaque);
				LoadScreenLoadButton.setContentAreaFilled(AreaFilled);
				LoadScreenLoadButton.setBorderPainted(BorderPainted);
				LoadScreenLoadButton.setFocusable(Focusable);
				LoadScreenLoadButton.setFont(new Font("Cambria",Font.PLAIN,30));
				LoadScreenLoadButton.setForeground(Color.WHITE);
				
			MainMenu.add(Quit);
				Quit.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
				Quit.setVisible(Visible);
				Quit.setOpaque(Opaque);
				Quit.setContentAreaFilled(AreaFilled);
				Quit.setBorderPainted(BorderPainted);
				Quit.setFocusable(Focusable);
				Quit.setFont(new Font("Cambria",Font.PLAIN,30));
				Quit.setForeground(Color.WHITE);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		MainMenu.add(Start);
			Start.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Start.setVisible(Visible);
			Start.setOpaque(Opaque);
			Start.setContentAreaFilled(AreaFilled);
			Start.setBorderPainted(BorderPainted);
			Start.setFocusable(Focusable);
			Start.setFont(new Font("Cambria",Font.PLAIN,30));
			Start.setForeground(Color.WHITE);
		
		MainMenu.add(Load);
			Load.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			Load.setVisible(Visible);
			Load.setOpaque(Opaque);
			Load.setContentAreaFilled(AreaFilled);
			Load.setBorderPainted(BorderPainted);
			Load.setFocusable(Focusable);
			Load.setFont(new Font("Cambria",Font.PLAIN,30));
			Load.setForeground(Color.WHITE);
			
		MainMenu.add(LoadScreenBackButton);
			LoadScreenBackButton.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			LoadScreenBackButton.setVisible(false);
			LoadScreenBackButton.setOpaque(Opaque);
			LoadScreenBackButton.setContentAreaFilled(AreaFilled);
			LoadScreenBackButton.setBorderPainted(BorderPainted);
			LoadScreenBackButton.setFocusable(Focusable);
			LoadScreenBackButton.setFont(new Font("Cambria",Font.PLAIN,30));
			LoadScreenBackButton.setForeground(Color.WHITE);
			
		MainMenu.add(LoadScreenLoadButton);
			LoadScreenLoadButton.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			LoadScreenLoadButton.setVisible(false);
			LoadScreenLoadButton.setOpaque(Opaque);
			LoadScreenLoadButton.setContentAreaFilled(AreaFilled);
			LoadScreenLoadButton.setBorderPainted(BorderPainted);
			LoadScreenLoadButton.setFocusable(Focusable);
			LoadScreenLoadButton.setFont(new Font("Cambria",Font.PLAIN,30));
			LoadScreenLoadButton.setForeground(Color.WHITE);
			
		MainMenu.add(Quit);
			Quit.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Quit.setVisible(Visible);
			Quit.setOpaque(Opaque);
			Quit.setContentAreaFilled(AreaFilled);
			Quit.setBorderPainted(BorderPainted);
			Quit.setFocusable(Focusable);
			Quit.setFont(new Font("Cambria",Font.PLAIN,30));
			Quit.setForeground(Color.WHITE);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
		MainMenu.add(Start);
			Start.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			Start.setVisible(Visible);
			Start.setOpaque(Opaque);
			Start.setContentAreaFilled(AreaFilled);
			Start.setBorderPainted(BorderPainted);
			Start.setFocusable(Focusable);
			Start.setFont(new Font("Cambria",Font.PLAIN,30));
			Start.setForeground(Color.WHITE);
		
		MainMenu.add(Load);
			Load.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), this.ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			Load.setVisible(Visible);
			Load.setOpaque(Opaque);
			Load.setContentAreaFilled(AreaFilled);
			Load.setBorderPainted(BorderPainted);
			Load.setFocusable(Focusable);
			Load.setFont(new Font("Cambria",Font.PLAIN,30));
			Load.setForeground(Color.WHITE);
			
		MainMenu.add(LoadScreenBackButton);
			LoadScreenBackButton.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), this.ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			LoadScreenBackButton.setVisible(false);
			LoadScreenBackButton.setOpaque(Opaque);
			LoadScreenBackButton.setContentAreaFilled(AreaFilled);
			LoadScreenBackButton.setBorderPainted(BorderPainted);
			LoadScreenBackButton.setFocusable(Focusable);
			LoadScreenBackButton.setFont(new Font("Cambria",Font.PLAIN,30));
			LoadScreenBackButton.setForeground(Color.WHITE);
			
		MainMenu.add(LoadScreenLoadButton);
			LoadScreenLoadButton.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), this.ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			LoadScreenLoadButton.setVisible(false);
			LoadScreenLoadButton.setOpaque(Opaque);
			LoadScreenLoadButton.setContentAreaFilled(AreaFilled);
			LoadScreenLoadButton.setBorderPainted(BorderPainted);
			LoadScreenLoadButton.setFocusable(Focusable);
			LoadScreenLoadButton.setFont(new Font("Cambria",Font.PLAIN,30));
			LoadScreenLoadButton.setForeground(Color.WHITE);
		
		MainMenu.add(Quit);
			Quit.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), this.ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
			Quit.setVisible(Visible);
			Quit.setOpaque(Opaque);
			Quit.setContentAreaFilled(AreaFilled);
			Quit.setBorderPainted(BorderPainted);
			Quit.setFocusable(Focusable);
			Quit.setFont(new Font("Cambria",Font.PLAIN,30));
			Quit.setForeground(Color.WHITE);	
		}

		System.out.println("building front porch ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		MainMenu.add(ImageLabel);
		MainMenu.setBounds(0,0,W,H);
		MainMenu.setLayout(null);
		MainMenu.setVisible(true);
		
	}
	
	public JLabel getMainMenu() {
		return MainMenu;
	}
	
	public JButton getLoad() {
		return Load;
	}
	public JButton getStart() {
		return Start;
	}
	public JButton getQuit() {
		return Quit;
	}
	public JButton getLoadScreenBB() {
		return LoadScreenBackButton;
	}
	public JButton getLoadScreenLB() {
		return LoadScreenLoadButton;
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

