/**
* This class contains information on the game board used in the game as well as methods that affect the board and must be
* called on each column
@author Patrick Chamberlain
*/
public class Board{

	private Column[] columns;
	private int numMarkers;
	private int[] markerColumns;


/**=================================
*	CONSTRUCTOR
* ==================================
*/
	public Board() 
	{
		columns = new Column[11];
		columns[0] = new Column(2);
		columns[1] = new Column(4);
		columns[2] = new Column(6);
		columns[3] = new Column(8);
		columns[4] = new Column(10);
		columns[5] = new Column(12);
		columns[6] = new Column(10);
		columns[7] = new Column(8);
		columns[8] = new Column(6);
		columns[9] = new Column(4);
		columns[10] = new Column(2);
		numMarkers = 3;
		markerColumns = new int[3];
		
		for (int i = 0; i < 3; i++) 
		{
			markerColumns[i] = 0;
		}

	}

/**=================================
*	METHODS
* ==================================
*/

	public addMarkers(int col, int play) 
	{
		if (!columns[col-2].isConquered()) 
		{
			if (col == numMarkers[0]) 
			{
				columns[col-2].addMarker(play);
			}
			else if (col == numMarkers[1]) 
			{
				columns[col-2].addMarker(play);
			]
			else if (col == numMarkers[2]) 
			{
				columns[col-2].addMarker(play);
			}
			else if (numMarkers > 0) 
			{
				markerColumns[3-numMarkers] = col;
				numMarkers--:
				columns[col-2].addMarker(play);
			}
		}
	}

	public int setMarkers(int play) 
	{
		int numConq = 0;
		for (int i = 0; i <= 10; i++) 
		{
			if (columns[i].isConquered())
			{
				if (play == columns[i].getOwner())
				{
					numConq++;
				}
			}
			else 
			{
			numConq += columns[i].setPlayerPosition(play);
			}
		}
		return numConq;
	}
	
	public void removeMarkers() 
	{
		for (int i = 0; i <= 10; i++) 
		{
			columns[i].neutralPosition = 0;
		}
		numMarkers = 3;
	}

	public String toString() 
	{
		String print = "";
		print += "Player One\n";
		for (int i =0; i <= 10; i++) 
		{

			print += ("Column " + (i+2) + " " + columns[i].playerOnePosition + "\n");
		}
		print += "Player Two\n";
		for (int i =0; i <= 10; i++) 
		{
			
			print += ("Column " + (i+2) + " " + columns[i].playerTwoPosition + "\n");
		}
		return print;
	}

}//end class
