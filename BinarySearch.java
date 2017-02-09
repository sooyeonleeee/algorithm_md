package linearSearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] s = { 11, 23, 25, 33, 34, 56, 66, 79, 80, 90};
		int k = 23;
		System.out.println(search(s, 0, s.length - 1, k));

	}

	public static int search(int[] data, int s, int e, int k) {
		while (s <= e) {
			int m = (s + e) / 2;
			if (data[m] == k) {
				return m;
			}
			if (data[m] > k) {
				e = m - 1;
			} else {
				s = m + 1;
			}
		}
		return -1;
	}

}
