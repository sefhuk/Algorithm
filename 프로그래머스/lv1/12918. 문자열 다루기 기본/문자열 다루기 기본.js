function solution(s) {
  if ([...s].includes('e')) return false;
  return !isNaN(+s) && (s.length === 4 || s.length === 6) ? true : false;
}