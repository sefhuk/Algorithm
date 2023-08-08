function solution(s) {
  const result = new Array(parseInt(s / 2)).fill('수박').join('');

  return s % 2 === 0 ? result : result + '수';
}
