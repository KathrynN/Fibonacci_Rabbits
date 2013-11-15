package rabitsAndFibb;

import java.util.ArrayList;

/** BreedingTime is the class which groups together Rabbits, monitoring how many have died or been born
*   @Author Kathryn Newbould
*   @Version 1.0
*/

public class BreedingTime {
	static int numOfRabbitsBorn;
	static int numOfRabbitsDead;

	/** timeToBreed monitors how many rabbits are born through numOfRabbitsBorn
	*   die, through numOfRabbitsDead
	*   It iterates through an ArrayList of Rabbit a given number of times (time)
	*   (stopping if all are dead) and time steps for each one.  
	*   @param rab is an ArrayList of any subclass of rabbit
	*   @param time is the number of timesteps to iterate over the ArrayList
	*/
	public static void timeToBreed(ArrayList<Rabbit> rab, int time){
		numOfRabbitsBorn = 0;
		numOfRabbitsDead = 0;
		// Method to monitor the breeding / dying behaviour of rabbits.
		for(int t = 0; t<time; t++){
			if(rab.size() ==0){
				break;  // stop if all rabbits are dead
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

    /**  breed loops through the ArrayList, and for each breedable rabbit, it adds a new rabbit to the ArrayList
    *   it also removes dead rabbits from the ArrayList
    *   and then returns this new, cleaned up list    *
    *   @param rab - an ArrayList of any subclass of class Rabbit
    */
	
	private static ArrayList<Rabbit> breed(ArrayList<Rabbit> rab){
	/*
    method which takes an array list of super class Rabbit, and returns a copy of it, having removed the dead rabbits, and added newly born rabbits.
	*/
		ArrayList<Rabbit> newHutch = new ArrayList<Rabbit>(rab);
		int iter = 0;
		for(Rabbit rabbit : rab){
			if (rabbit.isBreed() ){
				newHutch.add(new RandomlyDyingPredetRabbit(5));	// RandomDyingRabbit()  // new DyingstaticRabbit(rabbit.diesAt())  //new Rabbits  
				// I will learn how to change the type of Rabbit created without writing here in a few weeks
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
