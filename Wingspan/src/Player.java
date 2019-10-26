

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Player {
	
	//each player has a number
		private int number;
		
   //Array for player's deck of cards
	    private Card[] arr; 
	    private int size=3; //max size of array
	 
		
	  //Constructor to set player number
	     public Player(int num)
	     {
	    	 number=num;
	     }
	     
	     public Player() {
			// TODO Auto-generated constructor stub
		}

		int Getnum()
	      {
	    	    	
		 	return number;
	    	  
	      }
		void setCard(Card[] ar)
		{
			arr = ar;
		}
		void setsize(int s)
		{
			size=s;
		}
		//Function iterates through card array and prints card description 
		void displayCardArray()
		{
			for(int i=0; i< size; i++)
			{
				arr[i].print();
			}
		}

//Die function incorporating each food item to a player	
		void diefunc()
		{
			Dice d= new Dice();
			System.out.println("Player " +number + " "+ d.setget());

		}
	//Deletes the last card in the card array
	    Card[] deleteElement(Card[] arr2)
	    {
	            
	        Card c = new Card();
	        
	        for(int i = 0; i < arr2.length; i++)
	        {
	            arr2[i] = arr[i];
	        }
	      
	        for(int i=0; i<arr.length; i++)
	        {
	        	arr[i]=c;
	        }
	        
	        
	        for(int i = 0; i < arr2.length; i++)
	        {
	            arr[i] = arr2[i];
	        }
	  
	    		
	        
	        return arr;
	    }

	     
}