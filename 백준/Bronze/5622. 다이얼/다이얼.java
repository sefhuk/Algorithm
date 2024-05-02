import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split("");

    int result = 0;
    for(String s : input) {
      result += (getNum(s) - 1) + 2;
    }

    bw.write(result + "");
    bw.close();
;  }

  public static int getNum(String str) {
		switch(str) {
			case "A": case "B": case "C":
				return 2;
			case "D": case "E": case "F":
				return 3;
			case "G": case "H": case "I":
				return 4;
			case "J": case "K": case "L":
				return 5;
			case "M": case "N": case "O":
				return 6;
			case "P": case "Q": case "R": case "S":
				return 7;
			case "T": case "U": case "V":
				return 8;
			default:
				return 9;
		}
	}
}