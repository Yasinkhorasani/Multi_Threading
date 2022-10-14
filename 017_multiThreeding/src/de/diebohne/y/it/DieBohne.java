package de.diebohne.y.it;

/**
 * THREAD: enthält eine Start-Methode: start einen eigenen Ablauf: eigener Thread
 * in er Start-methode wird ran_Methode aufgerufen
 * 
 * Thread glueweinTopf = new Thread(() -> {}); wird ein Object vom typ Runnable esrtellt:
 * inhalt ist die run-methode
 * 
 * start-Methode versetzt das Thread Objekt in den RUNNABLE Zustand
* Runnable: steht bereit um vom Scheduler des Betriebssystem ausgesucht zu werden
* Scheduler sucht ein Runnable Objekt aus und versetzt es in den RUNNING Zustand: run-Methode wird
* durchgeführt
* Running: 	1.) Scheduler versetzt den Thread in den Runnable Zustand
* 			2.) Thread-Objekt verläßt den Running Zustand: Thread.sleep, wait, 
			3.) Run-Methode ist beendet: Thread ist tot: Kann NICHT neu gestartet werden
 * 
 * @author Alfa
 *
 */
public class DieBohne {

	public static void main(String[] args) {
		System.out.println("----Willkommen-----");
		KaffeMaschine caffemaker = new KaffeMaschine();
		Thread glueweinTopf = new Thread(() -> {
			for(int i = 0; i<20; i++) {
				System.out.println("GlueWein ist heiß in." +(20 - i));
				try {
					Thread.sleep(100);
				}catch(InterruptedException ausnahme){}
			}
		});
		    glueweinTopf.start();
		
		//		caffemaker.run();
			caffemaker.start();
			
//		for(int i = 0; i<20; i++) {
//			System.out.println("GlueWein ist heiß.." +(20 - i));
//			try {
//				Thread.sleep(100);
//				
//			}catch(InterruptedException ausnahme){}
//		}
	
		for(int i = 0; i< 20; i++) {
			System.out.println(" alle coffe-Alle Tische werden abgewicht....");
			try {
				Thread.sleep(100);
			}catch(InterruptedException ausnahme) {
				System.out.println(" Schneller, ............");
			}
		}
		
		System.out.println("Läuft der Koffe noch?" + caffemaker.isAlive());
		
		while(caffemaker.isAlive() || glueweinTopf.isAlive()) {
			try {
				Thread.sleep(100);
				
			}catch(InterruptedException ausnahme){}
		
		}
		System.out.println("------Bis Bald-----");

	}

}
