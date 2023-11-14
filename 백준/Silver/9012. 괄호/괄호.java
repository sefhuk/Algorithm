import java.io.*;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Stack<String> stack = new Stack<>();
            String[] tokens = br.readLine().split("");
            for (int j = 0; j < tokens.length; j++) {
                if (tokens[j].equals("(")) {
                    stack.push(tokens[j]);
                } else {
                    if (!stack.isEmpty()) {
                        if (stack.peek().equals("(")) {
                            stack.pop();
                        } else {
                            break;
                        }
                    } else {
                        stack.push(tokens[j]);
                        break;
                    }
                }
            }
            if (stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.close();
    }
}