let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim();

let N = Number(input);
let N2 = N;
let result = [];

if (N % 3 === 0) {
  result.push(parseInt(N / 3));
} else if (N % 5 === 0) {
  result.push(parseInt(N / 5));
}

let count = 0;
count += parseInt(N / 5);
N %= 5;
count += parseInt(N / 3);
N %= 3;
if (N === 0) result.push(count);

count = 0;
while (N2 > 0) {
  if (N2 % 5 === 0) {
    count += parseInt(N2 / 5);
    N2 = 0;
    break;
  }
  count++;
  N2 -= 3;
}
if (N2 === 0) result.push(count);
result.length === 0 ? console.log(-1) : console.log(Math.min(...result));