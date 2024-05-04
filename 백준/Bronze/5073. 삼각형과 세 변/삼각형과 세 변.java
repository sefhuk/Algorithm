import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = "";
    while(!(input = br.readLine()).equals("0 0 0")) {
      String[] tokens = input.split(" ");
      
      int[] angle = new int[3];

      for(int i = 0; i < 3; i++) {
        angle[i] = Integer.parseInt(tokens[i]);

        if(i > 0) {
          if(angle[i - 1] > angle[i]) {
            int tmp = angle[i - 1];
            angle[i - 1] = angle[i];
            angle[i] = tmp;
          }
        }
      }

      if(angle[2] >= angle[0] + angle[1]) {
        bw.write("Invalid\n");
        continue;
      }

      if(angle[0] == angle[1] && angle[1] == angle[2]) {
        bw.write("Equilateral\n");
      } else {
        if(angle[0] == angle[1] || angle[1] == angle[2] 
          || angle[0] == angle[2]) {
            bw.write("Isosceles\n");
        } else {
          bw.write("Scalene\n");
        }
      }

    }

    bw.close();
  }
}