public class Board{

private columns Column[]
private int numMarkers;


/**=================================
*	CONSTRUCTOR
*/==================================

	public Board() {
	
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

	}

/**=================================
*	METHODS
*/==================================

public void addMarkers(int col, int play) {

	columns[col-2].addMarker(play);

	}

public void setMarkers(int play) {

	for (int i = 0; i < 10; i++) {
		columns[i].setPlayerPosition(play);
	}
}
	
public void removeMarkers() {

	for (int i = 0; i < 10; i++) {
		columns[i].neutralPosition = 0;
	}
}

}//end class