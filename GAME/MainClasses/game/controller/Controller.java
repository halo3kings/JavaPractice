package game.controller;

import game.model.Model;
import game.viewer.Viewer;

public class Controller{
	Model MODEL = new Model();
	Viewer VIEW;
	boolean Running = true;
	
	public Controller(){
		MODEL.setGameW(440);
		MODEL.setGameH(510);
		System.out.println("Resolution is 440x510");
		
		VIEW = new Viewer(MODEL.getGameW(),MODEL.getGameH());
		System.out.println("creating Viewer");
		
		VIEW.PreLaunchScreen(true);
		System.out.println("creating Pre Launch Screen");
		
		VIEW.getPLS().getMenuPanel().setVisible(false);
		VIEW.getPLS().getMenuPanel().setVisible(true);
		System.out.println("Refreshed preLaunch Screen");
		
		this.setButtonActionEvents_PLS();
		System.out.println("Button Events instanced");
	}
	
	//All the button Action events
	public void setAllButtonEvents() {
		this.setButtonActionEvents_FrontPorch();
		this.setButtonActionEvents_MMS();
		this.setButtonActionEvents_Garage();
		this.setButtonActionEvents_HallWay();
		this.setButtonActionEvents_Lounge();
		this.setButtonActionEvents_GreenHouse();
		this.setButtonActionEvents_Library();
		this.setButtonActionEvents_PoolHall();
		this.setButtonActionEvents_Kitchen();
		this.setButtonActionEvents_DiningRoom();
		
		this.setButtonActionEvents_SecondHall();
		this.setButtonActionEvents_Study();
		this.setButtonActionEvents_Office();
		this.setButtonActionEvents_GuestRoom1();
		this.setButtonActionEvents_GuestRoom2();
		
		this.setButtonActionEvents_ThirdHall();
		this.setButtonActionEvents_MasterBedroom();
		this.setButtonActionEvents_PaintersStudio();
		this.setButtonActionEvents_AntiquesRoom();
		this.setButtonActionEvents_AntiquesRoom2();
		
		this.setButtonActionEvents_Attic();
		this.setButtonActionEvents_AtticRoom();
	}
	public void setButtonActionEvents_PLS() {
		VIEW.getPLS().getStart().addActionListener(e ->this.PLS_StartAction());
		VIEW.getPLS().getOptions().addActionListener(e ->this.PLS_Options());
		VIEW.getPLS().getCredits().addActionListener(e ->this.PLS_Credits());
		VIEW.getPLS().getQuit().addActionListener(e ->this.PLS_Quit());
		VIEW.getPLS().getBBOptions().addActionListener(e ->this.PLS_BBOptions());
		VIEW.getPLS().getBBCredits().addActionListener(e ->this.PLS_BBCredits());
	}
	public void setButtonActionEvents_MMS() {
		VIEW.getMMS().getStartButton().addActionListener(e ->this.MMS_Start());
		VIEW.getMMS().getQuit().addActionListener(e ->this.MMS_Quit());
		VIEW.getMMS().getLoad().addActionListener(e ->this.MMS_Load());
		VIEW.getMMS().getLLoad().addActionListener(e ->this.MMS_LLoad());
		VIEW.getMMS().getLoadBB().addActionListener(e ->this.MMS_LoadBB());
	}
	public void setButtonActionEvents_FrontPorch() {
		VIEW.getFP().getGarage().addActionListener(e ->this.FP_GarageDoor());
		VIEW.getFP().getHallway().addActionListener(e ->this.FP_HallwayDoor());
	}
	public void setButtonActionEvents_Garage() {
		VIEW.getGarage().getFrontPorch().addActionListener(e ->this.Garage_FrontPortch());
	}
	public void setButtonActionEvents_HallWay() {
		VIEW.getHallway().getLounge().addActionListener(e ->this.HallWay_Lounge());
		VIEW.getHallway().getDining().addActionListener(e ->this.HallWay_Dining());
		VIEW.getHallway().getKitchen().addActionListener(e ->this.HallWay_Kitchen());
		VIEW.getHallway().getStairs().addActionListener(e ->this.HallWay_Stairs());
		VIEW.getHallway().getKitchen2().addActionListener(e ->this.HallWay_Kitchen2());
		VIEW.getHallway().getPoolHall().addActionListener(e ->this.HallWay_PoolHall());
		VIEW.getHallway().getLibrary().addActionListener(e ->this.HallWay_Library());
		VIEW.getHallway().getFrontPorch().addActionListener(e ->this.HallWay_FrontPorch());	
	}
	public void setButtonActionEvents_Lounge() {
		VIEW.getLounge().getGreenHouse().addActionListener(e ->this.Lounge_GreenHouse());
		VIEW.getLounge().getHallWay().addActionListener(e ->this.Lounge_HallWay());
	}
	public void setButtonActionEvents_GreenHouse() {
		VIEW.getGreenHouse().getLounge().addActionListener(e ->this.GreenHouse_Lounge());
	}
	public void setButtonActionEvents_Library() {
		VIEW.getLibrary().getHall().addActionListener(e -> this.Library_Hall());
	}
	public void setButtonActionEvents_PoolHall() {
		VIEW.getPoolHall().getHall().addActionListener(e -> this.PoolHall_Hall());
	}
	public void setButtonActionEvents_Kitchen() {
		VIEW.getKitchen().getHall().addActionListener(e -> this.Kitchen_Hall());
		VIEW.getKitchen().getHall2().addActionListener(e -> this.Kitchen_Hall2());
		VIEW.getKitchen().getDiningRoom().addActionListener(e -> this.Kitchen_DiningRoom());
	}
	public void setButtonActionEvents_DiningRoom() {
		VIEW.getDiningRoom().getHall().addActionListener(e -> this.DiningRoom_Hall());
		VIEW.getDiningRoom().getKitchen().addActionListener(e -> this.DiningRoom_Kitchen());
	}
	public void setButtonActionEvents_SecondHall() {
		VIEW.getSecondHall().getHall().addActionListener(e -> this.SecondHall_Hall());
		VIEW.getSecondHall().getGuestRoom1().addActionListener(e -> this.SecondHall_GuestRoom1());
		VIEW.getSecondHall().getGuestRoom2().addActionListener(e -> this.SecondHall_GuestRoom2());
		VIEW.getSecondHall().GetOffice().addActionListener(e -> this.SecondHall_Office());
		VIEW.getSecondHall().GetStudy().addActionListener(e -> this.SecondHall_Study());
		VIEW.getSecondHall().GetThirdHall().addActionListener(e -> this.SecondHall_ThirdHall());
	}
	public void setButtonActionEvents_Study() {
		VIEW.getStudy().getHall().addActionListener(e -> this.Study_SecondHall());
	}
	public void setButtonActionEvents_Office() {
		VIEW.getOffice().getHall().addActionListener(e -> this.Office_SecondHall());
	}
	public void setButtonActionEvents_GuestRoom1() {
		VIEW.getGuestRoom1().getHall().addActionListener(e -> this.GuestRoom1_SecondHall());
	}
	public void setButtonActionEvents_GuestRoom2() {
		VIEW.getGuestRoom2().getHall().addActionListener(e -> this.GuestRoom2_SecondHall());
	}
	public void setButtonActionEvents_ThirdHall() {
		VIEW.getThirdHall().getAntiquesRoom().addActionListener(e -> this.ThirdHall_AntiquesRoom());
		VIEW.getThirdHall().getMasterBedroom().addActionListener(e -> this.ThirdHall_MasterBedroom());
		VIEW.getThirdHall().getPaintersStudio().addActionListener(e -> this.ThirdHall_PaintersStudio());
		VIEW.getThirdHall().getAttic().addActionListener(e -> this.ThirdHall_Attic());
		VIEW.getThirdHall().getSecondHall().addActionListener(e -> this.ThirdHall_SecondHall());
	}
	public void setButtonActionEvents_MasterBedroom() {
		VIEW.getMasterBedroom().getHallWay().addActionListener(e -> this.MasterBedroom_Hall());
	}
	public void setButtonActionEvents_PaintersStudio() {
		VIEW.getPaintersStudio().getHallWay().addActionListener(e -> this.PaintersStudio_Hall());
	}
	public void setButtonActionEvents_AntiquesRoom() {
		VIEW.getAntiquesRoom().getHallWay().addActionListener(e -> this.AntiquesRoom_Hall());
		VIEW.getAntiquesRoom().getAntiquesRoom2().addActionListener(e -> this.AntiquesRoom_AntiquesRoom2());
	}
	public void setButtonActionEvents_AntiquesRoom2() {
		VIEW.getAntiquesRoom2().getAntiquesRoom().addActionListener(e -> this.AntiquesRoom2_AntiquesRoom());
	}
	public void setButtonActionEvents_Attic() {
		VIEW.getAttic().getAtticRoom().addActionListener(e -> this.Attic_AtticRoom());
		VIEW.getAttic().getThirdHall().addActionListener(e -> this.Attic_ThirdHall());
	}
	public void setButtonActionEvents_AtticRoom() {
		VIEW.getAtticRoom().getAttic().addActionListener(e -> this.AtticRoom_Attic());
	}
	
	public void updateRoomID(int ID) {
		MODEL.setWindowID(ID);
	}
	public int getGameH() {
		return MODEL.getGameH();
	}
	public int getGameW() {
		return MODEL.getGameW();
	}
	//---------------------------------------------Button Actions-------------------\\
	//---PreLaunch screen buttons
	public void PLS_StartAction() {
		System.out.println("Starting...");
		if(VIEW.getPLS().getRes1().isSelected() == true) {
			MODEL.setGameH(510);
			MODEL.setGameW(656);
			VIEW.initRooms(MODEL.getGameW(),MODEL.getGameH());
			VIEW.updateWindow(MODEL.getGameW(),MODEL.getGameH());
			System.out.println(MODEL.getGameW() +" "+ MODEL.getGameH());
			System.out.println("Resolution is 640x480");
		}
		if(VIEW.getPLS().getRes2().isSelected() == true) {
			MODEL.setGameH(720+30);
			MODEL.setGameW(1280+16);
			VIEW.initRooms(MODEL.getGameW(),MODEL.getGameH());
			VIEW.updateWindow(MODEL.getGameW(),MODEL.getGameH());
			System.out.println("Resolution is 1280x720");
			//1280x720
		}
		if(VIEW.getPLS().getRes3().isSelected() == true) {
			MODEL.setGameH(1080+29);
			MODEL.setGameW(1920+16);
			VIEW.initRooms(MODEL.getGameW(),MODEL.getGameH());
			VIEW.updateWindow(MODEL.getGameW(),MODEL.getGameH());
			System.out.println("Resolution is 1920x1080");
			//1920x1080
		}
		VIEW.PreLaunchScreen(false);
		
		//VIEW.MainMenuScreen(true); DEFAULT
		VIEW.ThirdHall(true); // enter room here for immediate start room.
		this.setAllButtonEvents();
		
	}
	public void PLS_Quit() {
		System.out.println("Quiting...");
		VIEW.getFrame().dispose();
	}
	public void PLS_Options() {
		System.out.println("Changing for options...");
		VIEW.getPLS().getOptionsPanel().setVisible(true);
		VIEW.getPLS().getMenuPanel().setVisible(false);
	}
	public void PLS_Credits() {
		System.out.println("Changing to credits...");
		VIEW.getPLS().getCreditsPanel().setVisible(true);
		VIEW.getPLS().getMenuPanel().setVisible(false);	
	}
	public void PLS_BBOptions() {
		System.out.println("Changing to menu...");
		VIEW.getPLS().getOptionsPanel().setVisible(false);
		VIEW.getPLS().getMenuPanel().setVisible(true);
	}
	public void PLS_BBCredits() {
		System.out.println("Changing to menu...");
		VIEW.getPLS().getCreditsPanel().setVisible(false);
		VIEW.getPLS().getMenuPanel().setVisible(true);
	}
	//---Main Menu Screen buttons
	public void MMS_Start() {
		System.out.println("Starting...");
		VIEW.MainMenuScreen(false);
		VIEW.FrontPorch(true);
	}
	public void MMS_Load() {
		System.out.println("Opening loading screen...");
	}
	public void MMS_Quit() {
		System.out.println("Quiting...");
		VIEW.getFrame().dispose();
	}
	public void MMS_LLoad() {
		System.out.println("Loading save file");
	}
	public void MMS_LoadBB() {
		System.out.println("Returning to start");
	}
	//---Front Porch Buttons
	public void FP_HallwayDoor() {
		System.out.println("HallWay door");
		VIEW.FrontPorch(false);
		VIEW.Hallway(true);
	}
	public void FP_GarageDoor() {
		System.out.println("Garage door");
		VIEW.FrontPorch(false);
		VIEW.Garage(true);
	}
	//---Garage Buttons
	public void Garage_FrontPortch() {
		System.out.println("Going to front porch");
		VIEW.FrontPorch(true);
		VIEW.Garage(false);
	}
	//---HallWay Buttons
	public void HallWay_Lounge() {
		System.out.println("Going to Lounge");
		VIEW.Hallway(false);
		VIEW.Lounge(true);
	}
	public void HallWay_Dining() {
		System.out.println("Going to Dining");
		VIEW.Hallway(false);
		VIEW.DiningRoom(true);
	}
	public void HallWay_Kitchen() {
		System.out.println("Going to Kitchen");
		VIEW.Hallway(false);
		VIEW.Kitchen(true);
	}
	public void HallWay_Stairs() {
		System.out.println("Going up Stairs");
		VIEW.Hallway(false);
		VIEW.SecondHall(true);
	}
	public void HallWay_Kitchen2() {
		this.HallWay_Kitchen();
	}
	public void HallWay_PoolHall() {
		System.out.println("Going to Pool Hall");
		VIEW.Hallway(false);
		VIEW.PoolHall(true);
	}
	public void HallWay_Library() {
		System.out.println("Going to Library");
		VIEW.Hallway(false);
		VIEW.Library(true);
	}
	public void HallWay_FrontPorch() {
		System.out.println("Going to Front Porch");
		VIEW.Hallway(false);
		VIEW.FrontPorch(true);
	}
	//---Lounge Buttons
	public void Lounge_GreenHouse() {
		System.out.println("Going to Green House");
		VIEW.Lounge(false);
		VIEW.GreenHouse(true);
	}
	public void Lounge_HallWay()  {
		System.out.println("Going to Hall way");
		VIEW.Lounge(false);
		VIEW.Hallway(true);
	}
	//---GreenHouse Button
	public void GreenHouse_Lounge() {
		System.out.println("Going to lounge");
		VIEW.GreenHouse(false);
		VIEW.Lounge(true);
	}
	//---Dining Buttons
	public void DiningRoom_Hall() {
		System.out.println("Going to Hall");
		VIEW.DiningRoom(false);
		VIEW.Hallway(true);
	}
	public void DiningRoom_Kitchen() {
		System.out.println("Going to Kitchen");
		VIEW.DiningRoom(false);
		VIEW.Kitchen(true);
	}
	//---kitchen Buttons
	public void Kitchen_Hall() {
		System.out.println("Going to hall");
		VIEW.Kitchen(false);
		VIEW.Hallway(true);
	}
	public void Kitchen_Hall2() {
		this.Kitchen_Hall();
	}
	public void Kitchen_DiningRoom() {
		System.out.println("Going to dining room");
		VIEW.Kitchen(false);
		VIEW.DiningRoom(true);
	}
	//---poolHall Button
	public void PoolHall_Hall() {
		System.out.println("going to hall");
		VIEW.PoolHall(false);
		VIEW.Hallway(true);
	}
	//---Library Button
	public void Library_Hall() {
		System.out.println("Going to hall");
		VIEW.Library(false);
		VIEW.Hallway(true);
	}
	
	
	//===Second Hall Buttons
	public void SecondHall_Hall() {
		System.out.println("Going to hall");
		VIEW.Hallway(true);
		VIEW.SecondHall(false);
	}
	public void SecondHall_Study() {
		System.out.println("Going to Study");
		VIEW.SecondHall(false);
		VIEW.Study(true);
	}
	public void SecondHall_Office() {
		System.out.println("Going to Office");
		VIEW.SecondHall(false);
		VIEW.Office(true);
	}
	public void SecondHall_GuestRoom1() {
		System.out.println("Going to GuestRoom1");
		VIEW.SecondHall(false);
		VIEW.GuestRoom1(true);
	}
	public void SecondHall_GuestRoom2() {
		System.out.println("Going to GuestRoom2");
		VIEW.SecondHall(false);
		VIEW.GuestRoom2(true);
	}
	public void SecondHall_ThirdHall() {
		System.out.println("Going to Third Hall");
		VIEW.SecondHall(false);
		VIEW.ThirdHall(true);
	}
	//===Study Button
	public void Study_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.SecondHall(true);
		VIEW.Study(false);
	}
	//===Office
	public void Office_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.SecondHall(true);
		VIEW.Office(false);
	}
	//===GuestRoom1
	public void GuestRoom1_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.SecondHall(true);
		VIEW.GuestRoom1(false);
	}
	//===GuestRoom2
	public void GuestRoom2_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.SecondHall(true);
		VIEW.GuestRoom2(false);
	}
	
	//=-=Third Hall buttons
	public void ThirdHall_AntiquesRoom() {
		System.out.println("Going to Antiques Room");
		VIEW.ThirdHall(false);
		VIEW.AntiquesRoom(true);
	}
	public void ThirdHall_PaintersStudio() {
		System.out.println("Going to Painters Studio");
		VIEW.ThirdHall(false);
		VIEW.PaintersStudio(true);
	}
	public void ThirdHall_MasterBedroom() {
		System.out.println("Going to masterBedroom");
		VIEW.ThirdHall(false);
		VIEW.MasterBedroom(true);
	}
	public void ThirdHall_Attic() {
		System.out.println("Going to Attic");
		VIEW.ThirdHall(false);
		VIEW.Attic(true);
	}
	public void ThirdHall_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.ThirdHall(false);
		VIEW.SecondHall(true);
	}
	//=-=MasterBedroom Buttons
	public void MasterBedroom_Hall() {
		System.out.println("Going to Third Hall");
		VIEW.MasterBedroom(false);
		VIEW.ThirdHall(true);
	}
	//=-=PaintersStudio Buttons
	public void PaintersStudio_Hall() {
		System.out.println("Going to Third Hall");
		VIEW.PaintersStudio(false);
		VIEW.ThirdHall(true);
	}
	//=-=AntiquesRoom buttons
	public void AntiquesRoom_Hall() {
		System.out.println("Going to Third Hall");
		VIEW.AntiquesRoom(false);
		VIEW.ThirdHall(true);
	}
	public void AntiquesRoom_AntiquesRoom2() {
		System.out.println("Going to back of Room");
		VIEW.AntiquesRoom(false);
		VIEW.AntiquesRoom2(true);
	}
	//=-=AntiquesRoom2 Buttons
	public void AntiquesRoom2_AntiquesRoom() {
		System.out.println("Going to Antiques room");
		VIEW.AntiquesRoom(true);
		VIEW.AntiquesRoom2(false);
	}

	//-=-Attic
	public void Attic_AtticRoom() {
		System.out.println("Going to Attic Room");
		VIEW.AtticRoom(true);
		VIEW.Attic(false);
	}
	public void Attic_ThirdHall() {
		System.out.println("Going to Third Hall");
		VIEW.ThirdHall(true);
		VIEW.Attic(false);
	}
	//-=- Attic Room
	public void AtticRoom_Attic() {
		System.out.println("Going to Attic");
		VIEW.Attic(true);
		VIEW.AtticRoom(false);
	}
}
