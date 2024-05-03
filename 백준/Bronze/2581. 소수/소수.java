import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

    int min = 10000;
    int sum = 0;
    for(int i = M; i <= N; i++) {
      if(isPrime(i)) {
        sum += i;

        if(min > i) {
          min = i;
        }
      } 
    }

    if(sum == 0) {
      bw.write(-1 + "\n");
      bw.close();
      return;
    }

    bw.write(sum + "\n" + min);
    bw.close();
  }

  public static boolean isPrime(int num) {
    if(num == 1) {
      return false;
    }

    if(num < 4) {
      return true;
    }

    for(int i = 2; i < num; i++) {
      if(num %  i == 0) {
        return false;
      }
    }

    return true;
  }
}