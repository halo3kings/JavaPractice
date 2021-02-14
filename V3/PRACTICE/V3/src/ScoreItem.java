
public class ScoreItem {
	private String Name = "";
	private int Score = 0;
	private boolean inRoom = false;
	
	ScoreItem(String NM, int PT,boolean NR){
		Name = NM;
		Score = PT;
		inRoom = NR;
	}
	//Sets 
	public void setName(String NM) {
		Name = NM;
	}
	public void setScore(int PT) {
		Score = PT;
	}
	public void setInRoom(boolean NR) {
		inRoom = NR;
	}
	
	//Gets
	public String getName() {
		return Name;
	}
	public int getPoints() {
		return Score;
	}
	public boolean getInRoom() {
		return inRoom;
	}
}
