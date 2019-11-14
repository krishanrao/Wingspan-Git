package wingspan;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args)
	{  
		//create an instance of a player, twice (one for each player)
		Player p1= new Player(1);
		Player p2= new Player(2);
		//create instance of gameboard and deck
		GameBoard g1 = new GameBoard();
		Deck deck = new Deck();
		//randomly draw cards for our deck. 
		deck.drawCard(p1); // draw 3 cards from deck per player
		deck.drawCard(p1);
		deck.drawCard(p1);
		deck.drawCard(p2);
		deck.drawCard(p2);
		deck.drawCard(p2);
		//set up currentPlayer instance. We will toggle back and forth using a simple function once a players turn is over. 
		Player currentPlayer = p1;
		//int variable to represent what action the player chooses
		int actionChoice = 0;
		//The String form of the user choice. 
		String userAction = null;
		//Create an instance of a card to represent the card a player will play in "play bird" action
		Card currentCard;
		boolean gameNotOver =true; // will be false when game is over
		//loop until we set gameNotOver to false
		while(gameNotOver)
		{
			//Prompt user for action choice
			System.out.println("Player " + currentPlayer.getNum() + " What action would you like to perform?");
			System.out.println("1. Play Bird");
			System.out.println("2. Gain Food");
			System.out.println("3. Lay Eggs");
			System.out.println("4. Draw Bird");
			System.out.println("5. Quit");
			actionChoice = 1; 
			Scanner sc = new Scanner(System.in);
			actionChoice= sc.nextInt();

			System.out.println("You have chosen option "+ actionChoice);
			//if they choose to play a bird
			if(actionChoice == 1)
			{
				//let them choose a card to place from their hand.
				System.out.println("pick a card to place");
				for(int i=0; i<p1.arr.size(); i++)
					System.out.println(i + ".  " + p1.arr.get(i));
				
				Scanner choice = new Scanner(System.in);
				int chosenCard = choice.nextInt();
				
				userAction = p1.arr.get(chosenCard).getType();
				//our traversal function will place the card in the left most available spot of the row, based on habitat. 
				currentCard = g1.traversal(userAction, currentPlayer, chosenCard);
				System.out.println("***********************");
				System.out.println(currentCard);
				System.out.println("***********************");
				//decrement action cubes after turn
				currentPlayer.actionCubes--;
				
				// account for the food cost
				String foodCost = currentCard.getFoodCost();
				System.out.println("FoodCost is "+ foodCost);
				currentPlayer.foodHeld.remove(foodCost);
				int eggsLeft = g1.eggSubtraction(currentPlayer);
				
				currentPlayer.print();
				//switch players now that turn is over
				currentPlayer= toggle(currentPlayer, p1, p2);
/*			
THIS FEATURE TO BE HANDELED IN THE NEXT ITERATION				
			if(currentCard.whenPlayedPower == true)
				{
					//handle the when played power
				}
				else
				{
					//handle 
				}
*/				
				
			}
			//if user chooses to gain food
			if(actionChoice ==2)
			{
				
				//must find first available spot in gain food row
//				System.out.println("pick a card to place");
//				for(int i=0; i<p1.arr.size(); i++)
//					System.out.println(i + ".  " + p1.arr.get(i));
//				
//				Scanner choice = new Scanner(System.in);
//				int chosenCard = choice.nextInt();
//				
				userAction = "G";
				int dieNum = g1.traversalVoid(userAction, currentPlayer);
				System.out.println("Dienum " +dieNum);// Not sure what output to expect??
				currentPlayer.takeDice(dieNum);
				currentPlayer.actionCubes--; //Check If NEEDED
				currentPlayer.print();
				currentPlayer= toggle(currentPlayer, p1, p2);
				
			}
			if(actionChoice ==3)
			{
				//lay egg
			}
			if(actionChoice ==4)
			{
				//draw bird card
			}
			if(actionChoice == 5)
			{
				 //Display score here, at a later stage?
				gameNotOver =false;
			}
			
					
			
		}
		
		System.out.println("Game Over! ");
		
		System.out.println("------Player1's Cards------");
		p1.displayCardArray();
		System.out.println("------Player2's Cards------");
		p2.displayCardArray();			
			
		
	}
	//toggle function to switch between players, try will try to make it use only two parameters by 11/13- Vrinda
public static Player toggle(Player Person, Player person1, Player person2) { 
		
		if (person1.getNum() == Person.getNum()) {
			return person2;
		} 
		else {
		return person1;
	}
	
	}
}