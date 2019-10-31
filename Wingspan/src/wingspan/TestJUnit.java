// JUNIT 4 was used 
package wingspan;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import hw2.trouble.Deck;
import hw2.trouble.Player;

//Please read comments before testing
//In order to test the draw function in the deck class,
//I slightly modified the deck draw function to return the arraylist size.
//This was for testing purposes ONLY, i did not modify the actual method.
//if a card is properly drawn, the size should change to 17.
//Below you can find the function I used. 
/*
int drawCard(Player player) //draws a random card from the deck
{
	Random rand = new Random(); 	
    int pulled = 1;
    if (deck.size() == 0) System.out.println("emptydeck");
    player.arr.add(deck.get(pulled));
    deck.remove(pulled);
    return deck.size();
}
*/

//Most functions that return are getters, will add more testing once we add more functions.
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
public class TestJUnit 
{
	Player p1= new Player(1);
	Player p2= new Player(2);
	Deck deck = new Deck();
	ArrayList<Card> arr = new ArrayList<Card>(); // holds player's card
	
	
	@Test
	public void testDraw()
	{
		//arr=deck.drawCard(p1);
		assertEquals("Test to see if a card has successfully been drawn:", 17, deck.drawCard(p1));
	}
	
	
	
	
	
	

		
	
	
}