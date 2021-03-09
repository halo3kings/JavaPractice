package game.model;

public class Model {
	private int GameW;
	private int GameH;
	
	private int WindowID;
	//private boolean InventoryOpen;
	
	private int CurrentRoom;
	
	public void setGameW(int GW) {
		GameW = GW;
	}
	public void setGameH(int GH) {
		GameH = GH;//the 29 is for the top task bar of the window
	}
	public void setWindowID(int ID) {
		WindowID = ID;
	}
	public void setCurrentRoom(int currentRoom) {
		CurrentRoom = currentRoom;
	}
	//gets
	public int getGameW() {
		return GameW;
	}
	public int getGameH() {
		return GameH;
	}
	public int getWindowID() {
		return WindowID;
	}
	public int getCurrentRoom() {
		return CurrentRoom;
	}
}
