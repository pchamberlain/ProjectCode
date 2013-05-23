import java.util.Random;

public class Game 
{

	private Board gameBoard;
	private Player playerOne, playerTwo;
	private int[] numsRolled = new int[4];
	private Random dieSix = new Random();
	private int activePlayer;

/**
*=================================
*	CONSTRUCTOR
*=================================
*/
	public Game() 
	{
		gameBoard = new Board();
		playerOne = new Player(1);
		playerTwo = new Player(2);
		activePlayer = 1;
	}

/**
*=================================
*	METHODS
*=================================
*/
	public void nextPlayer() 
	{
		if (activePlayer == 1)
		{
			playerOne.setActive(false);
			playerTwo.setActive(true);
			activePlayer = 2;
		}
		else
		{
			playerOne.setActive(true);
			playerTwo.setActive(false);
			activePlayer = 1;
		}
		System.out.println(gameBoard.toString());
	}

	public String roll() 
	{
		String ret = "";
		for (int i = 0 ; i < 4 ; i++) 
		{
			numsRolled[i] = dieSix.nextInt(6) +1;
			ret += numsRolled[i] + ", ";
		}
		return ret;
	}

	public void endTurn(int player) 
	{

		
		if (player == 1) 
		{
			playerOne.setConquered(gameBoard.setMarkers(player));
		}
		else 
		{
			playerTwo.setConquered(gameBoard.setMarkers(player));
		}		
		gameBoard.removeMarkers();
	}

	public void crapOut() 
	{
		gameBoard.removeMarkers();
	}
	
	public boolean makePairs(int pairOne, int pairTwo) 
	{
		boolean validPair;

		if ((pairOne == numsRolled[0] + numsRolled[1]) && (pairTwo == numsRolled[2] + numsRolled[3])) 
		{
			validPair =  true;	
		}
		else if ((pairOne == numsRolled[0] + numsRolled[2]) && (pairTwo == numsRolled[1] + numsRolled[3])) 
		{
			validPair =  true;	
		}
		else if ((pairOne == numsRolled[0] + numsRolled[3]) && (pairTwo == numsRolled[1] + numsRolled[2])) 
		{
			validPair =  true;	
		}
		else if ((pairOne == numsRolled[1] + numsRolled[2]) && (pairTwo == numsRolled[0] + numsRolled[3])) 
		{
			validPair =  true;	
		}
		else if ((pairOne == numsRolled[1] + numsRolled[3]) && (pairTwo == numsRolled[0] + numsRolled[2])) 
		{
			validPair =  true;	
		}
		else if ((pairOne == numsRolled[2] + numsRolled[3]) && (pairTwo == numsRolled[0] + numsRolled[1])) 
		{
			validPair =  true;	
		}
		else 
		{
			validPair =  false;
		}
	
		if (validPair) {
			if (playerOne.isActive()) {
				gameBoard.addMarkers(pairOne, 1);
				gameBoard.addMarkers(pairTwo, 1);
			}
			else 
			{
				gameBoard.addMarkers(pairOne, 2);
				gameBoard.addMarkers(pairTwo, 2);
			}
		}

		return validPair;
	}

	public int isWinner()
	{
		if (playerOne.getNumConquered() >= 3)
		{
			return 1;
		}
		else if (playerTwo.getNumConquered() >= 3)
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}

}//end Game		
		
