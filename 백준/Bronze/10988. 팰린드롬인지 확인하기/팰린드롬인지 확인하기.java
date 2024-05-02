import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();

    for(int i = 0; i < input.length() / 2; i++) {
      if(input.charAt(i) != input.charAt(input.length() - i - 1)) {
        bw.write("0");
        bw.close();
        return;
      }
    }

    bw.write("1");
    bw.close();
  }
}