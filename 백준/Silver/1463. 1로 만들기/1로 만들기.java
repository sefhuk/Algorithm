import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];


		for(int i = 2; i <= N; i++) {
			arr[i] = arr[i - 1] + 1;

			if(i % 2 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 2] + 1);
			}

			if(i % 3 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 3] + 1);
			}
		}

		bw.write(arr[N] + "\n");
		bw.close();
	}
}