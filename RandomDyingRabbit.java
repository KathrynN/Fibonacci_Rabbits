package rabitsAndFibb;

/** RandomDyingRabbit has a chance to die on every timestep.
*   @Author Kathryn Newbould
*   @Version 1.0
*/
public class RandomDyingRabbit extends Rabbit {
	private double ageToDie;

	/** deathChance generates a random number between 0 and 2 
	*   if that number is less than 0.5, the rabbit dies
	*/
	private void deathChance() {
		ageToDie = Math.random() * 2;
		// generate age to Die 
		if (ageToDie < 0.5){
			dead = true;
			breed = false;
		}

	}

	/** timeStep increments the age by one month
	*   checks if the rabbit is dead
	*   if not, and the rabbit is old enough to breed, sets it to breed
	*/
	public void timeStep() {
		age+=1;
		deathChance();
		if (age>=2 && !dead){
			breed = true;
		}
	}
	
	public int diesAt(){return ageToDie;}
	
}
