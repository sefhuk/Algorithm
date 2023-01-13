const solution = (number, limit, power) => {
  let result = 0;
  for (let i = 1; i <= number; i++) {
    if (limit < getDivisorCount(i)) {
      result += power;
    } else {
      result += getDivisorCount(i);
    }
  }
  return result;
};

const getDivisorCount = (number) => {
  if (number === 1) return 1;
  if (number === 2 || number === 3) return 2;

  let result = 2;
  let start = 2;
  let end = number - 1;
  while (start <= end) {
    if (number % start === 0) {
      if (Math.sqrt(number) === start) {
        result++;
      } else {
        result += 2;
      }
      end = number / start - 1;
    }
    start++;
  }
  return result;
};