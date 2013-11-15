package rabitsAndFibb;

/** DyingStaticRabbit all share a death age
*   @Author Kathryn Newbould
*   @Version 1.0
*/
public class DyingStaticRabbit extends Rabbit {

	private int age=0;
	private boolean breed = false;
	private int ageToDie;
	private boolean dead = false;

	/** DyingStaticRabbit is the constructor
	*   @param deadBy defines the age at which these rabbits dye.
	*/
	DyingStaticRabbit(int deadBy){
		super();
		ageToDie = deadBy;
	}
	
	public int diesAt(){
		return ageToDie;
	}
	
	public boolean isBreed() {
		return breed;
	}
	
	public boolean isDead(){
		return dead;
	}

/** timeStep iterates the age, checks if the rabbit is dead, and if it is
*   old enough to breed and not dead, lets it breed next timestep
*/
	    public void timeStep() {
		age+=1;
		deathChance();
		if (age>=2 && !dead){
			breed = true;
		}
	}

	private void deathChance() {
		// kill off all rabbits when they reach age 5
		if (age >= ageToDie){
			dead = true;
			breed = false;
		}

	}

}
