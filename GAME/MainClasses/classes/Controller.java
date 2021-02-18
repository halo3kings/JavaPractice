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
		this.getUpDate();
	}
	public void StartWasPresed() {
		VIEW.PLS.setVisibility(false);
		//VIEW.MM.createMainMenu(VIEW.PLS.get);
		System.out.println("Starting...");
	}
	public void getUpDate() {
		while(Running) {
			VIEW.Check();
		}
	}
	//gets

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==VIEW.PLS.getStart()) {
			System.out.println("Start Fired");
		}
		
	}

	//sets

}
