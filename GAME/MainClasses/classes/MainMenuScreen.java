package classes;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenuScreen extends Base{
	
	private static int WindowID = 0;

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
		super(W, H);
	}
	public void createMainMenuScreen() {
		
		if(this.getWidth() == 640) {
			this.setMenu640();
		}
		if(this.getWidth() == 1280) {
			this.setMenu1280();
		}
		if(this.getWidth() == 1920) {
			this.setMenu1920();
		}
		
		MainMenu.setBounds(0,0, getWidth(), getHeight());
		MainMenu.add(MainMenuImage);
		MainMenu.setVisible(true);
		
		this.Frame.add(MainMenu);
		this.Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.Frame.setLayout(null);
		this.Frame.setSize(getWidth() + 15,getHeight() + 39);
		this.Frame.setVisible(true);
		this.Frame.setResizable(false);
	}
	public void setMenu640() {
		MainMenuImage.setIcon(mainMenuImage640);
		MainMenuImage.setBounds(0,0,640,480);
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

}

