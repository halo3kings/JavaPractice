package classes;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

public class Controller implements ActionListener{
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
		VIEW.PLS.getStart().addActionListener(this);
		VIEW.PLS.getOptions().addActionListener(this);
		VIEW.PLS.getCredits().addActionListener(this);
		VIEW.PLS.getQuit().addActionListener(this);
		VIEW.PLS.getBBOptions().addActionListener(this);
		VIEW.PLS.getBBCredits().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) { // all the button actions are listed below
		if(e.getSource() == VIEW.PLS.Start) {
			System.out.println("Starting...");
			if(VIEW.PLS.Res1.isSelected() == true) {
				MODEL.setGameH(480);
				MODEL.setGameW(640);
				//640x480
			}
			if(VIEW.PLS.Res2.isSelected() == true) {
				MODEL.setGameH(480);
				MODEL.setGameW(640);
				//640x480
			}
			if(VIEW.PLS.Res3.isSelected() == true) {
				MODEL.setGameH(480);
				MODEL.setGameW(640);
				//640x480
			}
			
			VIEW.PLS.setOpen(false);
			VIEW.PLS.Frame.dispose();
		}
		if(e.getSource() == VIEW.PLS.Quit) {
			System.out.println("Quiting...");
			VIEW.PLS.Frame.dispose();
		}
		if(e.getSource() == VIEW.PLS.Options) {
			System.out.println("Changing for options...");
			VIEW.PLS.PLSOptions.setVisible(true);
			VIEW.PLS.PLSMenu.setVisible(false);
		}
		if(e.getSource() == VIEW.PLS.Credits) {
			System.out.println("Changing to credits...");
			VIEW.PLS.PLSCredits.setVisible(true);
			VIEW.PLS.PLSMenu.setVisible(false);
		}
		if(e.getSource() == VIEW.PLS.BBOptions) {
			System.out.println("Changing to menu...");
			VIEW.PLS.PLSOptions.setVisible(false);
			VIEW.PLS.PLSMenu.setVisible(true);
		}
		if(e.getSource() == VIEW.PLS.BBCredits) {
			System.out.println("Changing to menu...");
			VIEW.PLS.PLSCredits.setVisible(false);
			VIEW.PLS.PLSMenu.setVisible(true);

		}
		

	}
}
