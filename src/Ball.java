

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball{
	private static final int D=30;//diameter
	private int xPos;
	private int yPos;
	public int xa=1;
	public int ya=1;
	private Game game;
	
	public Ball(Game game){
		setXPos(50);
		setYPos(20);
		this.game=game;
		
	}
	public void moveBall(){
		if (getXPos() + xa < 0)
			game.gameOver();	
		if (getXPos() + xa < Racquets.XPOS1 && colision());
		
		if (getXPos()  + xa > game.getWidth()-D)
			game.gameOver();		
		if (getXPos()> game.getWidth()-D -20- Racquets.XPOS2 && colision())	
				xa = -1;		
		if (getYPos()  + ya < 0)
			ya = 1;
		if (getYPos()  + ya > game.getHeight() -D)
			ya = -1;
		
		
		setXPos(getXPos()+xa);
		setYPos(getYPos()+ya);
	}
	public boolean colision(){
		return (getBounds().intersects(game.rac.getBounds1()) || 
					getBounds().intersects(game.rac.getBounds2()));
	}
	public Rectangle getBounds() {
		return new Rectangle(getXPos(), getYPos(),D+200,D+200);
	}
			
	public void paint(Graphics2D g2d) {
		g2d.setColor(Color.blue);
		g2d.fillOval(getXPos(), getYPos(),D,D);
	}	
	
	public int getXPos() {
		return xPos;
	}

	public void setXPos(int xPos) {
		this.xPos = xPos;
	}

	public int getYPos() {
		return yPos;
	}

	public void setYPos(int yPos) {
		this.yPos = yPos;
	}

}
