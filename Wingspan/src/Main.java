package connect4;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{  
		//Initializing 2 players and a board
		Player p1= new Player(1);
		Player p2= new Player(2);
		GameBoard g = new GameBoard();
		
		Player currentPlayer = p1;// setting first player to be the current player
		int colChosen=0;
		
		g.displayBoard(); //displaying board in the beginning
		
		boolean gameNotOver =true; // will be false when game is over
		while(gameNotOver)
		{
		System.out.println("Player " + currentPlayer.getNum() + " What col would you like to choose b/w 0-6");
		System.out.println("Press 7 to Quit");
		//add input validation later
		Scanner sc = new Scanner(System.in);
		colChosen= sc.nextInt();
		
		

		if(colChosen ==7)
			gameNotOver = false;
		 
		else if( colChosen >=0 && colChosen <=6) //If player choses a col num
		{
			
			g.traversalVoid(colChosen, currentPlayer); //pass the colNum into traversal
			// check win
			g.displayBoard(); //display board
			currentPlayer= toggle(currentPlayer, p1, p2); //switch to other player
			
		}
		
		
		}
		System.out.println("Game Over!");
		g.displayBoard();
		
	}
	//function to change from one player to another
public static Player toggle(Player Person, Player person1, Player person2) { 
		
		if (person1.getNum() == Person.getNum()) {
			return person2;
		} 
		else {
		return person1;
	}
	
	}

}
