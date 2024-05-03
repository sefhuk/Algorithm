import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    if(N == 1) {
      bw.write(9 + "\n");
      bw.close();
      return;
    }

    double result = 0;
    int div = 1;
    for(int i = 2; i <= N; i++) {
      div = div * 2;
      result = Math.pow(div * 2 + 1, 2);
    }

    bw.write((int) result + "\n");
    bw.close();
  }
}