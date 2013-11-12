package rabitsAndFibb;

public abstract class Rabbit {
	protected boolean breed = false;
	protected int age=0;
	protected boolean dead=false;
	private static int counter=0;
	private int ID;
	
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
	void timeStep(){
		age+=1;
		deathChance();
		if (age>=2 && !dead){
			breed = true;
		}
	}
	private void deathChance(){}
	public int diesAt(){return 0;}
}

