import java.util.*;
import java.io.*;

public class Main {
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean[] visited;
	static int[] distance;
	static int N, M, K, X;
	static ArrayList<Integer>[] graph;

	public static void main(String[] args) throws Exception {
		
		int[] split = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = split[0];
		M = split[1];
		K = split[2];
		X = split[3];
		visited = new boolean[N + 1];
		distance = new int[N + 1];

		graph = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		for(int i = 0; i < M; i++) {
			split = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			graph[split[0]].add(split[1]);
		}

		bfs();

		boolean isPossible = false;
		for(int i = 1; i < distance.length; i++) {
			if(distance[i] == K) {
				bw.write(i + "\n");
				isPossible = true;
			}
		}

		if(!isPossible) {
			bw.write("-1\n");
		}

		bw.close();

	}

	public static void bfs() throws Exception {

		Queue<Integer> q = new LinkedList<>();
		q.offer(X);
		visited[X] = true;

		while(!q.isEmpty()) {
			int pop = q.poll();
			
			for(int i: graph[pop]) {
				if(!visited[i]) {
					q.offer(i);
					visited[i] = true;
					distance[i] = distance[pop] + 1;
				}
			}
		}

	}
}