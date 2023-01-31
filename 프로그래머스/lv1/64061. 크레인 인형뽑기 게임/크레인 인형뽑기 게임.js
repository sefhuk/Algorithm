const solution = (board, moves) => {
  const basket = [];
  let result = 0;
  for (let i = 0; i < moves.length; i++) {
    if (board[board.length - 1][moves[i] - 1] === 0) continue;
    for (let j = 0; j < board.length; j++) {
      if (board[j][moves[i] - 1] !== 0) {
        basket.push(board[j][moves[i] - 1]);
        board[j][moves[i] - 1] = 0;
        break;
      }
    }
    if (basket.length >= 2) {
      if (basket[basket.length - 1] === basket[basket.length - 2]) {
        result += 2;
        basket.pop();
        basket.pop();
      }
    }
  }
  return result;
};