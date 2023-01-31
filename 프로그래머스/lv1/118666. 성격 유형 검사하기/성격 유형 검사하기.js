const solution = (survey, choices) => {
  const score = { R: 0, T: 0, C: 0, F: 0, J: 0, M: 0, A: 0, N: 0 };

  for (let i = 0; i < choices.length; i++) {
    if (choices[i] < 4) {
      score[survey[i][0]] += 3 - choices[i] + 1;
    } else if (choices[i] > 4) {
      score[survey[i][1]] += choices[i] - 4;
    }
  }

  const table = [
    { R: score.R, T: score.T },
    { C: score.C, F: score.F },
    { J: score.J, M: score.M },
    { A: score.A, N: score.N },
  ];
  let result = '';
  table.forEach((element) => {
    let one = Object.keys(element)[0];
    let two = Object.keys(element)[1];
    if (element[one] > element[two]) {
      result += one;
    } else if (element[one] < element[two]) {
      result += two;
    } else {
      result += one > two ? two : one;
    }
  });
  return result;
};