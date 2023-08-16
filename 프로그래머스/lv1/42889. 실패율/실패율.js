function solution(N, stages) {
  const answer = [];
  const failureRate = [];

  for (let i = 0; i < N; i++) {
    let fail = 0;
    let players = stages.length;

    stages = stages.map((e) => {
      if (e === 0) {
        players--;
        return e;
      }
      if (e === 1) fail++;
      return e - 1;
    });

    failureRate.push({ stage: i + 1, rate: fail / players });
  }

  failureRate.sort((a, b) => {
    if (a.rate > b.rate) return -1;
    if (a.rate < b.rate) return 1;

    if (a.stage > b.stage) return 1;
  });

  return failureRate.map((e) => e.stage);
}