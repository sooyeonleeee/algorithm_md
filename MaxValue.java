package linearSearch;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			data[i] = scan.nextInt();
			if (data[i] > max) {
				index = i;
			}
		}

		System.out.println(data[index]);
		System.out.println(index + 1);
	}
}
