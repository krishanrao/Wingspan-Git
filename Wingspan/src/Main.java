package wingspan;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args)
	{  
		System.out.println("-----------------Intial Information for both Players------------------");
		//creating an instance of each player
		Player p1= new Player(1);
		Player p2= new Player(2);
		Deck deck = new Deck();
		//each player gets to hold 3 cards
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
		p1.roll(); //roll 5 dice per player
		p2.roll();
		
		
	    p1.diefunc(); //displays each players food
		p2.diefunc(); //displays each players food
		
		p1.takeDice(2); // take 2 dice for player 1
		p2.takeDice(3); // take 3 dice for player 2
		
		p1.diefunc();  // displays dices left
		p2.diefunc();
		p1.diefunc2(); //displaces dice taken
		p2.diefunc2();

		p1.arr.remove(1); //removes die from arraylist on gaining food
		System.out.println("------Player1's Cards afterwards------");
		p1.displayCardArray();
		System.out.println("------Player2's Cards afterwards------");
		p2.displayCardArray();
	
	
	}

	
}