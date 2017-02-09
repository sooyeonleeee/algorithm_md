package dynamicSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class DFSTest {

	public int[][] data;
	public int n;
	public int cnt;
	public int size[];
	public static int[] dx = { 1, 0, -1, 0 };
	public static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		DFSTest test = new DFSTest();
		Scanner scan = new Scanner(System.in);

		test.n = scan.nextInt();
		test.data = new int[test.n][test.n];
		for (int i = 0; i < test.n; i++) {
			for (int j = 0; j < test.n; j++) {
				test.data[i][j] = scan.nextInt();
			}
		}
		test.size = new int[test.n];
		test.solve();

		System.out.println(test.cnt);

		for (int i = 0; i < (test.size).length; i++) {
			System.out.println(test.size[i]);
		}

	}

	// a,b�� ������ ����� ��� �������� c�� ĥ�Ѵ�
	public void dfs(int a, int b, int c) {
		data[a][b] = c;
		if (safe(a + 1, b) && data[a + 1][b] == 1)
			dfs(a + 1, b, c);
		if (safe(a - 1, b) && data[a - 1][b] == 1)
			dfs(a - 1, b, c);
		if (safe(a, b + 1) && data[a][b + 1] == 1)
			dfs(a, b + 1, c);
		if (safe(a, b - 1) && data[a][b - 1] == 1) {
			dfs(a, b - 1, c);
		}
	}

	public void dfs2(int a, int b, int c) {
		data[a][b] = c;
		for (int i = 0; i < 4; i++)
			if (safe(a + dx[i], b + dy[i]) && data[a + dx[i]][b + dy[i]] == 1)
				dfs2(a + dx[i], b + dy[i], c);
	}

	public void solve() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (data[i][j] == 1) {
					cnt++;// ���� �� ó�� ���� �߰������� 1�̵�
					dfs(i, j, cnt + 1);// �׸��� 2�� �ٲ��
				}

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (data[i][j] > 1) {
					size[data[i][j]]++;
				}
		// sort
	}

	// �̵��ؾ� �� ��Ұ� ������ ��踦 �Ѿ����� �˻�
	public boolean safe(int a, int b) {
		return (0 <= a && a < n) && (0 <= b && b < n);
	}
}
