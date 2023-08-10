function solution(s) {
  const num = [
    'zero',
    'one',
    'two',
    'three',
    'four',
    'five',
    'six',
    'seven',
    'eight',
    'nine',
  ];

  let result = '';
  let str = '';
  s.split('').forEach((e) => {
    str += e;

    if (num.includes(str)) {
      result += num.indexOf(str).toString();
      str = '';
    } else if (!isNaN(+str)) {
      result += str.toString();
      str = '';
    }
  });

  return +result;
}