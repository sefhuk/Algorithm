function solution(a, b) {
  if (a === b) return a;

  const arr = [a, b].sort((a, b) => a - b);
  let result = arr[0];
  for (let i = arr[0] + 1; i <= arr[1]; i++) {
    result += i;
  }

  return result;
}