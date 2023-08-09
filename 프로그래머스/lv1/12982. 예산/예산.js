function solution(d, budget) {
  d.sort((a, b) => a - b);

  let result = 0;
  let count = 0;
  for (let i = 0; i < d.length; i++) {
    if (budget >= result + d[i]) {
      result += d[i];
      count++;
    } else {
      break;
    }
  }

  return count;
}