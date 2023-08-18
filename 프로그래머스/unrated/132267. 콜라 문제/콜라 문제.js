function solution(a, b, n) {
  let answer = 0;

  let now = n;
  while (now >= a) {
    answer += Math.floor(now / a) * b;
    now = Math.floor(now / a) * b + (now % a);
  }

  return answer;
}