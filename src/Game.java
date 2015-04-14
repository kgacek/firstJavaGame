import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


public class Game extends JPanel {
	Ball ball=new Ball(this);
	Racquets rac=new Racquets(this);
	
	
	public Game(){
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				rac.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				rac.keyPressed(e);
			}
		});
		setFocusable(true);
	}
	
	public void paint(Graphics g){
	super.paint(g);
	Graphics2D g2d = (Graphics2D) g;
	ball.paint(g2d);
	rac.paint(g2d);
	
	}
	public void move(){
		ball.moveBall();
		rac.move();
	}

}
