
public class Enter
{
    public int CURRENTROOM;
    public String USERINPUT = "";
    public void setCurrentRoom(int cr){
        CURRENTROOM = cr;
    }
    public void setUserInput(String ui){
        USERINPUT = ui;
    }    
    public int computeRoom(){
        int newroom = 0;
        //porch
        if(CURRENTROOM == 0 && USERINPUT.equalsIgnoreCase("hall")){
            newroom = 2;
            return newroom;
        }
        if(CURRENTROOM == 0 && USERINPUT.equalsIgnoreCase("garage")){
            newroom = 1;
            return newroom;
        }
        //Garage
        if(CURRENTROOM == 1 && USERINPUT.equalsIgnoreCase("porch")){
            newroom = 0;
            return newroom;
        }        
        //hall
        if(CURRENTROOM == 2 && USERINPUT.equalsIgnoreCase("porch")){
            newroom = 0;
            return newroom;
        }
        if(CURRENTROOM == 2 && USERINPUT.equalsIgnoreCase("library")){
            newroom = 3;
            return newroom;
        }
        if(CURRENTROOM == 2 && USERINPUT.equalsIgnoreCase("lounge")){
            newroom = 4;
            return newroom;
        }
        if(CURRENTROOM == 2 && USERINPUT.equalsIgnoreCase("pool")){
            newroom = 5;
            return newroom;
        }
        if(CURRENTROOM == 2 && USERINPUT.equalsIgnoreCase("dining room")){
            newroom = 6;
            return newroom;
        }
        if(CURRENTROOM == 2 && USERINPUT.equalsIgnoreCase("kitchen")){
            newroom = 7;
            return newroom;
        }
        //library
        if(CURRENTROOM == 3 && USERINPUT.equalsIgnoreCase("hall")){
            newroom = 2;
            return newroom;
        }
        //lounge
        if(CURRENTROOM == 4 && USERINPUT.equalsIgnoreCase("hall")){
            newroom = 2;
            return newroom;
        }
        //pool
        if(CURRENTROOM == 5 && USERINPUT.equalsIgnoreCase("hall")){
            newroom = 2;
            return newroom;
        }
        //diningroom
        if(CURRENTROOM == 6 && USERINPUT.equalsIgnoreCase("hall")){
            newroom = 2;
            return newroom;
        }
        if(CURRENTROOM == 6 && USERINPUT.equalsIgnoreCase("kitchen")){
            newroom = 7;
            return newroom;
        }
        //Kitchen
        if(CURRENTROOM == 7 && USERINPUT.equalsIgnoreCase("hall")){
            newroom = 2;
            return newroom;
        }
        if(CURRENTROOM == 7 && USERINPUT.equalsIgnoreCase("dining room")){
            newroom = 6;
            return newroom;
        }        
        //GreenHouse
        if(CURRENTROOM == 8 && USERINPUT.equalsIgnoreCase("lounge")){
            newroom = 2;
            return newroom;
        }
        //Floor 2
        if(CURRENTROOM == 9 && USERINPUT.equalsIgnoreCase("hall")){
            newroom = 2;
            return newroom;
        }
        return newroom;
    }
}
