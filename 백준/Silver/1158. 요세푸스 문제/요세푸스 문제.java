import java.util.*;
import java.io.*;

public class Main {
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String[] split = br.readLine().split(" ");
		int N = Integer.parseInt(split[0]);
		int K = Integer.parseInt(split[1]);

		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}

		StringBuilder sb = new StringBuilder("<");
		while(!q.isEmpty()) {
			for(int i = 0; i < K - 1; i++) {
				q.offer(q.poll());
			}

			sb.append(q.poll()).append(", ");
		}

		sb.delete(sb.length() - 2, sb.length());
		sb.append(">");

		bw.write(sb.toString());
		bw.close();
	}
}