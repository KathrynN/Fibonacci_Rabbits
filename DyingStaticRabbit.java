package rabitsAndFibb;

public class DyingStaticRabbit extends Rabbit {

	private int age=0;
	private boolean breed = false;
	private int ageToDie;
	private boolean dead = false;
	
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
