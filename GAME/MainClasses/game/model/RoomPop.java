package game.model;
public class RoomPop {
	

	int AmountOfRooms = 25;
	int AmmountOfFirePlaces = 5;
	Room[] RM = new Room[AmountOfRooms];
	Fireplace[] FP = new Fireplace[AmmountOfFirePlaces];
	
	RoomPop(int RA) {
		AmountOfRooms = RA;
	}
	
	public void populateRoom() {
		
		for (int i = 0; i < AmountOfRooms; i++) {
			RM[i] = new Room(i);
			RM[i].setRoomNumber(i);
			RM[i].createDoors();
			
		}
	}
		
	//set
	public void setAmountOfRooms(int AR) {
		AmountOfRooms = AR;
	}
	//get
	public int getAmountOfRooms() {
		return AmountOfRooms;
	}

	public void customRoomSettings() {
		//DevRoom(Room 0)------------------------------------------------------
			
			//-Items-
				RM[0].INV.Gun.setInRoom(true);
				RM[0].INV.Knife.setInRoom(true);
				RM[0].INV.Salt.setInRoom(true);
				RM[0].INV.ReligiousBook.setInRoom(true);
				RM[0].INV.Ammo.setInRoom(true);
				RM[0].INV.Medicine.setInRoom(true);
				RM[0].INV.Gun.setInRoom(true);
				RM[0].INV.Gun.setInRoom(true);
			//-State-
				RM[0].INV.setEmpty(false);
			//-Enemies-
				RM[0].setNumberOfEnemies(0);
					RM[0].setEnemyType(0);
			//-Doors-
				RM[0].setNumberOfDoors(0);
					RM[0].DR[0].EXIT.setExitValue(1);
			//-RoomDescription-
				RM[0].setRoomDescription("Dev Room");
		//FrontPorch(Room 1)------------------------------------------------
			
			//-Items-
			//-State-
			//-Enemies-
			//-Doors-
				RM[1].setNumberOfDoors(1);
					RM[1].DR[0].EXIT.setExitValue(3);
					RM[1].DR[1].EXIT.setExitValue(2);
			//-RoomDescription-
				RM[1].setRoomDescription("Front Porch");
		//Garage(Room 2)-------------------------------------------------------
			
			//-Items-
				RM[2].INV.setFlashLight(true);
			//-State-
				RM[2].INV.setEmpty(false);
			//-Enemies-
			//-Doors-
				RM[2].setNumberOfDoors(0);
					RM[2].DR[0].EXIT.setExitValue(1);
			//-RoomDescription-
				RM[2].setRoomDescription("Garage");
		//Hallway Floor 1(Room 3)--------------------------------------------
			
			//-Items-
			//-State-
			//-Enemies-
			//-Doors-
				RM[3].setNumberOfDoors(6);
					RM[3].DR[0].EXIT.setExitValue(1);
					RM[3].DR[1].EXIT.setExitValue(4);
					RM[3].DR[2].EXIT.setExitValue(5);
					RM[3].DR[3].EXIT.setExitValue(6);
					RM[3].DR[4].EXIT.setExitValue(7);
					RM[3].DR[5].EXIT.setExitValue(8);
					RM[3].DR[6].EXIT.setExitValue(10);
			//-RoomDescription-
				RM[3].setRoomDescription("Main Hall");		
		//Library(Room 4)--------------------------------------------------------->|_|<-----ART
				
			//-Items-
				RM[4].INV.K1.setInRoom(true);
			//-State-
				RM[4].FP.setInRoom(true);
				RM[4].INV.setEmpty(false);
			//-Enemies-
			//-Doors-
				RM[4].setNumberOfDoors(0);
					RM[4].DR[0].EXIT.setExitValue(3);
			//-RoomDescription-
				RM[4].setRoomDescription("Library");
		//PoolHall(Room 5)-----------------------------------------------------
				
			//-Items-
				RM[5].INV.setLighter(true);
			//-State-
				RM[5].INV.setEmpty(false);
			//-Enemies-
			//-Doors-
				RM[5].setNumberOfDoors(0);
					RM[5].DR[0].EXIT.setExitValue(3);
			//-RoomDescription-
				RM[5].setRoomDescription("Pool Hall");
		//Kitchen(Room 6)---------------------------------------------------
				
			//-Items-
				RM[6].INV.Knife.setInRoom(true);
				RM[6].INV.Medicine.setInRoom(true);
					RM[6].INV.Medicine.setQuantity(1);
			//-State-
				RM[6].INV.setEmpty(false);
			//-Enemies-
			//-Doors-
				RM[6].setNumberOfDoors(1);
					RM[6].DR[0].EXIT.setExitValue(3);
					RM[6].DR[1].EXIT.setExitValue(7);
			//-RoomDescription-
				RM[6].setRoomDescription("kitchen");		
		//Dining Room(Room 7)---------------------------------------------------	
				
			//-Items-
				RM[7].INV.Salt.setInRoom(true);
			//-State-
				RM[7].INV.setEmpty(false);
			//-Enemies-
			//-Doors-
				RM[7].setNumberOfDoors(1);
					RM[7].DR[0].EXIT.setExitValue(3);
					RM[7].DR[1].EXIT.setExitValue(6);
			//-RoomDescription-
				RM[7].setRoomDescription("Dining Room");	
		
		//Lounge(Room 8)---------------------------------------------------------	
				
			//-Items-
			//-State-
			//-Enemies-
			//-Doors-
				RM[8].setNumberOfDoors(1);
					RM[8].DR[0].EXIT.setExitValue(3);
					RM[8].DR[1].EXIT.setExitValue(9);
						RM[8].DR[1].setLocked(true);
						RM[8].DR[1].setlockKeyValue(1);
			//-RoomDescription-
				RM[8].setRoomDescription("Lounge");	
				
		//Green House(Room 9)------------------------------------------------------
				
			//-Items-
				RM[9].INV.K3.setInRoom(true);
			//-State-
				RM[9].INV.setEmpty(false);
			//-Enemies-
				RM[9].setNumberOfEnemies(1);
					RM[9].setEnemyType(1);
			//-Doors-
				RM[9].setNumberOfDoors(0);
					RM[9].DR[0].EXIT.setExitValue(8);
			//-RoomDescription-
				RM[9].setRoomDescription("Green house");
				
		//2ND Story Hall(Room 10)---------------------------------------------------
				
			//-Items-
			//-State-
			//-Enemies-
			//-Doors-
				RM[10].setNumberOfDoors(5);
					RM[10].DR[0].EXIT.setExitValue(3);
					RM[10].DR[1].EXIT.setExitValue(11);
						RM[10].DR[1].setLocked(true);
						RM[10].DR[1].setlockKeyValue(3);
					RM[10].DR[2].EXIT.setExitValue(12);
					RM[10].DR[3].EXIT.setExitValue(13);
					RM[10].DR[4].EXIT.setExitValue(14);
						RM[10].DR[4].setLocked(true);
						RM[10].DR[4].setlockKeyValue(2);
					RM[10].DR[5].EXIT.setExitValue(15);
			//-RoomDescription-
				RM[10].setRoomDescription("Second Floor");
		
		//Study (Room 11)------------------------------------------------------------
				
			//-Items-
				RM[11].INV.K5.setInRoom(true);
				RM[11].INV.ReligiousBook.setInRoom(true);
			//-State-
				RM[11].INV.setEmpty(false);
			//-Enemies-
				RM[11].setNumberOfEnemies(1);
					RM[11].setEnemyType(1);
			//-Doors-
				RM[11].setNumberOfDoors(0);
					RM[11].DR[0].EXIT.setExitValue(10);

			//-RoomDescription-
				RM[11].setRoomDescription("Study");
		
		//Guest Room 1(Room 12)-----------------------------------------------------
				
			//-Items-
				RM[12].INV.Medicine.setInRoom(true);
					RM[12].INV.Medicine.setQuantity(1);
			//-State-
				RM[12].INV.setEmpty(false);	
			//-Enemies-
				RM[12].setNumberOfEnemies(1);
					RM[12].setEnemyType(0);
			//-Doors-
				RM[12].setNumberOfDoors(0);
					RM[12].DR[0].EXIT.setExitValue(10);

			//-RoomDescription-
				RM[12].setRoomDescription("Guest Room 1");
				
		//Guest Room 2(Room 13)-----------------------------------------------------						
				
			//-Items-
				RM[13].INV.Ammo.setInRoom(true);
					RM[12].INV.Ammo.setQuantity(6);
			//-State-
				RM[13].INV.setEmpty(false);	
			//-Enemies-
				RM[13].setNumberOfEnemies(1);
					RM[13].setEnemyType(1);
			//-Doors-
				RM[13].setNumberOfDoors(0);
					RM[13].DR[0].EXIT.setExitValue(10);

			//-RoomDescription-
				RM[13].setRoomDescription("Guest Room 2");
				
		//Office(Room 14)-----------------------------------------------------		
				
			//-Items-
				RM[14].INV.Gun.setInRoom(true);
				RM[14].INV.Ammo.setInRoom(true);
					RM[14].INV.Ammo.setQuantity(6);
				RM[14].INV.K4.setInRoom(true);	
			//-State-
				RM[14].FP.setInRoom(true);
				RM[14].INV.setEmpty(false);
			//-Enemies-
				RM[14].setNumberOfEnemies(1);
					RM[14].setEnemyType(0);
			//-Doors-
				RM[14].setNumberOfDoors(0);
					RM[14].DR[0].EXIT.setExitValue(10);

			//-RoomDescription-
				RM[14].setRoomDescription("Office");
				
		//3rd Floor main room(Room 15)-----------------------------------------------------		
				
			//-Items-
			//-State-
			//-Enemies-
			//-Doors-
				RM[15].setNumberOfDoors(4);
					RM[15].DR[0].EXIT.setExitValue(10);
					RM[15].DR[1].EXIT.setExitValue(16);
						RM[15].DR[1].setLocked(true);
						RM[15].DR[1].setlockKeyValue(5);
					RM[15].DR[2].EXIT.setExitValue(17);
						RM[15].DR[2].setLocked(true);
						RM[15].DR[2].setlockKeyValue(0);
					RM[15].DR[3].EXIT.setExitValue(18);
					RM[15].DR[4].EXIT.setExitValue(19);

			//-RoomDescription-
				RM[15].setRoomDescription("Third Floor");
				
		//Antiques Room (Room 16)-----------------------------------------------------
				
			//-Items-
				RM[16].INV.GoldenIdol.setInRoom(true);
			//-State-
				RM[16].INV.setEmpty(false);
			//-Enemies-
			//-Doors-
				RM[16].setNumberOfDoors(0);
					RM[16].DR[0].EXIT.setExitValue(15);

			//-RoomDescription-
				RM[16].setRoomDescription("Antiques Room");
				
		//Master BedRoom (Room 17)------------------------------------------------------ 
				
			//-Items-
				RM[17].INV.K2.setInRoom(true);
			//-State-
				RM[17].FP.setInRoom(true);
				RM[17].INV.setEmpty(false);
			//-Enemies-
			//-Doors-
				RM[17].setNumberOfDoors(0);
					RM[17].DR[0].EXIT.setExitValue(15);
					

			//-RoomDescription-
				RM[17].setRoomDescription("Master Bedroom");
				
		//Painters Studio  (Room 18)------------------------------------------------------		
				
			//-Items-
				RM[18].INV.Medicine.setInRoom(true);
					RM[18].INV.Medicine.setQuantity(1);
			//-State-
				RM[18].INV.setEmpty(false);	
			//-Enemies-
					RM[18].setNumberOfEnemies(1);
					RM[18].setEnemyType(0);
			//-Doors-
				RM[18].setNumberOfDoors(0);
					RM[18].DR[0].EXIT.setExitValue(15);

			//-RoomDescription-
				RM[18].setRoomDescription("Painting Studio");
				
		//Attic  (Room 19)------------------------------------------------------		
				
			//-Items-
				RM[19].INV.Ammo.setInRoom(true);
					RM[19].INV.Ammo.setQuantity(6);
			//-State-
				RM[19].FP.setInRoom(true);
				RM[19].INV.setEmpty(false);	
				RM[19].setLight(false);
			//-Enemies-
				RM[19].setNumberOfEnemies(1);
					RM[19].setEnemyType(0);
			//-Doors-
				RM[19].setNumberOfDoors(1);
					RM[19].DR[0].EXIT.setExitValue(15);
					RM[19].DR[1].EXIT.setExitValue(20);
						RM[19].DR[1].setLocked(true);
						RM[19].DR[1].setlockKeyValue(4);
						
			//-RoomDescription-
				RM[19].setRoomDescription("Attic");
	
		//Attic Room  (Room 20)------------------------------------------------------		
					
			//-Items-
				RM[20].INV.Ammo.setInRoom(true);
					RM[20].INV.Ammo.setQuantity(6);
			//-State-
				RM[20].setLight(false);	
				RM[20].FP.setInRoom(true);
				RM[20].INV.setEmpty(false);
			//-Enemies-
				RM[20].setNumberOfEnemies(1);
					RM[20].setEnemyType(1);
			//-Doors-
				RM[20].setNumberOfDoors(0);
					RM[20].DR[0].EXIT.setExitValue(19);
						
			//-RoomDescription-
					RM[20].setRoomDescription("Attic Room");					
				
	}
	
	
	
}
