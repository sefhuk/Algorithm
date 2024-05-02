import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int result = 0;
    List<Character> strs = new ArrayList<>();
    for(int i = 0; i < N; i++) {
      String word = br.readLine();

      if(word.length() == 1) {
        result++;
        continue;
      }

      for(int j = 0; j < word.length(); j++) {
        if(strs.contains(word.charAt(j))) {
          if(strs.get(strs.size() - 1) != word.charAt(j)) {
            strs.clear();
            break;
          }
        } else {
          strs.add(word.charAt(j));
        }
      }

      if(!strs.isEmpty()) {
        result++;
        strs.clear();
      }
    }

    bw.write(result + "\n");
    bw.close();
  }
}