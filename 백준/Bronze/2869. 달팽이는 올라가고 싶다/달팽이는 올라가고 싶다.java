import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");

    int A = Integer.parseInt(input[0]);
    int B = Integer.parseInt(input[1]);
    long V = Integer.parseInt(input[2]);
    
    bw.write(((V - B) / (A - B)) + ((V - B) % (A - B) == 0 ? 0 : 1) + "");
    bw.newLine();
    bw.close();
  }
}