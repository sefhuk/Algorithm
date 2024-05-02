import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());


    for(int i = 0; i < T; i++) {
      int cent = Integer.parseInt(br.readLine());

      if(cent >= 25) {
        bw.write((cent / 25) + " ");
        cent %= 25;
      } else {
        bw.write("0 ");
      }

      if(cent >= 10) {
        bw.write((cent / 10) + " ");
        cent %= 10;
      } else {
        bw.write("0 ");
      }

      if(cent >= 5) {
        bw.write((cent / 5) + " ");
        cent %= 5;
      } else {
        bw.write("0 ");
      }

      if(cent >= 1) {
        bw.write((cent / 1) + " ");
        cent %= 1;
      } else {
        bw.write("0 ");
      }

      bw.newLine();
    }

    bw.close();
  }
}