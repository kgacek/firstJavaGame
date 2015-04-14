

import javax.swing.JFrame;

public class Rameczka extends JFrame{
	 public Rameczka()
	 {
		 super("rameczka");
		 setSize(800,400);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Rameczka ramka=new Rameczka();	
		Game game=new Game();
		ramka.add(game);
		while (true){
			game.move();
			game.repaint();
			Thread.sleep(4);
			
		}
	
	

	}

}
