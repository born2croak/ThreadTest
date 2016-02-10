/**
 * Counter
 * Increments a number until it reaches 100
 * @author Tim Gifford
 * @author Brian Robertson
 * @author Dason Woodhouse
 * @author Parker Hubbard
 *
 */
public class Counter implements Runnable{
	
	public int currNum;
	public int countBy = 2;
	
	public Counter () {
		currNum = 0;
	}
	
	public Counter (int startNum) {
		currNum = startNum;
	}
	
	public void setCountBy (int num) {
		countBy = 2;
	}
	
	public void run () {
		
		while (currNum < 100) {
			System.out.println(this);
			currNum += countBy;

			
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}
	
	public String toString() {
		String stringNum = "";
		stringNum = Integer.toString(currNum);
		
		return stringNum;
	}

}
