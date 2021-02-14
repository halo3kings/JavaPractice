
public class Player {
	//Weaknesses
	boolean GhostAttack = true;
	boolean FigureAttack = true;
	//Data
	int Score = 0;
	//instancing
	Inventory INV = new Inventory(false,false);
	Stats STATUS = new Stats(100,100);
	
	//sets
	public void setScore(int SC) {
	Score = Score + SC;
	}
	//gets
	public int getScore() {
		return Score;
	}





}
