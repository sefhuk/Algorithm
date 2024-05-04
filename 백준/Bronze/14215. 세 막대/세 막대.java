import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");
    int[] nums = {Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])};

    Arrays.sort(nums);

    if(nums[0] + nums[1] <= nums[2]) {
      nums[2] -= nums[2] - (nums[0] + nums[1]) + 1;
    }

    bw.write(nums[0] + nums[1] + nums[2] + "");
    bw.close();
  }
}