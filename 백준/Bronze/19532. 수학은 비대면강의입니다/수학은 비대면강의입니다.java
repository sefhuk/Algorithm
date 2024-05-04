import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

   String[] input = br.readLine().split(" ");
   br.close();

   int a = Integer.parseInt(input[0]);
   int b = Integer.parseInt(input[1]);
   int c = Integer.parseInt(input[2]);
   int d = Integer.parseInt(input[3]);
   int e = Integer.parseInt(input[4]);
   int f = Integer.parseInt(input[5]);

    for(int i = -999; i <= 999; i++) {
      for(int j = -999; j <= 999; j++) {
        if(a * i + b * j == c
            && d * i + e * j == f) {
              bw.write(i + " " + j);
              bw.close();
              return;
            }
      }
    }
  }
}