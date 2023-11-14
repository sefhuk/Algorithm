import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];

        for (int i = 0; st.hasMoreTokens(); i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        String result;
        if (nums[0] == nums[2]) {
            result = (10000 + nums[0] * 1000) + "";
        } else {
            if (nums[0] == nums[1] || nums[1] == nums[2]) {
                result = (1000 + nums[1] * 100) + "";
            } else {
                result = nums[2] * 100 + "";
            }
        }

        bw.write(result);
        bw.close();
    }
}