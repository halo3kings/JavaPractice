package game.controller;

import java.util.Scanner;

import game.model.Figure;
import game.model.Ghost;
import game.model.Player;
import game.model.RoomPop;
public class OLDControllerOLD {
	//Instancing

	RoomPop RP = new RoomPop(10);
	Player PLAYER = new Player();
	Scanner keyboard = new Scanner(System.in);

	//Control DATA
	int CurrentRoom = 1;
	int PreviousRoom = 0;
	String userInput;
	double Rando = Math.round((Math.random() * 1));
	boolean ENDGAME;
	
	
	public void getInputResponse() {
		//help,Status,Grab,inventory,search,quit,use,attack,go
		userInput = keyboard.next();
		
		//Status
		if(userInput.equalsIgnoreCase("Status")) {
			PLAYER.STATUS.sayStatus();
			}
		
		//Grab
		if(userInput.equalsIgnoreCase("Grab")) {
			
			if(RP.RM[CurrentRoom].getSearched()) {
				//FlashLight
				if(RP.RM[CurrentRoom].INV.getFlashlight()) {
					PLAYER.INV.setFlashLight(true);
					RP.RM[CurrentRoom].INV.setFlashLight(false);
					System.out.println("You grab the FlashLight");
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);		
				}
				if(RP.RM[CurrentRoom].INV.GoldenIdol.getInRoom()) {
					PLAYER.INV.GoldenIdol.setInRoom(true);
					System.out.println("You grab the treasure of almech");
					PLAYER.setScore(PLAYER.INV.GoldenIdol.getPoints());
				}
				//keys all done manually because i'm feeling lazy
				if(RP.RM[CurrentRoom].INV.K1.getInRoom()) {
					PLAYER.INV.K1.setInInventory(true);
					RP.RM[CurrentRoom].INV.K1.setInRoom(false);
					System.out.println("You grab the "+PLAYER.INV.K1.getKeyName());
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				if(RP.RM[CurrentRoom].INV.K2.getInRoom()) {
					PLAYER.INV.K2.setInInventory(true);
					RP.RM[CurrentRoom].INV.K2.setInRoom(false);
					System.out.println("You grab the "+PLAYER.INV.K2.getKeyName());
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				if(RP.RM[CurrentRoom].INV.K3.getInRoom()) {
					PLAYER.INV.K3.setInInventory(true);
					RP.RM[CurrentRoom].INV.K3.setInRoom(false);
					System.out.println("You grab the "+PLAYER.INV.K3.getKeyName());
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				if(RP.RM[CurrentRoom].INV.K4.getInRoom()) {
					PLAYER.INV.K4.setInInventory(true);
					RP.RM[CurrentRoom].INV.K4.setInRoom(false);
					System.out.println("You grab the "+PLAYER.INV.K4.getKeyName());
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				if(RP.RM[CurrentRoom].INV.K5.getInRoom()) {
					PLAYER.INV.K5.setInInventory(true);
					RP.RM[CurrentRoom].INV.K5.setInRoom(false);
					System.out.println("You grab the "+PLAYER.INV.K5.getKeyName());
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				if(RP.RM[CurrentRoom].INV.K6.getInRoom()) {
					PLAYER.INV.K6.setInInventory(true);
					RP.RM[CurrentRoom].INV.K6.setInRoom(false);
					System.out.println("You grab the "+PLAYER.INV.K6.getKeyName());
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				//Lighter	
				if(RP.RM[CurrentRoom].INV.getLighter()) {
					PLAYER.INV.setLighter(true);
					RP.RM[CurrentRoom].INV.setLighter(false);
					System.out.println("You grab the Lighter");
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				//Gun	
				if(RP.RM[CurrentRoom].INV.Gun.getInRoom()) {
					PLAYER.INV.Gun.setQuantity(1);
					RP.RM[CurrentRoom].INV.Gun.setInRoom(false);
					System.out.println("You grab the handgun");
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				//Knife	
				if(RP.RM[CurrentRoom].INV.Knife.getInRoom()) {
					PLAYER.INV.Knife.setQuantity(1);
					RP.RM[CurrentRoom].INV.Knife.setInRoom(false);
					System.out.println("You grab the knife");	
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				//Salt
				if(RP.RM[CurrentRoom].INV.Salt.getInRoom()) {
					PLAYER.INV.Salt.setQuantity(1);
					RP.RM[CurrentRoom].INV.Salt.setInRoom(false);
					System.out.println("You grab the Salt");	
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				//Religious book
				if(RP.RM[CurrentRoom].INV.ReligiousBook.getInRoom()) {
					PLAYER.INV.ReligiousBook.setQuantity(1);
					RP.RM[CurrentRoom].INV.ReligiousBook.setInRoom(false);
					System.out.println("You grab the Religious Book");	
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				//ammo
				if(RP.RM[CurrentRoom].INV.Ammo.getInRoom()) {
					PLAYER.INV.Ammo.setQuantity(12);
					RP.RM[CurrentRoom].INV.Ammo.setInRoom(false);
					System.out.println("You grab 12 rounds of handgun ammo");	
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				//Medicine
				if(RP.RM[CurrentRoom].INV.Medicine.getInRoom()) {
					PLAYER.INV.Medicine.setQuantity(1);
					RP.RM[CurrentRoom].INV.Medicine.setInRoom(false);
					System.out.println("You grab some medicine ");	
					PLAYER.setScore(100);
					userInput = "";
					PLAYER.INV.setEmpty(false);
				}
				if(RP.RM[CurrentRoom].INV.getEmpty()== true) {
					System.out.println("There is nothing here to grab");
				}
				if(RP.RM[CurrentRoom].getSearched() == false) {
				System.out.println("You havent searched the room");
				}
				RP.RM[CurrentRoom].INV.setEmpty(true);
			}
		}
		
		//inventory
		if(userInput.equalsIgnoreCase("Inventory")) {
			PLAYER.INV.sayInventory();			
		}
		
		//search
		if(userInput.equalsIgnoreCase("Search")) {
			if(RP.RM[CurrentRoom].getLight() == true) {
				RP.RM[CurrentRoom].setSearched(true);
				System.out.println("You searched the room");
				PLAYER.setScore(100);
			}if(RP.RM[CurrentRoom].getLight() == false) {
				System.out.println("its too dark to look around");
			}
		}
		
		//quit
		if(userInput.equalsIgnoreCase("QUIT")) {
			System.exit(0);
		}
		
		//use
		if(userInput.equalsIgnoreCase("Use")) {
			boolean USE = true;
			
			if(PLAYER.INV.getEmpty()) {
				System.out.println("you have no items to use");
				USE = false;
				userInput = "";
			}
			
			while(USE){
				
				System.out.println("use what");
				userInput = keyboard.nextLine();
				
				if(userInput.equalsIgnoreCase("Flashlight")) {
					RP.RM[CurrentRoom].setLight(true);
					System.out.println("the room is now lit");
					PLAYER.setScore(100);
					userInput = "";
					USE = false;
				}
				if(userInput.equalsIgnoreCase("cancel")) {
					userInput = "";
					USE = false;
				}
				
				if(userInput.equalsIgnoreCase("key")) {
					//System.out.println("use key is has been tested as true moving on to the keys...");
											
					if(PLAYER.INV.K1.getInInventory()) {
						//System.out.println("k1 in inventory is true checking if it matches the door lock value");
							
						for(int i = 0; i <= RP.RM[CurrentRoom].getNumberOfDoors();i++) {
							//System.out.println("checking door( "+i+" )");
							if(PLAYER.INV.K1.getKeyValue() == RP.RM[CurrentRoom].DR[i].getlockKeyValue()&& RP.RM[CurrentRoom].DR[i].getLocked()) {
								RP.RM[CurrentRoom].DR[i].setLocked(false);
								System.out.println("Youve unlocked the "+RP.RM[RP.RM[CurrentRoom].DR[i].EXIT.exitValue].getRoomDescription());
								System.out.println("You no longer need this key...");
								PLAYER.setScore(100);
								PLAYER.INV.K1.setInInventory(false);
								userInput = "";
								USE = false;
								break;
								}
							}
						}
					
						if(PLAYER.INV.K2.getInInventory()) {
							//System.out.println("k2 in inventory is true checking if it matches the door lock value");
							
							for(int i = 0; i <= RP.RM[CurrentRoom].getNumberOfDoors();i++) {
								//System.out.println("checking door( "+i+" )");
								if(PLAYER.INV.K2.getKeyValue() == RP.RM[CurrentRoom].DR[i].getlockKeyValue()&& RP.RM[CurrentRoom].DR[i].getLocked()) {
									RP.RM[CurrentRoom].DR[i].setLocked(false);
									System.out.println("Youve unlocked the "+RP.RM[RP.RM[CurrentRoom].DR[i].EXIT.exitValue].getRoomDescription());
									System.out.println("You no longer need this key...");
									PLAYER.setScore(100);
									PLAYER.INV.K2.setInInventory(false);
									userInput = "";
									USE = false;
									break;
									}
								}
							}
						if(PLAYER.INV.K3.getInInventory()) {
						//System.out.println("k3 in inventory is true checking if it matches the door lock value");
							
						for(int i = 0; i <= RP.RM[CurrentRoom].getNumberOfDoors();i++) {
							//System.out.println("checking door( "+i+" )");
							if(PLAYER.INV.K3.getKeyValue() == RP.RM[CurrentRoom].DR[i].getlockKeyValue()&& RP.RM[CurrentRoom].DR[i].getLocked()) {
								RP.RM[CurrentRoom].DR[i].setLocked(false);
								System.out.println("Youve unlocked the "+RP.RM[RP.RM[CurrentRoom].DR[i].EXIT.exitValue].getRoomDescription());
								System.out.println("You no longer need this key...");
								PLAYER.setScore(100);
								PLAYER.INV.K3.setInInventory(false);
								userInput = "";
								USE = false;
								break;
								}
							}
						}
						if(PLAYER.INV.K4.getInInventory()) {
						//System.out.println("k4 in inventory is true checking if it matches the door lock value");
							
						for(int i = 0; i <= RP.RM[CurrentRoom].getNumberOfDoors();i++) {
							//System.out.println("checking door( "+i+" )");
							if(PLAYER.INV.K4.getKeyValue() == RP.RM[CurrentRoom].DR[i].getlockKeyValue()&& RP.RM[CurrentRoom].DR[i].getLocked()) {
								RP.RM[CurrentRoom].DR[i].setLocked(false);
								System.out.println("Youve unlocked the "+RP.RM[RP.RM[CurrentRoom].DR[i].EXIT.exitValue].getRoomDescription());
								System.out.println("You no longer need this key...");
								PLAYER.setScore(100);
								PLAYER.INV.K4.setInInventory(false);
								userInput = "";
								USE = false;
								break;
								}
							}
						}
						
						if(PLAYER.INV.K5.getInInventory()) {
						//System.out.println("k5 in inventory is true checking if it matches the door lock value");
							
						for(int i = 0; i <= RP.RM[CurrentRoom].getNumberOfDoors();i++) {
							//System.out.println("checking door( "+i+" )");
							if(PLAYER.INV.K5.getKeyValue() == RP.RM[CurrentRoom].DR[i].getlockKeyValue()&& RP.RM[CurrentRoom].DR[i].getLocked()) {
								RP.RM[CurrentRoom].DR[i].setLocked(false);
								System.out.println("Youve unlocked the "+RP.RM[RP.RM[CurrentRoom].DR[i].EXIT.exitValue].getRoomDescription());
								System.out.println("You no longer need this key...");
								PLAYER.setScore(100);
								PLAYER.INV.K5.setInInventory(false);
								userInput = "";
								USE = false;
								break;
								}
							}
						}
						if(PLAYER.INV.K6.getInInventory()) {
						//System.out.println("k6 in inventory is true checking if it matches the door lock value");
							
						for(int i = 0; i <= RP.RM[CurrentRoom].getNumberOfDoors();i++) {
							//System.out.println("checking door( "+i+" )");
							if(PLAYER.INV.K6.getKeyValue() == RP.RM[CurrentRoom].DR[i].getlockKeyValue()&& RP.RM[CurrentRoom].DR[i].getLocked()) {
								RP.RM[CurrentRoom].DR[i].setLocked(false);
								System.out.println("Youve unlocked the "+RP.RM[RP.RM[CurrentRoom].DR[i].EXIT.exitValue].getRoomDescription());
								System.out.println("You no longer need this key...");
								PLAYER.setScore(100);
								PLAYER.INV.K6.setInInventory(false);
								userInput = "";
								USE = false;
								break;
								}
							}
						}
						if(PLAYER.INV.K1.getInInventory() && PLAYER.INV.K2.getInInventory() && PLAYER.INV.K3.getInInventory() && PLAYER.INV.K4.getInInventory() && PLAYER.INV.K4.getInInventory() && PLAYER.INV.K6.getInInventory() == false) {
							System.out.println("You do not have the key to unlock the door(s)");
							USE = false;
							break;
						}
				
				}
				if(userInput.equalsIgnoreCase("lighter")) {
					if(RP.RM[CurrentRoom].FP.getInRoom()) {
						
						if(PLAYER.STATUS.getSanity() >= 99) {
							System.out.println("you light the lighter but nothing happens");
						}
						if(PLAYER.STATUS.getSanity() <= 99 && RP.RM[CurrentRoom].FP.getBeenLit() == false) {
							PLAYER.STATUS.setFullSanity();
							RP.RM[CurrentRoom].FP.setBeenLit(true);
							PLAYER.setScore(100);
							System.out.println("you light the fireplace and you begin to feel much calmer");
						}
						if(PLAYER.STATUS.getSanity() <= 99 && RP.RM[CurrentRoom].FP.getBeenLit() == true){
							System.out.println("the room is now lightly lit. you feel more relaxed");
							PLAYER.STATUS.setSanity(5);
						}
					}
					userInput = "";
					USE = false;
				}
					
				if(userInput.equalsIgnoreCase("Gun") || userInput.equalsIgnoreCase("Knife")||
						userInput.equalsIgnoreCase("Salt")||userInput.equalsIgnoreCase("Book")||userInput.equalsIgnoreCase("Ammo") ) {
					System.out.println("now is not the time to use it");
					userInput = "";
					USE = false;
				}

				if(userInput.equalsIgnoreCase("medicine")) {
					
					if(PLAYER.STATUS.getHealth() < 100){
						PLAYER.STATUS.setHealth(PLAYER.INV.Medicine.getDamage());
						PLAYER.INV.Medicine.setQuantity(-1);
						System.out.println("you feel a bit better");
						PLAYER.setScore(100);
						userInput = "";
						USE = false;						
					}
					
					if(PLAYER.STATUS.getHealth()== 100) {
		 				System.out.println("now is not the time to use it");
						userInput = "";
						USE = false;
					}					
					
				}				
				
			}
  
		}
		
		
		if(userInput.equalsIgnoreCase("Attack")) {

			if(RP.RM[CurrentRoom].getNumberOfEnemies() <= 0) {
				System.out.println("there is nothing here to attack.");
			}
			
			while(RP.RM[CurrentRoom].getNumberOfEnemies() >= 1) {
				boolean Attack = true;
				boolean PlayerAttack = true;
				boolean EnemyAttack = false;
				
				Ghost GHOST = new Ghost(); //0 for ghost 
				Figure FIGURE = new Figure();//1 for figure
				System.out.println("Number of enemies in room " + RP.RM[CurrentRoom].getNumberOfEnemies());
				
				while(Attack) {
					
					if(PLAYER.STATUS.getHealth() == 0 || PLAYER.STATUS.getSanity() == 0) {
						userInput = "";
						Attack = false;
						break;
					}
					if(GHOST.STATUS.getHealth() <= 0) {
						RP.RM[CurrentRoom].setNumberOfEnemies(0);
						System.out.println("There are no longer enemies in the room" );
						PLAYER.setScore(GHOST.getScore());
						userInput = "";
						Attack = false;
						break;
					}
					if(FIGURE.STATUS.getHealth() <= 0) {
						RP.RM[CurrentRoom].setNumberOfEnemies(0);
						System.out.println("There are no longer enemies in the room" );
						PLAYER.setScore(FIGURE.getScore());
						userInput = "";
						Attack = false;
						break;
					}
					if(PLAYER.STATUS.getSanity() <= 0 || PLAYER.STATUS.getHealth() <= 0) {//Game over with score printed
						
					}
					if(PlayerAttack == true) {					
						System.out.println("You begin to attack the " + RP.RM[CurrentRoom].getEnemyName() +". what do you attack with.");
						PLAYER.STATUS.sayStatus();
						userInput = keyboard.next();

							if(userInput.equalsIgnoreCase("Gun") && PLAYER.INV.Gun.getQuantity() == 1 && PLAYER.INV.Ammo.getQuantity() >=1 ) {
								if(RP.RM[CurrentRoom].getEnemyType() == 0) {
									System.out.println("You shoot the Ghost. However the bullet passes right through it.");
									PLAYER.INV.Ammo.setQuantity(-1);
									PlayerAttack = false;
									EnemyAttack = true;
								}
								if(RP.RM[CurrentRoom].getEnemyType() == 1) {
									System.out.println("You shoot the Figure. The Figure lurches back in pain.");
									PLAYER.INV.Ammo.setQuantity(-1);
									FIGURE.STATUS.setHealth(PLAYER.INV.Gun.getDamage());
									System.out.println("Figure HP: "+FIGURE.STATUS.getHealth());
									PLAYER.setScore(25);
									PlayerAttack = false;
									EnemyAttack = true;
								}
							}
							
							if(userInput.equalsIgnoreCase("Knife") && PLAYER.INV.Knife.getQuantity() == 1) {
								if(RP.RM[CurrentRoom].getEnemyType() == 0) {
									System.out.println("You slash at the Ghost. However nothing happens.");
									PlayerAttack = false;
									EnemyAttack = true;
								}
								if(RP.RM[CurrentRoom].getEnemyType() == 1) {
									System.out.println("You slash at the Figure. The Figure dashes back in pain.");
									FIGURE.STATUS.setHealth(PLAYER.INV.Knife.getDamage());
									System.out.println("Figure HP: "+FIGURE.STATUS.getHealth());
									PLAYER.setScore(25);
									PlayerAttack = false;
									EnemyAttack = true;
								}
							}
							
							if(userInput.equalsIgnoreCase("Salt") && PLAYER.INV.Salt.getQuantity() == 1) {
								if(RP.RM[CurrentRoom].getEnemyType() == 0) {
									System.out.println("You throw a fist full of salt at the ghost. You see it recoil in pain.");
									GHOST.STATUS.setHealth(PLAYER.INV.Salt.getDamage());
									System.out.println("Ghost HP: "+GHOST.STATUS.getHealth());
									PLAYER.setScore(25);
									PlayerAttack = false;
									EnemyAttack = true;
								}
								if(RP.RM[CurrentRoom].getEnemyType() == 1) {
									System.out.println("You throw a fist full of salt at the Figure. it barely flintches ");
									FIGURE.STATUS.setHealth(PLAYER.INV.Salt.getDamage());
									PlayerAttack = false;
									EnemyAttack = true;
								}
							}
							
							if(userInput.equalsIgnoreCase("Book") && PLAYER.INV.ReligiousBook.getQuantity() == 1) {
								if(RP.RM[CurrentRoom].getEnemyType() == 0) {
									System.out.println("You read from the book. The Ghost Howls in pain");
									GHOST.STATUS.setHealth(PLAYER.INV.ReligiousBook.getDamage());
									System.out.println(GHOST.STATUS.getHealth());
									PLAYER.setScore(25);
									PlayerAttack = false;
									EnemyAttack = true;
								}
								if(RP.RM[CurrentRoom].getEnemyType() == 1) {
									System.out.println("You Read from the book. The figure Paces unfazed");
									PlayerAttack = false;
									EnemyAttack = true;
								}
							}
							if(userInput.equalsIgnoreCase("FingerGuns")  && PLAYER.INV.FingerGun.getQuantity() == 1) {
								if(RP.RM[CurrentRoom].getEnemyType() == 0) {
									System.out.println("You slowly make a gun with your fingers, the ghost laughs at you. as you drop the thumb hammer \nthe ghost instantly begins to shake violently and finally it gets ripped appart atom by atom");
									GHOST.STATUS.setHealth(PLAYER.INV.FingerGun.getDamage());
									System.out.println("Ghost HP: "+GHOST.STATUS.getHealth());
									PLAYER.setScore(25);
									PlayerAttack = false;
									EnemyAttack = true;
								}
								if(RP.RM[CurrentRoom].getEnemyType() == 1) {
									System.out.println("You slowly make a gun with your fingers, the figure laughs at you. as you drop the thumb hammer \nthe figure stops in its tracks, blood begins to pour from its orifaces and soon its entire body begins to colapse inward on itself as if a black hole appeared within its stomach.");
									FIGURE.STATUS.setHealth(PLAYER.INV.FingerGun.getDamage());
									System.out.println("Figure HP: "+FIGURE.STATUS.getHealth());
									PlayerAttack = false;
									EnemyAttack = true;
								}	
							}
							if(userInput.equalsIgnoreCase("Run")){
								
								if(RP.RM[CurrentRoom].getEnemyType() == 0) {
									PLAYER.STATUS.setSanity(GHOST.INV.GhostAttack.getDamage());
									System.out.println("The Ghost Drains your sanity, but you managed to escape.");
									CurrentRoom = PreviousRoom;
									Attack = false;
									break;
								}
								if(RP.RM[CurrentRoom].getEnemyType() == 1) {
									PLAYER.STATUS.setHealth(FIGURE.INV.FigureAttack.getDamage());
									System.out.println("The Figure Attacks you, but you managed to escape.");
									CurrentRoom = PreviousRoom;
									Attack = false;
									break;
								}
							}
						}
							
						while(EnemyAttack = true) {
							if(RP.RM[CurrentRoom].getEnemyType() == 0 && GHOST.STATUS.getHealth() >= 1) {
								PLAYER.STATUS.setSanity(GHOST.INV.GhostAttack.getDamage());
								System.out.println("The Ghost Drains your sanity");
								EnemyAttack = false;
								PlayerAttack = true;
							}
							if(RP.RM[CurrentRoom].getEnemyType() == 1 && FIGURE.STATUS.getHealth() >= 1) {
								PLAYER.STATUS.setHealth(FIGURE.INV.FigureAttack.getDamage());
								System.out.println("The Figure Attacks you.");
								EnemyAttack = false;
								PlayerAttack = true;
							}
							break;
						}
							
					
						
					}
					break;
				}
		}
					
				
			
	
		//Help
		if(userInput.equalsIgnoreCase("help")) {
			System.out.println("commands: help,Status,Grab,inventory,search,quit,use,attack,Go");
		}
		
		//Go
		if(userInput.equalsIgnoreCase("Go")) {
			
			if(RP.RM[CurrentRoom].getNumberOfEnemies() >= 1)
			{
				System.out.println("something blocks the door");

				
			}else {
			
			System.out.println("Go where? ");
			
			for(int i = 0; i <= RP.RM[CurrentRoom].getNumberOfDoors();i++ ) {
				System.out.println(RP.RM[RP.RM[CurrentRoom].DR[i].EXIT.getExitValue()].getRoomDescription());	
			}
			
			//System.out.println(RP.RM[0].getRoomDescription());
			
			userInput = keyboard.nextLine();
			userInput = keyboard.nextLine();
			
			boolean Searching = true;
			while(Searching == true) {
				for (int i = 0; i < RP.AmountOfRooms;) { // for the amount of rooms made search them all
					
					//System.out.println(userInput);
					//System.out.println("Checking "+RP.RM[i].getRoomDescription());
					if(RP.RM[i].getRoomDescription() == null) { //if there is no description, then there's probably no room so stop trying
						Searching = false;
						break;
					}
					if(RP.RM[i].getRoomDescription().equalsIgnoreCase(userInput)) { // testing user string room name matches the room being searched.
						
					//	System.out.println("Room Description matched true now searching door values....");
						for (int b = 0; b <= RP.RM[CurrentRoom].getNumberOfDoors();) { //if user input matches a room, then for each door in the room check each door for:
							
							//System.out.println("currently the room were searching. ( "+ RP.RM[i].getRoomDescription() + ") door being searched ( " + b +" )...");  // help debug any room issues
							//System.out.println("Now testing if ( "+ RP.RM[CurrentRoom].getRoomDescription() + " ) room Door ("+b+") to see if room ( \""+i+" "+RP.RM[i].getRoomDescription()+"\") room number matches the searched door exit value. and if room ( \""+RP.RM[i].getRoomDescription()+"\" ) door ( "+b+" ) is locked....");
							
							if(RP.RM[CurrentRoom].DR[b].EXIT.getExitValue() == RP.RM[i].getRoomNumber() && RP.RM[CurrentRoom].DR[b].getLocked() == false) { //if our current room's door exit leads to the room were checking and if its not locked then change our current room to the new room being searched.
								System.out.println("You are at the "+RP.RM[i].getRoomDescription());
								PreviousRoom = CurrentRoom;
								CurrentRoom = RP.RM[i].getRoomNumber();
								userInput = "";
								Searching = false;
								break;
							}
						//	System.out.println("now testing if room is accessible from current location....");
							 //b == RP.RM[CurrentRoom].getNumberOfDoors() 
							if(b == RP.RM[CurrentRoom].getNumberOfDoors() && RP.RM[CurrentRoom].DR[b].EXIT.getExitValue() != RP.RM[i].getRoomNumber()) { // if our current room, and all its doors exits dont match the room were searching, and their door exit values then we cannot go to that room from where we are.
								System.out.println("you cannot go to that room from here.");
								userInput = "";
								Searching = false;
								break;
							}
						//	System.out.println("pretty much testing what the first check was testing but now has a different action if door is locked...");
							
							if(RP.RM[CurrentRoom].DR[b].EXIT.getExitValue() == RP.RM[i].getRoomNumber() && RP.RM[CurrentRoom].DR[b].getLocked() == true) { //if our current room's door exit leads to the room were checking and if its locked then say its locked. 
								System.out.println("the room is locked");
								userInput = "";
								Searching = false;
								break;
							}
							
							 else {
						//		System.out.println("door ( "+b+" ) did not match the the room trying a new door...\n");
								b++;
							}
						}

					}else {
						i++;
						}
					}
				}
			

			}
		}
		
		//dev tools
		if(userInput.equalsIgnoreCase("DevRoomNumber")) {
			System.out.println(CurrentRoom);
			}
		if(userInput.equalsIgnoreCase("DevRoomNumberOfExits")) {
			System.out.println(RP.RM[CurrentRoom].getNumberOfDoors());
			}
		//Cheats
		if(userInput.equalsIgnoreCase("LendLease")) {
			System.out.println("The united states government has provided you with assistance for this mission.");
			PLAYER.INV.Ammo.setQuantity(1200);
			PLAYER.INV.Medicine.setQuantity(1200);
			PLAYER.INV.Gun.setQuantity(1);
			PLAYER.INV.ReligiousBook.setQuantity(1);
			PLAYER.INV.FingerGun.setQuantity(1);
			
			}
		if(userInput.equalsIgnoreCase("lockpick")) {
			System.out.println("who wouldnt bring a lock pick to a mansion");
			PLAYER.INV.K1.setInInventory(true);
			PLAYER.INV.K2.setInInventory(true);
			PLAYER.INV.K3.setInInventory(true);
			PLAYER.INV.K4.setInInventory(true);
			PLAYER.INV.K5.setInInventory(true);
			PLAYER.INV.K6.setInInventory(true);
			PLAYER.INV.setEmpty(false);
			}
	}
	
	
	

	public void setUserInput(String UI) {
		userInput = UI;
		
	}
	public void setUpRooms() {
		RP.setAmountOfRooms(25);
		//System.out.println("Amount of rooms set to 10. Printed results: "+ RP.getAmountOfRooms());
		RP.populateRoom();
		//System.out.println("Rooms Populated. Printed results: "+ RP.RM[0].getRoomNumber()+"RoomNumber\n");
		RP.customRoomSettings();
		//System.out.println("Custom Rooms Populated. Printed results: "+ RP.RM[0].INV.Gun.getQuantity()+"Gun Quantity\n");
		
	}
	public boolean getEndGame() {
		if(PLAYER.INV.GoldenIdol.getInRoom() == true && CurrentRoom == 1) {
			return ENDGAME;
		}
		return false;
	}
	
//	public void setUpCharacter() {
//		Player PLAYERMAIN = new Player();
//		PLAYER = PLAYERMAIN;
//	}
	
}
	

				
			
		
	

	

