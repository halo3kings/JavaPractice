import java.util.Scanner;
public class fuckingMcFuck
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean gameState = true;
        
        String roomLetter;
        String userInput;
        String lastRoom = "A";
        //defaults
        String firstRoom = "A";
        //Inventory
        boolean flashLight = false;
        boolean gun = false;
        boolean holyBook = false;
        boolean knife = false;
        boolean key_0 = false;
        int ammunition = 0;
        //Status
        int HP = 100;
        int Sanity = 100;
        //Ghost and enemy damage
        int ghostAttack = 10;
        int enemyAttack = 10;
        //Weapon attacks damage
        int gunAttack = 25;
        int knifeAttack = 10;
        int holyBookAttack = 25;
        int fistAttack = 5;
        //enemies in rooms
        boolean enemyInRoom_A = true;
        
    
        
        System.out.println("You've finally arrived at the house.\n\nThe mansion screams run away, but you know theres a mystery behind those doors.\nyou cant run now, you have to get to the bottom of this mystery.");
        while(gameState = true){
            roomLetter="A";
            while(roomLetter.equals("A")){
                //Items in rooms.
                boolean itemInRoom = false;
                boolean itemFoundInRoom = false;
                //Enemy in room
                boolean ghostInRoom = false;
                boolean enemyInRoom = false;
                int numberOfEnemiesPresent = 0;
                int numberOfGhostPresent = 0;
                //enemiesHP
                int enemyHp = 0;
                int ghostHp = 0;

                //exposition
                System.out.println("You are at the Porch of the mansion\n");
                System.out.println("What would you like to do. help for help\n");
                //Enemy
                if(enemyInRoom_A = true && numberOfEnemiesPresent > 0)
                {
                    enemyInRoom = false;
                    ghostInRoom = false;
                }
                if(enemyInRoom == true && numberOfEnemiesPresent >= 1)
                {
                    System.out.println("You suddenly feel you are no longer alone...\n");
                    enemyHp = 50;

                }
                if(ghostInRoom == true){
                      System.out.println("You feel a chill down your spine...\n");
                      ghostHp = 50;
                }
                if(enemyHp <= 0 && enemyInRoom == true){
                    System.out.println("the figure slams to to ground and the body dissapears...THIS IS THE FIRST SECTION");
                    numberOfEnemiesPresent = numberOfEnemiesPresent - 1;
                }                
                //Inputs
                userInput = keyboard.next();
                //Help
                if(userInput.equalsIgnoreCase("help")){
                    System.out.println("commands:Help,Status,Enter,Inventory,Attack,Use,Search,Grab,Quit,\n");
                    }
                //Cheats    
                if(userInput.equalsIgnoreCase("Godmode")){
                    ammunition = 10000;
                    gun = true;
                    holyBook = true;
                    gunAttack = 100;
                    holyBookAttack = 100;
                    System.out.println("its party time\n");
                }
                //dev tools
                if(userInput.equalsIgnoreCase("killnow")){
                    System.exit(0);
                    }                
                //Status    
                if(userInput.equalsIgnoreCase("Status")){
                    System.out.println("HP: " + HP);
                    }                    
                //Enter
                if(userInput.equalsIgnoreCase("Enter")){
                    if(enemyInRoom == true){
                        System.out.println("as you go to leave something grabs you...\n");
                        userInput = keyboard.next();
                    }
                    if(enemyInRoom == false && ghostInRoom == false){
                        System.out.println("where do you want to go? the Garage or the Hall?\n");
                        userInput = keyboard.next();
                            if(userInput.equalsIgnoreCase("garage")){
                                lastRoom = roomLetter;
                                roomLetter = "b";
                            }
                            if(userInput.equalsIgnoreCase("Hall")){
                                lastRoom = roomLetter;
                                roomLetter = "c";
                            }                            
                    }
                    if(ghostInRoom == true){
                        System.out.println("as you leave the door shuts behind you on its own...\n");
                        System.out.println("where do you want to go? the Garage or the Hall?\n");
                        userInput = keyboard.next();
                            if(userInput.equalsIgnoreCase("garage")){
                                lastRoom = roomLetter;
                                roomLetter = "b";
                            }
                            if(userInput.equalsIgnoreCase("Hall")){
                                lastRoom = roomLetter;
                                roomLetter = "c";
                            }                         
                    }                    
                    }
                //Inventory    
                if(userInput.equalsIgnoreCase("Inventory")){
                        if(flashLight == true){
                            System.out.println("You have a flashlight\n");
                    }
                        if(gun == true){
                            System.out.println("You have a Gun\n");
                    }
                        if(key_0 == true){
                            System.out.println("You have a Key\n");
                    }else{
                            System.out.println("You have no items\n");
                    }
                }
                //Attack
                if(userInput.equalsIgnoreCase("Attack")){
                        
                        if(enemyInRoom == false && ghostInRoom == false){
                            System.out.println("theres nothing to attack you are alone.\n");
                        }
                        //Figure combat
                        while(enemyInRoom == true && enemyHp >= 0 && numberOfEnemiesPresent >= 1){
                            System.out.println("atack with what?\n");
                            userInput = keyboard.next();
                            //shooting the enemy
                            if(userInput.equalsIgnoreCase("gun")&& gun == true && ammunition > 0 && HP > 0){
                                System.out.println("you draw your gun and shoot the figure...\n");
                                enemyHp = enemyHp - gunAttack;                                
                                if(enemyHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    HP = HP - enemyAttack;
                                }
                                if(enemyHp <= 0){
                                    System.out.println("the figure slams to to ground and the body dissapears... THIS IS IN THE ATTACK SECTION");
                                    numberOfEnemiesPresent = numberOfEnemiesPresent - 1;
                                    break;
                                }
                            }
                            //shooting the enemy with no ammo
                            if(userInput.equalsIgnoreCase("gun")&& gun == true && ammunition == 0 && HP > 0){
                                System.out.println("you draw your gun and shoot the figure...*click* your out of ammo...\n");
                                enemyHp = enemyHp - fistAttack;
                                if(enemyHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    HP = HP - enemyAttack;
                                }
                                
                            }
                            //shooting the enemy without a gun
                            if(userInput.equalsIgnoreCase("gun")&& gun == false && HP > 0){
                                System.out.println("you draw your finger gun and shoot the figure. the figure laughs at you...\n");
                                enemyHp = enemyHp - fistAttack;
                                if(enemyHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    HP = HP - enemyAttack;
                                }
                                
                            }
                            //Attacking with a knife
                            if(userInput.equalsIgnoreCase("knife")&& knife == true && HP > 0){
                                System.out.println("you draw your gun and shoot the figure...\n");
                                enemyHp = enemyHp - knifeAttack;
                                if(enemyHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    HP = HP - enemyAttack;
                                }
                                                                
                            }
                            //attacking without the knife
                            if(userInput.equalsIgnoreCase("knife")&& knife == false && HP > 0){
                                System.out.println("you have no knife...\n");
                                enemyHp = enemyHp - fistAttack;
                                if(enemyHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    HP = HP - enemyAttack;
                                }
                                                                
                            }
                            //attacking with the book
                            if(userInput.equalsIgnoreCase("holy book")&& holyBook == true && HP > 0){
                                System.out.println("you pull out the holy book and read the first words you see. it had no effect...\n");
                                if(enemyHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    HP = HP - enemyAttack;
                                }
                                                                
                            }
                            //Attacking with a missing book
                            if(userInput.equalsIgnoreCase("holy book")||userInput.equalsIgnoreCase("book") && holyBook == false && HP > 0){
                                System.out.println("you dont have the book...\n");
                                enemyHp = enemyHp - fistAttack;
                                if(enemyHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    HP = HP - enemyAttack;
                                }
                                                                
                            }
                            //Attacking with hands
                            if(userInput.equalsIgnoreCase("Hands") && HP > 0){
                                System.out.println("you begin to attack the figure with your fists\n");
                                enemyHp = enemyHp - fistAttack;
                                if(enemyHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    HP = HP - enemyAttack;
                                }
                                                                
                            }
                            //Run
                            if(userInput.equalsIgnoreCase("Run") && HP > 0){
                                System.out.println("You break free and run back to the room you came from");
                                roomLetter = lastRoom; 
                                break;
                            }
                            //no Hp left
                            if( HP == 0){
                                System.out.println("You are dead...");
                                roomLetter = firstRoom; 
                                break;
                            }                            
                        }
                        //Ghost combat
                        while(ghostInRoom == true && enemyHp >= 0){
                            System.out.println("atack with what?\n");
                            userInput = keyboard.next();
                            //shooting the ghost
                            if(userInput.equalsIgnoreCase("gun")&& gun == true && ammunition > 0 && Sanity > 0){
                                System.out.println("you draw your gun and shoot the Ghost. nothing happens...\n");
                                if(ghostHp > 0 && HP > 0){
                                    System.out.println("The figure slashes at you\n");
                                    Sanity = Sanity - ghostAttack;
                                }
                                
                            }
                            //shooting the ghost with no ammo
                            if(userInput.equalsIgnoreCase("gun")&& gun == true && ammunition == 0 && Sanity > 0){
                                System.out.println("you draw your gun and shoot the Ghost. *click* your out of ammo...\n");
                                if(ghostHp > 0 && Sanity > 0){
                                    System.out.println("The figure slashes at you\n");
                                    Sanity = Sanity - ghostAttack;
                                }
                                
                            }
                            //shooting the ghost without a gun
                            if(userInput.equalsIgnoreCase("gun")&& gun == false && Sanity > 0){
                                System.out.println("you draw your finger gun and shoot the Ghost the ghost laughs at you...\n");
                                if(ghostHp > 0 && Sanity > 0){
                                    System.out.println("The figure slashes at you\n");
                                    Sanity = Sanity - ghostAttack;
                                }
                                
                            }
                            //Attacking a ghost with a knife
                            if(userInput.equalsIgnoreCase("knife")&& knife == true && Sanity > 0){
                                System.out.println("you begin to slash at the ghost with the knife but nothing works...\n");
                                if(ghostHp > 0 && Sanity > 0){
                                    System.out.println("The figure slashes at you\n");
                                    Sanity = Sanity - ghostAttack;
                                }
                                                                
                            }
                            //attacking without the knife
                            if(userInput.equalsIgnoreCase("knife")&& knife == false && Sanity > 0){
                                System.out.println("you have no knife...\n");
                                if(ghostHp > 0 && Sanity > 0){
                                    System.out.println("The figure slashes at you\n");
                                    Sanity = Sanity - ghostAttack;
                                }                                                                
                            }
                            //Attacking with the book
                            if(userInput.equalsIgnoreCase("holy book")&& holyBook == true && Sanity > 0){
                                System.out.println("you pull out the holy book and read the first words you see.the ghost wails in pain...\n");
                                ghostHp = ghostHp - holyBookAttack;
                                if(ghostHp > 0 && Sanity > 0){
                                    System.out.println("The figure slashes at you\n");
                                    Sanity = Sanity - ghostAttack;
                                }
                                                                
                            }
                            //Attacking with a missing book
                            if(userInput.equalsIgnoreCase("holy book")&& holyBook == false && Sanity > 0){
                                System.out.println("you dont have the book...\n");
                                if(ghostHp > 0 && Sanity > 0){
                                    System.out.println("The figure slashes at you\n");
                                    Sanity = Sanity - ghostAttack;
                                }
                                                                
                            }
                            //Hand attack
                            if(userInput.equalsIgnoreCase("Hands") && Sanity > 0){
                                System.out.println("in hopes to catch the ghost \"Slacking\" you begin to swing your arms and fists, desprately trying to hit somthing... but you dont\n");
                                if(ghostHp > 0 && Sanity > 0){
                                    System.out.println("The figure slashes at you\n");
                                    Sanity = Sanity - ghostAttack;
                                }
                                                                
                            }
                            //run
                            if(userInput.equalsIgnoreCase("Run") && Sanity > 0){
                                System.out.println("You break free and run back to the room you came from");
                                roomLetter = lastRoom; 
                                break;
                            }
                            //no Sanity left
                            if( Sanity > 0){
                                System.out.println("You are dead...");
                                roomLetter = firstRoom; 
                                break;
                            }                            
                        }
                    }
                //Use
                if(userInput.equalsIgnoreCase("Use")){
                    System.out.println("What item do you want to use? \n");
                    userInput = keyboard.next();
                    }
                //Search
                if(userInput.equalsIgnoreCase("Search")){
                        if(itemInRoom == true){
                            System.out.println("you notice a __ on the __\n");
                            itemFoundInRoom = true;
                            }
                        if(itemInRoom == false){
                            System.out.println("You find nothing");
                        }
                    }
                //Grab
                if(userInput.equalsIgnoreCase("Grab")){
                    if(itemFoundInRoom == true){
                        System.out.println("You grab the __");
                        itemInRoom = false;
                        itemFoundInRoom = false;
                    }
                    if(itemFoundInRoom == false){
                        System.out.println("there is nothing to grab");
                    }                    
                    }                    
                //Quit
                if(userInput.equalsIgnoreCase("quit")){
                    System.out.println("are you sure you want to quit?");
                    userInput = keyboard.next();
                    if(userInput.equalsIgnoreCase("quit")){
                        System.exit(0);
                    }                
                }
            //break;
        }
        
        
    }
}
}