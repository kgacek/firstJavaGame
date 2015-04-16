import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


public class Racquets{
	
	private static final int WIDTH = 60;
	private static final int HEIGHT = 10;
	static final int XPOS1 = 20;
	static final int XPOS2= XPOS1 + HEIGHT;
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
		g2d.fillRect(XPOS1, getYPos1(), HEIGHT, WIDTH);
		g2d.setColor(Color.red);
		g2d.fillRect(game.getWidth()-XPOS2, getYPos2(), HEIGHT, WIDTH);
	}
	
	public void move(){
		if(getYPos1()+dy1 > 0 && getYPos1()+dy1 < game.getHeight()-50)
		setYPos1(getYPos1()+dy1);
		if(getYPos2()+dy1 > 0 && getYPos2()+dy1 < game.getHeight()-50)
		setYPos2(getYPos2()+dy2);	
		
	}
	public Rectangle getBounds1() {
		return new Rectangle(20, getYPos1() , WIDTH, HEIGHT);
	}
	public Rectangle getBounds2() {
		return new Rectangle(game.getWidth()-30, getYPos1() , WIDTH, HEIGHT);
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
