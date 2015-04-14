

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import javax.swing.JPanel;

public class Ball extends JPanel {
	private int R;
	private int xPos;
	private int yPos;
	public int xa;
	public int ya;
	
	public Ball(){
		setXPos(20);
		setYPos(20);
		setR(20);
		
	}
	public void moveBall(){
		if (getXPos() + xa < 0)
			xa = 1;
		if (getXPos()  + xa > getWidth() - 30)
			xa = -1;
		if (getYPos()  + ya < 0)
			ya = 1;
		if (getYPos()  + ya > getHeight() - 30)
			ya = -1;
		
		setXPos(getXPos()+xa);
		setYPos(getYPos()+ya);
	}
			
		
	
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.blue);
		g2d.fillOval(getXPos(), getYPos(), getR()*2, getR()*2);
	}	
	



	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
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
