const solution = (numbers, hand) => {
  let result = '';
  let rf = '#';
  let lf = '*';
  numbers.forEach((element) => {
    switch (element) {
      case 1:
      case 4:
      case 7:
        lf = element;
        result += 'L';
        break;
      case 3:
      case 6:
      case 9:
        rf = element;
        result += 'R';
        break;
      default:
        if (getDistacne(element, lf) === getDistacne(element, rf)) {
          if (hand === 'right') {
            rf = element;
            result += 'R';
          } else {
            lf = element;
            result += 'L';
          }
        } else {
          if (getDistacne(element, lf) > getDistacne(element, rf)) {
            rf = element;
            result += 'R';
          } else {
            lf = element;
            result += 'L';
          }
        }
    }
  });
  return result;
};

const getDistacne = (start, end) => {
  if (start === 0) start = 11;
  if (end === 0) end = 11;
  if (end == '#') end = 12;
  if (end === '*') end = 10;

  let difference = Math.abs(start - end);
  if (difference === 1 || difference === 3) {
    return 1;
  } else if (difference % 3 === 0) {
    return difference / 3;
  } else {
    let count = 0;
    while (difference >= 2) {
      if (start > end) {
        start -= 3;
      } else {
        start += 3;
      }
      count++;
      difference -= 3;
    }
    return count + 1;
  }
};