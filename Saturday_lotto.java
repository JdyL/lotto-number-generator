import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Saturday_lotto {
	public static void main(String[] args) {
		int maxNumbers = 45 + 1;
		int slots = 6;

		System.out.println("//////////// Saturday Lotto Number Generator ////////////");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the amount of games: ");
		int amount = keyboard.nextInt();
		Integer[] arr = new Integer[maxNumbers];
		for(int i = 0;i<arr.length; i++) {

			arr[i]=i;
		}
		for (int o=0;o<amount;o++) {
			Collections.shuffle(Arrays.asList(arr));
			for (int i=0;i<slots;i++){
				if (!(i==(slots-1))){
					if (arr[i].equals(0)) {
						System.out.print(arr[i+10].toString() + "-");
					}
					else {
						System.out.print(arr[i].toString() + "-");
					}
				}
				else if (arr[i].equals(0)) {
					System.out.print(arr[i+10].toString());
				}
				else {
					System.out.print(arr[i].toString());
				}
			}
			System.out.println("");
		}
	}

	public static int getRandom(int maximum, int minimum) {
		return ((int) (Math.random()*(maximum - minimum))) + minimum;
	}
}
