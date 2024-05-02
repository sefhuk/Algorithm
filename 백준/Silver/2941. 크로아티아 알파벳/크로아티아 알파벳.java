import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();
    
  
    int result = 0;
    for(int i = 0; i < input.length(); i++) {
      char now = input.charAt(i);

      if(now == 'c') {
        if(i + 1 < input.length()) {
          char next = input.charAt(i + 1);
          if(next == '=' || next == '-') {
            i++;
          }
        }
      } else if(now == 'd') {
        if(i + 1 < input.length()) {
          char next = input.charAt(i + 1);
          if(next == '-') {
            i++;
          } else if(next == 'z') {
            if(i + 2 < input.length()) {
              char next2 = input.charAt(i + 2);
              if(next2 == '=') {
                i += 2;
              }
            }
          }
        } 
      } else if(now == 'l' || now =='n') {
        if(i + 1 < input.length()) {
          char next = input.charAt(i + 1);
          if(next == 'j') {
            i++;
          }
        }
      } else if(now == 's' || now == 'z') {
        if(i + 1 < input.length()) {
          char next = input.charAt(i + 1);
          if(next == '=') {
            i++;
          }
        }
      }

      result++;
    }

    bw.write(result + "\n");
    bw.close();
  }
}