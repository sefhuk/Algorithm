import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int answer = 0;
    static boolean[] visited;
    static ArrayList<Integer>[] tree;
    static int target;
    static int root;

    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(br.readLine());

        tree = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            tree[i] = new ArrayList<>();
        }

        String[] split = br.readLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("-1")) {
                root = i;
                continue;
            }

            int parent = Integer.parseInt(split[i]);
            tree[parent].add(i);
            tree[i].add(parent);

        }

        visited = new boolean[N];

        target = Integer.parseInt(br.readLine());
        if (root == target) {
            bw.write("0\n");
            bw.close();
            return;
        }

        dfs(root);

        bw.write(answer + "\n");
        bw.close();
    }

    public static void dfs(int start) {

        visited[start] = true;
        int count = 0;

        for (int i : tree[start]) {
            if (!visited[i] && target != i) {
                visited[i] = true;
                dfs(i);
                count++;
            }
        }

        if (count == 0) {
            answer++;
        }
    }
}