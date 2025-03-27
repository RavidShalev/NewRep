/** 
 * This class shares the data between different components or threads.
 * It contains an integer array, a boolean array for win states, 
 * a synchronization flag, and a constant integer value 'b'.
 * 
 * @Author: RavidShalev
 **/
public class SharedData 
{
	/** The main data array shared in the system */
	private int [] array;

	/** Boolean array representing win states */
	private boolean [] winArray;

	/** Shared flag for synchronization or status tracking */
	private boolean flag;

	/** A constant integer value, set during construction */
	private final int b;
	
	/**
	 * Constructor that initializes the data array and constant value.
	 * 
	 * @param array the integer array to be shared
	 * @param b a constant integer value
	 */
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Returns the win array.
	 * 
	 * @return boolean array indicating win states
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Sets the win array.
	 * 
	 * @param winArray the boolean array to set
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Returns the shared integer array.
	 * 
	 * @return the data array
	 */
	public int[] getArray() 
	{
		return array;
	}

	/**
	 * Returns the constant integer 'b'.
	 * 
	 * @return the value of b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Returns the value of the shared flag.
	 * 
	 * @return true or false depending on the flag's state
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Sets the value of the shared flag.
	 * 
	 * @param flag the boolean value to set
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
