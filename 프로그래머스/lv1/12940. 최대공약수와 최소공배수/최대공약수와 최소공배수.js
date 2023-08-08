function solution(n, m) {
  return n >= m ? [getGCD(n, m), getLCM(n, m)] : [getGCD(m, n), getLCM(m, n)];
}

function getGCD(a, b) {
  if (a % b === 0) return b;
  return getGCD(b, a % b);
}

function getLCM(a, b) {
  const gcd = getGCD(a, b);
  return (((gcd * a) / gcd) * b) / gcd;
}