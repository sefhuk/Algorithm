function solution(s) {
  return s
    .split(' ')
    .map((e) => {
      return e
        .split('')
        .map((e, idx) => {
          return idx % 2 === 0 ? e.toUpperCase() : e.toLowerCase();
        })
        .join('');
    })

    .join(' ');
}