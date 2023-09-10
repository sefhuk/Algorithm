function solution(wallpaper) {
  const tmp = [-1, wallpaper[0].length - 1, -1, 0];

  wallpaper = wallpaper.map((e) => [...e]);

  wallpaper.forEach((e, idx) => {
    if (e.includes('#')) {
      if (tmp[0] === -1) {
        tmp[0] = idx;
      } else {
        tmp[2] = idx;
      }

      const tmp2 = [-1, -1];
      e.forEach((c, cidx) => {
        if (c === '#') {
          if (tmp2[0] === -1) {
            tmp2[0] = cidx;
          } else {
            tmp2[1] = cidx;
          }
        }
      });
      tmp[1] = tmp[1] > tmp2[0] ? tmp2[0] : tmp[1];
      if (tmp2[1] === -1) {
        tmp[3] = tmp[3] < tmp2[0] ? tmp2[0] : tmp[3];
      } else {
        tmp[3] = tmp[3] < tmp2[1] ? tmp2[1] : tmp[3];
      }
    }
  });

  if (tmp[2] === -1) {
    tmp[2] = tmp[0] + 1;
  } else {
    tmp[2]++;
  }

  tmp[3]++;

  return tmp;
}