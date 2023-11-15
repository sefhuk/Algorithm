import java.io.*;
import java.util.*;

class Main {
    private static boolean isVisited[];
    private static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static Queue<Integer> q = new LinkedList<>();
    public static int virusCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pcCount = Integer.parseInt(br.readLine());
        int networkCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < pcCount + 1; i++) {
            list.add(new ArrayList<>());
        }

        StringTokenizer st;
        for (int i = 0; i < networkCount; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            list.get(one).add(two);
            list.get(two).add(one);
        }

        for (ArrayList<Integer> i : list) {
            Collections.sort(i);
        }

        isVisited = new boolean[pcCount + 1];
        dfs(1);

        bw.write(virusCount - 1 + "");
        bw.close();
    }

    public static void dfs(int start) {
        isVisited[start] = true;
        virusCount++;
        for (int i = 0; i < list.get(start).size(); i++) {
            if (!isVisited[list.get(start).get(i)]) {
                dfs(list.get(start).get(i));
            }
        }
    }
}