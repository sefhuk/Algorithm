import java.util.*;
import java.io.*;

public class Main {
	
	static int[][] graph;
	static boolean[] visited;
	static int N, M, V;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    
	StringTokenizer st = new StringTokenizer(br.readLine());
	N = Integer.parseInt(st.nextToken());
	M = Integer.parseInt(st.nextToken());
	V = Integer.parseInt(st.nextToken());

	graph = new int[N + 1][N+1];
	visited = new boolean[N + 1];

	for(int i = 0; i < M; i++) {
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		graph[start][end] = 1;
		graph[end][start] = 1;
	}
	
	dfs(V);
	bw.flush();
	bw.newLine();
	bfs(V);
  }

  private static void dfs(int start) throws Exception {
	  visited[start] = true;
	  bw.write(start + " ");
		
	  for(int i = 1; i <= N; i++) {
		  if(!visited[i] && graph[start][i] == 1) {
			  dfs(i);
		  }
	  }
  }

  private static void bfs(int start) throws Exception {

	  Queue<Integer> q = new LinkedList<>();
	  q.offer(start);
	  visited = new boolean[N + 1];
	  visited[start] = true;

	  while(!q.isEmpty()) {
		  int pop = q.poll();
		  
		  for(int i = 1; i <= N; i++) {
			  if(!visited[i] && graph[pop][i] == 1) {
				  q.offer(i);
				  visited[i] = true;
			  }
		  }

		  bw.write(pop + " ");
	  }

	  bw.flush();
  }
}