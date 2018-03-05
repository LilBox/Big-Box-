import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent{
private int dx = 0;
	public Ball(int x, int y)
	{
		setLocation(x,y);
		setSize(30,30);

	}
	public void paintComponent(Graphics graph) {
		Graphics2D g = (Graphics2D) (graph);
		g.setColor(Color.RED);
		Ellipse2D.Double ball = new Ellipse2D.Double(4,0,10,10);
		g.fill(ball);
		
	}
	public void setDX(int dx) {
		this.dx = dx;
	}
		public void update() {
		setLocation(getX() + dx,getY());
	}
	
}
