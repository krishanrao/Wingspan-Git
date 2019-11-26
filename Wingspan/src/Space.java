package connect4;

public class Space {
	
	
	public boolean occupied; //marker for occupied or not
	public int color; //color represents player num
	
	//constructor to set space fields
	Space()
	{
		occupied = false;
		color=0; //0 for unoccupied 
	}
	
	Space(boolean o, int c)
	{
		occupied = o;
		color=c; //0 for unoccupied 
	}
	public boolean getoccupied()
	{
		return occupied;
	}
	
	public void setoccupied()
	{
		occupied= true;
	}
	public void setcol(int c)
	{
		color = c;
	}

	public int getcol()
	{
		return color;
	}
}
