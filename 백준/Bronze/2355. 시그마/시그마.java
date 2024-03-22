import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());

        if(A == B) {
            System.out.println(A);
            return;
        }
        
        if(A > B) {
            long tmp = A;
                A = B;
                B = tmp;
        }
   
        System.out.println((B - A + 1) * (2 * A + (B - A)) / 2 );
    }
}