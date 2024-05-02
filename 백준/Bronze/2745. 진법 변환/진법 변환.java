import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");

    String N = input[0];
    int B = Integer.parseInt(input[1]);
    
    long result = 0;

    for(int i = 0; i < N.length(); i++) {
      int c = N.charAt(N.length() - i - 1);
      if(c >= 65 && c <= 97) {
        c -= 55;
      } else {
        c -= 48;
      }
      
      result += Math.pow(B, i) * c;
    }

    bw.write(result + "\n");
    bw.close();
  }
}