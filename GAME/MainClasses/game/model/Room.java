package game.model;


public class Room {
	
	//Data
	private int RoomNumber;
	private int NumberOfDoors = 20;
	private int NumberOfEnemies = 0;
	private int EnemyType;
	private boolean Light = true;
	private boolean Searched = false;
	private String RoomDescription;
	
	//Instancing
	Fireplace FP = new Fireplace (false,false,false);
	Inventory INV = new Inventory(false,false);
	Door[] DR = new Door[NumberOfDoors];
	
	//Constructor
	Room(int RN){
		this.RoomNumber = RN;
	}
	
	public void createDoors() {
		for (int i = 0; i < NumberOfDoors; i++) {
			DR[i] = new Door(false,1,0);
		}
		
	}
	//gets
	public int getRoomNumber() {
		return RoomNumber;		
	}
	public int getNumberOfDoors() {
		return NumberOfDoors;		
	}
	public int getNumberOfEnemies() {
		return NumberOfEnemies;		
	}
	public int getEnemyType() {
		return EnemyType;
	}
	public boolean getLight() {
		return Light;		
	}	
	public boolean getSearched() {
		return Searched;		
	}
	public String getEnemyName() {
		if(EnemyType == 0) {
			return "Ghost";
		}
		if(EnemyType == 1) {
			return "Figure";
		}
		return null;
	}
	public String getRoomDescription() {
		return RoomDescription;
	}

	
	//sets
	public void setRoomNumber(int RN) {
		RoomNumber = RN;
	}
	public void setNumberOfDoors(int DN) {
		NumberOfDoors = DN;
	}
	public void setNumberOfEnemies(int EN) {
		NumberOfEnemies = EN;
	}
	public void setEnemyType(int ET) {
		EnemyType = ET;
	}
	public void setLight(boolean LT) {
		Light = LT;
	}
	public void setSearched(boolean SD) {
		Searched = SD;
	}
	public void setRoomDescription(String RD) {
		RoomDescription = RD;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
