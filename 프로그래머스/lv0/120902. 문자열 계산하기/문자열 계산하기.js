const solution = (my_string) => {
  const arr = my_string.split(' ');

  let idx = 1;
  let result = +arr[0];
  while (idx < arr.length) {
    if (arr[idx] === '+') {
      result += +arr[idx + 1];
    } else {
      result -= +arr[idx + 1];
    }
    idx += 2;
  }

  return result;
};