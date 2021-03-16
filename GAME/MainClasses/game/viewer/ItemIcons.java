package game.viewer;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JLayeredPane;

public class ItemIcons {
	public int numberOfInvIcons = 16;
	public int IconWidth = 80;
	public int IconHeight = 168;
	public boolean Visible = true;
	private int Height;
	private int Width;
	private String VisibleIconImage;
	public String ImageLocation[] = new String[numberOfInvIcons];
	
	JLabel Icon = new JLabel();
	JLabel ImageLabel = new JLabel();
	
	ImageIcon BackGround;
	
	ItemIcons(int W, int H,int SetImage) {
		this.ImageLocationPopulator();
		this.setImage(SetImage);
		BackGround = new ImageIcon(this.getImage());
		Image Resize = BackGround.getImage();
			
		
			if(W == 656) {
				Image Resize640 = Resize.getScaledInstance(IconWidth,IconHeight, java.awt.Image.SCALE_SMOOTH);
				BackGround = new ImageIcon(Resize640);
				ImageLabel.setIcon(BackGround);
				ImageLabel.setVisible(true);
				System.out.println("resizing for 640 ");
				this.setHeight(BackGround.getIconHeight());
				this.setWidth(BackGround.getIconWidth());	
			}
			if(W == 1296) {
				Image Resize1280 = Resize.getScaledInstance(this.ScalingWidth(IconWidth), this.ScalingHeight(IconHeight), java.awt.Image.SCALE_SMOOTH);
				BackGround = new ImageIcon(Resize1280);
				ImageLabel.setIcon(BackGround);
				ImageLabel.setVisible(true);
				System.out.println("resizing for 1280 ");
				this.setHeight(BackGround.getIconHeight());
				this.setWidth(BackGround.getIconWidth());
			}
			if(W == 1936) {
				Image Resize1920 = Resize.getScaledInstance(this.ScalingWidth(IconWidth), this.ScalingHeight(IconHeight), java.awt.Image.SCALE_SMOOTH);
				BackGround = new ImageIcon(Resize1920);
				ImageLabel.setIcon(BackGround);
				ImageLabel.setVisible(true);
				System.out.println("resizing for 1920 ");
				this.setHeight(BackGround.getIconHeight());
				this.setWidth(BackGround.getIconWidth());
				
				System.out.println("building Icon ");
				ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
				Icon.add(ImageLabel);
				Icon.setBounds(0,0,W,H);
				Icon.setLayout(null);
				Icon.setVisible(Visible);
			}

	}
		public int getIconWidth() {
			return IconWidth;
		}
		public int getIconHeight() {
			return IconHeight;
		}
		public boolean Visibility() {
			return Visible;
		}
		public void setVisibility(boolean visible) {
			Visible = visible;
		}
		public JLabel getIcon() {
			return Icon;
		}
		public void setImage(int DesiredImage) {
			VisibleIconImage = ImageLocation[DesiredImage];
		}
		public String getImage() {
			return VisibleIconImage;
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
	
		public void ImageLocationPopulator() {
			ImageLocation[0]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Ammo.png";
			ImageLocation[1]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Book.png";
			ImageLocation[2]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\FingerGuns.png";
			ImageLocation[3]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\FlashLight.png";
			ImageLocation[4]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Key1.png";
			ImageLocation[5]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Key2.png";
			ImageLocation[6]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Key3.png";
			ImageLocation[7]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Key4.png";
			ImageLocation[8]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Key5.png";
			ImageLocation[9]  = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Key6.png";
			ImageLocation[10] = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Knife.png";
			ImageLocation[11] = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Lighter.png";
			ImageLocation[12] = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\LockPick.png";
			ImageLocation[13] = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Medicine.png";
			ImageLocation[14] = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\Revolver.png";
			ImageLocation[15] = "C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\GameUI\\Inventory\\Inventory Screen\\Inventory icons\\SaltBag.png";
							   
		}
}


