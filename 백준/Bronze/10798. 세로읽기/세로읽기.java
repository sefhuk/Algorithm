import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    List<String> vertical = new ArrayList<>();
    for(int i = 0; i < 15; i++) {
      vertical.add("");
    }

    for(int i = 0; i < 5; i++) {
      String[] input = br.readLine().split("");
      for(int j = 0; j < input.length; j++) {
        vertical.set(j, vertical.get(j) + input[j]);
      }
    }

    for(String s : vertical) {
      bw.write(s);
    }

    bw.close();
  }
}