import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine().toLowerCase();

    int[] nums = new int[26];

    for(int i = 0; i < input.length(); i++) {
      int index = input.charAt(i) - 97;
      nums[index]++;
    }

    int max = -1;
    char result = ' ';
    for(int i = 0; i < 26; i++) {
      if(max < nums[i]) {
        max = nums[i];
        result = (char) ('A' + i);
      } else if(max == nums[i]) {
        result = '?';
      }
    }

    bw.write(result + "");
    bw.close();
  }
}