package Practice;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class StartScreen extends Base  {
	
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

	StartScreen(int W, int H) {
		super(W, H);
		this.setStartScreen();
		Frame.add(StartScreen);
		this.createRoom();
	}
	//sets
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
		//Border-less window 
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
	public void setButtonStart(JButton start) {
		this.Start = start;
	}
	public void setButtonQuit(JButton quit) {
		this.Quit = quit;
	}
	public void setButtonOption(JButton option) {
		this.Options = option;
	}
	public void setButtonCredits(JButton credits) {
		this.Credits = credits;
	}
	public void setButtonBBCredits(JButton bbcredits) {
		this.BBCredits = bbcredits;
	}
	public void setButtonBBOptions(JButton bboptions) {
		this.BBOptions = bboptions;
	}
	//gets
	public JButton getButtonStart() {
		return Start;
	}
	public JButton getButtonQuit() {
		return Quit;
	}
	public JButton getButtonOptions() {
		return Options;
	}
	public JButton getButtonCredits() {
		return Credits;
	}
	public JButton getButtonBBCredits() {
		return BBCredits;
	}
	public JButton getButtonBBoptions() {
		return BBOptions;
	}

}
