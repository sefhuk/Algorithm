import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");

    int N = Integer.parseInt(input[0]);
    int B = Integer.parseInt(input[1]);

    String result = "";
    while(N >= B) {
      char tmp = (N % B) > 9 ? (char) ((N % B) + 55) : (char) ((N % B) + 48);
      result = tmp + result;
      N /= B;
    }

    result = (N > 9 ? (char) ((N % B) + 55) : N + "") + result;

    bw.write(result);
    bw.close();
  }
}