import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.*;
public class Man extends JComponent{

	private int dx = 0, dy = 0;
	public Man(int x, int y) {
		setLocation(x,y);
		setSize(200,400);
		
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) (g);
		Ellipse2D.Double head = new Ellipse2D.Double(4,0,30,30);
		//(x,y,width,height)
		g2.fill(head);
		g2.setColor(Color.CYAN);
		Rectangle body = new Rectangle(19,30,3,20);
		g2.fill(body);
		//Rectangle body = new Rectangle(8,10,3,20);
		//g2.fill(body);
		g2.setColor(Color.ORANGE);
		Rectangle leftArm = new Rectangle(10,33,8,3);
		g2.fill(leftArm);
		//Rectangle leftArm = new Rectangle(0,13,8,3);
		//g2.fill(leftArm);
		Rectangle rightArm = new Rectangle(20,33,8,3);
		g2.fill(rightArm);
		g2.setColor(Color.GREEN);
		Rectangle leftLeg = new Rectangle(16,40,3,15);
		g2.fill(leftLeg);
		Rectangle rightLeg = new Rectangle(20,40,3,15);
		g2.fill(rightLeg);
	}
	public void setDX(int dx) {
		this.dx = dx;
	}
	public void setDY(int dy) {
		this.dy = dy;
	}
	public void update() {
		setLocation(getX() + dx,getY() + dy);
	}
	
	
}
