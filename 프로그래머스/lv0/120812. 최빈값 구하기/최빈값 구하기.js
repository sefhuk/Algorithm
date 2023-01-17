const solution = (array) => {
  const obj = {};
  for (let i = 0; i < array.length; i++) {
    let num = String(array[i]);
    if (Object.keys(obj).includes(num)) {
      obj[num]++;
    } else {
      obj[num] = 1;
    }
  }

  const arr = Object.keys(obj)
    .map((element) => {
      return [Number(element), obj[element]];
    })
    .sort((a, b) => {
      return b[1] - a[1];
    });

  if (arr.length === 1) {
    return arr[0][0];
  } else {
    if (arr[0][1] === arr[1][1]) {
      return -1;
    } else {
      return arr[0][0];
    }
  }
};