import java.util.*;
import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {

		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(getCount(n) + "\n");
		}

		bw.flush();
	}

	private static int getCount(int n) {

		switch(n) {
			case 1:
				return 1;
			case 2:
				return 2;
			case 3:
				return 4;
			default:
				return getCount(n-1) + getCount(n-2) + getCount(n-3);
		}
	}
}