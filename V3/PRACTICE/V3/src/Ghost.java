
public class Ghost {
	//Weakness
	boolean Weakness_HolyBook = true;
	boolean Weakness_Salt = true;
	boolean Weakness_FingerGuns = true;
	//Data
	int Score = 100;
	
	//Instancing
	Inventory INV = new Inventory(false,false);
	Stats STATUS = new Stats(50,50);
	
	public void setInventory() {
		INV.GhostAttack.setQuantity(1);
	}
	//gets
	public int getScore() {
		return Score;
	}
	
	}

	

