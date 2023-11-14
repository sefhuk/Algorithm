import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Long.parseLong(st.nextToken());
        double B = Long.parseLong(st.nextToken());

        bw.write(A / B + "");
        bw.close();
    }
}