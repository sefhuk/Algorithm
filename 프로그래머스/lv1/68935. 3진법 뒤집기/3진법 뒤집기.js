function solution(n) {
  return parseInt(('' + getThird(n)).split('').reverse().join(''), 3);
}

function getThird(num) {
  if (num < 3) return num;
  if (parseInt(num / 3) < 3) return `${parseInt(num / 3)}${num % 3}`;
  return `${getThird(parseInt(num / 3))}${num % 3}`;
}