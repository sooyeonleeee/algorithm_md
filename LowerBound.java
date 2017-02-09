package linearSearch;

import java.util.Scanner;

public class LowerBound {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] data = new int[num];
		for (int i = 0; i < num; i++) {
			data[i] = scan.nextInt();
		}
		int value = scan.nextInt();
		System.out.println(sequential(data, value));
		System.out.println(binary(data, 0, data.length - 1, value));

	}

	public static int sequential(int[] data, int value) {
		int index = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] >= value) {
				return i + 1;
			}
		}
		return data.length + 1;
	}

	public static int binary(int[] data, int s, int e, int value) {

		while (e - s > 0) {
			int m = (s + e) / 2;
			if (data[m] < value) {
				s = m + 1;
			} else {
				e = m;
			}
		}
		return e + 1;
	}

}
