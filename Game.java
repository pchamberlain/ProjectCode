import java.util.Random;

public class Game {

private Board gameBoard;
private numsRolled int[] = new int[4]
Random dieSix = new Random();


	public Game () {
		gameBaord = new Board();
		}

public String roll() {
	String ret = "";
	for (int i = 0 ; i < 4 ; i++) {
		numsRolled[i] = dieSix.nextInt(6);
		ret += numsRolled[i] + ", ";
	}
	return ret;
}

public void endTurn() {
	