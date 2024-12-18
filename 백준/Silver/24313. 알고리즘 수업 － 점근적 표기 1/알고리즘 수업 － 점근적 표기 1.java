import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] split = br.readLine().split(" ");
		int a1 = Integer.parseInt(split[0]);
		int a0 = Integer.parseInt(split[1]);

		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());

		if(a1 == c) {
			if(a0 <= 0) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
		} else if(c > a1) {
			if(a0 / (c - a1) <= n0) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
		} else {
			bw.write("0\n");
		}

		bw.close();
    }
}