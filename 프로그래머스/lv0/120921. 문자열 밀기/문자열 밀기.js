const solution = (A, B) => {
  if (A === B) return 0;
  const str = A.split('');
  for (let i = 0; i < A.length; i++) {
    str.unshift(str[str.length - 1]);
    str.pop();
    if (str.join('') === B) return i + 1;
  }
  return -1;
};