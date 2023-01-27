const solution = (array) => {
  let str = array.join('');
  let count = 0;
  for (let i = 0; i < str.length; i++) {
    if (str[i] === '7') count++;
  }
  return count;
};