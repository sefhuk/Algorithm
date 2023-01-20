const solution = (score) => {
  let mean = score.map((element) => {
    return (element[0] + element[1]) / 2;
  });

  let rank = -1;
  let idx = 0;
  while (idx < mean.length) {
    let max = Math.max(...mean);
    let count = mean.filter((element) => element === max).length;
    mean = mean.map((element) => {
      if (element === max) {
        return rank;
      }
      return element;
    });
    rank -= count;
    idx += count;
  }
  return mean.map((element) => Math.abs(element));
};