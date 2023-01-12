const solution = (dots) => {
  for (let i = 0; i <= dots.length - 2; i++) {
    for (let j = i + 1; j <= dots.length - 1; j++) {
      let other = [0, 1, 2, 3].filter((element) => {
        return element !== i && element !== j;
      });
      let oneGradient = Math.abs(
        (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0])
      );
      let otherGradient = Math.abs(
        (dots[other[0]][1] - dots[other[1]][1]) /
          (dots[other[0]][0] - dots[other[1]][0])
      );
      if (oneGradient === otherGradient) return 1;
    }
  }
  return 0;
};