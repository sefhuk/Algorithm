import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[st.countTokens()];
        for (int i = 0; st.hasMoreTokens(); i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        bw.write(num[0] + " " + num[num.length - 1]);
        bw.close();
    }
}