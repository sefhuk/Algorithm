import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int X = Integer.parseInt(br.readLine());

    int row = 1;
    int col = 1;

    int turn = 1;
    while(turn++ < X) {

      if(row == 1) {
        if(col % 2 == 0) {
          row++;
          col--;
        } else {
          col++;
        }
      } else if(col == 1) {
        if(row % 2 == 0) {
          row++;
        } else {
          row--;
          col++;
        }
      } else {
        if((row + col)  % 2 == 0) {
          row--;
          col++;
        } else {
          row++;
          col--;
        }
      }
    }

    bw.write(row + "/" + col);
    bw.close();
  }
}