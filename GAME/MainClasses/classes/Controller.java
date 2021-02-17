package classes;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

public class Controller implements ActionListener{
	Model MODEL = new Model();
	Viewer VIEW = new Viewer();
	
	Controller(){
		
	}
	
	public void Start() {
		VIEW.PLS.createPreLaunchScreen();
		
	}
	public void initStartScreenButtons() {
		VIEW.PLS.getStart().addActionListener(this);
	}
	//gets

	//sets
	@Override
	public void actionPerformed(ActionEvent e) { // all the button actions are listed below
		if(e.getSource() == VIEW.PLS.getStart()) {
			VIEW.PLS.setVisibility(false);
			//VIEW.MM.createMainMenu(VIEW.PLS.get);
			System.out.println("Starting...");
		}
		if(e.getSource() == VIEW.PLS.getQuit()) {
			System.out.println("Quiting...");
		}
		if(e.getSource() == VIEW.PLS.getOptions()) {
			System.out.println("Changing for options...");
			VIEW.PLS.PLSOptions.setVisible(true);
			VIEW.PLS.PLSMenu.setVisible(false);
		}
		if(e.getSource() == VIEW.PLS.getCredits()) {
			System.out.println("Changing to credits...");
			VIEW.PLS.PLSCredits.setVisible(true);
			VIEW.PLS.PLSMenu.setVisible(false);
		}
		if(e.getSource() == VIEW.PLS.getBBOptions()) {
			System.out.println("Changing to menu...");
			VIEW.PLS.PLSOptions.setVisible(false);
			VIEW.PLS.PLSMenu.setVisible(true);
		}
		if(e.getSource() == VIEW.PLS.getBBCredits()) {
			System.out.println("Changing to menu...");
			VIEW.PLS.PLSCredits.setVisible(false);
			VIEW.PLS.PLSMenu.setVisible(true);

		}

	}
}
