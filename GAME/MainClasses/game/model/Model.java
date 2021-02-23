package game.model;

public class Model {
	private int GameW;
	private int GameH;
	
	private int WindowID;
	
	public void setGameW(int GW) {
		GameW = GW;
	}
	public void setGameH(int GH) {
		GameH = GH;
	}
	public void setWindowID(int ID) {
		WindowID = ID;
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
}
