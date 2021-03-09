package game.viewer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class InventoryScreen {
	
	JLayeredPane InventoryScreen = new JLayeredPane();
	JLabel ImageLabel = new JLabel();
	
	JButton LeftArrow = new JButton();
		ButtonDataStorage BDS = new ButtonDataStorage(0, 0, 20, 20);
	JButton RightArrow = new JButton();
		ButtonDataStorage BDS1 = new ButtonDataStorage(20, 0, 20, 20);
	JButton ItemSelected = new JButton();
		ButtonDataStorage BDS2 = new ButtonDataStorage(40, 0, 20, 20);
	JButton exit = new JButton();
		ButtonDataStorage BDS3 = new ButtonDataStorage(60, 0, 20, 20);
	
	public boolean Opaque = true;
	public boolean AreaFilled = true;
	public boolean BorderPainted = true;
	public boolean Focusable = true;
	public boolean Visible = true;
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\Inventory\\InventoryScreen.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	InventoryScreen(int W, int H) {
		//this.toggleButtonStateFinal();
		
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			InventoryScreen.add(LeftArrow);
				LeftArrow.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				LeftArrow.setVisible(Visible);
				LeftArrow.setOpaque(Opaque);
				LeftArrow.setContentAreaFilled(AreaFilled);
				LeftArrow.setBorderPainted(BorderPainted);
				LeftArrow.setFocusable(Focusable);
				
			InventoryScreen.add(RightArrow);
				RightArrow.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
				RightArrow.setVisible(Visible);
				RightArrow.setOpaque(Opaque);
				RightArrow.setContentAreaFilled(AreaFilled);
				RightArrow.setBorderPainted(BorderPainted);
				RightArrow.setFocusable(Focusable);
				
			InventoryScreen.add(ItemSelected);
				ItemSelected.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
				ItemSelected.setVisible(Visible);
				ItemSelected.setOpaque(Opaque);
				ItemSelected.setContentAreaFilled(AreaFilled);
				ItemSelected.setBorderPainted(BorderPainted);
				ItemSelected.setFocusable(Focusable);
			
			InventoryScreen.add(exit);
				exit.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
				exit.setVisible(Visible);
				exit.setOpaque(Opaque);
				exit.setContentAreaFilled(AreaFilled);
				exit.setBorderPainted(BorderPainted);
				exit.setFocusable(Focusable);
		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			InventoryScreen.add(LeftArrow);
			LeftArrow.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			LeftArrow.setVisible(Visible);
			LeftArrow.setOpaque(Opaque);
			LeftArrow.setContentAreaFilled(AreaFilled);
			LeftArrow.setBorderPainted(BorderPainted);
			LeftArrow.setFocusable(Focusable);
			
		InventoryScreen.add(RightArrow);
			RightArrow.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			RightArrow.setVisible(Visible);
			RightArrow.setOpaque(Opaque);
			RightArrow.setContentAreaFilled(AreaFilled);
			RightArrow.setBorderPainted(BorderPainted);
			RightArrow.setFocusable(Focusable);
			
		InventoryScreen.add(ItemSelected);
			ItemSelected.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			ItemSelected.setVisible(Visible);
			ItemSelected.setOpaque(Opaque);
			ItemSelected.setContentAreaFilled(AreaFilled);
			ItemSelected.setBorderPainted(BorderPainted);
			ItemSelected.setFocusable(Focusable);
		
		InventoryScreen.add(exit);
			exit.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			exit.setVisible(Visible);
			exit.setOpaque(Opaque);
			exit.setContentAreaFilled(AreaFilled);
			exit.setBorderPainted(BorderPainted);
			exit.setFocusable(Focusable);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			InventoryScreen.add(LeftArrow);
			LeftArrow.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
			LeftArrow.setVisible(Visible);
			LeftArrow.setOpaque(Opaque);
			LeftArrow.setContentAreaFilled(AreaFilled);
			LeftArrow.setBorderPainted(BorderPainted);
			LeftArrow.setFocusable(Focusable);
			
		InventoryScreen.add(RightArrow);
			RightArrow.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
			RightArrow.setVisible(Visible);
			RightArrow.setOpaque(Opaque);
			RightArrow.setContentAreaFilled(AreaFilled);
			RightArrow.setBorderPainted(BorderPainted);
			RightArrow.setFocusable(Focusable);
			
		InventoryScreen.add(ItemSelected);
			ItemSelected.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
			ItemSelected.setVisible(Visible);
			ItemSelected.setOpaque(Opaque);
			ItemSelected.setContentAreaFilled(AreaFilled);
			ItemSelected.setBorderPainted(BorderPainted);
			ItemSelected.setFocusable(Focusable);
		
		InventoryScreen.add(exit);
			exit.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
			exit.setVisible(Visible);
			exit.setOpaque(Opaque);
			exit.setContentAreaFilled(AreaFilled);
			exit.setBorderPainted(BorderPainted);
			exit.setFocusable(Focusable);
		}
		
		System.out.println("building InventoryScreen ");
		ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
		InventoryScreen.add(ImageLabel);
		InventoryScreen.setBounds(0,0,W,H);
		InventoryScreen.setLayout(null);
		InventoryScreen.setVisible(false);
	}
	public JButton getLeftArrow() {
		return LeftArrow;
	}
	public JButton getRightArrow() {
		return LeftArrow;
	}
	public JButton getItemSelected() {
		return LeftArrow;
	}
	public JButton getExit() {
		return exit;
	}
	public JLayeredPane getInventoryScreen() {
		return InventoryScreen;
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

}

