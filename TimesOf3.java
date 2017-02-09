package linearSearch;

import java.util.Scanner;

public class TimesOf3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.print("X");
			} else {
				System.out.print(i);
			}
			System.out.print(" ");
		}

	}
}
