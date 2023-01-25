const solution = (s) => {
  let arr = s.split(' ').map((element) => {
    if (element !== 'Z') {
      return +element;
    }
    return element;
  });
  let idx = 0;
  let result = 0;
  while (idx < arr.length) {
    if (arr[idx + 1] === 'Z') {
      idx += 2;
      continue;
    }
    result += arr[idx++];
  }
  return result;
};