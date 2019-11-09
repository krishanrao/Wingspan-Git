package wingspan;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> deck = new ArrayList<Card>(); //deck is just an arraylist of cards
	//below we initialize 6 cards in which we will later add to our deck.
	private Card c1 = new Card("Flamingo related information", 3, false, false);
	private Card c2 = new Card("Peacock related information", 2, false, false);
	private Card c3 = new Card("Vulture related information", 5, false, false);
	private Card c4 = new Card("Crow related information", 3, false, false);
	private Card c5 = new Card("Pigeon related information", 4, false, false);
	private Card c6 = new Card("Woodpecker related information", 1, false, false);
	
	public Deck() //creates a deck of cards for the player
	{
		//add a bunch of cards to our deck
		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c1);
	}
	
	void drawCard(Player player) //draws a random card from the deck
	{
		Random rand = new Random(); 	
	    int pulled = rand.nextInt(deck.size()); 
	    if (deck.size() == 0) System.out.println("emptydeck");
	    player.arr.add(deck.get(pulled));
	    deck.remove(pulled);
	}
	
	
}