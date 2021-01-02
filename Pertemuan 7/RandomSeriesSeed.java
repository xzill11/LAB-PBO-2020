//fazil basri

import java.util.Random;

public class RandomSeriesSeed {
	
	public static void main(String[] args) {

		Random rand = new Random(20);	System.out.println("Random Number 1: " + rand.nextInt(100));
		System.out.println("Random Number 2: " + rand.nextInt(100));
		System.out.println("Random Number 3: " + rand.nextInt(100));
		System.out.println("Changing seed to change to sequence");
		rand.setSeed(5);
		System.out.println("Random Number 4: " + rand.nextInt(100));
		System.out.println("Random Number 5: " + rand.nextInt(100));
		System.out.println("Random Number 6: " + rand.nextInt(100));
		System.out.println("Setting seed 40 to produce the previous sequence");
		rand.setSeed(20);
		System.out.println("Random Number 7: " + rand.nextInt(100));
		System.out.println("Random Number 8: " + rand.nextInt(100));
		System.out.println("Random Number 9: " + rand.nextInt(100));
	}
}

/*
code diatas merupakan contoh dari penggunaan Class Random,  class
Random ini akan menghasil nilai acak yang berupa tipe data integer, double,
Boolean, float dan long. 
Hasil output diatas adalah :

Random Number 1: 53
Random Number 2: 36
Random Number 3: 1
Changin seed to change to sequence
Random Number 4: 87
Random Number 5: 92
Random Number 6: 74
Setting seed 40 to produce the previous sequence
Random Number 7: 53
Random Number 8: 36
Random Number 9: 1
*/