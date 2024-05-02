import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] matrix = new int[100][100];

    int result = 0;

    int N = Integer.parseInt(br.readLine());
    for(int i = 0; i < N; i++) {
      String[] pos = br.readLine().split(" ");
      int x = 90 - Integer.parseInt(pos[1]);
      int y = Integer.parseInt(pos[0]);
    
      for(int j = y; j < y + 10; j++) {
        for(int k = x; k < x + 10; k++) {
          if(matrix[j][k] == 0) {
            result++;
          }

          matrix[j][k] = 1;
        }
      }
    }

    bw.write(result + "\n");
    bw.close();
  }
}