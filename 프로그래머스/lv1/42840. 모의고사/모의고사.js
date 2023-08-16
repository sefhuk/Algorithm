function solution(answers) {
  let scores = [0, 0, 0];

  answers.forEach((e, idx) => {
    if ((idx % 5) + 1 === e) scores[0]++;
  });

  let repeat = 0;

  answers.forEach((e, idx) => {
    if (idx % 2 === 0) {
      if (e === 2) scores[1]++;
    } else {
      if (idx % 8 < 2) {
        repeat = 1;
      } else if (idx % 8 < 4) {
        repeat = 3;
      } else if (idx % 8 < 6) {
        repeat = 4;
      } else {
        repeat = 5;
      }

      if (e === repeat) scores[1]++;
    }
  });

  repeat = 3;
  answers.forEach((e, idx) => {
    if (idx % 10 < 2) {
      repeat = 3;
    } else if (idx % 10 < 4) {
      repeat = 1;
    } else if (idx % 10 < 6) {
      repeat = 2;
    } else if (idx % 10 < 8) {
      repeat = 4;
    } else {
      repeat = 5;
    }

    if (e === repeat) scores[2]++;
  });

  let max = Math.max(...scores);
  let result = [];
  scores.forEach((e, idx) => {
    if (e === max) result.push(idx + 1);
  });

  return result;
}