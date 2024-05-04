import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

   String input = br.readLine();
   br.close();



   for(int i = 1; i <= Integer.parseInt(input); i++) {
    if(getSep(i) == Integer.parseInt(input)) {
      bw.write(i + "\n");
      bw.close();
      return;
    }
   }

   bw.write("0\n");
   bw.close();
  }

  public static int getSep(int num) {
    int result = num;
    String str = num + "";

    for(int i = 0; i < str.length(); i++) {
      result += Integer.parseInt(str.charAt(i) + "");
    }

    return result;
  }
}