package wingspan;

public class Card {
	
	private String birdInfo; //Contains info on bird attributes
	private int eggCapacity; //Contains the egg capacity 
	private boolean whenPlayedPower; //True if the card has a when played power
	private boolean whenActivatedPower; //True if the card has a when activated player.

	// Constructor that sets all the card attributes
	public Card()
	{
		birdInfo = "";
		eggCapacity = 0;
		whenPlayedPower = false ;
		whenActivatedPower= false;
	}
	
	public Card(String info, int egg, boolean act, boolean play) //initialize cards using this constructor
	{
		birdInfo = info;
		eggCapacity = egg;
		whenPlayedPower = play;
		whenActivatedPower= act;

	}
	
	void setegg(int string)
	{
		eggCapacity = string;
	}
	
	void setinfo(String info)
	{
		birdInfo = info;
	}
	
	int getegg()
	{
		return eggCapacity;
	}
	 
	String getcapacity()
	{
		String x = "" + eggCapacity;
		return x;
	}
	
	String getplayed()
	{
		return "" + whenPlayedPower;
	}
	
	String getActivated()
	{
		return "" + whenActivatedPower;
	}
	//print the card info as a string
	void print()
	{
		System.out.println(birdInfo+ " "+ eggCapacity+ " " +whenPlayedPower+ " " + whenActivatedPower);
	}
	
	@Override
	public String toString() {
		return (birdInfo+ " "+ eggCapacity+ " " +whenPlayedPower+ " " + whenActivatedPower);		
	}

}
