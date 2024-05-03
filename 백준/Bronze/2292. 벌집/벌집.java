import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int interval = 0;
    int start = 1;
    int result = 1;
    while(start < N) {
      interval += 6;
      start += interval;
      result++;
    }

    bw.write(result + "\n");
    bw.close();
  }
}