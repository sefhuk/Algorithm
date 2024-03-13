   import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            
            bw.write(str.charAt(0));
            bw.write(str.charAt(str.length() == 0 ? 0 : str.length() - 1));
            bw.newLine();
            bw.flush();
        }
        
        bw.close();
    }
}