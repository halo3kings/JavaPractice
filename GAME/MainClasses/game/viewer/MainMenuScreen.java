package game.viewer;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenuScreen{
	//Constants
	private static int BUTTON_WIDTH = 80;
	private static int BUTTON_HEIGHT = 40;
	private static int CHECKBOX_WIDTH = 150;
	private static int CHECKBOX_HEIGHT = 25;
	private static int WindowID = 0;
	
	private int Width;
	private int Height;
	private boolean Visibility = true;
	
	JPanel MainMenu = new JPanel();
	JPanel Load = new JPanel();

	JLabel MainMenuImage = new JLabel();
	ImageIcon mainMenuImage640 = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\640.png");
	ImageIcon mainMenuImage720 = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\720.png");
	ImageIcon mainMenuImage1920 = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\1920.png");
	
	JButton MMSStart = new JButton("Start");
	JButton MMSLoad = new JButton("Load");
	JButton MMSLoadBB = new JButton("Back");
	JButton MMSLLoad = new JButton("Load");
	JButton MMSQuit = new JButton("Quit");
	
	
	MainMenuScreen(int W, int H) {
		Width = W;
		Height = H;
		this.createMainMenuScreen();
		System.out.println("Finished MainMenu constructor");
	
	}
	public void createMainMenuScreen() {
		
		if(this.getWidth() == 656) {
			this.setMenu640();
		}
		if(this.getWidth() == 1296) {
			this.setMenu1280();
		}
		if(this.getWidth() == 1936) {
			this.setMenu1920();
		}
		
		MainMenu.setBounds(0,0, getWidth(), getHeight());
		MainMenu.add(MainMenuImage);
		MainMenu.setVisible(Visibility);
		System.out.println("Finished Creating main menu screen");
		
	}
	public void setMenu640() {
		MainMenuImage.setIcon(mainMenuImage640);
		MainMenuImage.setBounds(0,0,mainMenuImage640.getIconWidth(),mainMenuImage640.getIconHeight());
		MainMenu.setLayout(null);
		MainMenu.add(Load);
		MainMenu.add(MMSStart);
			MMSStart.setBounds(20,420 - getButtonH() - getButtonH() - 40,getButtonW() + 30,getButtonH());
			MMSStart.setOpaque(false);
			MMSStart.setContentAreaFilled(false);
			MMSStart.setBorderPainted(false);
			MMSStart.setFocusable(false);
			MMSStart.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMSLoad);
			MMSLoad.setBounds(20,420 - getButtonH() - 20,getButtonW() + 30,getButtonH());
			MMSLoad.setOpaque(false);
			MMSLoad.setContentAreaFilled(false);
			MMSLoad.setBorderPainted(false);
			MMSLoad.setFocusable(false);
			MMSLoad.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMSLoadBB);
		MainMenu.add(MMSQuit);
			MMSQuit.setBounds(20,420,getButtonW() + 30,getButtonH());
			MMSQuit.setOpaque(false);
			MMSQuit.setContentAreaFilled(false);
			MMSQuit.setBorderPainted(false);
			MMSQuit.setFocusable(false);
			MMSQuit.setFont(new Font("Cambria",Font.PLAIN,30));
		
		System.out.println("Finished 640 menu set");
	}
	public void setMenu1280() {
		MainMenuImage.setIcon(mainMenuImage720);
		MainMenuImage.setBounds(0,0,1280,720);
		MainMenu.setLayout(null);
		MainMenu.add(Load);
		MainMenu.add(MMSStart);
			MMSStart.setBounds(20,mainMenuImage720.getIconHeight() - 60 - getButtonH() - getButtonH() - 40,getButtonW() + 30,getButtonH());
			MMSStart.setOpaque(true);
			MMSStart.setContentAreaFilled(false);
			MMSStart.setBorderPainted(false);
			MMSStart.setFocusable(false);
			MMSStart.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMSLoad);
			MMSLoad.setBounds(20,mainMenuImage720.getIconHeight() - 60 - getButtonH() - 20,getButtonW() + 30,getButtonH());
			MMSLoad.setOpaque(true);
			MMSLoad.setContentAreaFilled(false);
			MMSLoad.setBorderPainted(false);
			MMSLoad.setFocusable(false);
			MMSLoad.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMSLoadBB);
		MainMenu.add(MMSQuit);
			MMSQuit.setBounds(20,mainMenuImage720.getIconHeight() - 60,getButtonW() + 30,getButtonH());
			MMSQuit.setOpaque(true);
			MMSQuit.setContentAreaFilled(false);
			MMSQuit.setBorderPainted(false);
			MMSQuit.setFocusable(false);
			MMSQuit.setFont(new Font("Cambria",Font.PLAIN,30));
			
		System.out.println("Finished 1280 menu set");
	}
	public void setMenu1920() {
		MainMenuImage.setIcon(mainMenuImage1920);
		MainMenuImage.setBounds(0,0,1920,1080);
		MainMenu.setLayout(null);
		MainMenu.add(Load);
		MainMenu.add(MMSStart);
			MMSStart.setBounds(20,mainMenuImage1920.getIconHeight() - 60 - getButtonH() - getButtonH() - 40,getButtonW() + 30,getButtonH());
			MMSStart.setOpaque(false);
			MMSStart.setContentAreaFilled(false);
			MMSStart.setBorderPainted(false);
			MMSStart.setFocusable(false);
			MMSStart.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMSLoad);
			MMSLoad.setBounds(20,mainMenuImage1920.getIconHeight() - 60 - getButtonH() - 20,getButtonW() + 30,getButtonH());
			MMSLoad.setOpaque(false);
			MMSLoad.setContentAreaFilled(false);
			MMSLoad.setBorderPainted(false);
			MMSLoad.setFocusable(false);
			MMSLoad.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMSLoadBB);
		MainMenu.add(MMSQuit);
			MMSQuit.setBounds(20,mainMenuImage1920.getIconHeight() - 60,getButtonW() + 30,getButtonH());
			MMSQuit.setOpaque(false);
			MMSQuit.setContentAreaFilled(false);
			MMSQuit.setBorderPainted(false);
			MMSQuit.setFocusable(false);
			MMSQuit.setFont(new Font("Cambria",Font.PLAIN,30));
		System.out.println("Finished 1920 menu set");
	}
	
	public void setVisibility(boolean Vis) {
		Visibility = Vis;
	}
	public void setStartButton(JButton ST) {
		MMSStart = ST;
	}
	public void setQuit(JButton QT) {
		MMSQuit = QT;
	}
	public void setLoad(JButton LD) {
		MMSLoad = LD;
	}
	public void setLoadBB(JButton LB) {
		MMSLoadBB = LB;
	}
	public void setLLoad(JButton LL) {
		MMSLLoad = LL;
	}	
	//gets
	public int getWindowNumber() {
		return WindowID;
	}
	public JButton getStartButton() {
		return MMSStart;
	}
	public JButton getQuit() {
		return MMSQuit;
	}
	public JButton getLoad() {
		return MMSLoad;
	}
	public JButton getLoadBB() {
		return MMSLoadBB;
	}
	public JButton getLLoad() {
		return MMSLLoad;
	}
	public JPanel getMainMenu() {
		return MainMenu;
	}

	public int getHeight() {
		return Height;
	}
	public int getWidth() {
		return Width;
	}
	public int getButtonW() {
		return BUTTON_WIDTH;
	}
	public int getButtonH() {
		return BUTTON_HEIGHT;
	}
	public int getCheckBoxW() {
		return CHECKBOX_WIDTH;
	}
	public int getCheckBoxH() {
		return CHECKBOX_HEIGHT;
	}

}

