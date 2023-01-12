const solution = (numer1, denom1, numer2, denom2) => {
  let common = (denom1 * denom2) / gcd(denom1, denom2);
  let resultNumer = numer1 * (common / denom1) + numer2 * (common / denom2);

  return [
    resultNumer / gcd(resultNumer, common),
    common / gcd(resultNumer, common),
  ];
};

const gcd = (a, b) => {
  if (a % b === 0) return b;
  return gcd(b, a % b);
};

const lcm = (a, b) => {
  return (a * b) / gcd(a, b);
};