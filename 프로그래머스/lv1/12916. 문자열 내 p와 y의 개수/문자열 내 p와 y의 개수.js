function solution(s) {
  const arr = s.toUpperCase().split('');

  if (!arr.includes('P') && !arr.includes('Y')) return true;

  let p = 0;
  let y = 0;
  arr.forEach((e) => {
    switch (e) {
      case 'P':
        p++;
        break;
      case 'Y':
        y++;
        break;
    }
  });

  return p === y ? true : false;
}