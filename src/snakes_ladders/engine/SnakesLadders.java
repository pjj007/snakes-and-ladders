/**
 * 
 */
package snakes_ladders222.engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Paul J Jensen
 *
 */
public class SnakesLadders {
	
	int boardArray[] = new int[100];
	
	static class QueueEntry {
		int vertex;
		int distance;
	};
	
	
	public static SnakesLadders snakeGame() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		Random r = new Random();
		
//		int snakes[][] = {{22, 5},{49, 26},{53, 23},{64, 39},{80, 57},{93, 69},{98, 67}};
//		int ladders[][] = {{3, 25},{8, 29},{12, 55},{18, 37},{38, 58},{47, 68},{59, 82},{72, 88},{76, 95}};
		int player1Index = 1;
		int player2Index = 1;
//		int turn1 = 1;
//		int turn2 = 1;
		
		while((player1Index != 100) || (player2Index !=100)) {
			
			System.out.println("Player 1, press any key to shuffle the die");
			
//			turn1++;
			br.readLine();
			
			int dieThrow = r.nextInt(6);
			if (dieThrow == 0)
			{
				dieThrow++;
			}
			
			System.out.println("The number on the die is " +dieThrow);
			
			if ((player1Index + dieThrow) > 100)
			{
				System.out.println("You will have to wait for the next turn, you have excedeed 100");
			}

			else if ((player1Index + dieThrow) == 100)
			{
				System.out.println("Congratulations player 1, you have won the game!");
			}
			
			else
			{
				player1Index += dieThrow;
				System.out.println("You have progressed by " + dieThrow + " square(s)");
			}
			br.readLine();
			
		}
	}
		public static void main(String[] args) throws IOException {
		
		SnakesLadders s = new SnakesLadders();
		s = snakeGame();
			
		int N = 100;
		int [] board = new int [N];
		for (int i = 0; i < N; i++)
			board[i] = -1;
		
	// Ladders
	board [3] = 25;
	board [8] = 29;
	board [12] = 55;
	board [18] = 37;
	board [38] = 58;
	board [47] = 68;
	board [59] = 82;
	board [72] = 88;
	board [76] = 95;
	
	// Snakes
	board [22] = 5;
	board [49] = 26;
	board [53] = 23;
	board [64] = 39;
	board [80] = 57;
	board [93] = 69;
	board [97] = 66;
	}
	
	
	
//public SnakesLadders(Scanner scanner) {
		// TODO Auto-generated constructor stub
	}

//	public static void main(String[] args)
//	{
//		int counter = 100, iteration = -1;
//		
//		while (counter > 0) {
//			if (counter % 10 == 0 && counter != 100) {
//				if (iteration == -1) 
//				{
//					
//				}
//			}
//		}
//		
//	}
	
//	public static String startGame (String start) throws IOException{
//		
//		SnakesLadders ui = new SnakesLadders(new Scanner(System.in)); 
//		
//		int userPosition = 1;
//		int compPosition = 1;
//		int diceRoll = 0;
//		int userRoll = 1;
//		int compRoll = 1;
//		
//		//int snakesLaddersArray [] = new int []
//	}
	
	
	
}
