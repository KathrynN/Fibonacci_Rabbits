package rabitsAndFibb;

public class RandomlyDyingPredetRabbit extends Rabbit{
	private int ageToDie;
	RandomlyDyingPredetRabbit(int cielAge){
		ageToDie = (int) (Math.random() * cielAge);
		ageToDie +=1;	// rabbits can't die before they're 2.
	}
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
