const solution = (keyinput, board) => {
  let result = [0, 0];
  let max = [parseInt(board[0] / 2), parseInt(board[1] / 2)];
  let change = [0, 0];
  for (let i = 0; i < keyinput.length; i++) {
    switch (keyinput[i]) {
      case 'left':
        change = [-1, 0];
        break;
      case 'right':
        change = [1, 0];
        break;
      case 'up':
        change = [0, 1];
        break;
      case 'down':
        change = [0, -1];
        break;
    }

    if (
      Math.abs(result[0] + change[0]) <= max[0] &&
      Math.abs(result[1] + change[1]) <= max[1]
    ) {
      result[0] += change[0];
      result[1] += change[1];
    }
  }
  return result;
};