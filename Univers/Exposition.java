
public class Exposition
{
    public int ROOMNUMBER = 0;
    public String USERINPUT = "";
    public void exposition_First_arrival(){
        System.out.println("You've finally arrived at the house.\n\nThe mansion screams run away, but you know theres a mystery behind those doors.\nyou cant run now, you have to get to the bottom of this mystery.");
    }
    public void exposition_porch(){
        System.out.println("You are at the Porch of the mansion\n");
        System.out.println("What would you like to do. help for help\n");
    }
    public void getHelp(){
        System.out.println("commands:Help,Status,Enter,Inventory,Use,Search,Grab,Attack,Quit,\n");
    }
    public void expoUse(){
        System.out.println("What item do you want to use? \n");
    }
    //get room specific exposition
    public void setRoomLetter(int rl){
        ROOMNUMBER = rl;
    }
    public void setUserInput(String ui){
        USERINPUT = ui;
    }
    public void getRoomEposition(){
        //porch
        if(ROOMNUMBER == 0){
            //porch
            System.out.println("You are at the Porch\n you noticed a garage a bit off to the right of the house...");
            System.out.println("\nhelp for help");
        }
        //garage
        if(ROOMNUMBER == 1){
            //garage
            System.out.println("You are in the garage...");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 1 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the porch?");
            //System.out.println("");
        }        
        //hallway
        if(ROOMNUMBER == 2){
            //hallway
            System.out.println("you are in the hall...");
            System.out.println("");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 2 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the porch, the library, the dining room, the lounge\n, pool hall, the kitchen or the second floor?");
            //System.out.println("");
        }        
        //library
        if(ROOMNUMBER == 3){
            //library
            System.out.println("You are in a library...");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 3 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the hall?");
            //System.out.println("");
        }        
        //lounge
        if(ROOMNUMBER == 4){
            //lounge
            System.out.println("You are in a lounge...");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 4 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the hall?");
            //System.out.println("");
        }        
        //Poolhall
        if(ROOMNUMBER == 5){
            //Poolhall
            System.out.println("You are in a pool hall...");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 5 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the hall?");
            //System.out.println("");
        }        
        //Diningroom
        if(ROOMNUMBER == 6){
            //Diningroom
            System.out.println("you are in the diningroom...");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 6 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the hall, or the kitchen?");
            //System.out.println("");
        }
        
        //kitchen
        if(ROOMNUMBER == 7){
            //kitchen
            System.out.println("You are in the kitchen...");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 7 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the hall or the dining room?");
            //System.out.println("");
        }        
        //greenHouse
        if(ROOMNUMBER == 8){
            //greenHouse
            System.out.println("You are in the greenhouse");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 8 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the lounge?");
            //System.out.println("");
        }        
        //second floor
        if(ROOMNUMBER == 9){
            //second floor
            System.out.println("You are in the hallway of the second floor");
            System.out.println("\nhelp for help");
        }
        if(ROOMNUMBER == 9 && USERINPUT.equalsIgnoreCase("enter")){
            //porch
            System.out.println("where would you like to go? the hall?");
            //System.out.println("");
        }        
    }
}
