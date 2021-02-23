package game.model;

public class Door {
	//Flags and values
	boolean Locked;
	int Exit;
	int lockKeyValue;

	//Instancing
	Exit EXIT = new Exit(0);
	
	//Constructor
	Door(boolean LK, int EX,int KV){
		Locked = LK;
		Exit = EX;
		lockKeyValue = KV;
		
	}
	//Sets
	public void setLocked(boolean LK) {
		Locked = LK;
	}
	public void setExit(int EX) {
		EXIT.setExitValue(EX);
	}	
	public void setlockKeyValue(int KV) {
		lockKeyValue = KV;
	}

	//Gets
	public boolean getLocked() {
		return Locked;
	}
	public int getExit() {
		return EXIT.getExitValue();
	}
	public int getlockKeyValue() {
		return lockKeyValue;
	}
	
}

