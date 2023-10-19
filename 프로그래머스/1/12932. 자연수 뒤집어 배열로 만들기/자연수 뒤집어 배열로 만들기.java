class Solution {
    public int[] solution(long n) {
        String[] tmp = Long.toString(n).split("");

        int[] answer = new int[tmp.length];

        for(int i = 0; i < tmp.length; i++) {
            answer[i] = Integer.parseInt(tmp[tmp.length-i-1]);
        }

        return answer;
    }
}