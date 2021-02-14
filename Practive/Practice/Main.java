import java.util.Scanner;
public class Main
{   
    boolean GAMESTATE = true;
    String userInput;
    //Inputs INP = new Inputs();
    public static void main (String[] args){
        boolean GAMESTATE = true;
        String userInput;
        Scanner keyboard = new Scanner(System.in);
        Controller CTRL = new Controller();
        CTRL.fillRooms();
        
        while(GAMESTATE == true)
        {
            System.out.println("Location: "+CTRL.RP.RM[CTRL.getCurrentRoomNumber()].getName());
            CTRL.getHelp();

            while(CTRL.getCurrentRoomNumber() >= 0){
                userInput = keyboard.next();
                CTRL.setInput(userInput);
                CTRL.getInputResponse();
                }
            }
        }
    }