const solution = (numlist, n) => {
  if (numlist.length === 1) return [numlist[0]];

  let arr = [...numlist];
  arr.sort((a, b) => {
    if (Math.abs(a - n) === Math.abs(b - n)) {
      if (a >= b) {
        return -1;
      } else {
        return 1;
      }
    }
    return Math.abs(a - n) - Math.abs(b - n);
  });

  return arr;
};