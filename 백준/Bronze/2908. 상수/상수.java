import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strs = br.readLine().split(" ");

		for(int i = 0; i < 3; i++) {
			int tmp1 = Integer.parseInt(strs[0].charAt(3 - i - 1) + "");
			int tmp2 = Integer.parseInt(strs[1].charAt(3 - i - 1) + "");

			if(tmp1 == tmp2) continue;

			if(tmp1 < tmp2) {
				strs[0] = strs[1];
			}

			break;
		}

		for(int i = 0; i < 3; i++) {
			bw.write(strs[0].charAt(3 - i - 1) + "");
		}
		bw.close();
	}
}