public class Column {

private int playerOnePosition, playerTwoPosition, neutralPosition, height;
private boolean conquered;

/**=================================
*	CONSTRUCTOR
*/==================================

	public Column(int heightIn) {

		playerOnePosition = 0;
		playerTwoPosition = 0;
		neutralPosition = 0;
		height = heightIn;
		conquered = false;
	}

/**=================================
*	METHODS
*/==================================

public boolean isConquered() {
	return conquered;
	}

public void addMarker(int player) {

	if (player == 1) {
		if (playerOnePosition > 0) {
			if (neutralPosition != 0) {
				neutralPosition++;
				}
			else {
				neutralPosition = playerOnePosition + 1;
				}
		else {
			neutralPosition++;
			}
		}
	else {
		if (playerTwoPosition > 0) {
			if (neutralPosition != 0) {
				neutralPosition++;
				}
			else {
				neutralPosition = playerTwoPosition + 1;
				}
		else {
			neutralPosition++;
			}
		}
	}

}//end addMarker()

public void setPlayerPosition(int player) {

/** 
*	Updates the player marker's position
*/

	if (player == 1) {
		if (neutralPosition > playerOnePosition) {
			playerOnePosition = neutralPosition;
		}
	else {
		if (neutralPosition > playerTwoPosition) {
			playerTwoPosition = neutralPosition;
		}
	}

/**
*	Check if the marker is at the top of the column
*/
	if (neutral position == height) {
		conquered = true;
		}

	neutralPosition = 0;//neutral position is set back to 0

}//end setPlayerPosition()


}//end class