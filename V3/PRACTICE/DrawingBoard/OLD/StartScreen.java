package OLD;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class StartScreen extends JFrame implements ActionListener {
	//helloGithub
	//_______________________________________________________________________________________________________________OLD
	//Constants
	private static int BUTTON_WIDTH = 80;
	private static int BUTTON_HEIGHT = 40;
	private static int CHECKBOX_WIDTH = 150;
	private static int CHECKBOX_HEIGHT = 25;
	
	//class variables - integers
	private int FrameWidth;
	private int FrameHeight;
	
	//class variables - booleans
	private boolean fullScreen = true;
	private boolean borderless = false;
	private boolean windowed = false;
	private boolean open = false;
	private boolean visible = true;
	
	//Panel instancing
	JPanel StartScreen = new JPanel();
		JPanel SSMenu = new JPanel();
		JPanel SSOptions = new JPanel();
		JPanel SSCredits = new JPanel();
		
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
	ImageIcon image = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\Assets\\mansion.png");
	
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
			
			this.setStartScreen();
			
			//JFrame settings 
			this.add(StartScreen);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			this.setSize(440,510);
			this.setVisible(true);
			this.setResizable(false);

	}

		//sets 
		public void setResolution(int Width,int Height) {
			FrameWidth = Width;
			FrameHeight = Height;
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
		public void setOpen(boolean OP) {
			open = OP;
		}
		public void setVisiblity(boolean VS) {
			visible = VS;
		}
		public void setSettings() {
			//setting the resolution on going back to menu
			if(Res1.isSelected()) {
				this.setResolution(640,480);
				this.sayResolution();
			}
			if(Res2.isSelected()) {
				this.setResolution(1280,720);
				this.sayResolution();
			}
			if(Res3.isSelected()) {
				this.setResolution(1920,1080);
				this.sayResolution();
			}
			
			//Setting the window type on going back to menu
			if(win4.isSelected()) {
				this.setFullScreen(true);
				this.sayWindowType();
			}
			if(win5.isSelected()) {
				this.setBorderless(true);
				this.sayWindowType();
			}
			if(win6.isSelected()) {
				this.setWindowed(true);
				this.sayWindowType();
			}
		}
		public void setStartScreen() {
			//Labels----
			//Image Labels 
		imageLabel.setIcon(image);
		imageLabel.setBounds(10,10,image.getIconWidth(),image.getIconHeight());
		imageLabel.setVisible(true);
			//Text Labels 
		creditText.setBounds(10, 10, 150 , 25);
		creditText.setVisible(true);
		
		//Radio Button----
		GroupRes.add(Res1);
		GroupRes.add(Res2);
		GroupRes.add(Res3);
			//640x480 
		Res1.setBounds(10, 10,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		Res1.setVisible(true);
		Res1.addActionListener(this);
		Res1.setSelected(true);
			//1280x720 
		Res2.setBounds(10, 35,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		Res2.setVisible(true);
		Res2.addActionListener(this);
			//1920x1080 
		Res3.setBounds(10, 60,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		Res3.setVisible(true);
		Res3.addActionListener(this);
		
		//checkBoxes for resolution----
		GroupWindow.add(win4);
		GroupWindow.add(win5);
		GroupWindow.add(win6);
			//FullScreen 
		win4.setBounds(10, 85,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		win4.setVisible(true);
		win4.addActionListener(this);
			//Border-less window 
		win5.setBounds(10, 110,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		win5.setVisible(true);
		win5.addActionListener(this);
			//windowed  
		win6.setBounds(10, 135,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
		win6.setVisible(true);
		win6.addActionListener(this);
		win6.setSelected(true);

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
		BBCredits.setVisible(true);
		
		//Options BackButton Data----
		BBOptions.setBounds(330, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
		BBOptions.setFocusable(false);
		BBOptions.addActionListener(this);
		BBOptions.setVisible(true);
		
		//Panel Building
		StartScreen.setBounds(-10, 0, 440, 510);
		StartScreen.setVisible(true);
		StartScreen.setLayout(null);
		
		StartScreen.add(SSMenu);
			SSMenu.setBounds(0, 0, 440, 510);
			SSMenu.setVisible(true);
			SSMenu.add(imageLabel);
			SSMenu.add(Start);
			SSMenu.add(Options);
			SSMenu.add(Credits);
			SSMenu.add(Quit);
		
		StartScreen.add(SSOptions);
			SSOptions.setBounds(0, 0, 440, 510);
			SSOptions.setVisible(false);
			SSOptions.setLayout(null);
			SSOptions.add(Res1);
			SSOptions.add(Res2);
			SSOptions.add(Res3);
			SSOptions.add(win4);
			SSOptions.add(win5);
			SSOptions.add(win6);
			SSOptions.add(BBOptions);
			
		StartScreen.add(SSCredits);
			SSCredits.setBounds(0, 0, 440, 510);
			SSCredits.setVisible(false);
			SSCredits.setLayout(null);
			SSCredits.add(BBCredits);
			SSCredits.add(creditText);
		}
		//gets 
		public int getResolutionWidth() {
			return FrameWidth;
		}	
		public int getResolutionHeight() {
			return FrameHeight;
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
		public boolean getOpen() {
			return open;
		}
		public boolean getVisiblilty() {
			return visible;
		}
		//says 
		public void sayResolution() {
			System.out.println("Width: "+ FrameWidth + " Height: "+ FrameHeight);
		}
		public void sayWindowType() {
			System.out.println(this.getWindowType());
		}
		//Button sets 
		public void setStartButton(JButton ST) {
			Start = ST;
		}
		public void setQuit(JButton QT) {
			Quit = QT;
		}
		public void setOptions(JButton OP) {
			Options = OP;
		}
		public void setCredits(JButton CD) {
			Credits = CD;
		}
		public void setBBCredits(JButton BC) {
			BBCredits = BC;
		}
		public void setBBOptions(JButton BO) {
			BBOptions = BO;
		}
		//Button gets
		public JButton getStart() {
			return Start;
		}
		public JButton getQuit() {
			return Quit;
		}
		public JButton getOptions() {
			return Options;
		}
		public JButton getCredits() {
			return Credits;
		}
		public JButton getBBCredits() {
			return BBCredits;
		}
		public JButton getBBOptions() {
			return BBOptions;
		}
		
	@Override
	public void actionPerformed(ActionEvent e) { // all the button actions are listed below
		if(e.getSource() == Start) {
			this.setSettings();
			StartScreen.setVisible(false);
			//this.createMainMenu();
			System.out.println("Starting...");
		}
		if(e.getSource() == Quit) {
			this.dispose();
			System.out.println("Quiting...");
		}
		if(e.getSource() == Options) {
			System.out.println("Changing for options...");
			SSOptions.setVisible(true);
			SSMenu.setVisible(false);
		}
		if(e.getSource() == Credits) {
			System.out.println("Changing to credits...");
			SSCredits.setVisible(true);
			SSMenu.setVisible(false);
		}
		if(e.getSource() == BBOptions) {
			System.out.println("Changing to menu...");
			SSOptions.setVisible(false);
			SSMenu.setVisible(true);
		}
		if(e.getSource() == BBCredits) {
			System.out.println("Changing to menu...");
			SSCredits.setVisible(false);
			SSMenu.setVisible(true);

		}
		
	}

}
