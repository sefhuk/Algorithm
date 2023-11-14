import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int minutes = H * 60 + M - 45;

        if(minutes <0 ){
            minutes = 1440 + minutes;
        }
        H = minutes / 60;
        M = minutes % 60;

        bw.write(H + " " + M);
        bw.close();
    }
}