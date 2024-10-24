import java.util.*;
import java.io.*;

public class Main {
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder result = new StringBuilder();

		int start = 1;
		for(int i = 0; i < N; i++) {
			int target = Integer.parseInt(br.readLine());
			
			while(stack.isEmpty() || stack.peek() < target) {
				stack.push(start++);
				result.append("+\n");
			}

			if(stack.peek() == target) {
				stack.pop();
				result.append("-\n");
			} else {
				bw.write("NO\n");
				bw.close();
				return;
			}
		}

		bw.write(result.toString());
		bw.close();
	
	}
}