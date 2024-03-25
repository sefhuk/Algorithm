import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<Character> stack = new Stack<>();

		String brackets = sc.nextLine();

		for(int i = 0; i < brackets.length(); i++) {

			char one = brackets.charAt(i);

			if(one == ')') {
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
					continue;
				}
			}

			stack.push(one);
		}

		System.out.println(stack.size());
	}
}