function solution(lottos, win_nums) {
  const correct = [0, 0];

  lottos.forEach((e) => {
    if (win_nums.includes(e)) {
      correct[0]++;
      correct[1]++;
    } else {
      if (e === 0) {
        correct[0]++;
      }
    }
  });

  return correct.map((e) => {
    return 7 - e <= 6 ? 7 - e : 6;
  });
}