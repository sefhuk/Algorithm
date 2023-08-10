function solution(t, p) {
  return t.split('').reduce((acc, cur, idx) => {
    if (idx > t.length - p.length) return acc + 0;
    return +t.slice(idx, idx + p.length) <= +p ? acc + 1 : acc + 0;
  }, 0);
}