package rabitsAndFibb;

public class RandomDyingRabbit extends Rabbit {
/* 
 *  rabbit is given a 1/2 chance of dying at every time step.
 */
	private int ageToDie;
	
	private void deathChance() {
		ageToDie = (int) (Math.random() * 2);
		// generate age to Die 
		if (ageToDie < 0.5){
			dead = true;
			breed = false;
		}

	}
	public void timeStep() {
		age+=1;
		deathChance();
		if (age>=2 && !dead){
			breed = true;
		}
	}
	public int diesAt(){return ageToDie;}
	
}
