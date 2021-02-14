
public class Key {
	private int keyValue = 0;
	private boolean inRoom = false;
	private String keyName = "";
	private boolean inInventory = false;
	
	Key(int KY,boolean IR,String KN){
		keyValue = KY;
		inRoom = IR;
		keyName = KN;
	}
	//set
	public void setKeyValue(int KY) {
		keyValue = KY;
	}
	public void setInRoom(boolean IR) {
		inRoom = IR;
	}
	public void setKeyName(String KN) {
		keyName = KN;
	}
	public void setInInventory(boolean II) {
		inInventory = II;
	}
	
	//get
	public int getKeyValue() {
		return keyValue;
	}
	public boolean getInRoom() {
		return inRoom;
	}
	public String getKeyName() {
		return keyName;
	}
	public boolean getInInventory() {
		return inInventory;
	}
}
