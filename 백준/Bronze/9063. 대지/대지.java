import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    if(N == 1) {
      bw.write("0");
      bw.close();
      return;
    }

    int maxX = -10000;
    int maxY = -10000;
    int minX = 10000;
    int minY = 10000;

    for(int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");
      int x = Integer.parseInt(input[0]);  
      int y = Integer.parseInt(input[1]);  

      if(x > maxX) {
        maxX = x;
      } 
      
      if(x < minX) {
        minX = x;
      }

      if(y > maxY) {
        maxY = y;
      }
      
      if(y < minY) {
        minY = y;
      }
    }

    bw.write((maxX - minX) * (maxY - minY) + "\n");
    bw.close();
  }
}