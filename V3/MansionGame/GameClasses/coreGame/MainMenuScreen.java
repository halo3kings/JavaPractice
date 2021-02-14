package coreGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainMenuScreen extends JFrame implements ActionListener{
	//Constants
	private static int BUTTON_WIDTH = 80;
	private static int BUTTON_HEIGHT = 40;
	private static int CHECKBOX_WIDTH = 150;
	private static int CHECKBOX_HEIGHT = 25;
	
	private int height = 640;
	private int width = 640;
	
	//class variables - booleans
	private boolean fullScreen = true;
	private boolean borderless = false;
	private boolean windowed = false;
	private boolean visible = true;
	private boolean open = false;

	
	MainMenuScreen(){
	}
	//sets
	public void setResolution(int HT, int WD) {
		height = HT;
		width = WD;
	}
	public void setVisibility(boolean VS) {
		visible = VS;
	}
	public void setOpen(boolean OP) {
		open = OP;
	}
	//gets
	public boolean getOpen() {
		return open;
	}
	public void createMainFrame() {
		//JFrame settings 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(width,height);
		this.setVisible(visible);
		this.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}