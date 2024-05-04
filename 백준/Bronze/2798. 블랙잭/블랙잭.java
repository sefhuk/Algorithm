import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);

    input = br.readLine().split(" ");
    br.close();
    
    int[] cards = new int[N];
    for(int i = 0; i < N; i++) {
      cards[i] = Integer.parseInt(input[i]);
    }

    int max = 0;
    for(int i = 0; i < N - 2; i++) {
      for(int j = i + 1; j < N - 1; j++) {
        for(int k = j + 1; k < N; k++) {
          int sum = cards[i] + cards[j] + cards[k];
          if(sum <= M) {
            if(sum > max) {
              max = sum;
            }
          }
        }
      }
    }

    bw.write(max + "\n");
    bw.close();
  }
}