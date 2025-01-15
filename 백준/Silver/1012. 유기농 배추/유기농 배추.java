import java.util.*;
import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int[][] matrix;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {

		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			matrix = new int[M][N];
			visited = new boolean[M][N];

			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine(), " ");

				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				matrix[X][Y] = 1;
			}

			int result = 0;
			for(int j = 0; j < matrix.length; j++) {
				for(int k = 0; k < matrix[j].length; k++) {
					if(!visited[j][k] && matrix[j][k] == 1) {
						dfs(j, k);
						result++;
					}
				}
			}

			bw.write(result + "\n");
		}

		bw.close();
	}

	private static void dfs(int x, int y) {
		
		if(x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
			return;
		}

		if(!visited[x][y] && matrix[x][y] == 1) {
			visited[x][y] = true;
			dfs(x + 1, y);
			dfs(x - 1, y);
			dfs(x, y + 1);
			dfs(x, y - 1);
		}
	}
}