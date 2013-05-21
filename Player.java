public class Player {

private String name;
private int numConquered, number;
private boolean isActive;

/**=================================
*	CONSTRUCTOR
*/==================================

	public Player(String nameIn, int numberIn) {

		name = nameIn;
		numConquered = 0;
		number = numberIn
		isActive = false
	}

/**=================================
*	METHODS
*/==================================

public void setActive(boolean active) {
	isActive = active;
	}

public boolean isActive(boolean active) {
	return isActive;
	}

public int getNumConquered() {
	return numConquered;
	}

public void addConquered() {
	numCOnquered++;
	}

}//end class