package wingspan;

public class Space {
	
	private int object;//different for diff habitats: die, egg, card
	private String habitat; //type of habitat
	private boolean action; //if there is an action for that space, for example trading a card for a die
	private Card placed; //card that is placed on the space
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
