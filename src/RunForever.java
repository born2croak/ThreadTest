/**
 * RunForever
 * Run Forest Run!
 * @author Tim Gifford
 * @author Brian Robertson
 * @author Dason Woodhouse
 * @author Parker Hubbard
 * 
 */
public class RunForever implements Runnable {

	public void run () {
		try {
			while (!Thread.interrupted()) {
				Thread.sleep(1000);
				System.out.println("Running...");
			}
		}
		catch (InterruptedException ex){
		}
	}
}
