import java.util.*;
import java.io.*;

public class Main {
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		
		Deque<Character> front = new LinkedList<>();
		Deque<Character> back = new LinkedList<>();

		String str = br.readLine();
		int M = Integer.parseInt(br.readLine());

		for(int i = 0; i < str.length(); i++) {
			front.addLast(str.charAt(i));
		}

		for(int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");

			if(input.length == 2) {
				front.addLast(input[1].charAt(0));
			} else {
				switch(input[0]) {
					case "L":
						if(!front.isEmpty()) {
							back.addFirst(front.removeLast());
						}
						break;
					case "D":
						if(!back.isEmpty()) {
							front.addLast(back.removeFirst());
						}
						break;
					case "B":
						if(!front.isEmpty()) {
							front.removeLast();
						}
				}
			}
		}

		while(!front.isEmpty()) {
			bw.write(front.removeFirst() + "");
		}
		
		while(!back.isEmpty()) {
			bw.write(back.removeFirst() + "");
		}

		bw.close();
	}
}