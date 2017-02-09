package linearSearch;

import java.util.Scanner;

public class UpperBound {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}

		int value = scan.nextInt();

		System.out.println(binary(data, 0, n - 1, value));

	}

	public static int binary(int[] data, int s, int e, int value) {
		while (e - s > 0) {
			int m = (s + e) / 2;
			if (data[m] <= value) {
				s = m + 1;
			} else {
				e = m;
			}
		}
		return e + 1;
	}

}
