
public class Fireplace {
	boolean inRoom = false;
	boolean hasBeenLit = false;
	boolean isLit = false;
	int sanityRestoration = 100;
	
	public Fireplace(boolean IR,boolean BL, boolean IL){
		inRoom = IR;
		hasBeenLit = BL;
		isLit = IL;
	}
	


	//sets 
	public void setBeenLit(boolean BL) {
		hasBeenLit = BL;
	}
	public void setIsLit(boolean IL) {
		isLit = IL;
	}
	public void setInRoom(boolean IN) {
		inRoom = IN;
	}
	//gets
	public boolean getBeenLit() {
		return hasBeenLit;
	}
	public boolean getIsLit() {
		return isLit;
	}
	public int getSanityRestoration() {
		return sanityRestoration;
	}
	public boolean getInRoom() {
		return inRoom;
	}




}
