import java.util.Scanner;
public class gamemain
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean gameStateRunning = true;
        int ROOMLOCATIONNUMBER = 0;
        String userInput;
        
        //Game classes instancing
        RoomPopulator rPOP = new RoomPopulator();
        Status stats = new Status();
        Inventory invo = new Inventory();
        Exposition expo = new Exposition();
        Search search = new Search();
        Enter enter = new Enter();
        //establishing player stats 
        stats.setSANITY(100);
        stats.setHP(100);
        boolean godmode = false;
        while(gameStateRunning == true)
        {
            expo.exposition_First_arrival();
            
            while(ROOMLOCATIONNUMBER >= 0){
                //Room specific exposition
                expo.setRoomLetter(ROOMLOCATIONNUMBER);
                expo.getRoomEposition();
                userInput = keyboard.next();
                
                if(userInput.equalsIgnoreCase("help")){
                    expo.getHelp();
                }
                if(userInput.equalsIgnoreCase("status")){
                    stats.getStatus();
                }
                /*
                if(userInput.equalsIgnoreCase("enter")){
                    enter.setCurrentRoom(ROOMLOCATIONNUMBER);
                    expo.setUserInput(userInput);
                    expo.getRoomEposition();
                    userInput = keyboard.next();
                    enter.setUserInput(userInput);
                    ROOMLOCATIONNUMBER = enter.computeRoom();
                }
                */
                if(userInput.equalsIgnoreCase("inventory")){
                    invo.getInventory();
                }
                if(userInput.equalsIgnoreCase("Use")){
                    expo.expoUse();
                    userInput = keyboard.next();
                }
                if(userInput.equalsIgnoreCase("Search")){
                    search.setRoomLetter(ROOMLOCATIONNUMBER);
                    search.getRoomContents();
                }
                if(userInput.equalsIgnoreCase("Grab")){
                    
                }
                if(userInput.equalsIgnoreCase("Attack")){
                    
                }
                if(userInput.equalsIgnoreCase("Quit")){
                    
                }
                //Developer commands and cheats
                if(userInput.equals("GODMODE")){
                    //all items,super stats, and instant kills
                    if(godmode== true){
                            invo.godModeOff();
                    }
                    if(godmode== false){
                            invo.backupInventoryForCheatsOff();
                            invo.godModeOn(true);
                    }
                }
                if(userInput.equals("FORCEQUIT")){
                    //auto quit
                }
                if(userInput.equals("THERESANEGGINMYBOOT")){
                    //alternative text
                }                
            }

        }
        
    }
}
