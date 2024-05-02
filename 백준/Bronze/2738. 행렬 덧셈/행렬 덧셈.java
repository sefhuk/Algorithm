import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] nm = br.readLine().split(" ");

    int[][] matrix = new int[Integer.parseInt(nm[0])][Integer.parseInt(nm[1])];

    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < matrix.length; j++) {
        String[] input = br.readLine().split(" ");

        for(int k = 0; k < matrix[0].length; k++) {
          matrix[j][k] += Integer.parseInt(input[k]);
        }
      }
    }

    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[0].length; j++) {
        bw.write(matrix[i][j] + " "); 
      }
      bw.newLine();
    }

    bw.close();
  }
}