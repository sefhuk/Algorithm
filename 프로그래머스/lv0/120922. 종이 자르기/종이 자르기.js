const solution = (M, N) => {
  return getCount(M, N);
};

const getCount = (a, b) => {
  if (a === 1 && b === 1) return 0;

  let [big, small] = a >= b ? [a, b] : [b, a];
  if (big % 2 === 0) {
    return 1 + getCount(small, big / 2) + getCount(small, big / 2);
  } else {
    return (
      1 +
      getCount(small, parseInt(big / 2)) +
      getCount(small, big - parseInt(big / 2))
    );
  }
};