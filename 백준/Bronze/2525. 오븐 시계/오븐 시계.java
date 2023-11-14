import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        int minutes = A * 60 + B;
        minutes += C;
        if (minutes >= 1440) {
            minutes -= 1440;
        }

        A = minutes / 60;
        B = minutes % 60;

        bw.write(A + " " + B);
        bw.close();
    }
}