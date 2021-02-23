package game.model;
public class Stats {
	//Status
	public int Health;
	public int Sanity;
	
	//Constructor
	Stats(int HP, int SN) {
		Health = HP;
		Sanity = SN;
		}
	
	//Sets
	public void setHealth(int HP) {
		Health = Health + HP;
		}
	public void setSanity(int SN) {
		Sanity = Sanity + SN;
		}
	public void setFullSanity() {
		Sanity = 100;
	}
	
	//Gets
	public int getSanity() {
		return Sanity;
		}
	public int getHealth() {
		return Health;
		}
	
	//Say
	public void sayHealth() {
		System.out.println("Your health is: " + Health);
		}
	public void saySanity() {
		System.out.println("Your Sanity is: " + Sanity);
		}
	public void sayStatus() {
		System.out.println("Your health is: " + Health +"\nYour Sanity is: " + Sanity);
		}
	
	}

