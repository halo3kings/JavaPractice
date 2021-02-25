package game.viewer;

public class Viewer extends Base {
	
	public Viewer(int W, int H) {
		super(W, H);
		PLS = new PreLaunchScreen();
		this.Frame.add(PLS.getPreLaunchScreen());
	}
	
	PreLaunchScreen PLS;
	MainMenuScreen MMS;
	FrontPorch FP;
	Garage GRG;
	Hallway HW;
	
	public void initRooms(int WD, int HT) {
		
		System.out.println("initializing MainMenu ");
		MMS = new MainMenuScreen(WD,HT);
		this.Frame.add(MMS.getMainMenu());
		MMS.getMainMenu().setVisible(false);
		
		System.out.println("initializing Front porch ");
		FP = new FrontPorch(WD,HT);
		this.Frame.add(FP.getFrontPorch());
		FP.getFrontPorch().setVisible(false);
		
		System.out.println("initializing Garage ");
		GRG = new Garage(WD,HT);
		this.Frame.add(GRG.getGarage());
		GRG.getGarage().setVisible(false);
		
		System.out.println("initializing HallWay");
		HW = new Hallway(WD,HT);
		this.Frame.add(HW.getHallWay());
		HW.getHallWay().setVisible(false);
		
	}
	public void MainMenuScreen(boolean Visible) {
		MMS.getMainMenu().setVisible(Visible);
	}
	public void PreLaunchScreen(boolean Visible) {
		PLS.getPreLaunchScreen().setVisible(Visible);	
	}
	public void FrontPorch(boolean Visible) {
		FP.getFrontPorch().setVisible(Visible);
	}
	public void Garage(boolean Visible) {
		GRG.getGarage().setVisible(Visible);
	}
	public void Hallway(boolean Visible ) {
		HW.getHallWay().setVisible(Visible);
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
	public Garage getGarage() {
		return GRG;
	}
	public Hallway getHallway() {
		return HW;
	}
	public void updateWindow(int Width, int Height) {
		Frame.setSize(Width, Height);		
		Frame.setVisible(false);
		Frame.setVisible(true);
	}
	
	
	}
	
	

