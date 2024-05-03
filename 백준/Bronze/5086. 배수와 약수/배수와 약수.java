import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    
    String input;
    while(!(input = br.readLine()).equals("0 0")) {
      String[] split = input.split(" ");
      int one = Integer.parseInt(split[0]);
      int two = Integer.parseInt(split[1]);

      if(two % one == 0) {
        bw.write("factor\n");
      } else if(one % two == 0) {
        bw.write("multiple\n");
      } else {
        bw.write("neither\n");
      }
    }

    bw.close();
  }
}