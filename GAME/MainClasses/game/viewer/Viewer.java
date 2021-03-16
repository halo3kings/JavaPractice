package game.viewer;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Viewer extends Base {
	public static int RoomLevel = 0;
	public static int PlayerHUD = 1;
	public static int Enemies = 2;
	public static int PlayerMenues = 3;
	public static int AdditionalOverlay = 4;
		
	JLayeredPane GameScreen = new JLayeredPane();
	
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
		PlayerHud PHUD;
		
		
		
	
	public void initRooms(int WD, int HT) {
		//Initializing all the rooms.
		
		// this method initializes all the rooms when called. when invoked the room instancing is finished and passed 
		// a height an width to construct from. next the Frame has added to it the newly created room. The room is then
		// set invisible until the time comes. Theoretically the Visibility can be removed and all changed within their 
		// respective rooms. however this makes for an easy quick edit.
		
		GameScreen.setBounds(0,0,WD,HT);
		GameScreen.setOpaque(true);
		GameScreen.setLayout(null);
		GameScreen.setVisible(true);
		
		//Room Elements
		System.out.println("Initializing MainMenu ");
		MMS = new MainMenuScreen(WD,HT);
		GameScreen.add(MMS.getMainMenu(),Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Front porch ");
		FP = new FrontPorch(WD,HT);
		GameScreen.add(FP.getFrontPorch(),Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Garage ");
		GRG = new Garage(WD,HT);
		GameScreen.add(GRG.getGarage(),Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing HallWay");
		HW = new Hallway(WD,HT);
		GameScreen.add(HW.getHallWay(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Lounge");
		LG = new Lounge(WD,HT);
		GameScreen.add(LG.getLounge(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Green House");
		GH =  new GreenHouse(WD,HT);
		GameScreen.add(GH.getGreenHouse(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Library");
		LB = new Library(WD,HT);
		GameScreen.add(LB.getLibrary(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing PoolHall");
		PH = new PoolHall(WD,HT);
		GameScreen.add(PH.getPoolHall(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Kitchen");
		KT = new Kitchen(WD,HT);
		GameScreen.add(KT.getKitchen(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Dining Room");
		DR = new DiningRoom(WD,HT);
		GameScreen.add(DR.getDiningRoom(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Second Floor Hall");
		SH = new secondHall(WD,HT);
		GameScreen.add(SH.getsecondHall(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Study");
		SD = new Study(WD,HT);
		GameScreen.add(SD.getStudy(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Office");
		OF = new Office(WD,HT);
		GameScreen.add(OF.getOffice(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing GuestRoom1");
		GR1 = new GuestRoom1(WD,HT);
		GameScreen.add(GR1.getGuestRoom1(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing GuestRoom1");
		GR2 = new GuestRoom2(WD,HT);
		GameScreen.add(GR2.getGuestRoom2(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Third Hall");
		TH = new ThirdHall(WD,HT);
		GameScreen.add(TH.getThirdHall(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing MasterBedroom");
		MB = new MasterBedroom(WD,HT);
		GameScreen.add(MB.getMasterBedroom(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Painters Studio");
		PS = new PaintersStudio(WD,HT);
		GameScreen.add(PS.getPaintersStudio(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Antiques Room");
		AR = new AntiquesRoom(WD,HT);
		GameScreen.add(AR.getAntiquesRoom(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Antiques Room");
		AR2 = new AntiquesRoom2(WD,HT);
		GameScreen.add(AR2.getAntiquesRoom2(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Antiques Room");
		AT = new Attic(WD,HT);
		GameScreen.add(AT.getAttic(), Integer.valueOf(RoomLevel));
		
		System.out.println("Initializing Antiques Room");
		ATR = new AtticRoom(WD,HT);
		GameScreen.add(ATR.getAtticRoom(), Integer.valueOf(RoomLevel));
		
		//Enemy elements
		
		//Player HUD elements
		System.out.println("Initializing Inventory Screen");
		IS = new InventoryScreen(WD,HT);
		GameScreen.add(IS.getInventoryScreen(),Integer.valueOf(PlayerHUD));
		
		System.out.println("Initializing PlayerHud");
		PHUD = new PlayerHud(WD,HT);
		GameScreen.add(PHUD.getPlayerHud(),Integer.valueOf(PlayerHUD));
		
		AllLayersVisibleSate(false);
		this.Frame.add(GameScreen);	
		
			
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
	public void PlayerHud(boolean Visible) {
		PHUD.getPlayerHud().setVisible(Visible);
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
	public PlayerHud getPlayersHud() {
		return PHUD;
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
	public void AllLayersVisibleSate(boolean Visible) {
		this.FrontPorch(Visible);
		this.Garage(Visible);
		this.Hallway(Visible);
		this.Lounge(Visible);
		this.GreenHouse(Visible);
		this.DiningRoom(Visible);
		this.Kitchen(Visible);
		this.PoolHall(Visible);
		this.Library(Visible);
		this.SecondHall(Visible);
		this.Office(Visible);
		this.GuestRoom2(Visible);
		this.GuestRoom1(Visible);
		this.Study(Visible);
		this.ThirdHall(Visible);
		this.PaintersStudio(Visible);
		this.MasterBedroom(Visible);
		this.AntiquesRoom(Visible);
		this.Attic(Visible);
		this.AtticRoom(Visible);
		this.InventoryScreen(Visible);
		this.PlayerHud(Visible);
	}
	public void refreshCurrentPane(int desiredRoom) {
		switch(desiredRoom)	{		
		case 1:this.FrontPorch(false);
			   this.FrontPorch(true);
		break;
		case 2:this.Garage(false);
			   this.Garage(true);
		break;
		case 3:this.Hallway(false);
			   this.Hallway(true);
		break;
		case 4:this.Lounge(false);
			   this.Lounge(true);
		break;
		case 5:this.GreenHouse(false);
			   this.GreenHouse(true);
		break;
		case 6:this.DiningRoom(false);
			   this.DiningRoom(true);
		break;
		case 7:this.Kitchen(false);
			   this.Kitchen(true);
		break;
		case 8:this.PoolHall(false);
			   this.PoolHall(true);
		break;
		case 9:this.Library(false);
	   		   this.Library(true);
		break;
		case 10:this.SecondHall(false);
			    this.SecondHall(true);
		break;
		case 11:this.Office(false);
			    this.Office(true);
		break;
		case 12:this.GuestRoom2(false);
			    this.GuestRoom2(true);
		break;
		case 13:this.GuestRoom1(false);
				this.GuestRoom1(true);
		break;
		case 14:this.Study(false);
				this.Study(true);
		break;
		case 15:this.ThirdHall(false);
				this.ThirdHall(true);
		break;
		case 16:this.PaintersStudio(false);
				this.PaintersStudio(true);
		break;
		case 17:this.MasterBedroom(false);
				this.MasterBedroom(true);
		break;
		case 18:this.AntiquesRoom(false);
				this.AntiquesRoom(true);
		break;
		case 19:this.AntiquesRoom2(false);
				this.AntiquesRoom2(true);
		break;
		case 20:this.Attic(false);
				this.Attic(true);
		break;
		case 21:this.AtticRoom(false);
				this.AtticRoom(true);
		break;
		}
		}
	public void closeCurrentPane(int desiredRoom) {
		switch(desiredRoom)	{		
		case 1:this.FrontPorch(false);
		break;
		case 2:this.Garage(false);
		break;
		case 3:this.Hallway(false);
		break;
		case 4:this.Lounge(false);
		break;
		case 5:this.GreenHouse(false);
		break;
		case 6:this.DiningRoom(false);
		break;
		case 7:this.Kitchen(false);
		break;
		case 8:this.PoolHall(false);
		break;
		case 9:this.Library(false);
		break;
		case 10:this.SecondHall(false);
		break;
		case 11:this.Office(false);
		break;
		case 12:this.GuestRoom2(false);
		break;
		case 13:this.GuestRoom1(false);
		break;
		case 14:this.Study(false);
		break;
		case 15:this.ThirdHall(false);
		break;
		case 16:this.PaintersStudio(false);
		break;
		case 17:this.MasterBedroom(false);
		break;
		case 18:this.AntiquesRoom(false);
		break;
		case 19:this.AntiquesRoom2(false);
		break;
		case 20:this.Attic(false);
		break;
		case 21:this.AtticRoom(false);
		break;
		}
	}
	public void openASpecificPane(int desiredRoom) {
		switch(desiredRoom)	{		
		case 1:this.FrontPorch(true);
		break;
		case 2:this.Garage(true);
		break;
		case 3:this.Hallway(true);
		break;
		case 4:this.Lounge(true);
		break;
		case 5:this.GreenHouse(true);
		break;
		case 6:this.DiningRoom(true);
		break;
		case 7:this.Kitchen(true);
		break;
		case 8:this.PoolHall(true);
		break;
		case 9:this.Library(true);
		break;
		case 10:this.SecondHall(true);
		break;
		case 11:this.Office(true);
		break;
		case 12:this.GuestRoom2(true);
		break;
		case 13:this.GuestRoom1(true);
		break;
		case 14:this.Study(true);
		break;
		case 15:this.ThirdHall(true);
		break;
		case 16:this.PaintersStudio(true);
		break;
		case 17:this.MasterBedroom(true);
		break;
		case 18:this.AntiquesRoom(true);
		break;
		case 19:this.AntiquesRoom2(true);
		break;
		case 20:this.Attic(true);
		break;
		case 21:this.AtticRoom(true);
		break;
		}
	}
	
}

	
	

