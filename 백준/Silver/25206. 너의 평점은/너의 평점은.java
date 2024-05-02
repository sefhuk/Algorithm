import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    double result = 0;
    double totalCredit = 0;

    for(int i = 0; i < 20; i++) {
      String input = br.readLine();
      String[] split = input.split(" ");

      if(split[2].equals("P")) continue;
      
      double credit = Float.parseFloat(split[1]);
      double point = convertPoint(split[2]);

      totalCredit += credit;
      result += credit * point;
    }

    System.out.printf("%.6f", result / totalCredit);
  }

  public static double convertPoint(String point) {
    switch(point) {
      case "A+":
        return 4.5f;
      case "A0":
        return 4.0f;
      case "B+":
        return 3.5f;
      case "B0":
        return 3.0f;
      case "C+":
        return 2.5f;
      case "C0":
        return 2.0f;
      case "D+":
        return 1.5f;
      case "D0":
        return 1.0f;
      default:
        return 0.0f;  
    }
  }
}