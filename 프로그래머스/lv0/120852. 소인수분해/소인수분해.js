const solution = (n) => {
  if (isPrime(n)) return [n];

  const result = [];
  for (let i = 2; i <= n; i++) {
    if (n % i === 0 && isPrime(i)) {
      result.push(i);
    }
  }
  return result;
};

const isPrime = (num) => {
  if (num <= 3) return true;
  for (let i = 2; i <= parseInt(Math.sqrt(num)); i++) {
    if (num % i === 0) return false;
  }
  return true;
};