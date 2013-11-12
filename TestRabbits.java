package rabitsAndFibb;

import java.util.ArrayList;

public class TestRabbits {

	public static void main(String[] args) {
		ArrayList<Rabbit> rabbithutch = new ArrayList<Rabbit>();
//		rabbithutch.add(new DyingStaticRabbit(4));
//		BreedingTime.timeToBreed(rabbithutch, 10);
//		System.out.println();
//		rabbithutch.clear();
		rabbithutch.add(new RandomlyDyingPredetRabbit(5));
		BreedingTime.timeToBreed(rabbithutch, 10);

		
	}

}
