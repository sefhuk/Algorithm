import java.util.*;
import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {

		String input = br.readLine();
		
		int result = 0;
		int openCount = 1;

		for(int i = 1; i < input.length(); i++) {
			char now = input.charAt(i);
			char prev = input.charAt(i - 1);
			
			if(now == '(') {
				openCount++;
			} else {
				openCount--;
				if(prev == '(') {
					result += openCount;
				} else {
					result++;
				}
			}
		}

		bw.write(result + "\n");
		bw.flush();
	}
}