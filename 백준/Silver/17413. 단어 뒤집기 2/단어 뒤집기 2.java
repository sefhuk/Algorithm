import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<>();

		String input = br.readLine();

		StringBuilder result = new StringBuilder();
		boolean isClosed = true;
		for(int i = 0; i < input.length(); i++) {
			
			char c = input.charAt(i);

			if(c == ' ') {
				if(isClosed) {
					while(!stack.isEmpty()) {
						result.append(stack.pop());
					}
				}

				result.append(c);

			} else if(c == '<') {
				while(!stack.isEmpty()) {
					result.append(stack.pop());
				}

				result.append(c);
				isClosed = false;

			} else if(c == '>') {
				result.append(c);
				isClosed = true;

			} else {
				if(isClosed) {
					stack.push(c);
				} else {
					result.append(c);
				}
			}
		}

		while(!stack.isEmpty()) {
			result.append(stack.pop());
		}

		bw.write(result.toString() + "\n");
		bw.close();
	}
}
