const solution = (board) => {
  let column = board[0].length;
  let row = board.length;
  let distance = [
    [-1, -1],
    [-1, 0],
    [-1, 1],
    [0, -1],
    [0, 1],
    [1, -1],
    [1, 0],
    [1, 1],
  ];

  for (let i = 0; i < row; i++) {
    for (let j = 0; j < column; j++) {
      for (let k = 0; k < 8; k++) {
        if (board[i][j] === 1) {
          let newRow = i + distance[k][0];
          let newColumn = j + distance[k][1];

          if (
            newRow >= 0 &&
            newRow < row &&
            newColumn >= 0 &&
            newColumn < column &&
            board[newRow][newColumn] === 0
          ) {
            board[newRow][newColumn] = 2;
          }
        }
      }
    }
  }

  let count = 0;
  for (let i = 0; i < row; i++) {
    for (let j = 0; j < column; j++) {
      if (board[i][j] === 0) {
        count++;
      }
    }
  }
  return count;
};