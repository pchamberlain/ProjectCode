/**
* This class contains information on the player marker positions, neutral marker positions and other informtion on a column 
* on the game board
@author Patrick Chamberlain
*/

public class Column {

	public int playerOnePosition, playerTwoPosition, height, owner;
	public int neutralPosition;
	private boolean conquered;

/**=================================
*	CONSTRUCTOR
* ==================================
*/
	public Column(int heightIn) 
	{

		playerOnePosition = 0;
		playerTwoPosition = 0;
		neutralPosition = 0;
		height = heightIn;
		conquered = false;
		owner = 0;
	}

/**=================================
*	METHODS
* ==================================
*/

// This method returns whether or not the column has been conquered
	public boolean isConquered() 
	{
		return conquered;
	}

//This method returns the owner (conquering player) of the column or 0 if there is none
	public int getOwner() 
	{
		return owner;
	}

//This methods adds markers to the column, incrementing existing ones.
	public void addMarker(int player) 
	{
		if (player == 1) 
		{
			if (playerOnePosition > 0) 
			{
				if (neutralPosition != 0) 
				{
					neutralPosition++;
				}
				else 
				{
					neutralPosition = playerOnePosition + 1;
				}
			}
			else 
			{
				neutralPosition++;
			}
		}
		else 
		{
			if (playerTwoPosition > 0) 
			{
				if (neutralPosition != 0) 
				{
					neutralPosition++;
				}
				else 
				{
					neutralPosition = playerTwoPosition + 1;
				}
			}
			else 
			{
				neutralPosition++;
			}
		}

		if (neutralPosition > height)
		{
			neutralPosition = height;
		}
	}//end addMarker()

/**
* This method sets the player's marker to the neutral marker's position and checks to see if the column become conquered. If * the column is conquered it returns 1, otherwise it returns 0.
*/
	public int setPlayerPosition(int player) 
	{

/** 
*	Updates the player marker's position
*/

		if (player == 1) 
		{
			if (neutralPosition > playerOnePosition) 
			{
				playerOnePosition = neutralPosition;
			}
		}
		else 
		{
			if (neutralPosition > playerTwoPosition) 
			{
				playerTwoPosition = neutralPosition;
			}
		}

/**
*	Check if the marker is at the top of the column
*/
		if (neutralPosition == height) 
		{
			System.out.println("Conquered");
			conquered = true;
			owner = player;
			neutralPosition = 0;//neutral position is set back to 0
			return 1;
		}
		else 
		{
			neutralPosition = 0;//neutral position is set back to 0
			return 0;
		}

	}//end setPlayerPosition()


}//end class
