import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class DrawGrid extends JComponent {

	private Grid grid;
	
	private double cellWidth;
	private double cellHeight;
	
	public DrawGrid(Grid grid, double cellWidth, double cellHeight)
	{
		this.grid = grid;
		this.cellWidth = cellWidth;
		this.cellHeight = cellHeight;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 =  (Graphics2D) g;
		g2.setColor(Color.WHITE);
		//Rectangle rect = new Rectangle(i * cellWidth, j * cellHeight, cellWidth, cellHeight);
		
		//for (int i = 0;)
		
	}
}
