import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());

        int result = 0;
        for (String i : num) {
            if (Integer.parseInt(i) == v) {
                result++;
            }
        }

        bw.write(result + "");
        bw.close();
    }
}