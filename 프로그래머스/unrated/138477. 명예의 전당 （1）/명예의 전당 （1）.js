function solution(k, score) {
  const answer = [];
  const board = [];

  score.forEach((e, idx) => {
    board.push(e);
    board.sort((a, b) => a - b);

    if (idx >= k) board.shift();
    answer.push(board[0]);
  });

  return answer;
}