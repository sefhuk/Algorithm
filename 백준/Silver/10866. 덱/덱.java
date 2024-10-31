import java.util.*;
import java.io.*;

public class Main {
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] deque = new int[20000];
	static int front = 9999;
	static int back = 9998;

	public static void main(String[] args) throws Exception {
		
		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++) {

			String[] split = br.readLine().split(" ");
			
			switch(split[0]) {
				case "push_back":
					pushBack(Integer.parseInt(split[1]));
					break;
				case "push_front":
					pushFront(Integer.parseInt(split[1]));
					break;
				case "pop_front":
					popFront();
					break;
				case "pop_back":
					popBack();
					break;
				case "size":
					size();
					break;
				case "empty":
					empty();
					break;
				case "front":
					front();
					break;
				case "back":
					back();
					break;
			}
		}

		bw.close();
	}

	private static void pushFront(int x) throws Exception {
		deque[--front] = x;
	}

	private static void pushBack(int x) throws Exception {
		deque[++back] = x;
	}

	private static void popFront() throws Exception {
		if(front > back) {
			bw.write("-1\n");
			return;
		}

		bw.write(deque[front] + "\n");
		front++;
	}

	private static void popBack() throws Exception {
		if(front > back) {
			bw.write("-1\n");
			return;
		}

		bw.write(deque[back] + "\n");
		back--;
	}

	private static void size() throws Exception {
		bw.write((back - front + 1) + "\n");
	}

	private static void empty() throws Exception {
		if(front > back) {
			bw.write("1\n");
			return;
		}

		bw.write("0\n");
	}

	private static void front() throws Exception {
		if(front > back) {
			bw.write("-1\n");
			return;
		}

		bw.write(deque[front] + "\n");
	}

	private static void back() throws Exception {
		if(front > back) {
			bw.write("-1\n");
			return;
		}

		bw.write(deque[back] + "\n");
	}
}