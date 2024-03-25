import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		
		Stack<String> stack = new Stack<>();

		int result = 0;

		for(int i = 0; i < N; i++) {

			String str = sc.nextLine();
			
			for(int j = 0; j < str.length(); j++) {
				String word = str.charAt(j) + "";

				if(!stack.isEmpty() && stack.peek().equals(word)) {
					stack.pop();
					continue;
				}

				stack.push(word);
			}

			if(stack.isEmpty()) {
				result++;
			}

			stack.clear();
		}

		System.out.println(result);
	}
}