import java.util.Scanner;

public class universe
{
    public static void main (String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        int x,y,z;
        int x2,y2,z2;
        int rateOfDecay;
        int energyUsed;
        int energyInUniverse;
        int currentEnergy;
                
        System.out.println("Please enter the rate of decay");        
        rateOfDecay = keyboard.nextInt();
        
        System.out.println("Please enter the energy in universe");        
        energyInUniverse = keyboard.nextInt();
        
        System.out.println("Please enter the current energy");
        currentEnergy = keyboard.nextInt();
    
    }
}
