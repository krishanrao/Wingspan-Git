// JUNIT 4 was used 
package hw2.trouble;
import org.junit.Test;

//import Wing.GameBoard;
import org.junit.Before;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
public class TestJUnit 
{
	Player p1= new Player(1);
	Player p2= new Player(2);
	GameBoard g1 = new GameBoard();
	Deck deck = new Deck();
	String userAction;
	
	Player currentPlayer = p1;
	@Before
	public void setUp()
	{
		deck.drawCard(p1); // draw 3 cards from deck per player
		deck.drawCard(p1);
		deck.drawCard(p1);
		
		deck.drawCard(p2);
		deck.drawCard(p2);
		deck.drawCard(p2);
		userAction = p1.arr.get(0).getType();		
		
		
		
	}
	//This test function test the play a bird.
	//Normally we would have the user pick a bird to play.
	//For testing purposes, I hardwired in the card.
	//Our traversal function should return the correct card, set that card on the space, and adjust egg cost. 
	//This first test will check if the traversal function is returning what is expected. 
	@Test
	public void testPlayBird()
	{
		Card currentCard ;//= g1.traversal(userAction, currentPlayer, 0);
		Card checkCard= p1.arr.get(0);
		assertEquals(checkCard, g1.traversal(userAction, currentPlayer, 0));
	}
	//This function will checks that we are correctly reading the symbol on a space.
	//The first space in the gain food row has an 1 egg on it. So our integer returning function traversalVoid() should return 1.
	@Test
	public void testPlayBird2()
	{
		int dieNum = g1.traversalVoid("G", currentPlayer);
		assertEquals(1, dieNum);
	}

	
	
	
	
	
	

		
	
	
}