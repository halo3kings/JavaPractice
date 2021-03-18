package game.viewer;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class InventoryScreen {
		
	JLayeredPane InventoryScreen = new JLayeredPane();
	JLabel ImageLabel = new JLabel();
	
	JButton LeftArrow = new JButton();
		ButtonDataStorage BDS = new ButtonDataStorage(7, 160, 25, 15);
	JButton RightArrow = new JButton();
		ButtonDataStorage BDS1 = new ButtonDataStorage(608,160,25, 15);
	JButton ItemSelected = new JButton();
		ButtonDataStorage BDS2 = new ButtonDataStorage(273, 105, 95, 124);
	JButton exit = new JButton();
		ButtonDataStorage BDS3 = new ButtonDataStorage(335, 445, 30, 18);
	JButton back = new JButton();
		ButtonDataStorage BDS4 = new ButtonDataStorage(555, 448, 35, 18);
		
	ItemIcons slot0;
	ItemIcons slot1;
	ItemIcons slot2;
	ItemIcons slot3;
	ItemIcons slot4;
	ItemIcons slot5;
	ItemIcons slot6;
	
	public boolean Opaque = false;
	public boolean AreaFilled = false;
	public boolean BorderPainted = true;
	public boolean Focusable = true;
	public boolean Visible = true;
	
	ImageIcon BackGround = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\InventoryScreen.png");
	Image Resize = BackGround.getImage();
	
	private int Height;
	private int Width;
	
	public int centerItemIconX = 238;
	public int CenterItemIconY = 70;
	
	public int ItemIconX[] = {25,100,175, centerItemIconX ,355,430,505};
	public int ItemIconY[] = {CenterItemIconY,105};
	
	public int[] ItemIconType = new int[16];
	
	public int W;
	public int H;

	
	InventoryScreen(int W, int H) {
		//this.toggleButtonStateFinal();
		this.populateItemIconTypeArray();
		this.setW(W);
		this.setH(H);
		
		if(W == 656) {
			Image Resize640 = Resize.getScaledInstance(640, 480, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize640);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 640 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			this.AddingElementsToLayer(W,H);
			

		}
		if(W == 1296) {
			Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1280);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1280 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());
			
			this.AddingElementsToLayer(W,H);
		}
		if(W == 1936) {
			Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
			BackGround = new ImageIcon(Resize1920);
			ImageLabel.setIcon(BackGround);
			ImageLabel.setVisible(true);
			System.out.println("resizing to 1920 ");
			this.setHeight(BackGround.getIconHeight());
			this.setWidth(BackGround.getIconWidth());

			this.AddingElementsToLayer(W,H);
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
		return RightArrow;
	}
	public JButton getItemSelected() {
		return ItemSelected;
	}
	public JButton getExit() {
		return exit;
	}
	public JButton getBack() {
		return back;
	}
	public JLayeredPane getInventoryScreen() {
		return InventoryScreen;
	}
	public void setW(int w) {
		W = w;
	}
	public void setH(int h) {
		H = h;
	}
	public int getW() {
		return W;
	}
	public int getH() {
		return H;
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
	public void populateItemIconTypeArray() {
		for(int i = 0; i <=  ItemIconType.length-1; i++) {
			ItemIconType[i] = i + 1;
			System.out.println(ItemIconType[i]);
		}
		System.out.println("ItemIconTypeArray finished Populating");
	}
	public void shiftIconsRight() {
		int temp;
		int[] tempA = new int[16];
		
		for(int i = 0; i<= ItemIconType.length-1;i++) {
			tempA[i] = ItemIconType[i];
			System.out.println(ItemIconType[i]);
		}
		System.out.println("Array Copied");
		
		temp = ItemIconType[ItemIconType.length - 1];
		tempA[0] = temp;
		for(int i = 1; i<= ItemIconType.length- 1;i++) {
			tempA[i] = ItemIconType[i-1];
		}
		System.out.println("Array shifted");
		
		for(int i = 0; i<= ItemIconType.length-1;i++) {
			ItemIconType[i] = tempA[i]; 
			System.out.println(ItemIconType[i]);
					
		}
		slot0.Update(this.getW(),this.getH(),ItemIconType[1],false);
			slot0.getIcon().setLocation(this.ScalingWidth(ItemIconX[0]),this.ScalingHeight(ItemIconY[1]));
			
		slot1.Update(this.getW(),this.getH(),ItemIconType[2],false);
			slot1.getIcon().setLocation(this.ScalingWidth(ItemIconX[1]),this.ScalingHeight(ItemIconY[1]));
			
		slot2.Update(this.getW(),this.getH(),ItemIconType[3],false);
			slot2.getIcon().setLocation(this.ScalingWidth(ItemIconX[2]),this.ScalingHeight(ItemIconY[1]));
			
		slot3.Update(this.getW(),this.getH(),ItemIconType[4],true);
			slot3.getIcon().setLocation(this.ScalingWidth(ItemIconX[3]),this.ScalingHeight(ItemIconY[0]));
			
		slot4.Update(this.getW(),this.getH(),ItemIconType[5],false);
			slot4.getIcon().setLocation(this.ScalingWidth(ItemIconX[4]),this.ScalingHeight(ItemIconY[1]));
			
		slot5.Update(this.getW(),this.getH(),ItemIconType[6],false);
			slot5.getIcon().setLocation(this.ScalingWidth(ItemIconX[5]),this.ScalingHeight(ItemIconY[1]));
			
		slot6.Update(this.getW(),this.getH(),ItemIconType[7],false);
			slot6.getIcon().setLocation(this.ScalingWidth(ItemIconX[6]),this.ScalingHeight(ItemIconY[1]));
			

		
	}
	public void AddingElementsToLayer(int W, int H) {
		
	InventoryScreen.add(LeftArrow,Integer.valueOf(2));
		LeftArrow.setBounds(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
		LeftArrow.setVisible(Visible);
		LeftArrow.setOpaque(Opaque);
		LeftArrow.setContentAreaFilled(AreaFilled);
		LeftArrow.setBorderPainted(BorderPainted);
		LeftArrow.setFocusable(Focusable);
		
	InventoryScreen.add(RightArrow,Integer.valueOf(2));
		RightArrow.setBounds(this.ScalingWidth(BDS1.getX()), this.ScalingHeight(BDS1.getY()), ScalingWidth(BDS1.getWidth()), this.ScalingHeight(BDS1.getHeight()));
		RightArrow.setVisible(Visible);
		RightArrow.setOpaque(Opaque);
		RightArrow.setContentAreaFilled(AreaFilled);
		RightArrow.setBorderPainted(BorderPainted);
		RightArrow.setFocusable(Focusable);
		
	InventoryScreen.add(ItemSelected,Integer.valueOf(2));
		ItemSelected.setBounds(this.ScalingWidth(BDS2.getX()), this.ScalingHeight(BDS2.getY()), ScalingWidth(BDS2.getWidth()), this.ScalingHeight(BDS2.getHeight()));
		ItemSelected.setVisible(Visible);
		ItemSelected.setOpaque(Opaque);
		ItemSelected.setContentAreaFilled(AreaFilled);
		ItemSelected.setBorderPainted(BorderPainted);
		ItemSelected.setFocusable(Focusable);
	
	InventoryScreen.add(exit,Integer.valueOf(2));
		exit.setBounds(this.ScalingWidth(BDS3.getX()), this.ScalingHeight(BDS3.getY()), ScalingWidth(BDS3.getWidth()), this.ScalingHeight(BDS3.getHeight()));
		exit.setVisible(Visible);
		exit.setOpaque(Opaque);
		exit.setContentAreaFilled(AreaFilled);
		exit.setBorderPainted(BorderPainted);
		exit.setFocusable(Focusable);
		
	InventoryScreen.add(back,Integer.valueOf(2));
		back.setBounds(this.ScalingWidth(BDS4.getX()), this.ScalingHeight(BDS4.getY()), ScalingWidth(BDS4.getWidth()), this.ScalingHeight(BDS4.getHeight()));
		back.setVisible(Visible);
		back.setOpaque(Opaque);
		back.setContentAreaFilled(AreaFilled);
		back.setBorderPainted(BorderPainted);
		back.setFocusable(Focusable);
		
	slot0 = new ItemIcons(W,H,ItemIconType[0],false);
		slot0.getIcon().setLocation(this.ScalingWidth(ItemIconX[0]),this.ScalingHeight(ItemIconY[1]));
		InventoryScreen.add(slot0.getIcon(),Integer.valueOf(3));
		
	slot1 = new ItemIcons(W,H,ItemIconType[1],false);
		slot1.getIcon().setLocation(this.ScalingWidth(ItemIconX[1]),this.ScalingHeight(ItemIconY[1]));
		InventoryScreen.add(slot1.getIcon(),Integer.valueOf(3));
		
	slot2 = new ItemIcons(W,H,ItemIconType[2],false);
		slot2.getIcon().setLocation(this.ScalingWidth(ItemIconX[2]),this.ScalingHeight(ItemIconY[1]));
		InventoryScreen.add(slot2.getIcon(),Integer.valueOf(3));
		
	slot3 = new ItemIcons(W,H,ItemIconType[3],true);
		slot3.getIcon().setLocation(this.ScalingWidth(ItemIconX[3]),this.ScalingHeight(ItemIconY[0]));
		InventoryScreen.add(slot3.getIcon(),Integer.valueOf(3));
		
	slot4 = new ItemIcons(W,H,ItemIconType[4],false);
		slot4.getIcon().setLocation(this.ScalingWidth(ItemIconX[4]),this.ScalingHeight(ItemIconY[1]));
		InventoryScreen.add(slot4.getIcon(),Integer.valueOf(3));
		
	slot5 = new ItemIcons(W,H,ItemIconType[5],false);
		slot5.getIcon().setLocation(this.ScalingWidth(ItemIconX[5]),this.ScalingHeight(ItemIconY[1]));
		InventoryScreen.add(slot5.getIcon(),Integer.valueOf(3));
		
	slot6 = new ItemIcons(W,H,ItemIconType[6],false);
		slot6.getIcon().setLocation(this.ScalingWidth(ItemIconX[6]),this.ScalingHeight(ItemIconY[1]));
		InventoryScreen.add(slot6.getIcon(),Integer.valueOf(3));
	}
	
	

}

