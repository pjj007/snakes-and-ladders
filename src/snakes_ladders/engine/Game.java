/**
 *
 */
package snakes_ladders222.engine;

import java.util.LinkedList;
/**
 * @author Paul J Jensen
 *
 */
public final class Game {

	private LinkedList <Player> players = new LinkedList <Player>();

	private Board board = null;

	private Player winner;

	private final class Die
	{
		private static final int MINVALUE = 1;

		private static final int MAXVALUE = 6;

		public int roll()
		{
			return random(MINVALUE, MAXVALUE);
		}

		private int random(int min, int max)
		{
			assert min < max;
			return (int) (min + Math.round((max-min) * Math.random()));
		}
	}

	private void movePlayer(int roll)
	{
		Player currentPlayer = players.remove();
		currentPlayer.moveForward(roll);
		players.add(currentPlayer);
		if (currentPlayer.wins())
		{
			winner = currentPlayer;
		}
	}

	public Game(String[] playerNames, int numSquares, int[][] snakes, int[][] ladders)
	{
		makeBoard(numSquares, ladders, snakes);
		makePlayers(playerNames);
	}

	private void makeBoard(int numSquares, int[][] ladders, int[][] snakes)
	{
		board = new Board(numSquares, ladders, snakes);
	}

	private void makePlayers (String[] playerNames)
	{
		assert playerNames.length > 0 : "There must be some player" ;
		System.out.println("Players are : ");
		int i = 1;
		for (String str : playerNames)
		{
			Player player = new Player(str);
			players.add(player);
			System.out.println(i + ". " + str);
			i++;
		}
	}

	public void play() {

		assert !players.isEmpty() : "No players to play";
		assert board!= null : "No scoreboard to play";

		Die die = new Die();
		startGame();

//		for (Player player : players)
//		{
//			firstSquare().enter(player);
//		}
//		winner = null;
//
		System.out.println("Initial state : \n" + this);
		while (notOver())
		{
			int roll = die.roll();
			System.out.println("Current player is " + currentPlayer()
			+ " and rolls " + roll);
			movePlayer(roll);
			System.out.println("State : \n" + this);
		}
		System.out.println(winner + " has won ");
	}

	private void startGame()
	{
		placePlayersAtFirstSquare();
		winner = null;
	}

	private void placePlayersAtFirstSquare()
	{
		for (Player player : players)
		{
			board.firstSquare().enter(player);
		}
	}

	private boolean notOver()
	{
		return winner == null;
	}

	@Override
	public String toString()
	{
		String str = new String();
		for (Player player : players)
		{
			str += player.getName() + " is at square "
					+ (player.position() + 1) + "\n";
		}
		return str;
	}

	Player currentPlayer()
	{
		assert players.size() > 0;
		return players.peek();
	}

//	private void createGame(int numSquares, int[][] ladders, int[][] snakes) {
//		squares.add(new FirstSquare (0, this));
//		for (int position = 1 ; position <numSquares -1 ; position++)
//		{
//			Square square = new Square (position, this);
//			squares.add(square);
//		}
//		squares.add(new LastSquare(numSquares -1, this));
//
//		for (int=i ; i < snakes.length ; i++)
//		{
//			assert snakes [i].length == 2;
//
//			int fromPosition = snakes[i][0] -1;
//			int toPosition = snakes[i][0] -1;
//			int transport = toPosition - fromPosition;
//			squares.set(fromPosition, new Snake (fromPosition, this, transport));
//		}
//
//		for (int=i ; i < ladders.length ; i++)
//		{
//			assert ladders [i].length == 2;
//
//			int fromPosition = ladders[i][0] -1;
//			int toPosition = ladders[i][0] -1;
//			int transport = toPosition - fromPosition;
//			squares.set(fromPosition, new Ladders (fromPosition, this, transport));
//		}
//
//	}





}

