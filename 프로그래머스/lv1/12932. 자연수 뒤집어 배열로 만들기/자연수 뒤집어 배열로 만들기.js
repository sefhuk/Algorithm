function solution(n) {
  return ('' + n)
    .split('')
    .reverse()
    .map((e) => Number(e));
}