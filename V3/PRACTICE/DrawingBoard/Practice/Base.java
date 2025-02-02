package Practice;

import javax.swing.JFrame;

public class Base {
	//Constants
	private static int BUTTON_WIDTH = 80;
	private static int BUTTON_HEIGHT = 40;
	private static int CHECKBOX_WIDTH = 150;
	private static int CHECKBOX_HEIGHT = 25;
	
	//class variables - integers
	private int FrameWidth;
	private int FrameHeight;

	//class variables - booleans
	private boolean fullScreen;
	private boolean borderless;
	private boolean windowed;
	
	JFrame Frame = new JFrame();
	
	Base(int W, int H){
		this.setResolution(W, H);
		this.createRoom();
	}
	
	public void createRoom() {
		//JFrame settings 
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setLayout(null);
		Frame.setSize(FrameHeight,FrameWidth);
		Frame.setVisible(true);
		Frame.setResizable(false);

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
	//gets
	public int getWidth() {
		return FrameWidth;
	}	
	public int getHeight() {
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
	//says
	public void sayResolution() {
		System.out.println("Width: "+ FrameWidth + " Height: "+ FrameHeight);
	}
	public void sayWindowType() {
		System.out.println(this.getWindowType());
	}





}
