import java.lang.Thread;

/**
 * ThreadTest
 * Build counter threads, run them in parallel, and then
 * display when they close
 * @author Tim Gifford
 * @author Brian Robertson
 * @author Dason Woodhouse
 * @author Parker Hubbard
 * 
 */
public class ThreadTest {

	/**
	 * Main
	 * Where the magic happens
	 * @param args
	 */
	public static void main(String[] args) {
		
		//make the Counters
		Counter counterEven = new Counter(0);
		Counter counterOdd = new Counter(1);
		
		//make the Threads
		Thread threadEven = new Thread(counterEven);
		Thread threadOdd = new Thread(counterOdd);
		Thread running = new Thread(new RunForever());
		
		//start the Threads
		threadEven.start();
		threadOdd.start();		
		running.start();
		
		//check pulse loop
		while (threadEven.isAlive() || threadOdd.isAlive()) {
			
		}
		running.interrupt();
		if (!threadEven.isAlive() && !threadOdd.isAlive()) {
			System.out.println("All finished");
		}
	}

}
