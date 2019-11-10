package wingspan;

public class Space {
	
	private int object;//different for diff habitats: die, egg, card
	private String habitat; //each space on the board belongs to the habitat
	private boolean action; //each space also has an action
	public Card placed; //card that is placed on the space
	public boolean ifplaced; //if card on space->true
	
	Space()
	{
		object=0;
		habitat=" ";
		action= false;
		ifplaced=false;
	}
	Space(int o, String h, boolean act,boolean flag)
	{
		object=o;
		habitat=h;
		action= act;
		ifplaced= flag;
			
	}
	

}

