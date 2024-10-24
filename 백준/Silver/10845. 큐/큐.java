import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] queue = new int[100000];
    static int top = -1;
    static int bottom = -1;

    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");

            if (split.length == 2) {
                push(Integer.parseInt(split[1]));
                continue;
            }

            switch (split[0]) {
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
            }
        }

        bw.close();

    }

    private static void push(int X) {
        queue[++top] = X;
    }

    private static void pop() throws IOException {
        if (top == bottom) {
            bw.write("-1\n");
            return;
        }

        bw.write(queue[++bottom] + "\n");
    }

    private static void size() throws IOException {
        bw.write(top - bottom + "\n");
    }

    private static void empty() throws IOException {
        if (top == bottom) {
            bw.write("1\n");
            return;
        }

        bw.write("0\n");
    }

    private static void front() throws IOException {
        if (top == bottom) {
            bw.write("-1\n");
            return;
        }

        bw.write(queue[bottom + 1] + "\n");
    }

    private static void back() throws IOException {
        if (top == bottom) {
            bw.write("-1\n");
            return;
        }

        bw.write(queue[top] + "\n");
    }
}