function solution(k, m, score) {
  let answer = 0;
  let idx = 0;

  score.sort((a, b) => b - a);
  while (score.length - idx >= m) {
    answer += score[idx + m - 1] * m;
    idx += m;
  }

  return answer;
}