package game.viewer;

public class Viewer {
	private int GameH;
	private int GameW;
	PreLaunchScreen PLS = new PreLaunchScreen(510,440);
	MainMenuScreen MMS;
	
	public void createMainMenuScreen(int WD, int HT) {
		MMS = new MainMenuScreen(WD,HT);
		MMS.createMainMenuScreen();
	}
	public PreLaunchScreen getPLS() {
		return PLS;
	}
	public MainMenuScreen getMMS() {
		return MMS;
	}
	
	
	}
	
	

