package classes;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

public class Controller{
	Model MODEL = new Model();
	Viewer VIEW = new Viewer();
	boolean Running = true;
	
	Controller(){
		
	}
	
	public void Start() {
		VIEW.PLS.createPreLaunchScreen();
		this.setButtonActionEventsPLS();
	}
	public void StartWasPresed() {
		VIEW.PLS.setVisibility(false);
		//VIEW.MM.createMainMenu(VIEW.PLS.get);
		System.out.println("Starting...");
	}
	//gets
	public void setButtonActionEventsPLS() {
		VIEW.PLS.getStart().addActionListener(e ->this.PLS_StartAction());
		VIEW.PLS.getOptions().addActionListener(e ->this.PLS_Options());
		VIEW.PLS.getCredits().addActionListener(e ->this.PLS_Credits());
		VIEW.PLS.getQuit().addActionListener(e ->this.PLS_Quit());
		VIEW.PLS.getBBOptions().addActionListener(e ->this.PLS_BBOptions());
		VIEW.PLS.getBBCredits().addActionListener(e ->this.PLS_BBCredits());
	}
	public void setButtonActionEventsMMS() {
		VIEW.MMS.getStartButton().addActionListener(e ->this.MMS_Start());
		VIEW.MMS.getQuit().addActionListener(e ->this.MMS_Quit());
		VIEW.MMS.getLoad().addActionListener(e ->this.MMS_Load());
		VIEW.MMS.getLLoad().addActionListener(e ->this.MMS_LLoad());
		VIEW.MMS.getLoadBB().addActionListener(e ->this.MMS_LoadBB());
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
	//----------------PreLaunch Screen------------\\
	public void PLS_StartAction() {
		System.out.println("Starting...");
		if(VIEW.PLS.Res1.isSelected() == true) {
			MODEL.setGameH(480);
			MODEL.setGameW(640);
		}
		if(VIEW.PLS.Res2.isSelected() == true) {
			MODEL.setGameH(720);
			MODEL.setGameW(1280);
			//1280x720
		}
		if(VIEW.PLS.Res3.isSelected() == true) {
			MODEL.setGameH(1080);
			MODEL.setGameW(1920);
			//1920x1080
		}
		VIEW.PLS.setOpen(false);
		VIEW.PLS.Frame.dispose();
		VIEW.createMainMenuScreen(MODEL.getGameW(), MODEL.getGameH());
		this.setButtonActionEventsMMS();
		this.updateRoomID(VIEW.MMS.getWindowNumber());
	}
	public void PLS_Quit() {
		System.out.println("Quiting...");
		VIEW.PLS.Frame.dispose();
	}
	public void PLS_Options() {
		System.out.println("Changing for options...");
		VIEW.PLS.PLSOptions.setVisible(true);
		VIEW.PLS.PLSMenu.setVisible(false);
	}
	public void PLS_Credits() {
		System.out.println("Changing to credits...");
		VIEW.PLS.PLSCredits.setVisible(true);
		VIEW.PLS.PLSMenu.setVisible(false);	
	}
	public void PLS_BBOptions() {
		System.out.println("Changing to menu...");
		VIEW.PLS.PLSOptions.setVisible(false);
		VIEW.PLS.PLSMenu.setVisible(true);
	}
	public void PLS_BBCredits() {
		System.out.println("Changing to menu...");
		VIEW.PLS.PLSCredits.setVisible(false);
		VIEW.PLS.PLSMenu.setVisible(true);
	}
	//-----------------------------Main Menu Screen button actions-------------\\
	public void MMS_Start() {
		System.out.println("Starting...");
	}
	public void MMS_Load() {
		System.out.println("Opening loading screen...");
	}
	public void MMS_Quit() {
		System.out.println("Quiting...");
		VIEW.MMS.Frame.dispose();
	}
	public void MMS_LLoad() {
		System.out.println("Loading save file");
	}
	public void MMS_LoadBB() {
		System.out.println("Returning to start");
	}


}
