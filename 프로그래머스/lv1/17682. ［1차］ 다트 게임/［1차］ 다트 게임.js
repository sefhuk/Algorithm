function solution(dartResult) {
  const answer = [0, 0, 0];

  const tmp = dartResult.match(/\d+[SDT]?[\*\#]?/g);

  tmp.forEach((e, idx) => {
    const [score, bonus, option] = e.match(/\d+|[SDT]|[\*\#]/g);

    switch (bonus) {
      case 'S':
        answer[idx] += Math.pow(score, 1);
        break;
      case 'D':
        answer[idx] += Math.pow(score, 2);
        break;
      case 'T':
        answer[idx] += Math.pow(score, 3);
    }

    switch (option) {
      case '*':
        answer[idx] *= 2;
        if (idx !== 0) {
          answer[idx - 1] *= 2;
        }
        break;
      case '#':
        answer[idx] *= -1;
    }
  });

  return answer.reduce((acc, cur) => acc + cur, 0);
}