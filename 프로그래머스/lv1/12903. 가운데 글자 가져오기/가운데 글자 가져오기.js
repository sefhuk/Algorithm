function solution(s) {
  return s.length % 2 === 0
    ? s.slice(parseInt(s.length / 2) - 1, parseInt(s.length / 2) + 1)
    : s.slice(parseInt(s.length / 2), s.length / 2 + 1);
}