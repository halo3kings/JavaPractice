
public class Controller 
{
    Inventory INV = new Inventory(false,false,false,false,false,false,0,0);
    Status STS = new Status(75,100);
    String userInput;
    String SHITSBUSTED = "SHIT'S BUSTED";
    RoomPopulator RP = new RoomPopulator();
    int STARTINGROOM = 0;
    int NUMBEROFROOMS = 10;
    int CURRENTROOM =0;

        public int getCurrentRoomNumber(){
            return CURRENTROOM;
        }
        public void fillRooms(){
            RP.fillRooms();
        }    
        public void setInput(String IN){
            userInput = IN;
        }
        public void getHelp(){
                System.out.println("Commands: Status,Inventory,Use_ITEM,Search,Grab,Attack,Quit");
        }
        
        public void getInputResponse(){   
                if(userInput.equalsIgnoreCase("help")){
                    System.out.println("Commands: Status,Inventory,Use_ITEM,Search,Grab,Attack,Quit");
                }
                //Status
                if(userInput.equalsIgnoreCase("Status")){
                    STS.getStatus();
                }
                //Grab
                if(userInput.equalsIgnoreCase("Grab")){
                    if(getCurrentRoomNumber() == RP.RM[getCurrentRoomNumber()].getNumber()&& RP.RM[getCurrentRoomNumber()].getRS()){
                        if(RP.RM[getCurrentRoomNumber()].getFl() == true){
                            INV.setFl(true);
                            System.out.println("You grabbed a Flashlight... ");
                        }
                        if(RP.RM[getCurrentRoomNumber()].getKF() == true){
                            INV.setKF(true);
                            System.out.println("You grabbed a Knife... ");
                        }
                        if(RP.RM[getCurrentRoomNumber()].getLT() == true){
                            INV.setLT(true);
                            System.out.println("You grabbed a Lighter... ");
                        }
                        if(RP.RM[getCurrentRoomNumber()].getGN() == true){
                            INV.setGN(true);
                            System.out.println("You grabbed a Gun... ");
                        }
                        if(RP.RM[getCurrentRoomNumber()].getST() == true){
                            INV.setST(true);
                            System.out.println("You grabbed a Salt... ");
                        }
                        if(RP.RM[getCurrentRoomNumber()].getRB() == true){
                            INV.setRB(true);
                            System.out.println("You grabbed a Religious Book... ");
                        }
                        if(RP.RM[getCurrentRoomNumber()].getMD() > 0){
                            INV.setMD(RP.RM[getCurrentRoomNumber()].getMD());
                            System.out.println("You grabbed "+RP.RM[getCurrentRoomNumber()].getMD()+" boxes of medicine...");
                        }
                        if(RP.RM[getCurrentRoomNumber()].getAO() > 0){
                            INV.setAO(RP.RM[getCurrentRoomNumber()].getAO());
                            System.out.println("You grabbed "+RP.RM[getCurrentRoomNumber()].getAO()+" rounds of ammo...");
                        }
                    }
                }
                //Inventory
                if(userInput.equalsIgnoreCase("Inventory")){
                    INV.getInventory();
                }                
                //Search
                if(userInput.equalsIgnoreCase("Search")){
                    if(getCurrentRoomNumber() == RP.RM[getCurrentRoomNumber()].getNumber()){
                        RP.RM[getCurrentRoomNumber()].setRoomSearch(true);
                        System.out.println("You searched "+RP.RM[getCurrentRoomNumber()].getName());
                    }                    
                }
                //Quit
                if(userInput.equalsIgnoreCase("Quit")){
                    System.exit(0);
                }
                //Use
                if(userInput.equalsIgnoreCase("Use_FLASHLIGHT")&& INV.getFl() == true){
                    if(getCurrentRoomNumber() == RP.RM[getCurrentRoomNumber()].getNumber()){
                        RP.RM[getCurrentRoomNumber()].setRoomDarkness(true);
                        System.out.println("the room is lit...");
                    }                   
                }
                if(userInput.equalsIgnoreCase("use_KNIFE")&& INV.getKF() == true){
                    if(getCurrentRoomNumber() == RP.RM[getCurrentRoomNumber()].getNumber()){
                        System.out.println("It's of no use...");
                    }                    
                }
                if(userInput.equalsIgnoreCase("use_Gun")&& INV.getGN() == true){
                    if(getCurrentRoomNumber() == RP.RM[getCurrentRoomNumber()].getNumber()){
                        System.out.println("It's of no use...");
                    }                    
                }
                if(userInput.equalsIgnoreCase("use_Lighter")&& INV.getLT() == true){
                    if(getCurrentRoomNumber() == RP.RM[getCurrentRoomNumber()].getNumber()){
                        System.out.println("It's of no use...");
                    }                    
                }
                if(userInput.equalsIgnoreCase("use_Salt")&& INV.getST() == true){
                    if(getCurrentRoomNumber() == RP.RM[getCurrentRoomNumber()].getNumber()){
                        System.out.println("It's of no use...");
                    }                    
                }
                if(userInput.equalsIgnoreCase("use_Religious_book")&& INV.getRB() == true){
                    if(getCurrentRoomNumber() == RP.RM[getCurrentRoomNumber()].getNumber()){
                        System.out.println("It's of no use...");
                    }                    
                }
                if(userInput.equalsIgnoreCase("use_medicine")&& INV.getMD() > 0){
                    if(STS.getHp() == 100){
                        System.out.println("you dont need to use medicine...");
                    }
                    if(STS.getHp() < 100){
                        System.out.println("you used some medicine...");
                        STS.setHp(25);
                        INV.setMD(-1);
                    }                    
                }
                //Attack
                if(userInput.equalsIgnoreCase("Attack") && RP.RM[getCurrentRoomNumber()].getenemiesInRoom()) {
                	System.out.println("test");
                	while(RP.RM[getCurrentRoomNumber()].getenemiesInRoom()) {
                		
                	}
                	}
                }
                }
            }
            
        
            
