const solution = (babbling) => {
  let result = 0;

  for (let i = 0; i < babbling.length; i++) {
    let word = [];
    let arr = [];
    let str = babbling[i].split('');
    for (let j = 0; j < str.length; j++) {
      arr.push(str[j]);
      switch (arr.join('')) {
        case 'aya':
        case 'ye':
        case 'woo':
        case 'ma':
          word.push(arr.splice(0).join(''));
          break;
      }
    }
    if (arr.length !== 0) word = [];

    if (word.length !== 0) {
      if (word.length === 1) {
        result++;
        continue;
      }
      let isPossible = true;
      for (let j = 0; j < word.length - 1; j++) {
        if (word[j] === word[j + 1]) {
          isPossible = false;
          break;
        }
      }
      if (isPossible) result++;
    }
  }
  return result;
};