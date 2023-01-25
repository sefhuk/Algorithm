const solution = (balls, share) => {
  if (balls === share) return 1;
  if (share === 1) return balls;
  let n = 1n;
  for (let i = BigInt(0); i < BigInt(share); i++) {
    n *= BigInt(balls) - i;
  }

  let result = n / BigInt(factorial(share));
  return Number(result);
};

const factorial = (n) => {
  if (n === 1) return 1;
  return BigInt(n) * BigInt(factorial(n - 1));
};