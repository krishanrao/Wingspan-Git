package Wing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/*
	 * If the card has a “when played” power, the player has the option to play the power. 
	 * Once you play the bird, slide your action cube to the left of the row to indicate that you are done.
	 *  The next time you play a card in the row, you must place a new action cube above that row. 
	 *  From there you may have to pay an egg cost (must discard that many eggs on top of the other costs for the card.

	 */
	
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		Player p1= new Player(1);
		Player p2= new Player(2);
		GameBoard g1 = new GameBoard();
		Deck deck = new Deck();
		deck.drawCard(p1); /// draw 3 cards from deck per player
		deck.drawCard(p1);
		deck.drawCard(p1);
		deck.drawCard(p2);
		deck.drawCard(p2);
		deck.drawCard(p2);
		Player currentPlayer = p1;
		int actionChoice;
		Card currentCard;
		boolean gameNotOver =true; // will be false when game is over
		while(gameNotOver)
		{
			System.out.println("What action would you like to perform?");
			System.out.println("1. Play Bird");
			System.out.println("2. Gain Food");
			System.out.println("3. Lay Eggs");
			System.out.println("4. Draw Bird");
			System.out.println("5. Quit");
			actionChoice = 2; 
			//actionChoice = sc.nextInt();
			if(actionChoice ==1)
			{
				//need to have user select card from their hand
				//the chosen card's habitat will dictate the letter as our first parameter for traversal()
				System.out.println("pick a card to place");
				for(int i=0; i<p1.arr.size(); i++)
					System.out.println(i + ".  " + p1.arr.get(i));
				Scanner choice = new Scanner(System.in);
				int chosenCard = choice.nextInt();
				String userAction = p1.arr.get(chosenCard).getType();
				currentCard = g1.traversal(userAction, currentPlayer, 0);
				currentPlayer.actionCubes--;
				String foodCost = currentCard.getFoodCost();
				currentPlayer.foodHeld.remove(foodCost);
				int eggsLeft = g1.eggSubtraction(currentPlayer);
				if(currentCard.whenPlayedPower == true)
				{
					//handle the when played power
				}
				else
				{
					//handle 
				}
				
				
			}
			else if(actionChoice ==2)
			{
				//we must later prompt user to choose card as 3rd parameter.
				//We put '0' for now just to make things easier (will choose first card every time)
				
				
			}
			else if(actionChoice ==3)
			{
				//lay egg
			}
			else if(actionChoice ==4)
			{
				//draw bird card
			}
			else if(actionChoice == 5)
			{
				//draw bird card
			}
			
			
			
			
			
			
		}
		
		
		
		/*
		 * System.out.println("-----------------Intial Information for both Players------------------");
		
		Player p1= new Player(1);
		Player p2= new Player(2);
		GameBoard g1 = new GameBoard();
		Deck deck = new Deck();
		deck.drawCard(p1); /// draw 3 cards from deck per player
		deck.drawCard(p1);
		deck.drawCard(p1);
		deck.drawCard(p2);
		deck.drawCard(p2);
		deck.drawCard(p2);
		//now that we have generated deck, we must generate player card array from the deck
		
		System.out.println("------Player1's Cards in the beginning------");
		p1.displayCardArray();
		System.out.println("------Player2's Cards in the beginning------");
		p2.displayCardArray();
		
		
		System.out.println("------Gain food ACTION for Players------");
		
		/*
		p1.roll(); //roll 5 dice per player
		p2.roll();
		
	    p1.diefunc(); 
		p2.diefunc();
		
		p1.takeDice(2); // take 2 dice for player 1
		p2.takeDice(3); // take 3 dice for player 2
		
		p1.diefunc();  // displays dices left
		p2.diefunc();
		p1.diefunc2(); //displaces dice taken
		p2.diefunc2();
		p1.arr.remove(1); //removes die from arraylist
		System.out.println("------Player1's Cards afterwards------");
		p1.displayCardArray();
		System.out.println("------Player2's Cards afterwards------");
		p2.displayCardArray();
	
	
	}
public Player toggle(Player Person, Player person1, Player person2) { 
		
		if (person1.getNum() == Person.getNum()) {
			return person2;
		} else {
			return person1;
		}
		 */
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
