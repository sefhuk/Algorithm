import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        String input = br.readLine();
        bw.write(input + "??!");
        bw.close();
    }
}