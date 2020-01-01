import java.util.HashMap;

public class Grid {
	
	private HashMap<Double, HashMap<Double, Cell>> grid;
	
	private int windowWidth;
	private int windowHeight;

	public Grid(int windowWidth, int windowHeight)
	{
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
		
	}
	
}
