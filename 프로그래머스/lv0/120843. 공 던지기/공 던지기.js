const solution = (numbers, k) => {
  if (k === 1) return 1;
  let idx = 0;
  for (let i = 1; i < k; i++) {
    idx = idx + 2 > numbers.length - 1 ? idx + 2 - numbers.length : idx + 2;
  }
  return numbers[idx];
};