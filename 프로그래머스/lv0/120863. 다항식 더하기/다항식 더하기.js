const solution = (polynomial) => {
  let arr = { monomial: 0, const: 0 };
  polynomial.split(' + ').map((element) => {
    if (element.includes('x')) {
      if (element === 'x') {
        arr.monomial++;
      } else {
        let num = Number(element.split('x')[0]);
        arr.monomial += num;
      }
    } else {
      arr.const += Number(element);
    }
  });

  if (!arr.monomial) {
    return arr.const.toString();
  } else {
    let result = '';
    if (arr.monomial === 1) {
      result = 'x';
    } else {
      result = arr.monomial + 'x';
    }
    if (!arr.const) {
      return result;
    } else {
      return result + ' + ' + arr.const;
    }
  }
};