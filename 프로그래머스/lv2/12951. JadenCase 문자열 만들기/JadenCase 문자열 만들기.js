function solution(s) {
  let tmp = ' ';

  s = [...s];
  for (let i = 0; i < s.length; i++) {
    if (tmp === ' ') {
      if (s[i] !== ' ') {
        s[i] = s[i].toUpperCase();
      }
    } else {
      s[i] = s[i].toLowerCase();
    }
    tmp = s[i];
  }

  return s.join('');
}