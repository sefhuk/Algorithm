import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                idx = i;
                max = num;
            }
        }

        bw.write(max + "\n");
        bw.write(idx + 1 + "");
        bw.close();

    }
}