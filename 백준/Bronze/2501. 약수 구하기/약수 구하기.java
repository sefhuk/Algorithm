import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");

    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);

    int idx = 0;
    int result = 0;
    for(int i = 1; i <= N; i++) {
      if(idx == K) {
        break;
      }

      if(N % i == 0) {
        result = i;
        idx++;
      }
    }

    if(idx < K) {
      bw.write("0\n");
    } else {
      bw.write(result + "\n");
    }
    
    bw.close();
  }
}