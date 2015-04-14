import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Racquet extends JPanel {
	
	private int yPos1;
	private int yPos2;
	
	public Racquet(){
		setYPos1(100);
		setYPos2(100);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		g2d.fillRect(20, getYPos1(), 10, 20);
		g2d.setColor(Color.red);
		g2d.fillRect(780, getYPos2(), 10, 20);
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


	
	
}
