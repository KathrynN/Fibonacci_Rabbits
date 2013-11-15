package rabitsAndFibb;

/** Rabbit is the super class of all other rabbits
*   @Author Kathryn Newbould
*   @Version 1.0
*/

public abstract class Rabbit {

	protected boolean breed = false;// can this rabbit breed
	protected int age=0;		// how old is this rabbit
	protected boolean dead=false;	// is it dead?
	private static int counter=0;	// how many rabbits have we made?
	private int ID;			// individual rabbit ID (so we can track which die)
	
	Rabbit(){
		counter+=1;
		ID = counter;
	}

	public boolean isBreed() {
		return breed;
	}
	public boolean isDead(){
		return dead;
	}
	public int getID(){
		return ID;
	}

	/** timeStep increments age by one month, calls deathChance(), then checks if the rabbit is able to breed
	*
	*/
	void timeStep(){		
		age+=1;
		deathChance();
		if (age>=2 && !dead){
			breed = true;
		}
	}
	private void deathChance(){}	// determines how or why rabbits die
	public int diesAt(){return 0;}	// diesAt() returns the integer for each rabbit if their death is predetermined
}

