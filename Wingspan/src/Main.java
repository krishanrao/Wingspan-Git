package Wing;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{  
		
		GameBoard g = new GameBoard();
		int currentPlayer = 1;
		int colChosen=0;
		g.displayBoard();
		boolean gameNotOver =true; // will be false when game is over
		while(gameNotOver)
		{
			System.out.println("Player " + currentPlayer + " What col would you like to choose b/w 0-6");
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
				if(currentPlayer ==1)
				{
					currentPlayer = 2;
				}
				else
				{
					currentPlayer = 1;
				}
				
			}
			
		}
		System.out.println("Game Over!");
		g.displayBoard();
		
	}

}