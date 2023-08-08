function solution(left, right) {
  let answer = 0;
  for (let i = left; i <= right; i++) {
    answer += getCount(i) % 2 === 0 ? i : -i;
  }

  return answer;
}

function getCount(num) {
  if (num === 1) return 1;
  let count = 2;
  for (let i = 2; i < num; i++) {
    if (num % i === 0) count++;
  }

  return count;
}