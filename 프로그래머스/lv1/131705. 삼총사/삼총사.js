const solution = (number) => {
  let cnt = 0;
  let length = number.length;
  for (let i = 0; i <= length - 3; i++) {
    for (let j = i + 1; j <= length - 2; j++) {
      for (let k = j + 1; k <= length - 1; k++) {
        if (+number[i] + +number[j] + +number[k] === 0) {
          cnt++;
        }
      }
    }
  }
  return cnt;
};