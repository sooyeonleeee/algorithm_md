package sort;
import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;
		}

		// selectionSort(arr);
		quickSort(arr, 0, arr.length - 1);
		int cnt = 0;
		for (int i : arr) {
			cnt++;
			if (cnt % 5 == 0) {
				System.out.println();
			}
			System.out.print(i + "\t");
		}

	}

	public static void selectionSort(int[] arr) {

		int tmp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public static void quickSort(int[] arr, int left, int right) {
		int i, j, key, temp;
		if (left < right) {
			i = left;
			j = right + 1;
			key = arr[left];
			do {
				do {
					i++;
				} while (arr[i] < key);
				do {
					j--;
				} while (arr[j] > key);
				if (i < j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			} while (i < j);
			temp = arr[left];
			arr[left] = arr[j];
			arr[j] = temp;
			quickSort(arr, left, j - 1);
			quickSort(arr, j + 1, right);
		}

	}

}
