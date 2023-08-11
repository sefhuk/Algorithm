function solution(food) {
  const answer = food.reduce((acc, cur, idx) => {
    if (cur < 2) return acc;
    acc.splice(
      parseInt(acc.length / 2),
      0,
      ...new Array(cur - (cur % 2)).fill(idx)
    );
    return acc;
  }, []);

  answer.splice(parseInt(answer.length / 2), 0, 0);

  return answer.join('');
}