function solution(arr, divisor) {
  const result = [];
  arr.forEach((e) => {
    if (e % divisor === 0) result.push(e);
  });

  return result.length === 0 ? [-1] : result.sort((a, b) => a - b);
}