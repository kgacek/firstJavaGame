import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Game extends JPanel {
	Ball ball=new Ball(this);
	Racquets rac=new Racquets(this);
	
	
	public Game(){
		addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				rac.keyReleased(e);
				System.out.print("ssss");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				rac.keyPressed(e);
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		setFocusable(true);
	}
	
	public void gameOver() {
		JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}
	public void paint(Graphics g){
	super.paint(g);
	Graphics2D g2d = (Graphics2D) g;
	rac.paint(g2d);
	ball.paint(g2d);
	
	}
	public void move(){
		ball.moveBall();
		rac.move();
	}

}
