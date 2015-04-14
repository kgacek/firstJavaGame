import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;


public class Racquets{
	
	private int yPos1;
	private int yPos2;
	private int dy1=0;
	private int dy2=0;
	private Game game;
	
	public Racquets(Game game){
		setYPos1(100);
		setYPos2(100);
		this.game=game;
	}
	
	public void paint(Graphics g2d) {

		g2d.setColor(Color.black);
		g2d.fillRect(20, getYPos1(), 8, 50);
		g2d.setColor(Color.red);
		g2d.fillRect(game.getWidth()-28, getYPos2(), 8, 50);
	}
	
	public void move(){
		if(getYPos1() > 0 && getYPos1() < game.getWidth()-50)
		setYPos1(getYPos1()+dy1);
		if(getYPos2() > 0 && getYPos2() < game.getWidth()-50)
		setYPos2(getYPos2()+dy2);	
		
	}
	
	public int getYPos1() {
		return yPos1;
	}

	public void setYPos1(int yPos) {
		this.yPos1 = yPos;
	}
	public int getYPos2() {
		return yPos2;
	}

	public void setYPos2(int yPos) {
		this.yPos2 = yPos;
	}
	public void keyReleased(KeyEvent e) {
	dy1=0;	
	dy2=0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP)
			dy1=-1;
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			dy1=1;
		if (e.getKeyCode() == KeyEvent.VK_W)
			dy2=-1;
		if (e.getKeyCode() == KeyEvent.VK_S)
			dy2=1;
	}


	
	
}
