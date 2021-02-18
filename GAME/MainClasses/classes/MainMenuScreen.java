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

	JPanel MainMenu = new JPanel();
	JPanel Load = new JPanel();

	JLabel MainMenuImage = new JLabel();
	ImageIcon mainMenuImage640 = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\640.png");
	ImageIcon mainMenuImage720 = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\720.png");
	ImageIcon mainMenuImage1920 = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\1920.png");
	
	JButton MMStart = new JButton("Start");
	JButton MMLoad = new JButton("Load");
	JButton MMLoadBB = new JButton("Back");
	JButton MMLLoad = new JButton("Load");
	JButton MMQuit = new JButton("Quit");
	
	
	
	public void createMainMenu() {
		
		if(this.getResolutionWidth() == 640) {
			this.setMenu640();
		}
		if(this.getResolutionWidth() == 1280) {
			this.setMenu1280();
		}
		if(this.getResolutionWidth() == 1920) {
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
		MainMenu.add(MMStart);
			MMStart.setBounds(20,420 - getButtonH() - getButtonH() - 40,getButtonW() + 30,getButtonH());
			MMStart.setOpaque(false);
			MMStart.setContentAreaFilled(false);
			MMStart.setBorderPainted(false);
			MMStart.setFocusable(false);
			MMStart.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMLoad);
			MMLoad.setBounds(20,420 - getButtonH() - 20,getButtonW() + 30,getButtonH());
			MMLoad.setOpaque(false);
			MMLoad.setContentAreaFilled(false);
			MMLoad.setBorderPainted(false);
			MMLoad.setFocusable(false);
			MMLoad.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMLoadBB);
		MainMenu.add(MMQuit);
			MMQuit.setBounds(20,420,getButtonW() + 30,getButtonH());
			MMQuit.setOpaque(false);
			MMQuit.setContentAreaFilled(false);
			MMQuit.setBorderPainted(false);
			MMQuit.setFocusable(false);
			MMQuit.setFont(new Font("Cambria",Font.PLAIN,30));
	}
	public void setMenu1280() {
		MainMenuImage.setIcon(mainMenuImage720);
		MainMenuImage.setBounds(0,0,1280,720);
		MainMenu.setLayout(null);
		MainMenu.add(MMStart);
			MMStart.setBounds(20,mainMenuImage720.getIconHeight() - 60 - getButtonH() - getButtonH() - 40,getButtonW() + 30,getButtonH());
			MMStart.setOpaque(false);
			MMStart.setContentAreaFilled(false);
			MMStart.setBorderPainted(false);
			MMStart.setFocusable(false);
			MMStart.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMLoad);
			MMLoad.setBounds(20,mainMenuImage720.getIconHeight() - 60 - getButtonH() - 20,getButtonW() + 30,getButtonH());
			MMLoad.setOpaque(false);
			MMLoad.setContentAreaFilled(false);
			MMLoad.setBorderPainted(false);
			MMLoad.setFocusable(false);
			MMLoad.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMLoadBB);
		MainMenu.add(MMQuit);
			MMQuit.setBounds(20,mainMenuImage720.getIconHeight() - 60,getButtonW() + 30,getButtonH());
			MMQuit.setOpaque(false);
			MMQuit.setContentAreaFilled(false);
			MMQuit.setBorderPainted(false);
			MMQuit.setFocusable(false);
			MMQuit.setFont(new Font("Cambria",Font.PLAIN,30));
	}
	public void setMenu1920() {
		MainMenuImage.setIcon(mainMenuImage1920);
		MainMenuImage.setBounds(0,0,1920,1080);
		MainMenu.setLayout(null);
		MainMenu.add(MMStart);
			MMStart.setBounds(20,mainMenuImage1920.getIconHeight() - 60 - getButtonH() - getButtonH() - 40,getButtonW() + 30,getButtonH());
			MMStart.setOpaque(false);
			MMStart.setContentAreaFilled(false);
			MMStart.setBorderPainted(false);
			MMStart.setFocusable(false);
			MMStart.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMLoad);
			MMLoad.setBounds(20,mainMenuImage1920.getIconHeight() - 60 - getButtonH() - 20,getButtonW() + 30,getButtonH());
			MMLoad.setOpaque(false);
			MMLoad.setContentAreaFilled(false);
			MMLoad.setBorderPainted(false);
			MMLoad.setFocusable(false);
			MMLoad.setFont(new Font("Cambria",Font.PLAIN,30));
		MainMenu.add(MMLoadBB);
		MainMenu.add(MMQuit);
			MMQuit.setBounds(20,mainMenuImage1920.getIconHeight() - 60,getButtonW() + 30,getButtonH());
			MMQuit.setOpaque(false);
			MMQuit.setContentAreaFilled(false);
			MMQuit.setBorderPainted(false);
			MMQuit.setFocusable(false);
			MMQuit.setFont(new Font("Cambria",Font.PLAIN,30));
	}
	//gets


	}

