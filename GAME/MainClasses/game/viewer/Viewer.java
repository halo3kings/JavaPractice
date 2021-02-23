package game.viewer;

public class Viewer extends Base {
	
	public Viewer(int W, int H) {
		super(W, H);
	
	}
	
	PreLaunchScreen PLS = new PreLaunchScreen();
	MainMenuScreen MMS;
	FrontPorch FP;
	
	public void createMainMenuScreen(int WD, int HT) {
		MMS = new MainMenuScreen(WD,HT);
		this.Frame.add(MMS.getMainMenu());
	}
	public void createPreLaunchScreen() {
		this.Frame.add(PLS.getPreLaunchScreen());
	}
	public void createFrontPorch(int WD, int HT) {
		System.out.println("Creating FrontPorch");
		FP = new FrontPorch(WD,HT);
		System.out.println("Adding created front porch");
		this.Frame.add(FP.getFrontPorch());
	}
	public PreLaunchScreen getPLS() {
		return PLS;
	}
	public MainMenuScreen getMMS() {
		return MMS;
	}
	public FrontPorch getFP() {
		return FP;
	}
	
	
	}
	
	

