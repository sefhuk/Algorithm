import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        String[] nx = br.readLine().split(" ");
        String[] num = br.readLine().split(" ");


        for (int i = 0; i < Integer.parseInt(nx[0]); i++) {
            if (Integer.parseInt(num[i]) < Integer.parseInt(nx[1])) {
                bw.write(Integer.parseInt(num[i]) + " ");
            }
        }
        bw.close();

    }
}