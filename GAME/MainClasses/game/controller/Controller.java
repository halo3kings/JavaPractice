package game.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

import game.model.Model;
import game.viewer.Viewer;

public class Controller{
	Model MODEL = new Model();
	Viewer VIEW;
	boolean Running = true;
	
	public Controller(){
		MODEL.setGameW(440);
		MODEL.setGameH(510);
		VIEW = new Viewer(MODEL.getGameW(),MODEL.getGameH());
		VIEW.createPreLaunchScreen();
		VIEW.getPLS().getMenuPanel().setVisible(false);
		VIEW.getPLS().getMenuPanel().setVisible(true);
		this.setButtonActionEventsPLS();
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
	public void setButtonActionEventsFP() {
		VIEW.getFP().getGarage().addActionListener(e ->);
		VIEW.getFP().getHallway().addActionListener(e ->);
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
			MODEL.setGameH(480+29);
			MODEL.setGameW(640);
			System.out.println("Resolution is 640x480");
		}
		if(VIEW.getPLS().getRes2().isSelected() == true) {
			MODEL.setGameH(720+29);
			MODEL.setGameW(1280);
			System.out.println("Resolution is 1280x720");
			//1280x720
		}
		if(VIEW.getPLS().getRes3().isSelected() == true) {
			MODEL.setGameH(1080+29);
			MODEL.setGameW(1920);
			System.out.println("Resolution is 1920x1080");
			//1920x1080
		}
		VIEW.getPLS().getPreLaunchScreen().setVisible(false);
		System.out.println("setting the PreLaunch screen invisible");
		
		VIEW.createMainMenuScreen(MODEL.getGameW(), MODEL.getGameH());
		System.out.println("creating the mainmenu screen with its needed resolution");
		
		VIEW.getFrame().setSize(MODEL.getGameW(),MODEL.getGameH());
		System.out.println("setting JFrame to the new user selected resolution");
		
		VIEW.getMMS().getMainMenu().setVisible(false);
		VIEW.getMMS().getMainMenu().setVisible(true);
		VIEW.getFrame().setVisible(false);
		VIEW.getFrame().setVisible(true);
		System.out.println("Refreshing JFrame");
		
		this.setButtonActionEventsMMS();
		System.out.println("Main Menu buttons initialized");
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
	//-----------------------------Main Menu Screen button actions-------------\\
	public void MMS_Start() {
		System.out.println("Starting...");
		System.out.println("Passing in model Width:  " +MODEL.getGameW()+" Passing in model Height:  "+MODEL.getGameH());
		System.out.println("creating the FrontPorch scene with its needed resolution");
		VIEW.createFrontPorch(MODEL.getGameW(),MODEL.getGameH());
		
		System.out.println("setting Main menu invisible");
		VIEW.getMMS().getMainMenu().setVisible(false);


		VIEW.getFrame().setVisible(false);
		VIEW.getFrame().setVisible(true);
		VIEW.getFP().getFrontPorch().setVisible(false);
		VIEW.getFP().getFrontPorch().setVisible(true);
		System.out.println("Refreshing JFrame");
		
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


}
