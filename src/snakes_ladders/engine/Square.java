/**
 *
 */
package snakes_ladders222.engine;

/**
 * @author Paul J Jensen
 *
 */
public class Square {

	private Board board = null;
	private Player player = null;
	private int position;
	private SquareRole squareRole = null;
	
	public Square(int pos, Board b)
	{
		assert pos >= 0 : "Square number must be positive or zero";
		position = pos;
		board = b;
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
	public void setPlayer(Player p)
	{
		player = p;
	}
	
	public int getPosition()
	{
		return position;
	}
	
	public void setSquareRole(SquareRole sr)
	{
		assert sr!= null;
		squareRole = sr;
	}
	
	public boolean isOccupied()
	{
		return squareRole.isOccupied();
	}
	
	public boolean isLastSquare()
	{
		return squareRole.isLastSquare();
	}
	
	public Square moveAndLand(int moves)
	{
		return squareRole.moveAndLand(moves);
	}
	
	public Square landHereOrGoHome()
	{
		return squareRole.landHereOrGoHome();
	}
	
	public void enter(Player p)
	{
		squareRole.enter(p);
	}
	
	public void leave(Player p)
	{
		squareRole.leave(p);
	}
	
	public Square findRelativeSquare(int shift)
	{
		return board.findSquare(position + shift);
	}
	
	public Square findFirstSquare()
	{
		return board.firstSquare();
	}
	
	public Square findLastSquare()
	{
		return board.lastSquare();
	}
	
//	public ISquare moveAndLand (int moves)
//	{
//		int lastPosition = game.findLastSquare().getPosition;
//		if (position + moves > lastPosition)
//		{
//			System.out.println("Should go to " + (position + moves + 1)
//					+ " beyond last square " + (lastPosition + 1)
//					+ " so don't move");
//			return this;
//		}
//		else
//		{
//			System.out.println("move from " + (position + 1) + " to "
//					+ (findRelativeSquare(moves).getPosion() + 1));
//		}
//
//		private ISquare findRelativeSquare(int moves)
//		{
//			return game.findSquare(moves + position);
//		}
//
//		public ISquare landHereOrGoHome()
//		{
//			if (isOccupied())
//			{
//				System.out.println("square " + (position + 1) + " is occupied");
//			}
//			else
//			{
//				System.out.println("land at " + (position + 1));
//			}
//			return isOccupied() ? findFirstSquare() : this;
//		}
//
//		private ISquare findFirstSquare()
//		{
//			return game.firstSquare();
//		}
//	}


}
