import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class General {
	public static void main(String[] args) {
		boolean powerball = false;
		int powerMax = 0;
		System.out.println("//////////// General Lotto Number Generator ////////////");
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the maximum number: ");
		int maxNumbers = keyboard.nextInt() + 1;

		System.out.print("Enter the amount of slots: ");
		int slots = keyboard.nextInt();

		System.out.print("Is there a powerball?(y/n) ");
		String ball = keyboard.next();

		if (ball.equals("y")) {
			powerball = true;
			System.out.print("What is the maximum number for the powerball? ");
			powerMax = keyboard.nextInt();
		}

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
			if (powerball == true) {
				System.out.println("-("+ getRandom(0,powerMax) + ")");
			}
			else {
				System.out.println("");
			}
		}
	}

	public static int getRandom(int maximum, int minimum) {
		return ((int) (Math.random()*(maximum - minimum))) + minimum;
	}
}
