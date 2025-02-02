package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class StartScreen extends JFrame implements ActionListener {
	//Constants
	private static int BUTTON_WIDTH = 80;
	private static int BUTTON_HEIGHT = 40;
	private static int CHECKBOX_WIDTH = 150;
	private static int CHECKBOX_HEIGHT = 25;
	
	//class variables - integers
	private int gameResolutionWidth = 0;
	private int gameResolutionHeight = 0;
	
	//class variables - booleans
	private boolean fullScreen = true;
	private boolean borderless = false;
	private boolean windowed = false;
	private boolean visible = true;

	//Button instancing
	JButton Start = new JButton("Start");
	JButton Quit = new JButton("Quit");
	JButton Options = new JButton("Options");
	JButton Credits = new JButton("Credits");
	JButton BBCredits = new JButton("Back");
	JButton BBOptions = new JButton("Back");
	
	//Radio Button
	JRadioButton Res1 = new JRadioButton("640x480");
	JRadioButton Res2 = new JRadioButton("1280x720");
	JRadioButton Res3 = new JRadioButton("1920x1080");
	
	//Button groups 
	ButtonGroup GroupRes = new ButtonGroup();
	ButtonGroup GroupWindow = new ButtonGroup();
	
	//Image instancing
	ImageIcon image = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\V3\\V3\\src\\practice\\mansion.png");
	
	//Label instancing
	JLabel imageLabel = new JLabel();
	JLabel creditText = new  JLabel("Developer: Austin Tyler");
	
	//Check boxes
	JCheckBox win4 = new JCheckBox("Full Screen");
	JCheckBox win5 = new JCheckBox("Windowed");
	JCheckBox win6 = new JCheckBox("Borderless Window");

	StartScreen(){
		
	}
	
		public void createStartScreen(){
			
		//Labels----
			//Image Labels 
		imageLabel.setIcon(image);
		imageLabel.setBounds(10,10,image.getIconWidth(),image.getIconHeight());
		imageLabel.setVisible(true);
			//Text Labels 
		creditText.setBounds(10, 10, 150 , 25);
		creditText.setVisible(false);
		
		//Radio Button----
		GroupRes.add(Res1);
		GroupRes.add(Res2);
		GroupRes.add(Res3);
			//640x480 
		Res1.setBounds(10, 10,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		Res1.setVisible(false);
		Res1.addActionListener(this);
			//1280x720 
		Res2.setBounds(10, 35,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		Res2.setVisible(false);
		Res2.addActionListener(this);
			//1920x1080 
		Res3.setBounds(10, 60,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		Res3.setVisible(false);
		Res3.addActionListener(this);
		
		//checkBoxes for resolution----
		GroupWindow.add(win4);
		GroupWindow.add(win5);
		GroupWindow.add(win6);
			//FullScreen 
		win4.setBounds(10, 85,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		win4.setVisible(false);
		win4.addActionListener(this);
			//Border-less window 
		win5.setBounds(10, 110,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		win5.setVisible(false);
		win5.addActionListener(this);
			//windowed  
		win6.setBounds(10, 135,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		win6.setVisible(false);
		win6.addActionListener(this);

		//Start Button Data----
		Start.setBounds(20, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
		Start.setFocusable(false);
		Start.addActionListener(this);
		Start.setVisible(true);
		
		//Quit Button Data----
		Quit.setBounds(320, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
		Quit.setFocusable(false);
		Quit.addActionListener(this);
		Quit.setVisible(true);
		
		//Option Button Data----
		Options.setBounds(220, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
		Options.setFocusable(false);
		Options.addActionListener(this);
		Options.setVisible(true);
		
		//Credit Button Data----
		Credits.setBounds(120, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
		Credits.setFocusable(false);
		Credits.addActionListener(this);
		Credits.setVisible(true);
		
		//Credit BackButton Data----
		BBCredits.setBounds(320, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
		BBCredits.setFocusable(false);
		BBCredits.addActionListener(this);
		BBCredits.setVisible(false);
		
		//Options BackButton Data----
		BBOptions.setBounds(330, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
		BBOptions.setFocusable(false);
		BBOptions.addActionListener(this);
		BBOptions.setVisible(false);
		
		//add Labels 
		this.add(imageLabel);
		this.add(creditText);

		//add buttons 
		this.add(BBCredits);
		this.add(BBOptions);
		this.add(Start);
		this.add(Quit);
		this.add(Options);
		this.add(Credits);
		
		//add check boxes 
		this.add(Res1);
		this.add(Res2);
		this.add(Res3);
		this.add(win4);
		this.add(win5);
		this.add(win6);
		
		//JFrame settings 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(440,510);
		this.setVisible(visible);
		this.setResizable(false);

	}
		//sets 
		public void setResolution(int RSW,int RSH) {
			gameResolutionWidth = RSW;
			gameResolutionHeight = RSH;
		}
		public void setFullScreen(boolean FS) {
			fullScreen = FS;
			borderless = false;
			windowed = false;
		}
		public void setBorderless(boolean BS) {
			fullScreen = false;
			borderless = BS;
			windowed = false;
		}
		public void setWindowed(boolean WD) {
			fullScreen = false;
			borderless = false;
			windowed = WD;
		}
		public void setVisiblilty(boolean VS) {
			visible = VS;
		}
		
		//gets 
		public int getResolutionWidth() {
			return gameResolutionWidth;
		}
		
		public int getResolutionHeight() {
			return gameResolutionHeight;
		}
		public String getWindowType() {
			
			if(fullScreen == true) {
				String FS = "fullScreen";
				return FS;
			}
			if(borderless == true) {
				String BD = "borderless";
				return BD;
			}
			if(windowed == true) {
				String WD = "windowed";
				return WD;
			}
			
			return "error";
		}
		public boolean getVisibility() {
			return visible;
		}
		
		//says 
		public void sayResolution() {
			System.out.println("Width: "+ gameResolutionWidth + " Height: "+ gameResolutionHeight);
		}
		public void sayWindowType() {
			System.out.println(this.getWindowType());
		}
		
	@Override
	public void actionPerformed(ActionEvent e) { // all the button actions are listed below
		if(e.getSource() == Start) {
			System.out.println("Flaged in Start Screen");
		}
		if(e.getSource() == Quit) {
			this.dispose();
			System.out.println("TESTQuiting...");
		}
		if(e.getSource() == Res1) {
			this.setResolution(640,480);
			this.sayResolution();
		}
		if(e.getSource() == Res2) {
			this.setResolution(1280,720);
			this.sayResolution();
		}
		if(e.getSource() == Res3) {
			this.setResolution(1920,1080);
			this.sayResolution();
		}
		if(e.getSource() == win4) {
			this.setFullScreen(true);
			this.sayWindowType();
		}
		if(e.getSource() == win5) {
			this.setBorderless(true);
			this.sayWindowType();
		}
		if(e.getSource() == win6) {
			this.setWindowed(true);
			this.sayWindowType();
		}
		
		if(e.getSource() == Options) {
			System.out.println("Changing for options...");
			//back button to menu visible
			BBOptions.setVisible(true);
			
			//game image made invisible
			imageLabel.setVisible(false);
			
			//menu buttons made invisible 
			Options.setVisible(false);
			Quit.setVisible(false);
			Credits.setVisible(false);
			Quit.setVisible(false);
			Start.setVisible(false);
			
			//the option check boxes made visible and made to no longer work if one of the resolutions is true. then refresh the frame
			Res1.setVisible(true);		
			Res2.setVisible(true);
			Res3.setVisible(true);
			win4.setVisible(true);
			win5.setVisible(true);
			win6.setVisible(true);
			
		}
		if(e.getSource() == Credits) {
			System.out.println("Changing to credits...");
			//credits and back button are visible
			creditText.setVisible(true);
			BBCredits.setVisible(true);
			
			//game image made invisible
			imageLabel.setVisible(false);
			
			//menu buttons made invisible 
			Options.setVisible(false);
			Quit.setVisible(false);
			Credits.setVisible(false);
			Quit.setVisible(false);
			Start.setVisible(false);
			
		}
		if(e.getSource() == BBOptions) {
			System.out.println("Changing to menu...");
			//menu image changes back to visible
			imageLabel.setVisible(true);
			//all menu buttons change back to visible 
			Options.setVisible(true);
			Quit.setVisible(true);
			Credits.setVisible(true);
			Quit.setVisible(true);
			Start.setVisible(true);
			//all option buttons set to  false
			Res1.setVisible(false);
			Res2.setVisible(false);
			Res3.setVisible(false);
			win4.setVisible(false);
			win5.setVisible(false);
			win6.setVisible(false);
			BBOptions.setVisible(false);

		}
		if(e.getSource() == BBCredits) {
			System.out.println("Changing to menu...");
			//credit text and credit back button set to invisible 
			creditText.setVisible(false);
			BBCredits.setVisible(false);
			//menu image set to visible
			imageLabel.setVisible(true);
			//all menu buttons change back to visible 
			Options.setVisible(true);
			Quit.setVisible(true);
			Credits.setVisible(true);
			Quit.setVisible(true);
			Start.setVisible(true);

		}
		
	}

}
