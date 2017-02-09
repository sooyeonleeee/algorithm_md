package linearSearch;

import java.util.Scanner;

public class LinearStructureSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int[] data = new int[num];

		for (int i = 0; i < num; i++) {
			data[i] = scan.nextInt();
		}

		int value = scan.nextInt();

		System.out.println(sequentialSearch(data, value));
		System.out.println(binarySearch(data, 0, data.length - 1, value));
		System.out.println(recursive(data, 0, data.length-1, value));
	}

	public static int sequentialSearch(int[] data, int value) {

		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				return i + 1;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] data, int s, int e, int value) {

		while (s <= e) {
			int m = (s + e) / 2;
			if (data[m] == value) {
				return m + 1;
			}
			if (data[m] < value) {
				s = m + 1;
			} else {
				e = m - 1;
			}
		}
		return -1;
	}

	public static int recursive(int[] data, int s, int e, int value) {
		if (s>e) {
			return -1;
		}
		int m=(s+e)/2;
		if (data[m]==value) {
			return m+1;
		}
		if (data[m]<value) {
			return recursive(data, m+1, e, value);
		}
		else {
			return recursive(data, s, m-1, value);
		}
	}

}
