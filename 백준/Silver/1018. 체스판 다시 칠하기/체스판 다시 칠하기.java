import java.util.*;
import java.io.*;

class Main {

	static int[][] board;
	static int N;
	static int M;
    public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] split = br.readLine().split(" ");
		N = Integer.parseInt(split[0]);
		M = Integer.parseInt(split[1]);

		board = new int[N][M];

		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			for(int j = 0; j < M; j++) {
				board[i][j] = input.charAt(j) == 'B' ? -1 : 1;
			}
		}

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N - 8 + 1; i++) {
			for(int j = 0; j < M - 8 + 1; j++) {
				min = Math.min(min, check(i, j));
			}
		}

		bw.write(min + "\n");

		bw.close();
    }

	private static int check(int r, int c) {

		int start = 1;
		int result = Integer.MAX_VALUE;
		
		for(int k = 0; k < 2; k++) {
			int count = 0;
			for(int i = r; i < r + 2; i++) {
				for(int j = c; j < c + 8; j++) {
					if(start != board[i][j]) {
						count++;
					}

					if(start != board[i + 2][j]) {
						count++;
					}

					if(start != board[i + 4][j]) {
						count++;
					}

					if(start != board[i + 6][j]) {
						count++;
					}

					start *= -1;
				}

				start *= -1;
			}
			
			start = -1;
			result = Math.min(count, result);
		}

		return result;
	}
}