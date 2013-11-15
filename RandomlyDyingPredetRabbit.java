package rabitsAndFibb;
/** @Author Kathryn Newbould
*   @Version 1.0
*   RandomlyDyingPredetRabbit has its lifetime determined when it is created (provided it lives at least 1 month).
*/
public class RandomlyDyingPredetRabbit extends Rabbit{
	private int ageToDie;
	
	/**@param cielAge - this is the age at which a rabbit dies no matter what.
	* rabbit cannot die before they are 2 months old.
	*/
	RandomlyDyingPredetRabbit(int cielAge){
		ageToDie = (int) (Math.random() * cielAge);
		ageToDie +=1;	// rabbits can't die before they're 2.
	}

	/** timeStep does a few things:
	*   it increments the age of the rabbit
	*   it checks if the bunny is dead through deathChance()
	*   and then, if the rabbit is old enough to breed (and not dead) it sets breed to true
	*/
	public void timeStep() {
		age+=1;
		deathChance();
		if (age>=2 && !dead){
			breed = true;
		}
	}

	/**  deathChance checks the rabbit's currently age against the ageToDie (determined randomly with ceiling cielAge
	*   if the rabbit's time is here, it sets the rabbit to dead and un-fertile
	*/
	private void deathChance() {
		if (age >= ageToDie){
			dead = true;
			breed = false;
		}

	}

}
