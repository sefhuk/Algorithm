function solution(keymap, targets) {
  const answer = [];

  targets.forEach((target, idx) => {
    let count = 0;
    for (let word of target) {
      const click = [];
      for (let key of keymap) {
        if (key.includes(word)) {
          click.push(key.indexOf(word) + 1);
        }
      }

      if (click.length === 0) {
        count = -1;
        break;
      } else {
        count += Math.min(...click);
      }
    }

    answer.push(count);
  });

  return answer;
}