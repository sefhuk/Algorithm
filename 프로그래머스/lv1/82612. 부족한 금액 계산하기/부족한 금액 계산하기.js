function solution(price, money, count) {
  const require = money - (price * count * (count + 1)) / 2;
  return require >= 0 ? 0 : -require;
}