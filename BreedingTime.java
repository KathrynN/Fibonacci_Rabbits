package rabitsAndFibb;

import java.util.ArrayList;

public class BreedingTime {
	static int numOfRabbitsBorn;
	static int numOfRabbitsDead;
	
	public static void timeToBreed(ArrayList<Rabbit> rab, int time){
		numOfRabbitsBorn = 0;
		numOfRabbitsDead = 0;
		// Method to monitor the breeding / dying behaviour of rabbits.
		for(int t = 0; t<time; t++){
			if(rab.size() ==0){
				break;
			}
			rab = breed(rab);
			for(Rabbit rabbit: rab){
				rabbit.timeStep();
				System.out.print(rabbit.getID() + "    ");
			}
			
			String plural = "";
			if(rab.size() > 1){
				plural = "s";
			}
			System.out.println();
			System.out.println("The rabbit hutch has " + rab.size() + " rabbit" + plural + " at time " + t + ".  " + numOfRabbitsDead + " rabbits have died." );
		}
	}
	
	private static ArrayList<Rabbit> breed(ArrayList<Rabbit> rab){
		ArrayList<Rabbit> newHutch = new ArrayList<Rabbit>(rab);
		int iter = 0;
		for(Rabbit rabbit : rab){
			if (rabbit.isBreed() ){
				newHutch.add(new RandomlyDyingPredetRabbit(5));	// RandomDyingRabbit()  // new DyingstaticRabbit(rabbit.diesAt())  //new Rabbits
				numOfRabbitsBorn++;
			}
			if (rabbit.isDead()){
				newHutch.remove(iter);
				numOfRabbitsDead++;
				iter--;
			}
			iter++;
		}
		return newHutch;

	}
}
