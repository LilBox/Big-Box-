import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;

public class WalkingFrame extends JFrame implements ActionListener{

	private Man man;
	private Ball ball;
	ArrayList <Ball> balls = new ArrayList<Ball>();
	public WalkingFrame() {
		this.setBounds(100,100,1000,1000);
		man = new Man(0,0);
		this.setLayout(null);
		this.add(man);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Timer timer = new Timer(2,this);
		timer.start();
		this.addKeyListener(new KeyListener() {
		
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == e.VK_W) {
					man.setDY(-2);
				}
				if(e.getKeyCode() == e.VK_S) {
					man.setDY(+2);
				}
				if(e.getKeyCode() == e.VK_A) {
					man.setDX(-2);
				}
				if(e.getKeyCode() == e.VK_D) {
					man.setDX(+2);
				}
				if(e.getKeyCode() == e.VK_SPACE) {
					ball = new Ball(man.getX(),man.getY()+10);
					balls.add(ball);
					add(ball);
					
					ball.setDX(-3);
					
					ball.setVisible(true);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == e.VK_W) {
					man.setDY(0);
				}
				
				if(e.getKeyCode() == e.VK_S) {
					man.setDY(0);
				}
				if(e.getKeyCode() == e.VK_A) {
					man.setDX(0);
				}
				if(e.getKeyCode() == e.VK_D) {
					man.setDX(0);
				}
			}
			public void keyTyped(KeyEvent e) {				
			}
			
		});
	}
	public static void main(String[] args) {
		new WalkingFrame();
	}
	public void actionPerformed(ActionEvent e) {
		man.update();
		for(Ball b: balls){
			if(b.getX() < 1000 || b.getX() > 0) {
				b.update();
			}
			else {
				this.remove(b);
			}
		}
	}
}