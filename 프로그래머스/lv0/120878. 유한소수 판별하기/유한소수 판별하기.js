const solution = (a, b) => {
  let mother = b / gcd(a, b);
  if (mother === 1) return 1;
  for (let i = 2; i <= mother; i++) {
    if (mother % i === 0) {
      if (i === 2 || i === 5) {
        continue;
      }
      if (isPrime(i)) return 2;
    }
  }
  return 1;
};

const gcd = (a, b) => {
  if (a % b === 0) return b;
  return gcd(b, a % b);
};

const isPrime = (num) => {
  if (num === 1) return false;
  if (num === 2 || num === 3 || num === 5 || num === 7) return true;
  if (num % 2 !== 0 && num % 3 !== 0 && num % 5 !== 0 && num % 7 !== 0) {
    return true;
  } else {
    return false;
  }
};