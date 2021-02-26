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
	Lounge LG;
	GreenHouse GH;
	Library LB;
	PoolHall PH;
	Kitchen KT;
	DiningRoom DR;
	
	public void initRooms(int WD, int HT) {
		//Initializing all the rooms.
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
		
		System.out.println("Initializing Lounge");
		LG = new Lounge(WD,HT);
		this.Frame.add(LG.getLounge());
		LG.getLounge().setVisible(false);
		
		System.out.println("Initializing Green House");
		GH =  new GreenHouse(WD,HT);
		this.Frame.add(GH.getGreenHouse());
		GH.getGreenHouse().setVisible(false);
		
		System.out.println("Initializing Library");
		LB = new Library(WD,HT);
		this.Frame.add(LB.getLibrary());
		LB.getLibrary().setVisible(false);
		
		System.out.println("Initializing PoolHall");
		PH = new PoolHall(WD,HT);
		this.Frame.add(PH.getPoolHall());
		PH.getPoolHall().setVisible(false);
		
		System.out.println("Initializing Kitchen");
		KT = new Kitchen(WD,HT);
		this.Frame.add(KT.getKitchen());
		KT.getKitchen().setVisible(false);
		
		System.out.println("Initializing Dining Room");
		DR = new DiningRoom(WD,HT);
		this.Frame.add(DR.getDiningRoom());
		DR.getDiningRoom().setVisible(false);
		
	}
	//calling the rooms to be visible or not.
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
	public void Lounge(boolean Visible) {
		LG.getLounge().setVisible(Visible);
	}
	public void GreenHouse(boolean Visible) {
		GH.getGreenHouse().setVisible(Visible);
	}
	public void Library(boolean Visible) {
		LB.getLibrary().setVisible(Visible);
	}
	public void PoolHall(boolean Visible) {
		PH.getPoolHall().setVisible(Visible);
	}
	public void Kitchen(boolean Visible) {
		KT.getKitchen().setVisible(Visible);
	}
	public void DiningRoom(boolean Visible) {
		DR.getDiningRoom().setVisible(Visible);
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
	public Lounge getLounge() {
		return LG;
	}
	public GreenHouse getGreenHouse() {
		return GH;
	}
	public Library getLibrary() {
		return LB;
	}
	public PoolHall getPoolHall() {
		return PH;
	}
	public Kitchen getKitchen() {
		return KT;
	}
	public DiningRoom getDiningRoom() {
		return DR;
	}
	
	public void updateWindow(int Width, int Height) {
		Frame.setSize(Width, Height);		
		Frame.setVisible(false);
		Frame.setVisible(true);
	}
	
	
	}
	
	

