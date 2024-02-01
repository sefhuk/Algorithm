import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");

				int N = Integer.parseInt(st.nextToken());
				int M = Integer.parseInt(st.nextToken());
        
				int[] basket = new int[N];
				for(int i = 1; i <= N; i++) {
					basket[i-1] = i;
				}

				for(int i = 0; i < M; i++) {
					st = new StringTokenizer(br.readLine(), " ");
					swap(basket, Integer.parseInt(st.nextToken()) - 1,
							Integer.parseInt(st.nextToken()) - 1);
				}

				for(int i = 0; i < N; i++) {
					System.out.print(basket[i] + " ");
				}
    }

		public static void swap(int[] basket, int start, int end) {
			
			while(start < end) {
				int tmp = basket[start];
				basket[start] = basket[end];
				basket[end] = tmp;

				start++;
				end--;
			}
		}
}
