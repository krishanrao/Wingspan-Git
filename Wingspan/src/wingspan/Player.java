package wingspan;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
	
		private int number;
	    ArrayList<Card> arr = new ArrayList<Card>(); // holds player's card
	    ArrayList<String> foodHeld = new ArrayList<String>(); //food tokens that the player is holding
	    ArrayList<String> rolledFood = new ArrayList<String>(); //food that was rolled in a turn
	    
		public String[] foodarr = {"fish", "cherry", "leafLikeSomething", "worm", "food", "moreFood"};
		private String foodstr;
		private int pos;
		 
	    
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
		
		void setCard(ArrayList<Card> ar)
		{
			arr = ar;
		}

		void displayCardArray()
		{
				System.out.println(arr.toString());	    
		}

		String setget() //rolls one die and return it's value
		{
			 Random rand = new Random(); 	
			    pos = rand.nextInt(6); //0-5 num is generated
			    foodstr= foodarr[pos];
			   
			    return foodstr;
		}
		
		void roll() //rolls five dice and adds it to this turn's list
		{
			rolledFood.clear();
			for(int i = 0; i < 5; i++)
			{
				rolledFood.add(setget());
			}
		}
		
		void takeDice(int dices) //takes a the amount of dices from the list depending on the space you're on
		{
			for (int i = 0; i < dices; i++)
			{
				int num = i+1;
				System.out.println("take dice #" + num);
				System.out.println(" ");
				
				for (int j = 0; j < rolledFood.size(); j++)
				{
					int num2 = j+1;
					System.out.println(num2 + ".  " + rolledFood.get(j) );
				}
				Scanner pickNum = new Scanner(System.in);
				int picked = pickNum.nextInt();
				foodHeld.add(rolledFood.get(picked-1));
				rolledFood.remove(picked-1);
			}
		}
		
		void diefunc() //displays food that was rolled
		{
			System.out.println("Player " +number + " "+ rolledFood);
		}
		
		void diefunc2() //displays food that is held
		{
			System.out.println("Player " +number + " "+ foodHeld);
		}
	     
}
