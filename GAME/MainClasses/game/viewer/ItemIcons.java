package game.viewer;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ItemIcons {

		JLabel AtticRoom = new JLabel();
		JLabel ImageLabel = new JLabel();
		
		String ImageLocation;
		
		ImageIcon BackGround = new ImageIcon(ImageLocation);
		Image Resize = BackGround.getImage();
		
		ButtonDataStorage BDS = new ButtonDataStorage(7, 160, 0, 0);
		
		private int Height;
		private int Width;
		
		ItemIcons(int W, int H) {

			if(W == 656) {
				
				//(this.ScalingWidth(BDS.getX()), this.ScalingHeight(BDS.getY()), ScalingWidth(BDS.getWidth()), this.ScalingHeight(BDS.getHeight()));
				
				Image Resize640 = Resize.getScaledInstance(BDS.getX(), BDS.getY(), java.awt.Image.SCALE_SMOOTH);
				BackGround = new ImageIcon(Resize640);
				ImageLabel.setIcon(BackGround);
				ImageLabel.setVisible(true);
				System.out.println("resizing to 640 ");
				this.setHeight(BackGround.getIconHeight());
				this.setWidth(BackGround.getIconWidth());
				
			}
			if(W == 1296) {
				Image Resize1280 = Resize.getScaledInstance(1280, 720, java.awt.Image.SCALE_SMOOTH);
				BackGround = new ImageIcon(Resize1280);
				ImageLabel.setIcon(BackGround);
				ImageLabel.setVisible(true);
				System.out.println("resizing to 1280 ");
				this.setHeight(BackGround.getIconHeight());
				this.setWidth(BackGround.getIconWidth());
				
			}
			if(W == 1936) {
				Image Resize1920 = Resize.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
				BackGround = new ImageIcon(Resize1920);
				ImageLabel.setIcon(BackGround);
				ImageLabel.setVisible(true);
				System.out.println("resizing to 1920 ");
				this.setHeight(BackGround.getIconHeight());
				this.setWidth(BackGround.getIconWidth());
				
			}
			
			System.out.println("building AtticRoom ");
			ImageLabel.setBounds(0,0,BackGround.getIconWidth(),BackGround.getIconHeight());
			AtticRoom.add(ImageLabel);
			AtticRoom.setBounds(0,0,W,H);
			AtticRoom.setLayout(null);
			AtticRoom.setVisible(false);
		}

		public JLabel getAtticRoom() {
			return AtticRoom;
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


