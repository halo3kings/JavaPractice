package game.model;

public class Figure {

	//Weakness
	boolean Knife = true;
	boolean Gun = true;
	boolean Weakness_FingerGuns = true;
	//Data
	int Score = 100;
	
	//Instancing
	Inventory INV = new Inventory(false,false);
	Stats STATUS = new Stats(50,50);
	
	public void setInventory() {
		INV.FigureAttack.setQuantity(1);
	}
	//gets
	public int getScore() {
		return Score;
	}
	
	
}
	

