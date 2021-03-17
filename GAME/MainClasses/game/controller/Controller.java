package game.controller;


import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;

import game.model.Model;
import game.viewer.Viewer;

public class Controller{
	Model MODEL = new Model();
	Viewer VIEW;
	boolean Running = true;
	boolean InventoryOpen  = false;
	
	Action Inventory;
	Action Use;
	
	public Controller(){
		
		//Setting the initial resolution of the preLaunch screen 
		MODEL.setGameW(440);
		MODEL.setGameH(510);
		System.out.println("Resolution is 440x510");
		
		//creating the ViewerClass and passing in the resolution from the previous section 
		VIEW = new Viewer(MODEL.getGameW(),MODEL.getGameH());
		System.out.println("creating Viewer");
		
		//setting the preLaunchScreen visible
		VIEW.PreLaunchScreen(true);
		System.out.println("creating Pre Launch Screen");
		
		//Refreshing the prelaunch screen
		VIEW.getPLS().getMenuPanel().setVisible(false);
		VIEW.getPLS().getMenuPanel().setVisible(true);
		System.out.println("Refreshed preLaunch Screen");
		
		//initializing the buttons for the prelaunch screen. 
		this.setButtonActionEvents_PLS();
		System.out.println("Button Events instanced");
		
		
	}
	
	//All the button Action events
	//this method when called Initializes each button's actions when pressed. 
	
	public void setAllButtonEvents() {
		//Downstairs room buttons 
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
		//SecondFloor room buttons
		this.setButtonActionEvents_SecondHall();
		this.setButtonActionEvents_Study();
		this.setButtonActionEvents_Office();
		this.setButtonActionEvents_GuestRoom1();
		this.setButtonActionEvents_GuestRoom2();
		//ThirdFloor room Buttons
		this.setButtonActionEvents_ThirdHall();
		this.setButtonActionEvents_MasterBedroom();
		this.setButtonActionEvents_PaintersStudio();
		this.setButtonActionEvents_AntiquesRoom();
		this.setButtonActionEvents_AntiquesRoom2();
		//Attic Buttons
		this.setButtonActionEvents_Attic();
		this.setButtonActionEvents_AtticRoom();
		//Hud/inventory buttons
		this.setButtonActionEvents_Inventory();
		this.setButtonActionEvents_PlayerHudButtons();
		
		
	}
	
	// the following setButtonActionEvents_RoomName methods all are the assigning each buttons action to their respective response methods.
	// for example the following "setButtonActionEvent_PLS()". From the View class, get the room class called PreLaunchScreen. from there get a
	// button called start and then assign an actionListener. When the Action listener is called invoke the method called PLS_StartAction.
	// The naming convention of the action methods are as follows. the RoomName_ButtonName so you can hopefully get an idea of what they do.
	
	public void setButtonActionEvents_PLS() {
		VIEW.getPLS().getStart().addActionListener(e ->this.PLS_StartAction());
		VIEW.getPLS().getOptions().addActionListener(e ->this.PLS_Options());
		VIEW.getPLS().getCredits().addActionListener(e ->this.PLS_Credits());
		VIEW.getPLS().getQuit().addActionListener(e ->this.PLS_Quit());
		VIEW.getPLS().getBBOptions().addActionListener(e ->this.PLS_BBOptions());
		VIEW.getPLS().getBBCredits().addActionListener(e ->this.PLS_BBCredits());
	}
	public void setButtonActionEvents_MMS() {
		VIEW.getMMS().getStart().addActionListener(e ->this.MMS_Start());
		VIEW.getMMS().getQuit().addActionListener(e ->this.MMS_Quit());
		VIEW.getMMS().getLoad().addActionListener(e ->this.MMS_Load());
		VIEW.getMMS().getLoadScreenLB().addActionListener(e ->this.MMS_LLoad());
		VIEW.getMMS().getLoadScreenBB().addActionListener(e ->this.MMS_LoadBB());
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
	public void setButtonActionEvents_Inventory() {
		VIEW.getInventoryScreen().getLeftArrow().addActionListener(e -> this.InventoryButtons_LeftArrow());
		VIEW.getInventoryScreen().getRightArrow().addActionListener(e -> this.InventoryButtons_RightArrow());
		VIEW.getInventoryScreen().getItemSelected().addActionListener(e -> this.InventoryButtons_ItemSelected());
		VIEW.getInventoryScreen().getExit().addActionListener(e -> this.InventoryButtons_Exit());
		VIEW.getInventoryScreen().getBack().addActionListener(e ->this.InventoryButtons_Back());
	}
	public void setButtonActionEvents_PlayerHudButtons() {
		VIEW.getPlayersHud().getInventory().addActionListener(e -> this.PlayerHudButton_Inventory());
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
			MODEL.setGameH(519);
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
		VIEW.MainMenuScreen(true); //DEFAULT
		//VIEW.ThirdHall(true); // enter room here for immediate start room.
		this.setAllButtonEvents();
		
	}
	//PreLaunch Screen button actions.
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
		VIEW.PlayerHud(true);

		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getFP().getRoomNumber());
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
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getHallway().getRoomNumber());
	}
	public void FP_GarageDoor() {
		System.out.println("Garage door");
		VIEW.FrontPorch(false);
		VIEW.Garage(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getGarage().getRoomNumber());
	}
	
	//---Garage Buttons
	public void Garage_FrontPortch() {
		System.out.println("Going to front porch");
		VIEW.FrontPorch(true);
		VIEW.Garage(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getFP().getRoomNumber());
	}
	
	//---HallWay Buttons
	public void HallWay_Lounge() {
		System.out.println("Going to Lounge");
		VIEW.Hallway(false);
		VIEW.Lounge(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getLounge().getRoomNumber());
	}
	public void HallWay_Dining() {
		System.out.println("Going to Dining");
		VIEW.Hallway(false);
		VIEW.DiningRoom(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getDiningRoom().getRoomNumber());
	}
	public void HallWay_Kitchen() {
		System.out.println("Going to Kitchen");
		VIEW.Hallway(false);
		VIEW.Kitchen(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getKitchen().getRoomNumber());
	}
	public void HallWay_Stairs() {
		System.out.println("Going up Stairs");
		VIEW.Hallway(false);
		VIEW.SecondHall(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getSecondHall().getRoomNumber());
	}
	public void HallWay_Kitchen2() {
		this.HallWay_Kitchen();
	}
	public void HallWay_PoolHall() {
		System.out.println("Going to Pool Hall");
		VIEW.Hallway(false);
		VIEW.PoolHall(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getPoolHall().getRoomNumber());
	}
	public void HallWay_Library() {
		System.out.println("Going to Library");
		VIEW.Hallway(false);
		VIEW.Library(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getLibrary().getRoomNumber());
	}
	public void HallWay_FrontPorch() {
		System.out.println("Going to Front Porch");
		VIEW.Hallway(false);
		VIEW.FrontPorch(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getFP().getRoomNumber());
	}
	
	//---Lounge Buttons
	public void Lounge_GreenHouse() {
		System.out.println("Going to Green House");
		VIEW.Lounge(false);
		VIEW.GreenHouse(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getGreenHouse().getRoomNumber());
	}
	public void Lounge_HallWay()  {
		System.out.println("Going to Hall way");
		VIEW.Lounge(false);
		VIEW.Hallway(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getHallway().getRoomNumber());
	}
	
	//---GreenHouse Button
	public void GreenHouse_Lounge() {
		System.out.println("Going to lounge");
		VIEW.GreenHouse(false);
		VIEW.Lounge(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getLounge().getRoomNumber());
	}
	
	//---Dining Buttons
	public void DiningRoom_Hall() {
		System.out.println("Going to Hall");
		VIEW.DiningRoom(false);
		VIEW.Hallway(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getHallway().getRoomNumber());
	}
	public void DiningRoom_Kitchen() {
		System.out.println("Going to Kitchen");
		VIEW.DiningRoom(false);
		VIEW.Kitchen(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getKitchen().getRoomNumber());
	}
	
	//---kitchen Buttons
	public void Kitchen_Hall() {
		System.out.println("Going to hall");
		VIEW.Kitchen(false);
		VIEW.Hallway(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getHallway().getRoomNumber());
	}
	public void Kitchen_Hall2() {
		this.Kitchen_Hall();
	}
	public void Kitchen_DiningRoom() {
		System.out.println("Going to dining room");
		VIEW.Kitchen(false);
		VIEW.DiningRoom(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getDiningRoom().getRoomNumber());
	}
	
	//---poolHall Button
	public void PoolHall_Hall() {
		System.out.println("going to hall");
		VIEW.PoolHall(false);
		VIEW.Hallway(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getHallway().getRoomNumber());
	}
	
	//---Library Button
	public void Library_Hall() {
		System.out.println("Going to hall");
		VIEW.Library(false);
		VIEW.Hallway(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getHallway().getRoomNumber());
	}
	
	//===Second Hall Buttons
	public void SecondHall_Hall() {
		System.out.println("Going to hall");
		VIEW.Hallway(true);
		VIEW.SecondHall(false);

		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getSecondHall().getRoomNumber());
	}
	public void SecondHall_Study() {
		System.out.println("Going to Study");
		VIEW.SecondHall(false);
		VIEW.Study(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getStudy().getRoomNumber());
	}
	public void SecondHall_Office() {
		System.out.println("Going to Office");
		VIEW.SecondHall(false);
		VIEW.Office(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getOffice().getRoomNumber());
	}
	public void SecondHall_GuestRoom1() {
		System.out.println("Going to GuestRoom1");
		VIEW.SecondHall(false);
		VIEW.GuestRoom1(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getGuestRoom1().getRoomNumber());
	}
	public void SecondHall_GuestRoom2() {
		System.out.println("Going to GuestRoom2");
		VIEW.SecondHall(false);
		VIEW.GuestRoom2(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getGuestRoom2().getRoomNumber());
	}
	public void SecondHall_ThirdHall() {
		System.out.println("Going to Third Hall");
		VIEW.SecondHall(false);
		VIEW.ThirdHall(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getThirdHall().getRoomNumber());
	}
	
	//===Study Button
	public void Study_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.SecondHall(true);
		VIEW.Study(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getSecondHall().getRoomNumber());		
	}
	
	//===Office
	public void Office_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.SecondHall(true);
		VIEW.Office(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getSecondHall().getRoomNumber());
	}
	
	//===GuestRoom1
	public void GuestRoom1_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.SecondHall(true);
		VIEW.GuestRoom1(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getSecondHall().getRoomNumber());
	}
	
	//===GuestRoom2
	public void GuestRoom2_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.SecondHall(true);
		VIEW.GuestRoom2(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getSecondHall().getRoomNumber());
	}
	
	//=-=Third Hall buttons
	public void ThirdHall_AntiquesRoom() {
		System.out.println("Going to Antiques Room");
		VIEW.ThirdHall(false);
		VIEW.AntiquesRoom(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getAntiquesRoom().getRoomNumber());
	}
	public void ThirdHall_PaintersStudio() {
		System.out.println("Going to Painters Studio");
		VIEW.ThirdHall(false);
		VIEW.PaintersStudio(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getPaintersStudio().getRoomNumber());
	}
	public void ThirdHall_MasterBedroom() {
		System.out.println("Going to masterBedroom");
		VIEW.ThirdHall(false);
		VIEW.MasterBedroom(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getMasterBedroom().getRoomNumber());
	}
	public void ThirdHall_Attic() {
		System.out.println("Going to Attic");
		VIEW.ThirdHall(false);
		VIEW.Attic(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getAttic().getRoomNumber());
	}
	public void ThirdHall_SecondHall() {
		System.out.println("Going to Second Hall");
		VIEW.ThirdHall(false);
		VIEW.SecondHall(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getSecondHall().getRoomNumber());
	}
	
	//=-=MasterBedroom Buttons
	public void MasterBedroom_Hall() {
		System.out.println("Going to Third Hall");
		VIEW.MasterBedroom(false);
		VIEW.ThirdHall(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getThirdHall().getRoomNumber());
	}
	
	//=-=PaintersStudio Buttons
	public void PaintersStudio_Hall() {
		System.out.println("Going to Third Hall");
		VIEW.PaintersStudio(false);
		VIEW.ThirdHall(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getThirdHall().getRoomNumber());
	}
	
	//=-=AntiquesRoom buttons
	public void AntiquesRoom_Hall() {
		System.out.println("Going to Third Hall");
		VIEW.AntiquesRoom(false);
		VIEW.ThirdHall(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getMasterBedroom().getRoomNumber());
	}
	public void AntiquesRoom_AntiquesRoom2() {
		System.out.println("Going to back of Room");
		VIEW.AntiquesRoom(false);
		VIEW.AntiquesRoom2(true);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getAntiquesRoom2().getRoomNumber());
	}
	
	//=-=AntiquesRoom2 Buttons
	public void AntiquesRoom2_AntiquesRoom() {
		System.out.println("Going to Antiques room");
		VIEW.AntiquesRoom(true);
		VIEW.AntiquesRoom2(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getAntiquesRoom2().getRoomNumber());
	}

	//-=-Attic
	public void Attic_AtticRoom() {
		System.out.println("Going to Attic Room");
		VIEW.AtticRoom(true);
		VIEW.Attic(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getAtticRoom().getRoomNumber());
	}
	public void Attic_ThirdHall() {
		System.out.println("Going to Third Hall");
		VIEW.ThirdHall(true);
		VIEW.Attic(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getThirdHall().getRoomNumber());
	}
	
	//-=- Attic Room
	public void AtticRoom_Attic() {
		System.out.println("Going to Attic");
		VIEW.Attic(true);
		VIEW.AtticRoom(false);
		
		MODEL.setPreviousRoom(MODEL.getCurrentRoom());
		MODEL.setCurrentRoom(VIEW.getAttic().getRoomNumber());
	}
	
	//---Inventory Buttons
	public void InventoryButtons_LeftArrow() {
		
	}
	public void InventoryButtons_RightArrow() {
		VIEW.getInventoryScreen().shiftIconsRight();
		System.out.println("Right arrow pressed");

	}
	public void InventoryButtons_ItemSelected() {
		
	}
	public void InventoryButtons_Exit() {
		VIEW.InventoryScreen(false);
		VIEW.MainMenuScreen(true);
		System.out.println("Going Back to Menu");
		//VIEW.openASpecificPane(MODEL.getCurrentRoom());
	}
	public void InventoryButtons_Back() {
		VIEW.InventoryScreen(false);
		VIEW.PlayerHud(true);
		System.out.println("Closing Inventory");
		//VIEW.openASpecificPane(MODEL.getCurrentRoom());
	}
	
	//-()-Player Hud Buttons
	public void PlayerHudButton_Inventory() {
		System.out.println("Opening Inventory");
		VIEW.InventoryScreen(true);
		VIEW.PlayerHud(false);
	}
	
	
		
	
}
