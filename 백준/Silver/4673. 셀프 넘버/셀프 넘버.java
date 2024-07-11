import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		int[] arr = new int[10001];
		
		for(int i = 1; i < arr.length; i++) {

			int sum = i;

			String numStr = i + "";
			for(int j = 0; j < numStr.length(); j++) {
				sum += numStr.charAt(j) - '0';
			}

			if(sum <= 10000) {
				arr[sum] = -1;
			}
		}

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != -1) bw.write(i + "\n");
		}

		bw.close();
	}
}