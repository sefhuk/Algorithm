import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    private static ArrayList<Integer> stack = new ArrayList<Integer>();
    private static int top = -1;

    public static void push(int num) {
        stack.add(num);
        top++;
    }

    public static int pop() {
        if (top == -1) {
            return -1;
        } else {
            int num = stack.get(top);
            stack.remove(top);
            top--;
            return num;
        }
    }

    public static int size() {
        return top + 1;
    }

    public static int empty() {
        if (top == -1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (top == -1) {
            return -1;
        } else {
            return stack.get(top);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String func = st.nextToken();

            switch (func) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                    break;
                case "pop":
                    bw.write(pop() + "\n");
                    break;
                case "size":
                    bw.write(size() + "\n");
                    break;
                case "empty":
                    bw.write(empty() + "\n");
                    break;
                case "top":
                    bw.write(top() + "\n");
            }
        }

        bw.close();
    }
}