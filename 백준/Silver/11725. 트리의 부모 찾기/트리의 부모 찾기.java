import java.util.*;
import java.io.*;

public class Main {
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] answer;
	static boolean[] visited;
	static ArrayList<Integer>[] tree;

	public static void main(String[] args) throws Exception {

		int N = Integer.parseInt(br.readLine());
		
		tree = new ArrayList[N + 1];
		for(int i = 0; i < tree.length; i++) {
			tree[i] = new ArrayList<>();
		}

		for(int i = 0; i < N - 1; i++) {
			String[] split = br.readLine().split(" ");
			int one = Integer.parseInt(split[0]);
			int two = Integer.parseInt(split[1]);

			tree[one].add(two);
			tree[two].add(one);
		}

		answer = new int[N + 1];
		visited = new boolean[N + 2];

		dfs(1);

		for(int i = 2; i < answer.length; i++) {
			bw.write(answer[i] + "");
			bw.newLine();
		}

		bw.flush();
	}	

	public static void dfs(int start) {

		visited[start] = true;

		for(int i: tree[start]) {
			if(!visited[i]) {
				visited[i] = true;
				answer[i] = start;
				dfs(i);
			}
		}
		
	}
}