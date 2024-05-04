import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] pos = new int[3][2];

    for(int i = 0; i < 3; i++) {
      String[] input = br.readLine().split(" ");
      pos[i][0] = Integer.parseInt(input[0]); 
      pos[i][1] = Integer.parseInt(input[1]);
    }

    for(int i = 0; i < 2; i++) {
      if(pos[0][i] == pos[1][i]) {
        bw.write(pos[2][i] + " ");
      } else if(pos[0][i] == pos[2][i]) {
        bw.write(pos[1][i] + " ");
      } else {
        bw.write(pos[0][i] + " ");
      }
    }
    
    bw.close();
  }
}