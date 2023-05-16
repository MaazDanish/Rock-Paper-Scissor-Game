package Exercise;
import java.util.*;
public class Ex02_RockPaperScissor_Game {
		public static void main(String[] args) {
	    
		System.out.println("Welcome to the Rock Paper Scissor Game : ");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Select your Choice");
	    System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
		int UserInput = sc.nextInt();	
		
		if (UserInput==0) {
			System.out.println("Your choice : Rock");
		}
		else if (UserInput==1) {
			System.out.println("Your Choice : Paper");
		}
		else if (UserInput==2){
			System.out.println("Your Choice : Scissor");
		}
		
	    Random Ran = new Random();
		int ComputerInput = Ran.nextInt(3);
		
		if (ComputerInput==0) {
			System.out.println("Computer choice : Rock");
		}
		else if (ComputerInput==1) {
			System.out.println("Computer Choice : Paper");
		}
		else if (ComputerInput==2){
			System.out.println("Computer Choice : Scissor");
		}
//		boolean tries = true;
//		while(tries){
		if(UserInput==ComputerInput) {
			System.out.println("The Game is Draw :" + " Better Luck Next Time");
		}
		else if (UserInput==0 && ComputerInput==2 || UserInput==1 && ComputerInput==0 || UserInput==2 && ComputerInput==1 ) {
			System.out.println("Congratulations : You Won");
		}
		else {
			System.out.println("You Lost :" + " Better Luck Next Time");
		}
		}
		}
//}
		
