import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int grade = Integer.parseInt(br.readLine());

        if (grade >= 90) {
            bw.write("A");
        } else if (grade >= 80) {
            bw.write("B");
        } else if (grade >= 70) {
            bw.write("C");
        } else if (grade >= 60) {
            bw.write("D");
        } else {
            bw.write("F");
        } 
        
        bw.close();
    }
}