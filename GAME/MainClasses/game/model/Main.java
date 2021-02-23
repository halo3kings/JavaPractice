
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import game.controller.OLDControllerOLD;

//import java.util.Scanner;
public class Main extends JFrame implements ActionListener {

	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in);
		//String UserInput;
		StartScreen SS = new StartScreen();
		
		boolean gameIsRunning = true;
		
		System.out.println("commands: help,Status,Grab,inventory,search,quit,use,attack,go");
		OLDControllerOLD GAMECONTROLLER = new OLDControllerOLD();
		GAMECONTROLLER.setUpRooms();
		//GAMECONTROLLER.setUpCharacter();
		
		while(gameIsRunning == true) {
			
			//UserInput = keyboard.next();
			GAMECONTROLLER.getInputResponse();
			if(GAMECONTROLLER.PLAYER.STATUS.getHealth() == 0 || GAMECONTROLLER.PLAYER.STATUS.getSanity() == 0) {
				System.out.println("----GAME OVER----");
				System.out.println("Total Score: "+GAMECONTROLLER.PLAYER.getScore());
				System.out.println("Your items: "); GAMECONTROLLER.PLAYER.INV.sayInventory();
				System.out.println("");
				gameIsRunning = false;
			}
			if(GAMECONTROLLER.getEndGame()) {
				System.out.println("----GAME OVER----");
				System.out.println("Total Score: "+GAMECONTROLLER.PLAYER.getScore());
				System.out.println("Your items: "); GAMECONTROLLER.PLAYER.INV.sayInventory();
				System.out.println("");
				gameIsRunning = false;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
