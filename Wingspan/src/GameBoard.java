package connect4;



public class GameBoard {
	
	private int rows=6; 
	private int cols=7;
	//creating a 2d array to represent the connect4 board
	private Space board[][] = new Space [rows][cols];
	
	GameBoard() {
		//initializing each space on the board to space object, doing this for the entire board here
		
		Space object = new Space(false, 0); 
		
//initializing each board space to "not occupied" and "no color" in the beginning
		board[0][0] = object;
		board[0][1] = object;
		board[0][2] = object;
		board[0][3] = object;
		board[0][4] = object;
		board[0][5] = object;
		board[0][6] = object;
		
		board[1][0] = object;
		board[1][1] = object;
		board[1][2] = object;
		board[1][3] = object;
		board[1][4] = object;
		board[1][5] = object;
		board[1][6] = object;
		
		board[2][0] = object;
		board[2][1] = object;
		board[2][2] = object;
		board[2][3] = object;
		board[2][4] = object;
		board[2][5] = object;
		board[2][6] = object;
		
		board[3][0] = object;
		board[3][1] = object;
		board[3][2] = object;
		board[3][3] = object;
		board[3][4] = object;
		board[3][5] = object;
		board[3][6] = object;
		
		board[4][0] = object;
		board[4][1] = object;
		board[4][2] = object;
		board[4][3] = object;
		board[4][4] = object;
		board[4][5] = object;
		board[4][6] = object;
		
		board[5][0] = object;
		board[5][1] = object;
		board[5][2] = object;
		board[5][3] = object;
		board[5][4] = object;
		board[5][5] = object;
		board[5][6] = object;
				
			


	
	}
	
	public boolean traversalVoid(int colNum ,Player p) 
	// this is used if a person choses to play one of the 7 columns 
	{
		
	
		for(int j=rows-1; j>=0;j--)  //finding the topmost available spot in the colNm chosen by the user
		{
			
			if(board[j][colNum].occupied == false) //checking if that space is already occupied
			{
					
				board[j][colNum].occupied= true; //if not occupied, we now mark it occupied 

				
				if(p.getNum() == 1) //if player one is playing then change color to 1
				{
					board[j][colNum].color=1;
					return true;
				
				}
				else if(p.getNum()== 2) //if player two is playing then change color to 2
				{
					board[j][colNum].color=2;
					return true;
				
				}			
		   }
		 
		}
		
	return false;	
	}
	
	public void displayBoard()
	{
//		for(int i=0; i< rows; i++)
//		{
//			for(int j=0; j<cols; j++)
//			{
//				System.out.println(board[rows][cols].getcol()+ " ");
//			}
//			System.out.println();
//		}
		
		//Loop was giving some issues, hence displaying like this
		System.out.print(board[0][0].getcol());
		System.out.print(board[0][1].getcol());
		System.out.print(board[0][2].getcol()); 
		System.out.print(board[0][3].getcol());
		System.out.print(board[0][4].getcol());
		System.out.print(board[0][5].getcol());
		System.out.println(board[0][6].getcol());
		
		System.out.print(board[1][0].getcol());
		System.out.print(board[1][1].getcol());
		System.out.print(board[1][2].getcol()); 
		System.out.print(board[1][3].getcol());
		System.out.print(board[1][4].getcol());
		System.out.print(board[1][5].getcol());
		System.out.println(board[1][6].getcol());
		
		System.out.print(board[2][0].getcol());
		System.out.print(board[2][1].getcol());
		System.out.print(board[2][2].getcol()); 
		System.out.print(board[2][3].getcol());
		System.out.print(board[2][4].getcol());
		System.out.print(board[2][5].getcol());
		System.out.println(board[2][6].getcol());
		
		System.out.print(board[3][0].getcol());
		System.out.print(board[3][1].getcol());
		System.out.print(board[3][2].getcol()); 
		System.out.print(board[3][3].getcol());
		System.out.print(board[3][4].getcol());
		System.out.print(board[3][5].getcol());
		System.out.println(board[3][6].getcol());
		
		System.out.print(board[4][0].getcol());
		System.out.print(board[4][1].getcol());
		System.out.print(board[4][2].getcol()); 
		System.out.print(board[4][3].getcol());
		System.out.print(board[4][4].getcol());
		System.out.print(board[4][5].getcol());
		System.out.println(board[4][6].getcol());
		
		System.out.print(board[5][0].getcol());
		System.out.print(board[5][1].getcol());
		System.out.print(board[5][2].getcol()); 
		System.out.print(board[5][3].getcol());
		System.out.print(board[5][4].getcol());
		System.out.print(board[5][5].getcol());
		System.out.println(board[5][6].getcol());
		
		
	}

}
