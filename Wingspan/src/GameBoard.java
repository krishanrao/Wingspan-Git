package wingspan;
import java.util.ArrayList;

public class GameBoard {
	
	
	private int rows=3;
	private int cols=5;
	private int eggCost= 0; //initializing egg cost to 0
	
	private Space board[][] = new Space [rows][cols];
	
	
	GameBoard() {
		//initializing all spaces on the game board
		//-----for row 1
	Space object1 = new Space(1, "Forest", false,false); 
	board[0][0]= object1;
		
	Space object2 = new Space(1, "Forest", true,false);  
	board[0][1]= object2;
	
	Space object3 = new Space(2, "Forest", false,false); 
	board[0][2]= object3;
	
	Space object4 = new Space(2, "Forest", true,false); 
	board[0][3]= object4;
	
	Space object5 = new Space(3, "Forest", false,false); 
	board[0][4]= object5;
	//-----for row 2--
	Space object6 = new Space(1, "Grasslands", false,false); 
	board[1][0]= object6;
		
	Space object7 = new Space(2, "Grasslands", true,false);  
	board[1][1]= object7;
	
	Space object8 = new Space(3, "Grasslands", false,false); 
	board[1][2]= object8;
	
	Space object9 = new Space(3, "Grasslands", true,false); 
	board[1][3]= object9;
	
	Space object10 = new Space(4, "Grasslands", false,false); 
	board[1][4]= object10;
	//----for row 3---

	Space object11 = new Space(1, "Wetlands", false,false); 
	board[2][0]= object11;
		
	Space object12 = new Space(1, "Wetlands", true,false);  
	board[2][1]= object12;
	
	Space object13 = new Space(2, "Wetlands", false,false); 
	board[2][2]= object13;
	
	Space object14 = new Space(2, "Wetlands", true,false); 
	board[2][3]= object14;
	
	Space object15 = new Space(3, "Wetlands", false,false); 
	board[2][4]= object15;
	
	}
	
	Card traversal(String userAction,Player p,int cardNum) 
	{
		ArrayList<Card> playerCards = new ArrayList<>();
		playerCards = p.getCardList();
		int row = 0;
		//row is determined by what habitat user wants to play bird in
		if(userAction == "G" || userAction == "g") //Gain Food->G/g
		{
			row=0;
			
		}
		if(userAction == "L" || userAction == "l") //Lay eggs ->L/l
		{
			row=1;
			
		}
		if(userAction == "D" || userAction == "d") //Draw bird ->D/d
		{
			row=2;
			
		}
		//traversing through the board to find the next available column
		for(int j=0; j<cols;j++)
		{
			if(board[row][j].ifplaced == false)
			{
				board[row][j].placed = playerCards.get(cardNum); //get which card the player wants to place
				board[row][j].ifplaced=true; //marking the place as true now. this means that the space is no longer empty
				if(j == 1 || j == 2)
				{
					eggCost = 1; //these two cols on the board have egg cost of 1 egg
				}
				else if(j==3|| j==4)
				{
					eggCost = 2; //these two cols on the board have egg cost of 2 eggs
				}
			}
			 
		}
		return playerCards.get(cardNum);
		
		
	}
	//handling the egg cost associated with placing birds
	public int eggSubtraction(Player p)
	{
		return (p.getEggsHeld() - eggCost);
	}
	
	
}