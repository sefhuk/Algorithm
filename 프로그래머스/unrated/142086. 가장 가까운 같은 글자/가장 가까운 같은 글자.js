function solution(s) {
  const answer = [];
  const tmp = {};

  [...s].forEach((e, idx) => {
    if (tmp.hasOwnProperty(e)) {
      answer.push(idx - tmp[e]);
    } else {
      answer.push(-1);
    }
    tmp[e] = idx;
  });

  return answer;
}