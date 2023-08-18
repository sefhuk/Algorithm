function solution(n, lost, reserve) {
  let answer = n - lost.length;

  for (let i = 0; i < lost.length; i++) {
    for (let j = 0; j < reserve.length; j++) {
      if (lost[i] === reserve[j]) {
        lost[i] = 0;
        reserve[j] = 0;
        answer++;
        break;
      }
    }
  }

  lost = lost.filter((val) => val !== 0).sort((a, b) => a - b);
  reserve = reserve.filter((val) => val !== 0).sort((a, b) => a - b);

  reserve.forEach((e, idx) => {
    if (lost.includes(e - 1)) {
      answer++;
      lost.splice(lost.indexOf(e - 1), 1);
      reserve[idx] = 0;
    } else if (lost.includes(e + 1)) {
      answer++;
      lost.splice(lost.indexOf(e + 1), 1);
      reserve[idx] = 0;
    }
  });

  return answer;
}