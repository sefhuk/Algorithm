const getSum = (arr) => {
  const result = (arr.length * (2 * arr[0] + (arr.length - 1))) / 2;
  return result;
};

const solution = (num, total) => {
  let result = Array.from({ length: num }, () => 0);
  let mid = num % 2 === 0 ? num / 2 - 1 : parseInt(num / 2);
  result[mid] = parseInt(total / num);

  let cnt = result[mid];
  for (let i = mid - 1; i >= 0; i--) {
    result[i] = --cnt;
  }

  cnt = result[mid];
  for (let i = mid + 1; i < num; i++) {
    result[i] = ++cnt;
  }
  return result;
};