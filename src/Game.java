import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Game extends JPanel {
	Ball ball=new Ball(this);
	Racquets rac=new Racquets(this);
	
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
