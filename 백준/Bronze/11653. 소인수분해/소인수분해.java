import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    if(N == 1) {
      return;
    }

    int start = 2;
    while(N != 1) {
      if(N % start == 0) {
        N /= start;
        bw.write(start + "\n");
      } else {
        start++;
      }
    }

    bw.close();
  }
}