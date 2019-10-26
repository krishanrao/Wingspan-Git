
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{  
		//Created an array for each player's deck of cards
		Card[] cardarr1 = (Card[]) new Card[3];
		Card[] cardarr2 = (Card[]) new Card[3];
			
		System.out.println("-----------------Intial Information for both Players------------------");
		
		//Initializing card array contents
		cardarr1[0] = new Card("Flamingo related information", 3, false, false);
		cardarr1[1] = new Card("Peacock related information", 2, false, false);
		cardarr1[2]= new Card("Vulture related information", 5, false, false);

		cardarr2[0]= new Card("Crow related information", 3, false, false);
		cardarr2[1]= new Card("Pigeon related information", 4, false, false);
		cardarr2[2]= new Card("Woodpecker related information", 1, false, false);
		
		//Creating an instance of each player
		Player p1= new Player(1);
		Player p2= new Player(2);
		
		//setting card contents for each player
		p1.setCard(cardarr1);
		p2.setCard(cardarr2);
		
		
		
		System.out.println("------Player1's Cards in the beginning------");
		p1.displayCardArray();
		
		
		System.out.println("------Player2's Cards in the beginning------");
		p2.displayCardArray();
		
		
		//After a player gains a food token
		System.out.println("------Gain food ACTION for Players------");
	    p1.diefunc();
		p2.diefunc();
		
		
     //Every time the player gains a food token, he gives away one card
	    Card[] myarr = (Card[]) new Card[cardarr1.length-1]; 
	    
	    //Deletes the last card in the player deck
		p1.deleteElement(myarr);

	    //Deletes the last card in the player deck
		p2.deleteElement(myarr);
		 
		//printing the card contents to test if the "Gain Food Action" worked
		   System.out.println("------Player1's Cards afterwards------");
			p1.displayCardArray();
			System.out.println("------Player2's Cards afterwards------");
			p2.displayCardArray();
	
			//Command prompt code to write console contents to output file
//			javac myFile.java
//			java ClassName > a.txt
			
			//bool variable to test our acceptance test function
			boolean test= testfunc();
			
			//Function should return false/true depending on randomness
			System.out.println("TEST: "+ test);

	}
	
	
	public static boolean testfunc()
	{
		boolean flag= true;
		//Opening expected.txt
		File file1 = new File("C:\\Users\\Vrinda Shroff\\Desktop\\Software Engineering\\Homework4v2.0\\src\\expected.txt");
		Scanner sc1=null;
		try {
			sc1 = new Scanner(file1);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Opening Output.txt
		File file2 = new File("C:\\Users\\Vrinda Shroff\\Desktop\\Software Engineering\\Homework4v2.0\\src\\output.txt");
		Scanner sc2 =null;
		try {
			sc2 = new Scanner(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//While each of the files has another line, keep checking
	while(sc1.hasNextLine() && sc2.hasNextLine())
	{

		
		//if the two lines don't match
		if(sc1.nextLine() != sc2.nextLine())
		{
			//set flag to false
			flag = false;
			
		}

	}
		
		return flag;
		
	}
	
}
	
