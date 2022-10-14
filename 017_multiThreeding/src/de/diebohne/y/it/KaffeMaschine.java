package de.diebohne.y.it;

/**
 * stellt einen eigenen Ablauf dar: ist ein THRED
 * @author Alfa
 *
 */
public class KaffeMaschine  extends Thread{
		@Override
		public void run() {
			for(int i = 0; i<20; i++) {
				System.out.println("Koffe ist fertig...." + (20 - i));
				try {
					Thread.sleep(100);
					
				}catch(InterruptedException ausnahme){
					System.out.println("Anzeige kommt gleich Wieder...");
				}
			}
		}
}

