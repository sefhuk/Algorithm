import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long n = Integer.parseInt(br.readLine());
    br.close();
    
    bw.write((n*(n-1)*(n-2)/6)+"\n" + 3);
    bw.close();
  }
}