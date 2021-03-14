package game.viewer;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ItemIcons {
	
		private static int Width = 50;
		private static int Height = 50;
		private int NumberOfIcons = 16;

		JLabel Icon = new JLabel();
		JLabel ImageLabel[] = new JLabel[NumberOfIcons];
		
		String ImageLocation[] = new String[NumberOfIcons];
		ImageIcon INVIcon[] = new ImageIcon[NumberOfIcons];
			
		ItemIcons(int X, int Y,int W, int H) {
			
			System.out.println("building Icon ");
			this.ImageLocationPopulator();
			this.scalingImages(W);
			this.setAllIconsVisibility(false);
			
			Icon.setBounds(X,Y,W,H);
			Icon.setLayout(null);
			Icon.setVisible(false);
		}

		public JLabel getIcon() {
			return Icon;
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
		public  void setSpecificIconVisible(int SpecificInvIcon, boolean Visible) {
			ImageLabel[SpecificInvIcon].setVisible(Visible);
		}
		public void setAllIconsVisibility(boolean Visible) {
			for(int i = 0; i > NumberOfIcons - 1; i++ ) {
				ImageLabel[i].setVisible(Visible);
			}
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
				
			for(int i = 0; i > NumberOfIcons - 1; i++ ) {
					INVIcon[i] = new ImageIcon(ImageLocation[i]);
				}
		}
		public void scalingImages(int W) {
					
			for(int i = 0; i > NumberOfIcons - 1; i++) {				

					Image Resize = INVIcon[i].getImage();
					if(W == 656) {
				
					Image Resize640 = Resize.getScaledInstance(this.ScalingWidth(this.getWidth()), this.ScalingHeight(this.getHeight()), java.awt.Image.SCALE_SMOOTH);
					INVIcon[i] = new ImageIcon(Resize640);
					ImageLabel[i].setIcon(INVIcon[i]);
					ImageLabel[i].setVisible(true);
					System.out.println("resizing to 640 ");
					this.setHeight(INVIcon[i].getIconHeight());
					this.setWidth(INVIcon[i].getIconWidth());
					
					ImageLabel[i].setBounds(0,0,INVIcon[i].getIconWidth(),INVIcon[i].getIconHeight());
					Icon.add(ImageLabel[i]);
				}
			
				if(W == 1296) {
					
					Image Resize1280 = Resize.getScaledInstance(this.ScalingWidth(this.getWidth()), this.ScalingHeight(this.getHeight()), java.awt.Image.SCALE_SMOOTH);
					INVIcon[i] = new ImageIcon(Resize1280);
					ImageLabel[i].setIcon(INVIcon[i]);
					ImageLabel[i].setVisible(true);
					System.out.println("resizing to 640 ");
					this.setHeight(INVIcon[i].getIconHeight());
					this.setWidth(INVIcon[i].getIconWidth());
					
					ImageLabel[i].setBounds(0,0,INVIcon[i].getIconWidth(),INVIcon[i].getIconHeight());
					Icon.add(ImageLabel[i]);
				}
				
				if(W == 1936) {
					
					Image Resize1920 = Resize.getScaledInstance(this.ScalingWidth(this.getWidth()), this.ScalingHeight(this.getHeight()), java.awt.Image.SCALE_SMOOTH);
					INVIcon[i] = new ImageIcon(Resize1920);
					ImageLabel[i].setIcon(INVIcon[i]);
					ImageLabel[i].setVisible(true);
					System.out.println("resizing to 640 ");
					this.setHeight(INVIcon[i].getIconHeight());
					this.setWidth(INVIcon[i].getIconWidth());
					
					ImageLabel[i].setBounds(0,0,INVIcon[i].getIconWidth(),INVIcon[i].getIconHeight());
					Icon.add(ImageLabel[i]);
				}
			}

		}
	}




