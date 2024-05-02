import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] pos = {-1, -1};
    int max = -1;
    for(int i = 0; i < 9; i++) {
      String[] row = br.readLine().split(" ");
      for(int j = 0; j < row.length; j++) {
        int num = Integer.parseInt(row[j]);
        
        if(num > max) {
          max = num;
          pos[0] = i;
          pos[1] = j;
        }
      }
    }

    bw.write(max + "\n");
    bw.write((pos[0] + 1) + " " + (pos[1] + 1));
    bw.close();
  }
}