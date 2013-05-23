public class Player {

	private int numConquered, number;
	private boolean isActive;

/**
*=================================
*	CONSTRUCTOR
*=================================
*/

	public Player(int numberIn) 
	{
		numConquered = 0;
		number = numberIn;
		isActive = false;
	}

/**
*=================================
*	METHODS
*=================================
*/

	public void setActive(boolean active) 
	{
		isActive = active;
	}

	public boolean isActive() 
	{
		return isActive;
	}

	public int getNumConquered() 
	{
		return numConquered;
	}

	public void setConquered(int con) 
	{
		numConquered = con;
	}

}//end class
