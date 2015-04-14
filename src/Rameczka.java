

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
		Rameczka gra=new Rameczka();
		Ball pilka=new Ball();
		Racquet paletki= new Racquet();

		gra.add(paletki);
		gra.add(pilka);
		while (true){
			pilka.moveBall();
			pilka.repaint();
			Thread.sleep(1);
			
		}
	
	

	}

}
