function solution(players, callings) {
  const nameObj = {};
  const rankObj = {};
  players.forEach((e, idx) => {
    nameObj[e] = idx + 1;
    rankObj[idx + 1] = e;
  });

  callings.forEach((e) => {
    const rank = nameObj[e];
    nameObj[e]--;
    nameObj[rankObj[rank - 1]]++;

    rankObj[rank] = rankObj[rank - 1];
    rankObj[rank - 1] = e;
  });

  return Object.values(rankObj);
}