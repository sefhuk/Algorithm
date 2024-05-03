import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");

    int x = Integer.parseInt(input[0]);
    int y = Integer.parseInt(input[1]);
    int w = Integer.parseInt(input[2]);
    int h = Integer.parseInt(input[3]);

    double min = Math.min(w - x, x);
    min = Math.min(min, h - y);
    min = Math.min(min, y);

    bw.write((long) min + "\n");
    bw.close();
  }
}