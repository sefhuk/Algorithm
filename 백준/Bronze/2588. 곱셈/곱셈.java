import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int multiplicand = Integer.parseInt(br.readLine());
        String multiplier = br.readLine();

        for (int i = multiplier.length()-1; i >= 0; i--) {
            bw.write(Character.getNumericValue(multiplier.charAt(i)) * multiplicand + "\n");
        }

        bw.write(multiplicand * Integer.parseInt(multiplier) + "");
        bw.close();
    }
}