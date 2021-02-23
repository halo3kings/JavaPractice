package game.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

import game.model.Model;
import game.viewer.Viewer;

public class Controller{
	Model MODEL = new Model();
	Viewer VIEW = new Viewer();
	boolean Running = true;
	
	public Controller(){
		
	}
	
	public void Start() {
		VIEW.getPLS().createPreLaunchScreen();
		this.setButtonActionEventsPLS();
	}
	public void StartWasPresed() {
		VIEW.getPLS().setVisibility(false);
		//VIEW.MM.createMainMenu(VIEW.PLS.get);
		System.out.println("Starting...");
	}
	//gets
	public void setButtonActionEventsPLS() {
		VIEW.getPLS().getStart().addActionListener(e ->this.PLS_StartAction());
		VIEW.getPLS().getOptions().addActionListener(e ->this.PLS_Options());
		VIEW.getPLS().getCredits().addActionListener(e ->this.PLS_Credits());
		VIEW.getPLS().getQuit().addActionListener(e ->this.PLS_Quit());
		VIEW.getPLS().getBBOptions().addActionListener(e ->this.PLS_BBOptions());
		VIEW.getPLS().getBBCredits().addActionListener(e ->this.PLS_BBCredits());
	}
	public void setButtonActionEventsMMS() {
		VIEW.getMMS().getStartButton().addActionListener(e ->this.MMS_Start());
		VIEW.getMMS().getQuit().addActionListener(e ->this.MMS_Quit());
		VIEW.getMMS().getLoad().addActionListener(e ->this.MMS_Load());
		VIEW.getMMS().getLLoad().addActionListener(e ->this.MMS_LLoad());
		VIEW.getMMS().getLoadBB().addActionListener(e ->this.MMS_LoadBB());
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
		if(VIEW.getPLS().getRes1().isSelected() == true) {
			MODEL.setGameH(480);
			MODEL.setGameW(640);
		}
		if(VIEW.getPLS().getRes2().isSelected() == true) {
			MODEL.setGameH(720);
			MODEL.setGameW(1280);
			//1280x720
		}
		if(VIEW.getPLS().getRes3().isSelected() == true) {
			MODEL.setGameH(1080);
			MODEL.setGameW(1920);
			//1920x1080
		}
		VIEW.getPLS().setOpen(false);
		VIEW.getPLS().getFrame().dispose();
		VIEW.createMainMenuScreen(MODEL.getGameW(), MODEL.getGameH());
		this.setButtonActionEventsMMS();
		this.updateRoomID(VIEW.getMMS().getWindowNumber());
	}
	public void PLS_Quit() {
		System.out.println("Quiting...");
		VIEW.getPLS().getFrame().dispose();
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
	//-----------------------------Main Menu Screen button actions-------------\\
	public void MMS_Start() {
		System.out.println("Starting...");
	}
	public void MMS_Load() {
		System.out.println("Opening loading screen...");
	}
	public void MMS_Quit() {
		System.out.println("Quiting...");
		VIEW.getMMS().getFrame().dispose();
	}
	public void MMS_LLoad() {
		System.out.println("Loading save file");
	}
	public void MMS_LoadBB() {
		System.out.println("Returning to start");
	}


}
