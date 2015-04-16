

import javax.swing.JFrame;

public class Rameczka extends JFrame{
	 public Rameczka()
	 {
		 super("rameczka");
		 setSize(800,600);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Rameczka ramka=new Rameczka();	
		Game game=new Game();
		//System.out.println(Racquets.XPOS1);
		//System.out.println(Racquets.XPOS2);
		ramka.add(game);
		while (true){
			game.move();
			game.repaint();
			Thread.sleep(5);
			
		}
	
	

	}

}
