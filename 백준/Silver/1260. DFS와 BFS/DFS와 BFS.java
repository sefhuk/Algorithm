import java.io.*;
import java.util.*;

class Main {
    private static boolean isVisited[];
    private static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();
    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        isVisited = new boolean[N + 1];

        for (int i = 0; i < N+1; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int vert1 = Integer.parseInt(st.nextToken());
            int vert2 = Integer.parseInt(st.nextToken());
            list.get(vert1).add(vert2);
            list.get(vert2).add(vert1);
        }

        for (ArrayList<Integer> i : list) {
            Collections.sort(i);
        }

        dfs(V);
        sb.append("\n");

        isVisited = new boolean[N + 1];
        bfs(V);

        bw.write(sb.toString());
        bw.close();
    }

    public static void dfs(int start) {
        isVisited[start] = true;
        sb.append(start + " ");
        for (int i = 0; i < list.get(start).size(); i++) {
            if (!isVisited[list.get(start).get(i)]) {
                dfs(list.get(start).get(i));
            }
        }
    }

    public static void bfs(int start) {
        q.offer(start);
        isVisited[start] = true;
        while (!q.isEmpty()) {
            int poped = q.poll();
            sb.append(poped + " ");
            for (int i = 0; i < list.get(poped).size(); i++) {
                if (!isVisited[list.get(poped).get(i)]) {
                    q.offer(list.get(poped).get(i));
                    isVisited[list.get(poped).get(i)] = true;
                }
            }
        }
    }
}