const solution = (babelling) => {
  for (let j = 0; j < babelling.length; j++) {
    let str = babelling[j].split('');
    let queue = [];
    for (let i = 0; i < str.length; i++) {
      queue.push(str[i]);
      switch (queue.join('')) {
        case 'aya':
        case 'woo':
          queue.splice(0, 3);
          break;
        case 'ye':
        case 'ma':
          queue.splice(0, 2);
          break;
      }
    }
    babelling[j] = queue.join('');
  }
  return babelling.filter((element) => {
    return element === '';
  }).length;
};