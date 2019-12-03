package connect4;
package Wing;



public class GameBoard {
	
	private int rows=6; 
	private int cols=7;
	//creating a 2d array to represent the connect4 board
	private int board[][] = new int[rows][cols];
	
	GameBoard() 
	{
		//initializing each space on the board to space object, doing this for the entire board here
		
		for(int i = 0; i < (rows-1); i++)
		{
			for(int j = 0; j < (cols-1); j++)
			{
				board[i][j] = 0;
			}
		}
		
		//initializing each board space to "not occupied" and "no color" in the beginning
		
		
			


	
	}
	
	public void traversalVoid(int colNum , int player) 
	// this is used if a person choses to play one of the 7 columns 
	{
		
	
		for(int j=rows-1; j>=0;j--)  //finding the topmost available spot in the colNm chosen by the user
		{
			
			if(board[j][colNum] == 0 ) //once we find first empty space
			{
				if(player == 1) //if player 1 is placing piece
				{
					board[j][colNum] = 1;
					//break;
				}
				else
				{
					board[j][colNum] = 2;
					//break;
				}
				//board[j][colNum].occupied= true; //if not occupied, we now mark it occupied 
				break;
						
		   }
		 
		}
		
	//return false;	
	}
	
	public void displayBoard()
	{
		for(int i=0; i< rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		
		
	}

}
