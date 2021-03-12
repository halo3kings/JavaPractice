package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PlayerHud {
	private static int RoomNumber = -1;
	
	JLabel PlayerHud = new JLabel();
	JLabel ImageLabel = new JLabel();
	
	JButton Inventory = new JButton();
	ButtonDataStorage BDS = new ButtonDataStorage(587, 412, 40, 50);
	
	public boolean Opaque = true;
	public boolean AreaFilled = true;
	public boolean BorderPainted = true;
	public boolean Focusable = true;
	public boolean Visible = true;
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\InventoryButton\\InventoryButtonImage.png");
	Image Resize = BackGround.getImage();
	
	
	private int Height;
	private int Width;
	
	PlayerHud(int W, int H) {
		this.toggleButtonStateFinal();
		
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			PlayerHud.add(Inventory);
				Inventory.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Inventory.setVisible(Visible);
				Inventory.setOpaque(Opaque);
				Inventory.setContentAreaFilled(AreaFilled);
				Inventory.setBorderPainted(BorderPainted);
				Inventory.setFocusable(Focusable);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			PlayerHud.add(Inventory);
				Inventory.setBounds(ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Inventory.setVisible(Visible);
				Inventory.setOpaque(Opaque);
				Inventory.setContentAreaFilled(AreaFilled);
				Inventory.setBorderPainted(BorderPainted);
				Inventory.setFocusable(Focusable);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			PlayerHud.add(Inventory);
				Inventory.setBounds(ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				Inventory.setVisible(Visible);
				Inventory.setOpaque(Opaque);
				Inventory.setContentAreaFilled(AreaFilled);
				Inventory.setBorderPainted(BorderPainted);
				Inventory.setFocusable(Focusable);
		}
		
		System.out.println("building PlayerHud ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		PlayerHud.add(ImageLabel);
		PlayerHud.setBounds(0,0,W,H);
		PlayerHud.setLayout(null);
		PlayerHud.setVisible(false);
	}
	public JButton getInventory() {
		return Inventory;
	}
	public JLabel getPlayerHud() {
		return PlayerHud;
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

