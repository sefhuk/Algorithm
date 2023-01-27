const solution = (my_str, n) => {
  let idx = 0;
  const result = [];
  while (idx < my_str.length) {
    result.push(my_str.slice(idx, idx + n));
    idx += n;
  }
  return result;
};