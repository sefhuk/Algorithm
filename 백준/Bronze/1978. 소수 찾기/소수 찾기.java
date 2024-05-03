import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    String[] nums = br.readLine().split(" ");

    int count = 0;
    for(String s : nums) {
      int num = Integer.parseInt(s);

      if(num == 1) {
        continue;
      }
      
      if(num <= 3) {
        count++;
        continue;
      }

      boolean isPrime = true;
      for(int i = 2; i < num; i++) {
        if(num % i == 0) {
          isPrime = false;
          break;
        }
      }

      if(isPrime) {
        count++;
      }
    }

    bw.write(count + "\n");
    bw.close();
  }
}