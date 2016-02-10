import java.lang.Thread;

/**
 * 
 * @author Tim
 *
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		Counter counterEven = new Counter(0);
		Counter counterOdd = new Counter(1);
		
		Thread threadEven = new Thread(counterEven);
		Thread threadOdd = new Thread(counterOdd);
		Thread running = new Thread(new RunForever());
		
		threadEven.start();
		threadOdd.start();		
		running.start();
		
		while (threadEven.isAlive() || threadOdd.isAlive()) {
			
		}
		running.interrupt();
		if (!threadEven.isAlive() && !threadOdd.isAlive()) {
			System.out.println("All finished");
		}
	}

}
