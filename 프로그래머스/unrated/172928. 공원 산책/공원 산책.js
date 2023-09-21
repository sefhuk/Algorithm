function solution(park, routes) {
  const start = [0, 0];
  park = park.map((e, idx) => {
    if (e.includes('S')) {
      start[0] = idx;
      start[1] = e.indexOf('S');
    }
    return [...e];
  });

  const size = [park.length, park[0].length];

  for (const e of routes) {
    const tmp = e.split(' ');
    let isPossible = true;
    let now = [0, 0];

    if (tmp[0] === 'E') {
      if (start[1] + +tmp[1] > size[1] - 1) {
        continue;
      }
    } else if (tmp[0] === 'W') {
      if (start[1] - +tmp[1] < 0) {
        continue;
      }
    } else if (tmp[0] === 'S') {
      if (start[0] + +tmp[1] > size[0] - 1) {
        continue;
      }
    } else {
      if (start[0] - +tmp[1] < 0) {
        continue;
      }
    }

    for (let i = 1; i <= +tmp[1]; i++) {
      if (tmp[0] === 'E') {
        now[0] = start[0];
        now[1] = start[1] + i;
      } else if (tmp[0] === 'W') {
        now[0] = start[0];
        now[1] = start[1] - i;
      } else if (tmp[0] === 'S') {
        now[0] = start[0] + i;
        now[1] = start[1];
      } else {
        now[0] = start[0] - i;
        now[1] = start[1];
      }

      if (park[now[0]][now[1]] === 'X') {
        isPossible = false;
        break;
      }
    }

    if (isPossible) {
      if (tmp[0] === 'E') {
        start[1] += +tmp[1];
      } else if (tmp[0] === 'W') {
        start[1] -= +tmp[1];
      } else if (tmp[0] === 'S') {
        start[0] += +tmp[1];
      } else {
        start[0] -= +tmp[1];
      }
    }
  }

  return start;
}