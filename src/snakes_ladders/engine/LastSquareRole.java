/**
 * 
 */
package snakes_ladders222.engine;

/**
 * @author Paul J Jensen
 *
 */
public final class LastSquareRole extends SquareRole{

	public LastSquareRole (Square s)
	{
		super(s);
	}
	
	@Override
	public boolean isLastSquare()
	{
		return true;
	}
	
}
