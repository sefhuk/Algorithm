import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long count = Integer.parseInt(br.readLine());

    bw.write((count * count * count) + "\n3");
    bw.close();
  }
}