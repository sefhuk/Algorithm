const solution = (quiz) => {
  for (let i = 0; i < quiz.length; i++) {
    let arr = quiz[i].split(' ');
    let truth;
    switch (arr[1]) {
      case '+':
        truth = Number(arr[0]) + Number(arr[2]);
        break;
      case '-':
        truth = Number(arr[0]) - Number(arr[2]);
        break;
    }
    if (truth === Number(arr[4])) {
      quiz[i] = 'O';
    } else {
      quiz[i] = 'X';
    }
  }
  return quiz;
};