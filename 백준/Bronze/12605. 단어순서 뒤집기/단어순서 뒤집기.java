import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		String[] strs = new String[N];
		for(int i = 0; i < N; i++) {
			strs[i] = sc.nextLine();
		}

		for(int i = 0; i < strs.length; i++) {

			String[] tokens = strs[i].split(" ");

			System.out.print("Case #" + (i + 1) + ":");

			if(tokens.length == 1) {
				System.out.println(" " + tokens[0]);
				continue;
			}

			for(int j = tokens.length - 1; j >= 0; j--) {
				System.out.print(" " + tokens[j]);
			}

			System.out.println();
		}
	}
}