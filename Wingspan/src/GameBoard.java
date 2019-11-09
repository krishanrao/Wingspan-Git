package wingspan;

public class GameBoard {
	
	
	private int rows=3;
	private int cols=5;
	
	
	private Space board[][] = new Space [rows][cols];
	

	
	GameBoard() {
		
	//filling the board array with Space objects 
    //-----for First row------------------------------------
		
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
	
	//-------For second row---------------------------------
	
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
	
	//-------for third row-------------------------------

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
	
	void traversal(String userAction,Player p,int cardNum) 
	{
		int row = 0;
		if(userAction == "G" || userAction == "g") //if he user wants to Gain Food->G/g
		{
			row=0;
			
		}
		if(userAction == "L" || userAction == "l") //if the user wants the bird to Lay eggs ->L/l
		{
			row=1;
			
		}
		if(userAction == "D" || userAction == "d") //if the user wants to Draw bird ->D/d
		{
			row=2;
			
		}
		for(int j=0; j<cols;j++)
		{
			if(board[row][j].ifplaced == false) //if the Board space is "false" i.e. empty, marking the board space as "true" or used
			{
				//board[row][j]= p.getPlayerCard(cardNum);
				
				board[row][j].ifplaced=true;
			}
			 
		}
		
		
		
	}
	
	
}
