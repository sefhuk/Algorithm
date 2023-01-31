const solution = (s) => {
  let str = s.split('');
  let idx = 1;
  let same = s[0];
  let other = '';
  while (idx < str.length) {
    if (same.length === other.length) {
      str.splice(idx, 0, '.');
      idx++;
      same = '';
      other = '';
    }

    if (same[0] === str[idx] || same === '') {
      same += str[idx++];
    } else {
      other += str[idx++];
    }
  }
  return str.join('').split('.').length;
};