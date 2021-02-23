package game.model;

public class ComplexItem {
	//Statistics
	public int Quantity;
	public int Damage;
	public int Score;
	public boolean inRoom;
	
	
	//Constructor
	ComplexItem(int QT, int DM, int SC,boolean IR){
		Quantity = QT;
		Damage = DM;
		Score = SC;
		inRoom = IR;
		
	}
	
	//gets 
	public int getQuantity() {
		return Quantity;
	}
	public int getDamage() {
		return Damage;
	}
	public boolean getInRoom() {
		return inRoom;
	}
	
	//sets 
	public void setQuantity(int QT) {
		Quantity = Quantity + QT;
	}
	public void setDamage(int DM) {
		Damage = Damage + DM;
	}
	public void setInRoom(boolean IR) {
		inRoom = IR;
	}
	
}

