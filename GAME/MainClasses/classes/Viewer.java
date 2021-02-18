package classes;

public class Viewer {
	
	PreLaunchScreen PLS = new PreLaunchScreen(510,440);
	MainMenuScreen MM = new MainMenuScreen();
	
	public void Check() {
		if(PLS.getOpen() == false) {
			System.out.println("Window Closed");
		}
	}
	
	}

