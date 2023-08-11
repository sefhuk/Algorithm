function solution(strings, n) {
  return strings.sort((a, b) => {
    return a[n] !== b[n]
      ? a[n].charCodeAt(0) - b[n].charCodeAt(0)
      : a > b
      ? 1
      : 0 - 1;
  });
}