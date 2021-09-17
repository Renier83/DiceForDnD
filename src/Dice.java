
import java.util.Random;



public class Dice {

	public static void main(String[] args) {
		
		java.util.Random r = new Random();
		int [] stats = new int [4];
		int[] finalstat = new int [6];
		for(int k = 0; k < 6; k++) {
			
		
		
			for (int i = 0; i < 4; i++) {
					int result = r.nextInt(6);
					stats[i] = result + 1;
					//result++;
			
			
			System.out.println("You rolled a: " + (result + 1));
			
			}
			int min = 0;
			for (int i = 0; i < 4; i++) {
				System.out.print(stats[i]+ " ");
				if (stats[i] < stats[min]) {
					min = i;
				}
			}
			System.out.println();
			int total = 0;
			for(int i = 0; i < 4; i++) {
				if(i != min) {
					total += stats[i];
				}
			}
			finalstat[k] = total;
			System.out.println(total);
		}
		System.out.println("Final Stats");
		for(int k = 0; k < 6; k++) {
			System.out.println(finalstat[k] + " ");
		}
		System.out.println();
	}

}

// First step is create an array
// roll the die and insert in array
// add the top 3 highest value and insert in main array
//do this for loop 6 times and return values.