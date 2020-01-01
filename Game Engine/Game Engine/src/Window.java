import javax.swing.JFrame;

public class Window {

	private static int windowWidth = 800;
	private static int windowHeight = 600;
	
	private static double cellWidth = 2.0;
	private static double cellHeight = 2.0;
	
	private static String title = "Game";
	
	
	
	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		
		window.setSize(windowWidth, windowHeight);
		window.setTitle(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		Grid grid = new Grid(windowWidth, windowHeight);
		DrawGrid dg = new DrawGrid(grid, cellWidth, cellHeight);
	}
	
	public static void setWindowWidth(int width)
	{
		windowWidth = width;
	}
	
	public static void setWindowHeight(int height)
	{
		windowWidth = height;
	}
	
	public static void setTitle(String name)
	{
		title = name;
	}
	
	
}
