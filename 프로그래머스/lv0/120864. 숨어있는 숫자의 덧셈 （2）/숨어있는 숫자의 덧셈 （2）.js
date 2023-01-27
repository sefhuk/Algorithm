const solution = (my_string) => {
  my_string += ' ';
  let num = '0';
  let result = 0;
  for (let i = 0; i < my_string.length; i++) {
    if (+my_string[i] || my_string[i] === '0') {
      num += my_string[i];
    } else {
      result += +num;
      num = '0';
    }
  }
  return result;
};