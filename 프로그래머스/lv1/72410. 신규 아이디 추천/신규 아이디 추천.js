const solution = (new_id) => {
  // step 1
  let str = new_id.toLowerCase().split('');

  // step 2
  str = str
    .map((element) => {
      if (
        element !== '-' &&
        element !== '_' &&
        element !== '.' &&
        (element.charCodeAt() < 97 || element.charCodeAt() > 122) &&
        isNaN(element)
      )
        return ' ';
      return element;
    })
    .filter((element) => element !== ' ');

  // step 3
  for (let i = 0; i < str.length; i++) {
    if (str[i] === '.') {
      if (str[i - 1] === '.' || str[i - 1] === ' ') {
        str[i] = ' ';
      }
    }
  }

  str = str.filter((element) => element !== ' ');

  //step 4
  if (str[0] === '.') str = str.splice(1);
  if (str[str.length - 1] === '.') str.splice(str.length - 1);

  // step 5
  if (str.length === 0) str = ['a'];

  // step 6
  if (str.length > 15) {
    str.splice(15);
  }
  if (str[14] === '.') str.splice(14);

  // step 7
  if (str.length <= 2) {
    let last = str[str.length - 1];
    while (str.length < 3) {
      str.push(last);
    }
  }

  return str.join('');
};