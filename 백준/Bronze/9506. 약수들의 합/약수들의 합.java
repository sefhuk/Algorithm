import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int input = -2;
    while((input = Integer.parseInt(br.readLine())) != -1) {
      String print = input + " = 1";
      int sum = 1;
      for(int i = 2; i < input; i++) {
        if(input % i == 0) {
          sum += i;
          print += " + " + i;
        }
      }

      if(sum == input) {
        bw.write(print + "\n");
      } else {
        bw.write(input + " is NOT perfect.\n");
      }

      print = "";
    }

    bw.close();
  }
}