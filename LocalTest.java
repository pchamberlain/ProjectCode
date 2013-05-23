import java.util.*;

/**
* Local Test Driver for Can't Stop Server
@author Patrick Chamberlain
*/

public class LocalTest 
{

	public static void main(String args[]) 
	{

		Game cantStop = new Game();

		String inputString, outputString;
		int inputIntOne, inputIntTwo;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Hello and welcome to the Local Test Driver for Can't Stop Server");

		while (cantStop.isWinner() == 0) {
			
			while (true) 
			{	
				System.out.println("Player One: Enter Command");
				System.out.println("Commands: \n1) Roll\n2) Crap\n3) End Turn");
	
				inputString = scan.nextLine();
				
				if ("Roll".equalsIgnoreCase(inputString)) 
				{
					System.out.println("You Rolled: " + cantStop.roll());	
					System.out.println("What pairs would you like to make? Enter one at a time");	
				
					inputIntOne  = scan.nextInt();
					inputIntTwo = scan.nextInt();
				
					while (!cantStop.makePairs(inputIntOne, inputIntTwo)) 
					{
						System.out.println("INVALID PAIRS SELECTED! Enter one at a time");
						inputIntOne  = scan.nextInt();
						inputIntTwo = scan.nextInt();
					}
				}
				else if ("crap".equalsIgnoreCase(inputString))
				{
					cantStop.crapOut();
					cantStop.nextPlayer();
					break;
				}
				else if ("end turn".equalsIgnoreCase(inputString))
				{		
					cantStop.endTurn(1);
					if (cantStop.isWinner() == 1) 
					{
						System.out.println("Player One Wins!");
					}
					cantStop.nextPlayer();
					break;
				}

			if (cantStop.isWinner() != 0) {break;}
				
			}//end player One turn

			while (true) 
			{			
				System.out.println("Player Two: Enter Command");
				System.out.println("Commands: \n1) Roll\n2) Crap\n3) End Turn");
	
				inputString = scan.nextLine();
				
				if ("Roll".equalsIgnoreCase(inputString)) 
				{
					System.out.println("You Rolled: " + cantStop.roll());	
					System.out.println("What pairs would you like to make? Enter One at a time");	
				
					inputIntOne  = scan.nextInt();
					inputIntTwo = scan.nextInt();
				
					while (!cantStop.makePairs(inputIntOne, inputIntTwo)) 
					{
						System.out.println("INVALID PAIRS SELECTED! Enter One at a time");
						inputIntOne  = scan.nextInt();
						inputIntTwo = scan.nextInt();
					}
				}
				else if ("crap".equalsIgnoreCase(inputString))
				{
					cantStop.crapOut();
					cantStop.nextPlayer();
					break;
				}
				else if ("end turn".equalsIgnoreCase(inputString))
				{		
					cantStop.endTurn(2);
					if (cantStop.isWinner() == 2) 
					{
						System.out.println("Player Two Wins!");
					}
					cantStop.nextPlayer();
					break;
				}
				
			}
		}//end game

	}//end main

}//end class
		
		

		
		
