/**
 * 
 */
package snakes_ladders222.engine;

/**
 * @author Paul J Jensen
 *
 */
public final class Main {

	public static void main (String[] args){
		
		String[] playerNames = {"Player 1", "Player 2"};
		int numSquares = 100;
		
		int [][] snakesFromTo = {{22, 5},{49, 26},{53, 23},{64, 39},{80, 57},{93, 69},{98, 67}};
		int [][] laddersFromTo = {{3, 25},{8, 29},{12, 55},{18, 37},{38, 58},{47, 68},{59, 82},{72, 88},{76, 95}};
	
		Game game = new Game (playerNames, numSquares, snakesFromTo, laddersFromTo);
	
		game.play();
	}
	
}
