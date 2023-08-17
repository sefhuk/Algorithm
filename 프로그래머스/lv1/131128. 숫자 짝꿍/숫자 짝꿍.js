function solution(X, Y) {
  let tmp = X.length >= Y.length ? [[...Y], [...X]] : [[...X], [...Y]];

  tmp = tmp.map((e) =>
    e
      .sort((a, b) => b - a)
      .join('')
      .match(/(\d)\1*/g)
  );

  let num = [];
  for (let i = 0; i < tmp[0].length; i++) {
    for (let j = 0; j < tmp[1].length; j++) {
      if (tmp[0][i][0] === tmp[1][j][0]) {
        if (tmp[0][i].length > tmp[1][j].length) {
          num.push(tmp[1][j]);
        } else {
          num.push(tmp[0][i]);
        }
      }
    }
  }

  if (num.length === 0) return '-1';
  return num[0][0] === '0' ? '0' : num.join('');
}