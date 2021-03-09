package game.viewer;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Viewer extends Base {
	public static int RoomLevel = 0;
	public static int Enemies = 1;
	public static int PlayerHUD = 2;
	public static int AdditionalOverlay = 3;
	public static int AdditionalOverlay1 = 4;
	
	public Viewer(int W, int H) {
		super(W, H);
		PLS = new PreLaunchScreen();
		this.Frame.add(PLS.getPreLaunchScreen());
		
	}
	
	// This is a list of instanced rooms for the viewer to then work with.
	
	//First Floor
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
	//Second Floor
		secondHall SH;
		Study SD;
		Office OF;
		GuestRoom1 GR1;
		GuestRoom2 GR2;
	//Third floor
		ThirdHall TH;
		MasterBedroom MB;
		PaintersStudio PS;
		AntiquesRoom AR;
		AntiquesRoom2 AR2;
	//Attic
		Attic AT;
		AtticRoom ATR;
	//In game UI
		InventoryScreen IS;
		
		
		
	
	public void initRooms(int WD, int HT) {
		//Initializing all the rooms.
		
		// this method initializes all the rooms when called. when invoked the room instancing is finished and passed 
		// a height an width to construct from. next the Frame has added to it the newly created room. The room is then
		// set invisible until the time comes. Theoretically the Visibility can be removed and all changed within their 
		// respective rooms. however this makes for an easy quick edit.
		
		//Room Elements
		System.out.println("Initializing MainMenu ");
		MMS = new MainMenuScreen(WD,HT);
		this.Frame.add(MMS.getMainMenu());
		
		System.out.println("Initializing Front porch ");
		FP = new FrontPorch(WD,HT);
		this.Frame.add(FP.getFrontPorch());
		FP.getFrontPorch().setLayer(FP.getFrontPorch(),RoomLevel);
		
		System.out.println("Initializing Garage ");
		GRG = new Garage(WD,HT);
		this.Frame.add(GRG.getGarage());
		GRG.getGarage().setLayer(GRG.getGarage(), RoomLevel);
		
		System.out.println("Initializing HallWay");
		HW = new Hallway(WD,HT);
		this.Frame.add(HW.getHallWay());
		HW.getHallWay().setLayer(HW.getHallWay(), RoomLevel);
		
		System.out.println("Initializing Lounge");
		LG = new Lounge(WD,HT);
		this.Frame.add(LG.getLounge());
		LG.getLounge().setLayer(LG.getLounge(), RoomLevel);
		
		System.out.println("Initializing Green House");
		GH =  new GreenHouse(WD,HT);
		this.Frame.add(GH.getGreenHouse());
		GH.getGreenHouse().setLayer(GH.getGreenHouse(), RoomLevel);
		
		System.out.println("Initializing Library");
		LB = new Library(WD,HT);
		this.Frame.add(LB.getLibrary());
		LB.getLibrary().setLayer(LB.getLibrary(), RoomLevel);
		
		System.out.println("Initializing PoolHall");
		PH = new PoolHall(WD,HT);
		this.Frame.add(PH.getPoolHall());
		PH.getPoolHall().setLayer(PH.getPoolHall(), RoomLevel);
		
		System.out.println("Initializing Kitchen");
		KT = new Kitchen(WD,HT);
		this.Frame.add(KT.getKitchen());
		KT.getKitchen().setLayer(KT.getKitchen(), RoomLevel);
		
		System.out.println("Initializing Dining Room");
		DR = new DiningRoom(WD,HT);
		this.Frame.add(DR.getDiningRoom());
		DR.getDiningRoom().setLayer(DR.getDiningRoom(), RoomLevel);
		
		System.out.println("Initializing Second Floor Hall");
		SH = new secondHall(WD,HT);
		this.Frame.add(SH.getsecondHall());
		SH.getsecondHall().setLayer(SH.getsecondHall(), RoomLevel);
		
		System.out.println("Initializing Study");
		SD = new Study(WD,HT);
		this.Frame.add(SD.getStudy());
		SD.getStudy().setLayer(SD.getStudy(), RoomLevel);
		
		System.out.println("Initializing Office");
		OF = new Office(WD,HT);
		this.Frame.add(OF.getOffice());
		OF.getOffice().setLayer(OF.getOffice(), RoomLevel);
		
		System.out.println("Initializing GuestRoom1");
		GR1 = new GuestRoom1(WD,HT);
		this.Frame.add(GR1.getGuestRoom1());
		GR1.getGuestRoom1().setLayer(GR1.getGuestRoom1(), RoomLevel);
		
		System.out.println("Initializing GuestRoom1");
		GR2 = new GuestRoom2(WD,HT);
		this.Frame.add(GR2.getGuestRoom2());
		GR2.getGuestRoom2().setLayer(GR2.getGuestRoom2(), RoomLevel);
		
		System.out.println("Initializing Third Hall");
		TH = new ThirdHall(WD,HT);
		this.Frame.add(TH.getThirdHall());
		TH.getThirdHall().setLayer(TH.getThirdHall(), RoomLevel);
		
		System.out.println("Initializing MasterBedroom");
		MB = new MasterBedroom(WD,HT);
		this.Frame.add(MB.getMasterBedroom());
		MB.getMasterBedroom().setLayer(MB.getMasterBedroom(), RoomLevel);
		
		System.out.println("Initializing Painters Studio");
		PS = new PaintersStudio(WD,HT);
		this.Frame.add(PS.getPaintersStudio());
		PS.getPaintersStudio().setLayer(PS.getPaintersStudio(), RoomLevel);
		
		System.out.println("Initializing Antiques Room");
		AR = new AntiquesRoom(WD,HT);
		this.Frame.add(AR.getAntiquesRoom());
		AR.getAntiquesRoom().setLayer(AR.getAntiquesRoom(), RoomLevel);
		
		System.out.println("Initializing Antiques Room");
		AR2 = new AntiquesRoom2(WD,HT);
		this.Frame.add(AR2.getAntiquesRoom2());
		AR2.getAntiquesRoom2().setLayer(AR2.getAntiquesRoom2(), RoomLevel);
		
		System.out.println("Initializing Antiques Room");
		AT = new Attic(WD,HT);
		this.Frame.add(AT.getAttic());
		AT.getAttic().setLayer(AT.getAttic(), RoomLevel);
		
		System.out.println("Initializing Antiques Room");
		ATR = new AtticRoom(WD,HT);
		this.Frame.add(ATR.getAtticRoom());
		ATR.getAtticRoom().setLayer(ATR.getAtticRoom(), RoomLevel);
		
		//Enemy elements
		
		//Player HUD elements
		System.out.println("Initializing Inventory Screen");
		IS = new InventoryScreen(WD,HT);
		this.Frame.add(IS.getInventoryScreen());
		IS.getInventoryScreen().setLayer(IS.getInventoryScreen(), PlayerHUD);
		
			
	}
	// The following methods allow for the instanced rooms to be toggled visible through abstraction.
	
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
	public void SecondHall(boolean Visible) {
		SH.getsecondHall().setVisible(Visible);
	}
	public void Study(boolean Visible) {
		SD.getStudy().setVisible(Visible);
	}
	public void Office(boolean Visible) {
		OF.getOffice().setVisible(Visible);
	}
	public void GuestRoom1(boolean Visible) {
		GR1.getGuestRoom1().setVisible(Visible);
	}
	public void GuestRoom2(boolean Visible) {
		GR2.getGuestRoom2().setVisible(Visible);
	}
	public void ThirdHall(boolean Visible) {
		TH.getThirdHall().setVisible(Visible);
	}
	public void MasterBedroom(boolean Visible) {
		MB.getMasterBedroom().setVisible(Visible);
	}
	public void PaintersStudio(boolean Visible) {
		PS.getPaintersStudio().setVisible(Visible);
	}
	public void AntiquesRoom(boolean Visible) {
		AR.getAntiquesRoom().setVisible(Visible);
	}
	public void AntiquesRoom2(boolean Visible) {
		AR2.getAntiquesRoom2().setVisible(Visible);
	}
	public void Attic(boolean Visible) {
		AT.getAttic().setVisible(Visible);
	}
	public void AtticRoom(boolean Visible) {
		ATR.getAtticRoom().setVisible(Visible);
	}
	public void InventoryScreen(boolean Visible) {
		IS.getInventoryScreen().setVisible(Visible);
	}
	
	// These methods allow for a controller or external class easy access to the rooms and their contents. 
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
	public secondHall getSecondHall()  {
		return SH;
	}
	public Study getStudy() {
		return SD;
	}
	public Office getOffice() {
		return OF;
	}
	public GuestRoom1 getGuestRoom1() {
		return GR1;
	}
	public GuestRoom2 getGuestRoom2() {
		return GR2;
	}
	public ThirdHall getThirdHall() {
		return TH;
	}
	public MasterBedroom getMasterBedroom() {
		return MB;
	}
	public PaintersStudio getPaintersStudio() {
		return PS;
	}
	public AntiquesRoom getAntiquesRoom() {
		return AR;
	}
	public AntiquesRoom2 getAntiquesRoom2() {
		return AR2;
	}
	public Attic getAttic() {
		return AT;
	}
	public AtticRoom getAtticRoom() {
		return ATR;
	}
	public InventoryScreen getInventoryScreen() {
		return IS;
	}
			
	// when called this updates the Jframe by resetting its height and turning it invisible, then back to visible.
	public void updateWindow(int Width, int Height) {
		Frame.setSize(Width, Height);		
		Frame.setVisible(false);
		Frame.setVisible(true);
	}
	public void refreshWindow() {		
		Frame.setVisible(false);
		Frame.setVisible(true);
	}
	public void getCurrentRoom(int CurrentRoom) {
		switch(CurrentRoom)	{		
		case 1:this.getFP();
		break;
		case 2:this.getGarage();
		break;
		case 3:this.getHallway();
		break;
		case 4:this.getLounge();
		break;
		case 5:this.getGreenHouse();
		break;
		case 6:this.getDiningRoom();
		break;
		case 7:this.getKitchen();
		break;
		case 8:this.getPoolHall();
		break;
		case 9:this.getLibrary();
		break;
		case 10:this.getSecondHall();
		break;
		case 11:this.getOffice();
		break;
		case 12:this.getGuestRoom2();
		break;
		case 13:this.getGuestRoom1();
		break;
		case 14:this.getStudy();
		break;
		case 15:this.getThirdHall();
		break;
		case 16:this.getPaintersStudio();
		break;
		case 17:this.getMasterBedroom();
		break;
		case 18:this.getAntiquesRoom();
		break;
		case 19:this.getAntiquesRoom2();
		break;
		case 20:this.getAttic();
		break;
		case 21:this.getAtticRoom();
		break;
		}
	}
	
}
	
	

