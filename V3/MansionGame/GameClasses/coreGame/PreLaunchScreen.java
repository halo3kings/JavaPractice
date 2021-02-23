package coreGame;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PreLaunchScreen extends Base  {
	
	//Panel instancing
	JPanel PreLaunchScreen = new JPanel();
		JPanel PLSMenu = new JPanel();
		JPanel PLSOptions = new JPanel();
		JPanel PLSCredits = new JPanel();
		
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
	ImageIcon image = new ImageIcon("C:\\Users\\austi\\OneDrive\\Desktop\\Programming stuff\\JavaPractice\\APLSets\\mansion.png");
	
	//Label instancing
	JLabel imageLabel = new JLabel();
	JLabel creditText = new  JLabel("Developer: Austin Tyler");
	
	//Check boxes
	JCheckBox win4 = new JCheckBox("Full Screen");
	JCheckBox win5 = new JCheckBox("Windowed");
	JCheckBox win6 = new JCheckBox("BorderlePLS Window");

	PreLaunchScreen(int W, int H) {
		super(W, H);
	}
	public void createPreLaunchScreen() {
		this.setPreLaunchScreen();
		Frame.add(PreLaunchScreen);
		this.setVisibility(true);
		this.createWindow();
	}
	//sets
	public void setPreLaunchScreen() {
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
	Res1.setBounds(10, 10,getCheckBoxW(),getCheckBoxH());
	Res1.setVisible(true);
	Res1.setSelected(true);
		//1280x720 
	Res2.setBounds(10, 35,getCheckBoxW(),getCheckBoxH());
	Res2.setVisible(true);
		//1920x1080 
	Res3.setBounds(10, 60,getCheckBoxW(),getCheckBoxH());
	Res3.setVisible(true);
	
	//checkBoxes for resolution----
	GroupWindow.add(win4);
	GroupWindow.add(win5);
	GroupWindow.add(win6);
		//FullScreen 
	win4.setBounds(10, 85,getCheckBoxW(),getCheckBoxH());
	win4.setVisible(true);
		//Border-lePLS window 
	win5.setBounds(10, 110,getCheckBoxW(),getCheckBoxH());
	win5.setVisible(true);
		//windowed  
	win6.setBounds(10, 135,getCheckBoxW(),getCheckBoxH());
	win6.setVisible(true);
	win6.setSelected(true);

	//Start Button Data----
	Start.setBounds(20, 420, getButtonW(), getButtonH());
	Start.setFocusable(false);
	Start.setVisible(true);
	
	//Quit Button Data----
	Quit.setBounds(320, 420, getButtonW(), getButtonH());
	Quit.setFocusable(false);
	Quit.setVisible(true);
	
	//Option Button Data----
	Options.setBounds(220, 420, getButtonW(), getButtonH());
	Options.setFocusable(false);
	Options.setVisible(true);
	
	//Credit Button Data----
	Credits.setBounds(120, 420, getButtonW(), getButtonH());
	Credits.setFocusable(false);
	Credits.setVisible(true);
	
	//Credit BackButton Data----
	BBCredits.setBounds(320, 420, getButtonW(), getButtonH());
	BBCredits.setFocusable(false);
	BBCredits.setVisible(true);
	
	//Options BackButton Data----
	BBOptions.setBounds(330, 420, getButtonW(), getButtonH());
	BBOptions.setFocusable(false);
	BBOptions.setVisible(true);
	
	//Panel Building
	PreLaunchScreen.setBounds(-10, 0, 440, 510);
	PreLaunchScreen.setVisible(true);
	PreLaunchScreen.setLayout(null);
	
	PreLaunchScreen.add(PLSMenu);
		PLSMenu.setBounds(0, 0, 440, 510);
		PLSMenu.setVisible(true);
		PLSMenu.add(imageLabel);
		PLSMenu.add(Start);
		PLSMenu.add(Options);
		PLSMenu.add(Credits);
		PLSMenu.add(Quit);
	
	PreLaunchScreen.add(PLSOptions);
		PLSOptions.setBounds(0, 0, 440, 510);
		PLSOptions.setVisible(false);
		PLSOptions.setLayout(null);
		PLSOptions.add(Res1);
		PLSOptions.add(Res2);
		PLSOptions.add(Res3);
		PLSOptions.add(win4);
		PLSOptions.add(win5);
		PLSOptions.add(win6);
		PLSOptions.add(BBOptions);
		
	PreLaunchScreen.add(PLSCredits);
		PLSCredits.setBounds(0, 0, 440, 510);
		PLSCredits.setVisible(false);
		PLSCredits.setLayout(null);
		PLSCredits.add(BBCredits);
		PLSCredits.add(creditText);
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
	
}
