import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] degree = new int[3];

    for(int i = 0; i < 3; i++) {
      degree[i] = Integer.parseInt(br.readLine());
    }

    if(degree[0] + degree[1] + degree[2] != 180) {
      bw.write("Error");
      bw.close();
      return;
    }

    if(degree[0] == degree[1] && degree[1] == degree[2]) {
      bw.write("Equilateral");
    } else {
      if(degree[0] == degree[1] || degree[1] == degree[2]
        || degree[0] == degree[2]) {
          bw.write("Isosceles");
      } else {
        bw.write("Scalene");
      }
    }

    bw.close();
  }
}